package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CuestionarioFinal_Modulo3;

import java.util.Collections;
import java.util.LinkedList;

public class Pregunta6 {
    public static void main(String[] args) {

        LinkedList<String> colores = new LinkedList<>();
        colores.add("azul");
        colores.add("rojo");
        colores.set(0, "violeta"); // Reemplaza el elemento en el índice 0 ("azul") con "violeta"
        colores.add("verde");
        colores.add("amarillo");
        colores.add("gris");
        colores.remove(2); // Elimina el elemento en el índice 2 ("verde")
        Collections.sort(colores); // Ordena la lista alfabéticamente en orden ascendente
        Collections.reverse(colores); // Invierte el orden de la lista, de ascendente a descendente
        colores.add("marron");
        colores.add(1, "naranja"); // Inserta "naranja" en el índice 1, desplazando los elementos existentes
        System.out.println(colores);

        /** ¿Qué se muestra por la consola? */

        /** 1. [violeta, naranja, rojo, gris, amarillo, marron] */

    }
}
