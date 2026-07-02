package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.Collections;
import java.util.LinkedList;

public class Ej_06 {
    public static void main(String[] args) {
        var colores = new LinkedList<String>();

        // Agregar colores a la lista
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");

        // Modificar el valor de un elemento de la lista
        colores.set(1, "Violeta");

        // Agregar un elemento al principio de la lista
        colores.add(0, "Gris");

        // Ordenar la lista
        Collections.sort(colores);

        // Invierte el orden de la lista
        Collections.reverse(colores);

        // Imprimir la lista ordenada
        System.out.println(colores);

    }
}
/**
 * ¿Qué se muestra por la consola?
 *
 * d. [Violeta, Verde, Rojo, Gris]
 *
 */
