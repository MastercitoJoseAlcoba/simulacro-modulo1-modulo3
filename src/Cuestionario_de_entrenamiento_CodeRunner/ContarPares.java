package Cuestionario_de_entrenamiento_CodeRunner;

public class ContarPares {
    public static void main(String[] args) {

        int[][] matriz = {
                {11, 20, 32, 41},
                {22, 33, 44, 55, 34, 24},
                {33, 44, 55, 34, 24, 22},
                {3, 9, 12}
        };

        int contar = contarPares(matriz);

        System.out.println(contar);
    }

    public static int contarPares(int[][] matriz) {

        // Contador de números pares
        int contar = 0;

        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {

            // Recorremos las columnas de cada fila
            for (int j = 0; j < matriz[i].length; j++) {

                // Si el resto de dividir entre 2 es 0,
                // el número es par
                if (matriz[i][j] % 2 == 0) {
                    contar++;
                }
            }
        }

        return contar;
    }
}
