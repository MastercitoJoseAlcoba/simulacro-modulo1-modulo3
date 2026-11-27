package Apoyo_Diciembre2026.VC3P2_RotacionMatriz;

public class Ej02_RotacionMatriz {
    public static void main(String[] args) {

        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Ej02_RotacionMatriz RotacionMatriz = null;
        RotacionMatriz.imprimirMatriz(RotacionMatriz.rotarMatriz90(m1));
    }

    public static int[][] rotarMatriz90(int[][] matriz) {
        // COMPLETAR

        // Validacion de matriz cuadrada
        if (matriz == null || matriz.length == 0){
            return null;
        }

        int n = matriz.length;

        // Validar que la matriz sea cuadrada
        for (int i = 0; i < n; i++){
            if (matriz[i] == null || matriz[i].length != n){
                return null;
            }
        }

        // Crear una nueva matriz
        int [][] resultado = new int [n][n];

        // Recorrer la matriz original
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                resultado [j][n - 1 - i] = matriz [i][j];
            }
        }
        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {

        if (matriz == null) {
            System.out.println("null");
            return;
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}

