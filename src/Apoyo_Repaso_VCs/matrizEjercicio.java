package Apoyo_Repaso_VCs;

public class matrizEjercicio {
    public static void main(String[] args) {
        int [][] matriz = new int [12][18];
        int [][] resultado = marcarPerimietro(matriz);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + "-");
            }
            System.out.println();
        }

    }

    public static int [][] marcarPerimietro(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int [][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) { //
                    resultado[i][j] = 1;
                } else {
                    resultado[i][j] = matriz[i][j];
                }
            }
        }

        return matriz;
    }
}
