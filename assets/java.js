'use strict';

const codigo = document.querySelector('pre#code');
const fuente = codigo.textContent;
const tokens = /\/\/[^\n]*|\/\*[\s\S]*?\*\/|"(?:\\.|[^"\\])*"|'(?:\\.|[^'\\])*'|\b(?:public|private|static|void|int|boolean|char|return|if|else|for|while|new|null|true|false)\b|\b\d+\b/g;
const fragmento = document.createDocumentFragment();
let inicio = 0;

for (const token of fuente.matchAll(tokens)) {
  const texto = token[0];
  const tramo = document.createElement('span');
  if (texto.startsWith('/')) tramo.className = 'java-comentario';
  else if (texto.startsWith('"') || texto.startsWith("'")) tramo.className = 'java-cadena';
  else if (/^\d/.test(texto)) tramo.className = 'java-numero';
  else tramo.className = 'java-palabra';
  tramo.textContent = texto;
  fragmento.append(fuente.slice(inicio, token.index), tramo);
  inicio = token.index + texto.length;
}
fragmento.append(fuente.slice(inicio));
codigo.replaceChildren(fragmento);
