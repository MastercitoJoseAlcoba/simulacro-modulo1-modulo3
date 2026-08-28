package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class SumaDeBordes {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int resultado = sumaBordes(matriz, true);

        System.out.println(resultado);
    }

    public static int sumaBordes(int[][] matriz, boolean sentidoHorario) {

        int suma = 0;

        // Como la matriz es cuadrada,
        // n sirve para filas y columnas
        int n = matriz.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // Detectamos si el elemento está en el borde
                if (i == 0 || i == n - 1 ||
                        j == 0 || j == n - 1) {

                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }
}
