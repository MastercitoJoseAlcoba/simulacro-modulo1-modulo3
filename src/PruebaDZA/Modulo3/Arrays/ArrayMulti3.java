package PruebaDZA.Modulo3.Arrays;

public class ArrayMulti3 {
    public static void main(String[] args) {
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,10}
        };

        int filas = matriz.length; // Obteniendo el número de filas de la matriz
        int columnas = matriz[0].length; // Obteniendo el número de columnas de la matriz

        System.out.println("La matriz tiene: " + filas + " filas y " + columnas + " columnas");
    }
}
