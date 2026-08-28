package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

import java.util.Arrays;

public class DuplicarPares {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] resultado = duplicarPares(arr);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] duplicarPares(int[] arr) {

        int[] resultado = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            // Si es par, lo duplicamos
            if (arr[i] % 2 == 0) {

                resultado[i] = arr[i] * 2;

            } else {

                // Si es impar, queda igual
                resultado[i] = arr[i];
            }
        }

        return resultado;
    }
}
