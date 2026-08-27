package Integer.MIN_VALUE_y_Integer.MAX_VALUE;

import java.util.Arrays;

public class EjerciciosMaximosMinimosResueltos {

    public static void main(String[] args) {

        int[] numeros = {5, -8, 12, 7, 20, 3, -4};

        int[][] matriz = {
                {3, 8, 4},
                {10, 5, 6},
                {7, 9, 12}
        };

        System.out.println("=== ARRAYS ===");

        System.out.println("Máximo: " + encontrarMaximo(numeros));
        System.out.println("Mínimo: " + encontrarMinimo(numeros));
        System.out.println("Máximo par: " + maximoPar(numeros));
        System.out.println("Mínimo par: " + minimoPar(numeros));
        System.out.println("Máximo impar: " + maximoImpar(numeros));
        System.out.println("Mínimo impar: " + minimoImpar(numeros));


        System.out.println("\n=== MATRICES ===");

        System.out.println("Máximo matriz: " + maximoMatriz(matriz));
        System.out.println("Mínimo matriz: " + minimoMatriz(matriz));
        System.out.println("Máximo par matriz: " + maximoParMatriz(matriz));
        System.out.println("Mínimo impar matriz: " + minimoImparMatriz(matriz));


        System.out.println("\n=== POR FILAS ===");

        System.out.println("Máximo por fila: "
                + Arrays.toString(maximoPorFila(matriz)));

        System.out.println("Mínimo por fila: "
                + Arrays.toString(minimoPorFila(matriz)));

        System.out.println("Máximo par por fila: "
                + Arrays.toString(maximoParPorFila(matriz)));

        System.out.println("Mínimo par por fila: "
                + Arrays.toString(minimoParPorFila(matriz)));

        System.out.println("Máximo impar por fila: "
                + Arrays.toString(maximoImparPorFila(matriz)));

        System.out.println("Mínimo impar por fila: "
                + Arrays.toString(minimoImparPorFila(matriz)));


        System.out.println("\n=== POR COLUMNAS ===");

        System.out.println("Máximo por columna: "
                + Arrays.toString(maximoPorColumna(matriz)));

        System.out.println("Mínimo por columna: "
                + Arrays.toString(minimoPorColumna(matriz)));
    }


    // =========================================================
    // EJERCICIO 1 - MÁXIMO DE UN ARRAY
    // =========================================================

    public static int encontrarMaximo(int[] numeros) {

        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maximo) {

                maximo = numeros[i];
            }
        }

        return maximo;
    }


    // =========================================================
    // EJERCICIO 2 - MÍNIMO DE UN ARRAY
    // =========================================================

    public static int encontrarMinimo(int[] numeros) {

        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < minimo) {

                minimo = numeros[i];
            }
        }

        return minimo;
    }


    // =========================================================
    // EJERCICIO 3 - MÁXIMO PAR
    // =========================================================

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


    // =========================================================
    // EJERCICIO 4 - MÍNIMO PAR
    // =========================================================

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


    // =========================================================
    // EJERCICIO 5 - MÁXIMO IMPAR
    // =========================================================

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


    // =========================================================
    // EJERCICIO 6 - MÍNIMO IMPAR
    // =========================================================

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


    // =========================================================
    // EJERCICIO 7 - MÁXIMO DE TODA LA MATRIZ
    // =========================================================

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


    // =========================================================
    // EJERCICIO 8 - MÍNIMO DE TODA LA MATRIZ
    // =========================================================

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


    // =========================================================
    // EJERCICIO 9 - MÁXIMO PAR DE TODA LA MATRIZ
    // =========================================================

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


    // =========================================================
    // EJERCICIO 10 - MÍNIMO IMPAR DE TODA LA MATRIZ
    // =========================================================

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


    // =========================================================
    // EJERCICIO 11 - MÁXIMO DE CADA FILA
    // =========================================================

    public static int[] maximoPorFila(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

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


    // =========================================================
    // EJERCICIO 12 - MÍNIMO DE CADA FILA
    // =========================================================

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


    // =========================================================
    // EJERCICIO 13 - MÁXIMO PAR DE CADA FILA
    // =========================================================

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


    // =========================================================
    // EJERCICIO 14 - MÍNIMO PAR DE CADA FILA
    // =========================================================

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


    // =========================================================
    // EJERCICIO 15 - MÁXIMO IMPAR DE CADA FILA
    // =========================================================

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


    // =========================================================
    // EJERCICIO 16 - MÍNIMO IMPAR DE CADA FILA
    // =========================================================

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


    // =========================================================
    // EJERCICIO 17 - MÁXIMO DE CADA COLUMNA
    // =========================================================

    public static int[] maximoPorColumna(int[][] matriz) {

        int[] resultado = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {

            int maxColumna = Integer.MIN_VALUE;

            for (int i = 0; i < matriz.length; i++) {

                if (matriz[i][j] > maxColumna) {

                    maxColumna = matriz[i][j];
                }
            }

            resultado[j] = maxColumna;
        }

        return resultado;
    }


    // =========================================================
    // EJERCICIO 18 - MÍNIMO DE CADA COLUMNA
    // =========================================================

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
}