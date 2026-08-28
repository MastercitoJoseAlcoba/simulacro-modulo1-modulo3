package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

import java.util.Arrays;

public class BubbleSortDeMayorAMenor {
    public static void main(String[] args) {

        int[] numeros = {13, 25, 1, -24, 100, 27, 12};

        ordenamientoBurbuja(numeros);

        System.out.println("Ordenado " + Arrays.toString(numeros));
    }

    public static void ordenamientoBurbuja(int[] arreglo) {

        int n = arreglo.length;

        // Cantidad de pasadas
        for (int i = 0; i < n - 1; i++) {

            // Comparación entre vecinos
            for (int j = 0; j < n - i - 1; j++) {

                // Para ordenar de mayor a menor
                if (arreglo[j] < arreglo[j + 1]) {

                    int aux = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = aux;
                }
            }
        }
    }
}