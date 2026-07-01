package Ejercicios_de_Entrenamiento_Varios.Pregunta06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pregunta6 {
    public class Solution {

        public static List<Integer> obtenerParesDuplicados(List<Integer> numeros) {

            List<Integer> resultado = new ArrayList<Integer>(); // Creas una nueva lista. No tocas la original.

            for (int i = 0; i < numeros.size(); i++) { // Recorrés toda la lista. En listas se usa .size(), no .length.

                int valor = numeros.get(i); // Obtienes el valor de la posición actual.

                if (valor % 2 == 0) { // Preguntás si es par.
                    resultado.add(valor * 2); // Si es par, agregás el doble.
                }
            }

            return resultado;
        }
    }

    /**
     * Idea conceptual: Ojo con esto: en array es numeros.length; en List es numeros.size().
     */

    public static void main(String[] args) {
        Solution Solution = null;
        System.out.println(Solution.obtenerParesDuplicados(Arrays.asList(3, 4, 7, 8, 10)));
        System.out.println(Solution.obtenerParesDuplicados(Arrays.asList(1, 3, 5, 7)));
        System.out.println(Solution.obtenerParesDuplicados(Arrays.asList(2, 4, 6)));
        System.out.println(Solution.obtenerParesDuplicados(Arrays.asList(-4, -3, 0, 5, 8)));
        System.out.println(Solution.obtenerParesDuplicados(new ArrayList<Integer>()));
    }
}
