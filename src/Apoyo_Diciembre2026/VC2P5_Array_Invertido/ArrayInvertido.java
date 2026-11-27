package Apoyo_Diciembre2026.VC2P5_Array_Invertido;

import java.util.Arrays;

public class ArrayInvertido {

    public static void main(String[] args) {
        int[] numeros = {4, -2, 9, 1};
        int[] invertido = invertirArray(numeros);

        System.out.println("Array invertido: " + Arrays.toString(invertido));

        if (invertido.length > 0) {
            int ultimo = invertido[invertido.length - 1];
            System.out.println("Último elemento del invertido: " + ultimo);
        } else {
            System.out.println("El array está vacío");
        }
    }

    public static int[] invertirArray(int[] numeros) {
        int[] resultado = new int[numeros.length];
        int posicion = 0;

        // i baja en el original y posicion sube en el resultado.
        for (int i = numeros.length - 1; i >= 0; i--) {
            resultado[posicion] = numeros[i];
            posicion++;
        }

        return resultado;
    }
}