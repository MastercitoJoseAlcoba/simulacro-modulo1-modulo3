package PruebaDZA.Modulo3.Arrays;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] numeros = new int[3][4]; // filas y columnas
        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [0][2] = 3;
        numeros [0][3] = 4;

        for (int i = 0; i < numeros.length; i++) { // filas
            for (int j = 0; j < numeros[i].length; j++) { // columnas
                System.out.println(numeros[i][j] + " -- ");
            }
        }

        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.println(numeros[fila][columna] + " -- ");
            }
        }

        System.out.println();
    }
}
