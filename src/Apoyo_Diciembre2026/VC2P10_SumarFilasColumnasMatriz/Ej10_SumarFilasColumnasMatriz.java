package Apoyo_Diciembre2026.VC2P10_SumarFilasColumnasMatriz;

import CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_Arrays.SumarFilasColumnasMatriz;

import java.util.Arrays;

public class Ej10_SumarFilasColumnasMatriz {
    public static void main(String[] args) {
        int[][] miMatriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] sumasFilas = SumarFilasColumnasMatriz.sumarFilas(miMatriz);
        int[] sumasColumnas = SumarFilasColumnasMatriz.sumarColumnas(miMatriz);

        System.out.println("Sumas de las filas: " + Arrays.toString(sumasFilas));
        System.out.println("Sumas de las columnas: " + Arrays.toString(sumasColumnas));

    }

    public static int[] sumarFilas(int[][] matriz) {
        // Verifica si la matriz no está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }

        int [] resultado = new int [matriz.length];

        for (int i = 0; i < matriz.length; i++){

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz [i][j];
            }

            resultado[i] = suma;
        }

        return resultado;
    }

    public static int[] sumarColumnas(int[][] matriz) {
        // Verifica si la matriz no está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }

        int [] resultado = new int [matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++){

            int suma  = 0;

            for (int i = 0; i < matriz.length; i++){

                suma += matriz [i][j];
            }

            resultado[j] = suma;
        }

        return resultado;
    }
}


