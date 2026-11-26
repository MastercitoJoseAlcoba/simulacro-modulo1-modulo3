package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

import java.util.Arrays;

public class Ej02_duplicarInvertido {
    public static void main(String[] args) {
        /*
         * Ejercicio 2: duplicarInvertido
         *
         * Dificultad: básica
         *
         * Implementar un método que devuelva un nuevo array con los elementos en orden inverso, multiplicados por dos.
         *
         */

        int [] array1 = {1, 2, 3};
        int [] array2 = {5, 10, 15};
        int [] array3 = {-2, 0, 4};
        int [] array4 = {};

        int [] resultado1 = duplicarInvertido(array1);
        int [] resultado2 = duplicarInvertido(array2);
        int [] resultado3 = duplicarInvertido(array3);
        int [] resultado4 = duplicarInvertido(array4);

        System.out.println(Arrays.toString(resultado1));
        System.out.println(Arrays.toString(resultado2));
        System.out.println(Arrays.toString(resultado3));
        System.out.println(Arrays.toString(resultado4));

    }

    public static int [] duplicarInvertido(int[] array) {
        int[] resultado = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[array.length - 1 - i] * 2;
        }

        return resultado;
    }
}
