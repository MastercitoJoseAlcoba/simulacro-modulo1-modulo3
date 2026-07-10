package FIP_PRE_05_JMAC_2026_Guille.Pregunta19;

import java.util.Arrays;

public class Ordenamiento {
    public static void main(String[] args) {

        int[] numeros = {2, 35, 10, 8};

        miOrdenamiento(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    public static void miOrdenamiento(int[] arreglo) {

        int n = arreglo.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {  // (arreglo[j] > arreglo[j + 1])
                    arreglo[j] = arreglo[j + 1];    // int aux = arreglo[j];
                    arreglo [j + 1] = arreglo[j];   // arreglo [j] = arreglo[j + 1];
                                                    // arreglo[j + 1] = aux;
                }
            }
        }
    }
}

/**
 *
 * Explicación:
 *
 * El algoritmo intenta ordenar, pero el intercambio está mal implementado.
 *
 * 1. Para intercambiar dos valores se necesita una variable auxiliar.
 * 2. Aquí primero se asigna arreglo[j] = arreglo[j+1].
 * 3. Después arreglo[j+1] recibe el valor ya modificado de arreglo[j].
 * 4. Por eso se pierde el valor original y se duplican valores.
 * 5. El resultado final no es un ordenamiento correcto: [2, 8, 8, 8]
 *
 *
 * Inicio: [2, 35, 10, 8]
 *
 * 35 > 10:
 * [2, 10, 10, 8]
 *
 * 10 > 8:
 * [2, 8, 8, 8]
 *
 * Salida: [2, 8, 8, 8]
 *
 *
 */