package Apoyo_Diciembre2026.VC2P7_ArrayInvertido_DuplicandoPares;

import java.util.Arrays;

public class ArrayInvertidoPares {

    public static void main(String[] args) {
        int[] numeros = {3, 4, 7, 2};

        int[] resultado = invertirYDuplicarPares(numeros);

        System.out.println(Arrays.toString(resultado)); // [4, 7, 8, 3]
    }

    public static int[] invertirYDuplicarPares(int[] numeros) {
        int[] resultado = new int[numeros.length];
        int posicion = 0;

        // Leemos el original desde el último elemento.
        for (int i = numeros.length - 1; i >= 0; i--) {
            int valor = numeros[i];

            // Si el valor es par, lo multiplicamos por 2.
            if (valor % 2 == 0) {
                valor = valor * 2;
            }

            // Guardamos todos los valores, pares e impares.
            resultado[posicion] = valor;
            posicion++;
        }

        return resultado;
    }
}