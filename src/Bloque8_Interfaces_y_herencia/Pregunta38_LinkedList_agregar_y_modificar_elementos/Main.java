package Bloque8_Interfaces_y_herencia.Pregunta38_LinkedList_agregar_y_modificar_elementos;
/*
PREGUNTA 38 — LINKEDLIST: AGREGAR Y MODIFICAR ELEMENTOS

Tema:
- List
- LinkedList
- add()
- add(indice, elemento)
- set()
- for-each

Pregunta:
¿Qué imprime el programa?

Respuesta correcta:
b. Yorkshire - Pitbul - CaneCorso -
*/

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Declaramos una lista usando la interfaz List.
        //
        // La implementación real es LinkedList.
        //
        // Esto es válido porque LinkedList implementa List.
        List<String> razas = new LinkedList<>();

        // Agregamos "Pastor" al final de la lista.
        //
        // Lista:
        // [Pastor]
        razas.add("Pastor");

        // Agregamos "CaneCorso" al final.
        //
        // Lista:
        // [Pastor, CaneCorso]
        razas.add("CaneCorso");

        // Agregamos "Yorkshire" en la posición 0.
        //
        // Cuando agregamos en una posición específica,
        // el elemento entra en esa posición
        // y los demás se corren hacia la derecha.
        //
        // Antes:
        // [Pastor, CaneCorso]
        //
        // Después:
        // [Yorkshire, Pastor, CaneCorso]
        razas.add(0, "Yorkshire");

        // set(1, "Pitbul") reemplaza el elemento de la posición 1.
        //
        // ATENCIÓN:
        // set no agrega.
        // set modifica/reemplaza.
        //
        // Antes:
        // índice 0 -> Yorkshire
        // índice 1 -> Pastor
        // índice 2 -> CaneCorso
        //
        // Después:
        // índice 0 -> Yorkshire
        // índice 1 -> Pitbul
        // índice 2 -> CaneCorso
        razas.set(1, "Pitbul");

        // Recorremos la lista con for-each.
        //
        // En cada vuelta, raza toma un valor de la lista.
        for (String raza : razas) {

            // Imprime la raza y luego " - ".
            //
            // Usa print, no println.
            // Por eso todo sale en una sola línea.
            System.out.print(raza + " - ");
        }
    }
}

/*
RECORRIDO DE LA LISTA:

Inicio:
[]

Después de:
razas.add("Pastor");

[Pastor]

Después de:
razas.add("CaneCorso");

[Pastor, CaneCorso]

Después de:
razas.add(0, "Yorkshire");

[Yorkshire, Pastor, CaneCorso]

Después de:
razas.set(1, "Pitbul");

[Yorkshire, Pitbul, CaneCorso]

SALIDA FINAL:

Yorkshire - Pitbul - CaneCorso -

IDEA CLAVE:

add(elemento)
agrega al final.

add(indice, elemento)
inserta en esa posición y corre los demás.

set(indice, elemento)
reemplaza el elemento de esa posición.

Diferencia fundamental:

add mete uno nuevo.
set cambia uno que ya existe.

Si confundís add con set,
la lista queda con otra cantidad de elementos.

Java no se enoja,
pero el parcial sí.
*/


