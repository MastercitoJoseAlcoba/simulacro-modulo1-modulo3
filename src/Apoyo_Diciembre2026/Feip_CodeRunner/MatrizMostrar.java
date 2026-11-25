package Apoyo_Diciembre2026.Feip_CodeRunner;

public class MatrizMostrar {
    public static void matrizMostrar(char[][] matriz) {
        int ultimo = matriz.length - 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == ultimo || j == 0 || j == ultimo) {
                    matriz[i][j] = '#';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
