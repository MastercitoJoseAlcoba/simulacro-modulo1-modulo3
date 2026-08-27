package Modulo03_LogicaDeProgramacionAvanzada.Matrices.MaximosMinimos;

public class MaximosMinimos {

    public static void main(String[] args) {

        int[][] matriz = {
                {3, 8, 4},
                {10, 5, 6},
                {7, 14, 12}
        };

        System.out.println("Máximo: " + buscarMaximo(matriz));

        System.out.println("Mínimo: " + buscarMinimo(matriz));

        System.out.println("Máximo par: " + buscarMaximoPar(matriz));

        System.out.println("Mínimo impar: " + buscarMinimoImpar(matriz));
    }


    public static int buscarMaximo(int[][] matriz) {

        int maximo = Integer.MIN_VALUE; // Inicio desde el menor int posible

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > maximo) {

                    maximo = matriz[i][j];
                }
            }
        }

        return maximo;
    }


    public static int buscarMinimo(int[][] matriz) {

        int minimo = Integer.MAX_VALUE; // Inicio desde el mayor int posible

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < minimo) {

                    minimo = matriz[i][j];
                }
            }
        }

        return minimo;
    }


    public static int buscarMaximoPar(int[][] matriz) {

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


    public static int buscarMinimoImpar(int[][] matriz) {

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
}