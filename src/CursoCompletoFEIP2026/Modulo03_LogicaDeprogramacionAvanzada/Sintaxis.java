package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada;

import java.util.LinkedList;

public class Sintaxis {
    public static void main(String[] args) {
        // Ejemplo 1: Veamos ahora un programa, utilizando una lista:
        
        /** SINTAXIS: */
        /** ClaseDeLista<TipoDeDatoDeLista> nombreVariable = new ClaseDeLista<TipoDeDatoDeLista> */

        LinkedList<String> listaString = new LinkedList<>();

        // agregar elementos a la lista (ADD)
        listaString.add("Hola"); // Utilizando el add de una lista agregamos el elemento que se pasa como parámetro al final de la lista.
        listaString.add("chau");
        listaString.add("otro texto");
        
        // consulta el tamaño de la lista (SIZE)
        int tamanoLista = listaString.size(); // Obtiene la cantidad de elementos de una lista, suponiendo que se realizaron las add anteriores el tamaño de la lista sería 3.
        
        // Consulta por vacío (EMPTY)
        boolean listaVacia = listaString.isEmpty(); // Retorna true si la lista está vacía. Equivale a: listaString.size()==0.
        
        // contiene elemento (CONTAINS)
        boolean contieneElemento = listaString.contains("otro texto"); // Retorna true si el elemento se encuentra dentro de la lista, false, en caso contrario.
        boolean contieneElemento2 = listaString.contains("hola");
        
        // devolver el elemento en la posición 3 de la lista
        String elementoEnPosicion3 = listaString.get(3); // Retorna el elemento que se encuentra en la posición índice de la lista varLista. Devuelve "false", ya que el índice 3 no existe.
        
        /** Este programa, muestra como crear una lista y como utilizar algunos de sus métodos. */

        }
        
}

