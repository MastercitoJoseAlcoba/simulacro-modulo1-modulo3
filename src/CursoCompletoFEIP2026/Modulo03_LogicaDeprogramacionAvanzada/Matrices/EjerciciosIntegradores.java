package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Matrices;

import java.util.Arrays;

public class EjerciciosIntegradores {

    public static void main(String[] args) {

        int[][] matriz = {
                {3, 8, 4},
                {10, 5, 6},
                {7, 14, 12}
        };


        int[] resultado = maximoParPorFila(matriz);


        System.out.println(
                Arrays.toString(resultado)
        );
    }


    /*
     * =========================================================
     * EJERCICIO
     * =========================================================
     *
     * Buscar el máximo número par de cada fila.
     *
     * Retornar un array con los resultados.
     *
     *
     * Matriz:
     *
     * 3   8   4
     * 10  5   6
     * 7   14  12
     *
     *
     * Resultado:
     *
     * {8, 10, 14}
     */

    public static int[] maximoParPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];


        for (int i = 0; i < matriz.length; i++) {

            int maxFilaPar = Integer.MIN_VALUE; // Reinicio para cada fila


            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0 &&
                        matriz[i][j] > maxFilaPar) {

                    maxFilaPar = matriz[i][j];
                }
            }


            resultado[i] = maxFilaPar;
        }


        return resultado;
    }
}