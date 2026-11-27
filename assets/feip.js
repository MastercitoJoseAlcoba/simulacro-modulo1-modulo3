'use strict';

const base = 'src/Apoyo_Diciembre2026/';
const prefijoProgreso = 'feip:completado:';
const completados = new Set();
const claveDe = recurso => recurso.claveProgreso || recurso.archivo;
const porId = id => document.getElementById(id);
const buscar = porId('buscar');
const navegacion = porId('modulos');
const catalogo = porId('catalogo');
const tema = porId('tema');
const tipo = porId('tipo');
const estadoProgreso = porId('estado-progreso');
let moduloActivo = 0;

function crear(etiqueta, texto) {
  const elemento = document.createElement(etiqueta);
  elemento.textContent = texto;
  return elemento;
}

function palabras(texto) {
  return texto.normalize('NFD').replace(/\p{M}/gu, '').toLowerCase()
    .split(/[^a-z0-9]+/).filter(Boolean);
}

const prioridad = ['Arrays', 'Matrices', 'Listas', 'Pilas', 'Colas', 'POO', 'Excepciones'];
const sinonimos = {
  Arrays: 'arreglos vectores',
  POO: 'programación orientada a objetos',
  Excepciones: 'try catch errores',
  Pilas: 'stack lifo',
  Colas: 'queue fifo'
};

for (const recurso of recursos) {
  recurso.indice = palabras([
    recurso.nombre, recurso.descripcion, recurso.archivo, recurso.tipo,
    modulos[recurso.modulo - 1],
    ...recurso.temas.flatMap(nombre => [nombre, sinonimos[nombre] || ''])
  ].join(' '));
  try {
    if (localStorage.getItem(prefijoProgreso + claveDe(recurso)) === '1') {
      completados.add(claveDe(recurso));
    }
  } catch {
    porId('aviso-progreso').hidden = false;
  }
}

const temas = new Set(recursos.flatMap(recurso => recurso.temas));
for (const nombre of [...prioridad, ...[...temas].filter(nombre => !prioridad.includes(nombre)).sort()]) {
  tema.add(new Option(nombre, nombre));
}
for (const nombre of [...new Set(recursos.map(recurso => recurso.tipo))].sort()) {
  tipo.add(new Option(nombre, nombre));
}

function nombreModulo(numero) {
  return numero === 5 ? modulos[numero - 1] : `Módulo ${numero} · ${modulos[numero - 1]}`;
}

for (const [numero, nombre] of ['Todos los módulos', ...modulos].entries()) {
  const boton = crear('button', numero > 0 && numero < 5 ? `Módulo ${numero}` : nombre);
  boton.type = 'button';
  boton.setAttribute('aria-label', numero ? nombreModulo(numero) : nombre);
  boton.addEventListener('click', () => {
    moduloActivo = numero;
    render();
  });
  navegacion.append(boton);
}

function actualizarProgreso() {
  const progreso = porId('progreso');
  progreso.max = recursos.length;
  progreso.value = completados.size;
  porId('resumen-progreso').textContent = `${completados.size} de ${recursos.length} recursos completados`;
}

function crearTarjeta(recurso) {
  const tarjeta = crear('article', '');
  const titulo = crear('h4', '');
  const enlace = crear('a', recurso.nombre);
  enlace.href = base + recurso.archivo.split('/').map(encodeURIComponent).join('/');
  enlace.target = '_blank';
  enlace.rel = 'noopener';
  enlace.setAttribute('aria-description', 'Se abre en otra pestaña');
  titulo.append(enlace);

  const detalle = crear('p', [recurso.tipo, ...recurso.temas].join(' · '));
  detalle.className = 'detalle';
  const boton = crear('button', 'Completado');
  boton.type = 'button';
  boton.setAttribute('aria-label', `Completado: ${recurso.nombre}`);
  boton.setAttribute('aria-pressed', completados.has(claveDe(recurso)));

  boton.addEventListener('click', () => {
    const clave = prefijoProgreso + claveDe(recurso);
    const completado = !completados.has(claveDe(recurso));
    if (completado) completados.add(claveDe(recurso));
    else completados.delete(claveDe(recurso));
    try {
      if (completado) localStorage.setItem(clave, '1');
      else localStorage.removeItem(clave);
    } catch {
      porId('aviso-progreso').hidden = false;
    }
    actualizarProgreso();
    if (estadoProgreso.value) {
      render();
      (catalogo.querySelector('button') || estadoProgreso).focus();
    } else {
      boton.setAttribute('aria-pressed', completado);
    }
  });

  tarjeta.append(detalle, titulo, crear('p', recurso.descripcion), boton);
  return tarjeta;
}

function render() {
  const terminos = palabras(buscar.value);
  const visibles = recursos.filter(recurso =>
    (!moduloActivo || recurso.modulo === moduloActivo) &&
    (!tema.value || recurso.temas.includes(tema.value)) &&
    (!tipo.value || recurso.tipo === tipo.value) &&
    (!estadoProgreso.value || completados.has(claveDe(recurso)) === (estadoProgreso.value === 'completados')) &&
    terminos.every(termino => recurso.indice.some(palabra => palabra.includes(termino)))
  );

  for (const [numero, boton] of [...navegacion.children].entries()) {
    boton.setAttribute('aria-pressed', numero === moduloActivo);
  }

  catalogo.replaceChildren();
  for (const [indice] of modulos.entries()) {
    const numero = indice + 1;
    const grupo = visibles.filter(recurso => recurso.modulo === numero);
    if (!grupo.length) continue;
    const seccion = crear('section', '');
    const tarjetas = crear('div', '');
    tarjetas.className = 'tarjetas';
    tarjetas.append(...grupo.map(crearTarjeta));
    seccion.append(crear('h3', nombreModulo(numero)), tarjetas);
    catalogo.append(seccion);
  }
  porId('estado').textContent = visibles.length === 1 ? '1 recurso' : `${visibles.length} recursos`;
  porId('sinResultados').hidden = Boolean(visibles.length);
}

buscar.addEventListener('input', render);
for (const filtro of [tema, tipo, estadoProgreso]) filtro.addEventListener('change', render);
porId('limpiar').addEventListener('click', () => {
  buscar.value = tema.value = tipo.value = estadoProgreso.value = '';
  moduloActivo = 0;
  render();
  buscar.focus();
});

window.addEventListener('storage', evento => {
  if (evento.key === null) completados.clear();
  else {
    if (!evento.key.startsWith(prefijoProgreso)) return;
    const archivo = evento.key.slice(prefijoProgreso.length);
    if (!recursos.some(recurso => claveDe(recurso) === archivo)) return;
    if (evento.newValue === '1') completados.add(archivo);
    else completados.delete(archivo);
  }
  actualizarProgreso();
  render();
});

actualizarProgreso();
render();
