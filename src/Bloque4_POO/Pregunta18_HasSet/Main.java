package Bloque4_POO.Pregunta18_HasSet;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // ================================
        // PREGUNTA 18 — HASHSET
        // ================================
        //
        // Este ejercicio trabaja con HashSet.
        //
        // HashSet es una colección tipo conjunto.
        //
        // Sus dos características más importantes son:
        //
        // 1) No permite duplicados.
        // 2) No garantiza el orden de impresión.
        //
        // Es decir:
        //
        // Si agregas dos veces el mismo valor,
        // queda guardado una sola vez.
        //
        // Y cuando imprimís,
        // el orden puede no ser el mismo en que agregaste.

        HashSet<String> numeros = new HashSet<>();

        // Agregamos "dos".
        numeros.add("dos");

        // Agregamos "tres".
        numeros.add("tres");

        // Intentamos agregar "tres" otra vez.
        //
        // Pero HashSet NO permite duplicados.
        //
        // Entonces este segundo "tres" no se agrega.
        //
        // No da error.
        // Simplemente lo ignora.
        numeros.add("tres");

        // Agregamos "cuatro".
        numeros.add("cuatro");

        // Agregamos "cinco".
        numeros.add("cinco");

        // Imprimimos el HashSet.
        //
        // Puede imprimir algo como:
        //
        // [cinco, dos, tres, cuatro]
        //
        // O también podría salir en otro orden.
        //
        // Lo importante NO es el orden.
        //
        // Lo importante es que "tres" aparece una sola vez.
        System.out.println(numeros);
    }
}

/*
================================================
PREGUNTA
================================================

Indicar cuál afirmación es correcta.

a. HashSet permite elementos duplicados y mantiene el orden de inserción.

b. HashSet no permite elementos duplicados y no garantiza el orden de impresión.

c. HashSet permite elementos duplicados, pero los ordena automáticamente.

d. HashSet no permite elementos duplicados y siempre imprime en orden alfabético.


================================================
ANÁLISIS DE CADA OPCIÓN
================================================

Opción a:
"HashSet permite elementos duplicados y mantiene el orden de inserción."

Incorrecta.

HashSet NO permite duplicados.
Además, NO mantiene orden de inserción.


Opción b:
"HashSet no permite elementos duplicados y no garantiza el orden de impresión."

Correcta.

Esta es exactamente la definición importante de HashSet.


Opción c:
"HashSet permite elementos duplicados, pero los ordena automáticamente."

Incorrecta.

HashSet no permite duplicados.
Además, no ordena automáticamente.


Opción d:
"HashSet no permite elementos duplicados y siempre imprime en orden alfabético."

Incorrecta.

La primera parte es correcta:
no permite duplicados.

Pero la segunda es falsa:
HashSet no imprime siempre en orden alfabético.


================================================
RESPUESTA
================================================

b. HashSet no permite elementos duplicados y no garantiza el orden de impresión.


================================================
IDEA CLAVE
================================================

HashSet:
- No admite duplicados.
- No mantiene orden de inserción.
- No ordena alfabéticamente.

Si necesitas mantener el orden de inserción:
LinkedHashSet

Si necesitas orden natural:
TreeSet

Ejemplo:

HashSet:
Puede imprimir en cualquier orden.

LinkedHashSet:
Mantiene el orden en que agregaste.

TreeSet:
Ordena automáticamente.

HashSet es como una mochila:
guarda cosas, pero no prometas encontrarlas ordenadas.
*/