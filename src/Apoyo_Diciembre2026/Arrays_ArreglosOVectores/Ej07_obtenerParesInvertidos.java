package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

public class Ej07_obtenerParesInvertidos {
    public static void main(String[] args) {
        /*
         * Ejercicio 7: Obtener los números pares de un array en orden inverso
         *
         * Dificultad: avanzada
         *
         * Implementar un método que devuelva un nuevo array que contenga únicamente los números pares del array original,
         * en orden inverso.
         * El tamaño del array resultante debe ser exactamente igual a la cantidad de números pares en el array original.
         *
         */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultado = obtenerParesInvertidos(array);

        for (int i = 0; i < resultado.length; i++){
            System.out.print(resultado[i] + " ");
        }
    }

    public static int[] obtenerParesInvertidos(int[] array) {
        int cantidad = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                cantidad++;
            }
        }

        int[] resultado = new int [cantidad];
        int posicion = 0;

        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] % 2 == 0){
                resultado[posicion] = array[i];
                posicion++;
            }
        }

        return resultado;
    }
}
