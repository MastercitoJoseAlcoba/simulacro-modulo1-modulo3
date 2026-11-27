package Apoyo_Diciembre2026.VC2P4_Array_Invertido_UltimoElemento;

import java.util.Arrays;

public class ArrayInvertido {

    public static void main(String[] args) {
        int[] numeros = {4, -2, 9, 1};

        // Guardamos el array que devuelve el método.
        int[] invertido = invertirArray(numeros);

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array invertido: " + Arrays.toString(invertido));

        // Verificamos que haya elementos antes de buscar el último.
        if (invertido.length == 0) {
            System.out.println("El array está vacío");
        } else {
            int ultimo = invertido[invertido.length - 1];
            System.out.println("Último elemento del invertido: " + ultimo);
        }
    }

    public static int[] invertirArray(int[] array) {
        int[] resultado = new int[array.length];

        // Leemos el original desde el final y llenamos el nuevo desde el inicio.
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[array.length - 1 - i];
        }

        return resultado;
    }
}