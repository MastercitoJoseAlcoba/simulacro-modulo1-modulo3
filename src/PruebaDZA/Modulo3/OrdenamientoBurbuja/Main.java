package PruebaDZA.Modulo3.OrdenamientoBurbuja;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {5, 2, 8, 1, 9};
        System.out.println("Array desordenado: " + Arrays.toString(numeros));
        ordenamientoBurbuja(numeros);
        System.out.println("Array ordenado:" + Arrays.toString(numeros));
        int valorBuscado = busquedaBInaria(numeros, 100);
        System.out.println(valorBuscado);
        busquedaBInaria(numeros, 100);
        System.out.println(valorBuscado);

        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    // Método para ordenar un array
    public static void ordenamientoBurbuja(int [] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arreglo[j]; // int temp = variable temporal para almacenar el valor de arreglo[j]
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

    }
    public static int busquedaBInaria(int [] arreglo, int i) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el valor está presente en la posición medio
            int valorBuscado = 0;

            if (arreglo[medio] == valorBuscado) {
                System.out.println("El valor " + valorBuscado + " se encuentra en la posición " + medio);
                return izquierda;
            } else if (arreglo[medio] < valorBuscado) {
                izquierda = medio + 1;
                // Si el valor es menor, ignorar la mitad derecha
            } else {
                derecha = medio - 1;
            }
        }
        return izquierda;
    }
}
