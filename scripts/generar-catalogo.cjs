'use strict';
const fs = require('node:fs');
const path = require('node:path');
function generar(original, paths) {
 const validos=new Set(paths), usados=new Set(), resultado=[];
 const nombreArchivo=p=>p.split('/').pop();
 const normal=s=>s.normalize('NFD').replace(/\p{M}/gu,'').toLowerCase();
 for(const r of original){
  let p=r.archivo;
  if(!validos.has(p)){
   const candidatos=paths.filter(x=>nombreArchivo(x)===nombreArchivo(p));
   if(candidatos.length!==1)throw Error('Ruta no resuelta: '+p);
   p=candidatos[0];
  }
  if(usados.has(p))throw Error('Duplicado: '+p);
  usados.add(p);resultado.push({...r,archivo:p,...(p!==r.archivo?{claveProgreso:r.claveProgreso||r.archivo}:{})});
 }
 for(const p of paths.sort()){
  if(usados.has(p)||!/\.(html|md|java|png|jpe?g|pdf)$/i.test(p))continue;
  const file=nombreArchivo(p), ext=file.split('.').pop().toLowerCase();
  const s=normal(p), temas=[];
  if(/matriz|matrices|submatriz|punto.?silla/.test(s))temas.push('Matrices');
  if(/array|arreglo|vector|temperatura/.test(s))temas.push('Arrays');
  if(/poo|clase|herencia|interfaz|polimorfismo|persona|producto|libro|pelicula|vehiculo/.test(s))temas.push('POO');
  if(/excep|try.?catch/.test(s))temas.push('Excepciones');
  if(/cadena|vocal|patente|string/.test(s))temas.push('Cadenas');
  if(/linkedlist|arraylist|lista/.test(s))temas.push('Listas');
  if(/stack|pila/.test(s))temas.push('Pilas');
  if(/queue|cola/.test(s))temas.push('Colas');
  if(/hashmap|mapa/.test(s))temas.push('Mapas');
  if(/bucle|fibonacci|histograma|triangulo/.test(s))temas.push('Bucles');
  let modulo=/feip_(coderunner|teorico)|simulador/.test(s)?5:temas.includes('Excepciones')||/vc4p/.test(s)?4:temas.some(x=>['Matrices','Arrays','Listas','Pilas','Colas','Mapas'].includes(x))?3:temas.includes('POO')||/vc1p/.test(s)?2:/vc[23]p/.test(s)?3:1;
  const carpeta=p.split('/').slice(-2,-1)[0]||'';
  const human=x=>x.replace(/\.[^.]+$/,'').replace(/_/g,' ').replace(/([a-záéíóú])([A-Z])/g,'$1 $2');
  const tipo={html:'Interactivo',md:'Enunciado / apuntes',java:'Código Java',png:'Imagen',jpg:'Imagen',jpeg:'Imagen',pdf:'PDF'}[ext];
  const nombre=/^main\.java$/i.test(file)?'Main — '+human(carpeta):human(file);
  resultado.push({nombre,descripcion:tipo+' · '+human(carpeta),archivo:p,modulo,tipo,temas});
  usados.add(p);
 }
 return resultado;
}
const root = 'src/Apoyo_Diciembre2026';
function walk(dir) { return fs.readdirSync(dir,{withFileTypes:true}).flatMap(e => e.isDirectory()?walk(path.join(dir,e.name)):e.isFile()?[path.join(dir,e.name)]:[]); }
const paths = walk(root).map(p=>path.relative(root,p).split(path.sep).join('/'));
const file='assets/catalogo.js';
const raw=fs.readFileSync(file,'utf8');
const match=raw.match(/const recursos\s*=\s*(\[[\s\S]*\]);/);
if(!match)throw Error('Formato de catálogo inesperado');
const original=JSON.parse(match[1]);
const result=generar(original,paths);
fs.writeFileSync(file,raw.replace(match[1],JSON.stringify(result,null,2)));
console.log(result.length+' recursos validados');
