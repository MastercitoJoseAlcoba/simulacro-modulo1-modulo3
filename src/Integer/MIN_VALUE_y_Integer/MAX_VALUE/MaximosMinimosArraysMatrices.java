package Integer.MIN_VALUE_y_Integer.MAX_VALUE;

import java.util.Arrays;

public class MaximosMinimosArraysMatrices {

    public static void main(String[] args) {

        // =====================================================
        // ARRAY DE PRUEBA
        // =====================================================

        int[] numeros = {5, -8, 12, 7, 20, 3, -4};

        System.out.println("=== ARRAYS ===");

        System.out.println("Máximo: " + encontrarMaximo(numeros));
        System.out.println("Mínimo: " + encontrarMinimo(numeros));

        System.out.println("Máximo par: " + maximoPar(numeros));
        System.out.println("Mínimo par: " + minimoPar(numeros));

        System.out.println("Máximo impar: " + maximoImpar(numeros));
        System.out.println("Mínimo impar: " + minimoImpar(numeros));


        // =====================================================
        // MATRIZ DE PRUEBA
        // =====================================================

        int[][] matriz = {
                {3, 8, 4},
                {10, 5, 6},
                {7, 9, 12}
        };

        System.out.println("\n=== MATRICES ===");

        System.out.println("Máximo matriz: " + maximoMatriz(matriz));
        System.out.println("Mínimo matriz: " + minimoMatriz(matriz));

        System.out.println("Máximo par matriz: " + maximoParMatriz(matriz));
        System.out.println("Mínimo impar matriz: " + minimoImparMatriz(matriz));


        System.out.println("\nMáximo por fila:");
        System.out.println(Arrays.toString(maximoPorFila(matriz)));

        System.out.println("Mínimo por fila:");
        System.out.println(Arrays.toString(minimoPorFila(matriz)));

        System.out.println("Máximo par por fila:");
        System.out.println(Arrays.toString(maximoParPorFila(matriz)));

        System.out.println("Mínimo par por fila:");
        System.out.println(Arrays.toString(minimoParPorFila(matriz)));

        System.out.println("Máximo impar por fila:");
        System.out.println(Arrays.toString(maximoImparPorFila(matriz)));

        System.out.println("Mínimo impar por fila:");
        System.out.println(Arrays.toString(minimoImparPorFila(matriz)));


        System.out.println("\nMáximo por columna:");
        System.out.println(Arrays.toString(maximoPorColumna(matriz)));

        System.out.println("Mínimo por columna:");
        System.out.println(Arrays.toString(minimoPorColumna(matriz)));
    }


    /*
     * =========================================================
     * 1. MÁXIMO DE UN ARRAY
     * =========================================================
     */

    public static int encontrarMaximo(int[] numeros) {

        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maximo) {

                maximo = numeros[i];
            }
        }

        return maximo;
    }


    /*
     * =========================================================
     * 2. MÍNIMO DE UN ARRAY
     * =========================================================
     */

    public static int encontrarMinimo(int[] numeros) {

        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < minimo) {

                minimo = numeros[i];
            }
        }

        return minimo;
    }


    /*
     * =========================================================
     * 3. MÁXIMO PAR
     * =========================================================
     */

    public static int maximoPar(int[] numeros) {

        int maxPar = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0 &&
                    numeros[i] > maxPar) {

                maxPar = numeros[i];
            }
        }

        return maxPar;
    }


    /*
     * =========================================================
     * 4. MÍNIMO PAR
     * =========================================================
     */

    public static int minimoPar(int[] numeros) {

        int minPar = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0 &&
                    numeros[i] < minPar) {

                minPar = numeros[i];
            }
        }

        return minPar;
    }


    /*
     * =========================================================
     * 5. MÁXIMO IMPAR
     * =========================================================
     */

    public static int maximoImpar(int[] numeros) {

        int maxImpar = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 != 0 &&
                    numeros[i] > maxImpar) {

                maxImpar = numeros[i];
            }
        }

        return maxImpar;
    }


    /*
     * =========================================================
     * 6. MÍNIMO IMPAR
     * =========================================================
     */

    public static int minimoImpar(int[] numeros) {

        int minImpar = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 != 0 &&
                    numeros[i] < minImpar) {

                minImpar = numeros[i];
            }
        }

        return minImpar;
    }


    /*
     * =========================================================
     * 7. MÁXIMO DE TODA UNA MATRIZ
     * =========================================================
     */

    public static int maximoMatriz(int[][] matriz) {

        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > maximo) {

                    maximo = matriz[i][j];
                }
            }
        }

        return maximo;
    }


    /*
     * =========================================================
     * 8. MÍNIMO DE TODA UNA MATRIZ
     * =========================================================
     */

    public static int minimoMatriz(int[][] matriz) {

        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < minimo) {

                    minimo = matriz[i][j];
                }
            }
        }

        return minimo;
    }


    /*
     * =========================================================
     * 9. MÁXIMO PAR DE TODA LA MATRIZ
     * =========================================================
     */

    public static int maximoParMatriz(int[][] matriz) {

        int maxPar = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0 &&
                        matriz[i][j] > maxPar) {

                    maxPar = matriz[i][j];
                }
            }
        }

        return maxPar;
    }


    /*
     * =========================================================
     * 10. MÍNIMO IMPAR DE TODA LA MATRIZ
     * =========================================================
     */

    public static int minimoImparMatriz(int[][] matriz) {

        int minImpar = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 != 0 &&
                        matriz[i][j] < minImpar) {

                    minImpar = matriz[i][j];
                }
            }
        }

        return minImpar;
    }


    /*
     * =========================================================
     * 11. MÁXIMO DE CADA FILA
     * =========================================================
     */

    public static int[] maximoPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            // Se reinicia para CADA FILA
            int maxFila = Integer.MIN_VALUE;

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > maxFila) {

                    maxFila = matriz[i][j];
                }
            }

            resultado[i] = maxFila;
        }

        return resultado;
    }


    /*
     * =========================================================
     * 12. MÍNIMO DE CADA FILA
     * =========================================================
     */

    public static int[] minimoPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            int minFila = Integer.MAX_VALUE;

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < minFila) {

                    minFila = matriz[i][j];
                }
            }

            resultado[i] = minFila;
        }

        return resultado;
    }


    /*
     * =========================================================
     * 13. MÁXIMO PAR DE CADA FILA
     *
     * ESTE ES EL PATRÓN IMPORTANTE:
     *
     * int maxFilaPar = Integer.MIN_VALUE;
     * =========================================================
     */

    public static int[] maximoParPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            int maxFilaPar = Integer.MIN_VALUE;

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


    /*
     * =========================================================
     * 14. MÍNIMO PAR DE CADA FILA
     * =========================================================
     */

    public static int[] minimoParPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            int minFilaPar = Integer.MAX_VALUE;

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0 &&
                        matriz[i][j] < minFilaPar) {

                    minFilaPar = matriz[i][j];
                }
            }

            resultado[i] = minFilaPar;
        }

        return resultado;
    }


    /*
     * =========================================================
     * 15. MÁXIMO IMPAR DE CADA FILA
     * =========================================================
     */

    public static int[] maximoImparPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            int maxFilaImpar = Integer.MIN_VALUE;

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 != 0 &&
                        matriz[i][j] > maxFilaImpar) {

                    maxFilaImpar = matriz[i][j];
                }
            }

            resultado[i] = maxFilaImpar;
        }

        return resultado;
    }


    /*
     * =========================================================
     * 16. MÍNIMO IMPAR DE CADA FILA
     * =========================================================
     */

    public static int[] minimoImparPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            int minFilaImpar = Integer.MAX_VALUE;

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 != 0 &&
                        matriz[i][j] < minFilaImpar) {

                    minFilaImpar = matriz[i][j];
                }
            }

            resultado[i] = minFilaImpar;
        }

        return resultado;
    }


    /*
     * =========================================================
     * 17. MÁXIMO DE CADA COLUMNA
     * =========================================================
     */

    public static int[] maximoPorColumna(int[][] matriz) {

        int[] resultado = new int[matriz[0].length];

        // Primero recorremos columnas
        for (int j = 0; j < matriz[0].length; j++) {

            int maxColumna = Integer.MIN_VALUE;

            // Después filas
            for (int i = 0; i < matriz.length; i++) {

                if (matriz[i][j] > maxColumna) {

                    maxColumna = matriz[i][j];
                }
            }

            resultado[j] = maxColumna;
        }

        return resultado;
    }


    /*
     * =========================================================
     * 18. MÍNIMO DE CADA COLUMNA
     * =========================================================
     */

    public static int[] minimoPorColumna(int[][] matriz) {

        int[] resultado = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {

            int minColumna = Integer.MAX_VALUE;

            for (int i = 0; i < matriz.length; i++) {

                if (matriz[i][j] < minColumna) {

                    minColumna = matriz[i][j];
                }
            }

            resultado[j] = minColumna;
        }

        return resultado;
    }


    /*
     * =========================================================
     *              IDEAS CLAVE PARA RECORDAR
     * =========================================================
     *
     *
     * 1. BUSCAR MÁXIMO
     *
     * int maximo = Integer.MIN_VALUE;
     *
     * if (numero > maximo) {
     *     maximo = numero;
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 2. BUSCAR MÍNIMO
     *
     * int minimo = Integer.MAX_VALUE;
     *
     * if (numero < minimo) {
     *     minimo = numero;
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 3. MÁXIMO PAR
     *
     * int maxPar = Integer.MIN_VALUE;
     *
     * if (numero % 2 == 0 &&
     *     numero > maxPar) {
     *
     *     maxPar = numero;
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 4. MÍNIMO PAR
     *
     * int minPar = Integer.MAX_VALUE;
     *
     * if (numero % 2 == 0 &&
     *     numero < minPar) {
     *
     *     minPar = numero;
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 5. MÁXIMO IMPAR
     *
     * int maxImpar = Integer.MIN_VALUE;
     *
     * if (numero % 2 != 0 &&
     *     numero > maxImpar) {
     *
     *     maxImpar = numero;
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 6. MÍNIMO IMPAR
     *
     * int minImpar = Integer.MAX_VALUE;
     *
     * if (numero % 2 != 0 &&
     *     numero < minImpar) {
     *
     *     minImpar = numero;
     * }
     *
     *
     * =========================================================
     * REGLA DE ORO
     * =========================================================
     *
     * MÁXIMO
     *
     * Integer.MIN_VALUE
     *
     *
     * MÍNIMO
     *
     * Integer.MAX_VALUE
     *
     *
     * "Para buscar el MÁS GRANDE,
     *  arranco desde el MÁS CHICO."
     *
     *
     * "Para buscar el MÁS CHICO,
     *  arranco desde el MÁS GRANDE."
     *
     *
     * =========================================================
     * MUY IMPORTANTE EN MATRICES
     * =========================================================
     *
     * Si dice:
     *
     * "máximo de CADA FILA"
     *
     * el máximo se reinicia dentro del for de filas:
     *
     *
     * for (int i = 0; i < matriz.length; i++) {
     *
     *     int maxFila = Integer.MIN_VALUE;
     *
     *     for (int j = 0; j < matriz[i].length; j++) {
     *
     *         ...
     *     }
     * }
     *
     *
     * Por eso:
     *
     * int maxFilaPar = Integer.MIN_VALUE;
     *
     * va ENTRE los dos for.
     *
     *
     * =========================================================
     * FILAS VS COLUMNAS
     * =========================================================
     *
     * POR FILAS:
     *
     * for (int i = 0; i < matriz.length; i++) {
     *
     *     for (int j = 0; j < matriz[i].length; j++) {
     *
     *     }
     * }
     *
     *
     * POR COLUMNAS:
     *
     * for (int j = 0; j < matriz[0].length; j++) {
     *
     *     for (int i = 0; i < matriz.length; i++) {
     *
     *     }
     * }
     *
     * =========================================================
     */
}