package Parcial_Mejores_Ejercicios.SumarFilas;

public class Pregunta5 {
    public static int[] sumarFilas(int[][] matriz) {

        int[] resultado = new int[matriz.length]; // Creas un array con la misma cantidad de posiciones que filas tiene la matriz.

        for (int fila = 0; fila < matriz.length; fila++) { // Después recorrés fila por fila:

            int suma = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) { // Y dentro de cada fila recorrés sus columnas:
                suma += matriz[fila][columna];
            }

            resultado[fila] = suma; // Cada fila guarda su suma en la misma posición del array resultado.
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matriz = { // Tiene 3 filas, entonces el resultado tendrá 3 posiciones:
                {3, 5, 2}, // 3 + 5 + 2 = 10
                {4, 8, 1},
                {7, 6, 9}
        };

        System.out.println(java.util.Arrays.toString(sumarFilas(matriz)));

    }
}
