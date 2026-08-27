package Modulo03_LogicaDeProgramacionAvanzada.Matrices.FilasYColumnas;

import java.util.Arrays;

public class FilasYColumnas {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println(
                "Suma filas: " +
                        Arrays.toString(sumarFilas(matriz))
        );


        System.out.println(
                "Suma columnas: " +
                        Arrays.toString(sumarColumnas(matriz))
        );
    }


    public static int[] sumarFilas(int[][] matriz) {

        int[] resultado = new int[matriz.length];


        for (int i = 0; i < matriz.length; i++) {

            int suma = 0; // Reinicio la suma para cada fila


            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }


            resultado[i] = suma;
        }


        return resultado;
    }


    public static int[] sumarColumnas(int[][] matriz) {

        int[] resultado = new int[matriz[0].length];


        for (int j = 0; j < matriz[0].length; j++) {

            int suma = 0; // Reinicio la suma para cada columna


            for (int i = 0; i < matriz.length; i++) {

                suma += matriz[i][j];
            }


            resultado[j] = suma;
        }


        return resultado;
    }
}