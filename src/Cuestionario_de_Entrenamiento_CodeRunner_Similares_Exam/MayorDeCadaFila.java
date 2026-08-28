package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class MayorDeCadaFila {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 4},
                {5, 8, 3},
                {12, 2, 7}
        };

        mayorFilas(matriz);
    }

    private static void mayorFilas(int[][] matriz) {

        // Recorremos cada fila
        for (int i = 0; i < matriz.length; i++) {

            // Tomamos el primer elemento como mayor inicial
            int mayor = matriz[i][0];

            // Arrancamos en 1 porque la posición 0
            // ya fue usada como mayor inicial
            for (int j = 1; j < matriz[i].length; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];
                }
            }

            System.out.println("Mayor fila :" + i + " es " + mayor);
        }
    }
}

