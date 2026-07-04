package Bloque4_POO.Pregunta17_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ================================
        // PREGUNTA 17 — LINKEDLIST
        // ================================
        //
        // Este ejercicio trabaja con una LinkedList.
        //
        // LinkedList es una lista.
        //
        // Permite:
        //
        // - Agregar elementos.
        // - Eliminar elementos.
        // - Acceder por índice.
        //
        // OJO:
        //
        // Cuando eliminas un elemento,
        // los índices se reacomodan.
        //
        // Esa es la trampa principal del ejercicio.

        LinkedList<String> lista = new LinkedList<>();

        // Agregamos elementos a la lista.
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        // Estado inicial de la lista:
        //
        // Índice 0 -> A
        // Índice 1 -> B
        // Índice 2 -> C
        // Índice 3 -> D
        // Índice 4 -> E
        //
        // Lista:
        //
        // [A, B, C, D, E]

        // Llamamos al método procesarLista.
        //
        // IMPORTANTE:
        //
        // La lista es un objeto.
        //
        // Cuando se pasa como parámetro,
        // el método trabaja sobre la misma lista.
        //
        // Por eso los cambios que se hacen dentro de procesarLista
        // afectan también a la lista que está en el main.
        procesarLista(lista);

        // Luego de procesar la lista,
        // se imprime el elemento que quedó en la posición 2.
        System.out.println("Elemento en la posición 2: " + lista.get(2));
    }

    public static void procesarLista(LinkedList<String> lista) {

        // Recibimos esta lista:
        //
        // [A, B, C, D, E]

        // --------------------------------
        // PRIMER CAMBIO
        // --------------------------------
        //
        // remove(0) elimina el elemento de la posición 0.
        //
        // En este momento:
        //
        // posición 0 -> A
        //
        // Entonces se elimina "A".
        lista.remove(0);

        // Después de eliminar A:
        //
        // [B, C, D, E]
        //
        // Ahora los índices cambiaron:
        //
        // posición 0 -> B
        // posición 1 -> C
        // posición 2 -> D
        // posición 3 -> E

        // --------------------------------
        // SEGUNDO CAMBIO
        // --------------------------------
        //
        // remove(2) elimina el elemento que está en la posición 2.
        //
        // OJO:
        //
        // Ya no es la misma posición 2 de antes.
        //
        // Antes de borrar A, posición 2 era C.
        //
        // Pero después de borrar A, la lista quedó:
        //
        // [B, C, D, E]
        //
        // Entonces posición 2 ahora es D.
        lista.remove(2);

        // Después de eliminar D:
        //
        // [B, C, E]
        //
        // Índices:
        //
        // posición 0 -> B
        // posición 1 -> C
        // posición 2 -> E

        // --------------------------------
        // TERCER CAMBIO
        // --------------------------------
        //
        // add(2, "X") agrega "X" en la posición 2.
        //
        // No reemplaza a E.
        //
        // Inserta X antes de E.
        lista.add(2, "X");

        // Después de agregar X:
        //
        // [B, C, X, E]
        //
        // Índices finales:
        //
        // posición 0 -> B
        // posición 1 -> C
        // posición 2 -> X
        // posición 3 -> E
    }
}

/*
================================================
RESULTADO FINAL
================================================

Lista inicial:

[A, B, C, D, E]

Después de lista.remove(0):

[B, C, D, E]

Después de lista.remove(2):

[B, C, E]

Después de lista.add(2, "X"):

[B, C, X, E]

Entonces:

lista.get(2)

devuelve:

X

================================================
SALIDA
================================================

Elemento en la posición 2: X

================================================
RESPUESTA
================================================

a. Elemento en la posición 2: X

================================================
IDEA CLAVE
================================================

Cuando eliminas elementos de una lista,
los índices se corren.

No memorices la posición inicial.
Tienes que ir actualizando la lista paso a paso.

Los índices en listas se mueven más que proyecto Java
cuando uno cambia carpetas en IntelliJ.
*/