package PruebaDZA.Modulo4.Matriz;

import java.util.Arrays;

public class sumarFilasDeUnaMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Sumar filas
        sumarFilasColumnasMatriz(matriz);

        System.out.println("----------------");

        // Sumar columnas
        int[] resultado = sumarColumnas(matriz);

        System.out.println("Resultado: " + Arrays.toString(resultado));
    }

    // SUMAR FILAS
    public static void sumarFilasColumnasMatriz(int[][] matriz) {

        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("La matriz está vacía");
        }

        for (int fila = 0; fila < matriz.length; fila++) {

            if (matriz[fila] == null || matriz[fila].length == 0) {
                throw new IllegalArgumentException("La fila está vacía");
            }

            int sumarFilas = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                sumarFilas += matriz[fila][columna];
            }

            System.out.println("La suma de la fila " + fila + " es: " + sumarFilas);
        }
    }

    // SUMAR COLUMNAS
    public static int[] sumarColumnas(int[][] matriz) {

        if (matriz == null || matriz.length == 0 ||
                matriz[0] == null || matriz[0].length == 0) {

            throw new IllegalArgumentException("La matriz está vacía");
        }

        int cantidadColumnas = matriz[0].length;

        int[] resultado = new int[cantidadColumnas];

        for (int fila = 0; fila < matriz.length; fila++) {
            if (matriz[fila] == null || matriz[fila].length != cantidadColumnas) {
                throw new IllegalArgumentException(
                        "Todas las filas deben tener la misma cantidad de columnas"
                );
            }
        }

        for (int columna = 0; columna < cantidadColumnas; columna++) {

            int sumasColumnas = 0;

            for (int fila = 0; fila < matriz.length; fila++) {

                sumasColumnas += matriz[fila][columna];
            }

            resultado[columna] = sumasColumnas;

            System.out.println("La suma de la columna " + columna + " es: " + sumasColumnas);
        }

        return resultado;
    }
}