package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

import java.util.Arrays;

public class Ej01_invertirArray {
    public static void main(String[] args) {
        /*
         * Ejercicio 1: invertirArray
         *
         * Dificultad: básica
         *
         * Enunciado:
         * Implementar un método que reciba un array de enteros y devuelva un nuevo array con sus elementos en orden
         * inverso.
         *
         */

        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {10, 20, 30};
        int [] array3 = {5};
        int [] array4 = {};

        int [] resultado1 = invertirArray(array1);
        int [] resultado2 = invertirArray(array2);
        int [] resultado3 = invertirArray(array3);
        int [] resultado4 = invertirArray(array4);

        System.out.println(Arrays.toString(resultado1));
        System.out.println(Arrays.toString(resultado2));
        System.out.println(Arrays.toString(resultado3));
        System.out.println(Arrays.toString(resultado4));

    }

    public static int[] invertirArray(int[] array) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[array.length - 1 - i];
        }
        return resultado;
    }
}

