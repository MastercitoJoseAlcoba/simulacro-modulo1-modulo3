package Apoyo_Septiembre2026.Sep_2026;

public class ExamenArraysYMatrices {

    public static void main(String[] args) {

        /*
         * =====================================================
         *                  EJERCICIO 1 - ARRAYS
         * =====================================================
         *
         * Dado un array de números enteros, implementar un método
         * llamado procesarArray que:
         *
         * 1. Valide que el array no sea null.
         *
         * 2. Recorra el array en orden inverso.
         *
         * 3. Genere un nuevo array con los valores procesados:
         *
         *    - Si el número es PAR, multiplicarlo por 2.
         *
         *    - Si el número es IMPAR, multiplicarlo por 3.
         *
         * 4. Retorne el nuevo array.
         *
         *
         * Ejemplo:
         *
         * numeros = {4, 7, 10, 3}
         *
         * Primero se invierte:
         *
         * {3, 10, 7, 4}
         *
         * Después se procesa:
         *
         * 3  -> impar -> 3 * 3  = 9
         * 10 -> par   -> 10 * 2 = 20
         * 7  -> impar -> 7 * 3  = 21
         * 4  -> par   -> 4 * 2  = 8
         *
         * Resultado esperado:
         *
         * {9, 20, 21, 8}
         *
         *
         * FIRMA:
         *
         * public static int[] procesarArray(int[] numeros)
         *
         * =====================================================
         */


        int[] numeros = {4, 7, 10, 3};

        int[] resultadoArray = procesarArray(numeros);

        System.out.println("=== RESULTADO ARRAY ===");

        for (int i = 0; i < resultadoArray.length; i++) {

            System.out.print(resultadoArray[i] + " ");
        }



        /*
         * =====================================================
         *                EJERCICIO 2 - MATRICES
         * =====================================================
         *
         * Dada una matriz de números enteros, implementar un
         * método llamado maximosParesPorFila que:
         *
         * 1. Recorra todas las filas y columnas de la matriz.
         *
         * 2. Busque el número PAR más grande de cada fila.
         *
         * 3. Genere un array donde cada posición contenga
         *    el máximo par de cada fila.
         *
         * 4. Retorne dicho array.
         *
         *
         * Para buscar el máximo par de cada fila se recomienda:
         *
         * int maxFilaPar = Integer.MIN_VALUE;
         *
         *
         * MATRIZ:
         *
         *  3   8   4
         * 10   5   6
         *  7  14  12
         *
         *
         * FILA 0:
         *
         * pares = 8, 4
         *
         * máximo par = 8
         *
         *
         * FILA 1:
         *
         * pares = 10, 6
         *
         * máximo par = 10
         *
         *
         * FILA 2:
         *
         * pares = 14, 12
         *
         * máximo par = 14
         *
         *
         * Resultado esperado:
         *
         * {8, 10, 14}
         *
         *
         * FIRMA:
         *
         * public static int[] maximosParesPorFila(int[][] matriz)
         *
         * =====================================================
         */


        int[][] matriz = {
                {3, 8, 4},
                {10, 5, 6},
                {7, 14, 12}
        };

        int[] resultadoMatriz = maximosParesPorFila(matriz);

        System.out.println();
        System.out.println();
        System.out.println("=== RESULTADO MATRIZ ===");

        for (int i = 0; i < resultadoMatriz.length; i++) {

            System.out.print(resultadoMatriz[i] + " ");
        }
    }



    /*
     * =========================================================
     *              EJERCICIO 1 - COMPLETAR
     * =========================================================
     */

    public static int[] procesarArray(int[] numeros) {

        // Aca debe completar el codigo

        return null;
    }



    /*
     * =========================================================
     *              EJERCICIO 2 - COMPLETAR
     * =========================================================
     */

    public static int[] maximosParesPorFila(int[][] matriz) {

        // Aca debe completar el codigo

        return null;
    }
}