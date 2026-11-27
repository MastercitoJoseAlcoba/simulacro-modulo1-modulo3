package Apoyo_Diciembre2026.VC3P3_SumaSubmatrizMaxima;

public class Ej03_SumaSubmatrizMaxima {
    public static void main(String[] args) {

        int[][] m1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        Ej03_SumaSubmatrizMaxima SubmatrizSumaMaxima = null;
        System.out.println(SubmatrizSumaMaxima.sumaSubmatrizMaxima(m1, 2));

    }

    public static int sumaSubmatrizMaxima(int[][] matriz, int k) {

        // Validar matriz y tamaño de k
        if (matriz == null || matriz.length == 0 || k <= 0) {
            return Integer.MIN_VALUE;
        }

        // Validar filas nulas o vacías
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == null || matriz[i].length == 0) {
                return Integer.MIN_VALUE;
            }
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Validar tamaño de la submatriz
        if (k > filas || k > columnas) {
            return Integer.MIN_VALUE;
        }

        int maximo = Integer.MIN_VALUE;

        // Recorrer las posibles submatrices
        for (int i = 0; i <= filas - k; i++) {

            for (int j = 0; j <= columnas - k; j++) {

                int suma = 0;

                // Sumar los elementos de la submatriz
                for (int f = i; f < i + k; f++) {

                    for (int c = j; c < j + k; c++) {
                        suma += matriz[f][c];
                    }
                }

                // Actualizar el máximo
                if (suma > maximo) {
                    maximo = suma;
                }
            }
        }

        return maximo;
    }
}

