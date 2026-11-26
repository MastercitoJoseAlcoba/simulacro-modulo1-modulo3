package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

public class Ej03_ultimoPar {
    public static void main(String[] args) {
        /*
         * Ejercicio 3: ultimoPar
         *
         * Dificultad: básica
         *
         * Implementar un método que recorra un array desde el final hacia el principio y retorne el último número par
         * del array original.
         *
         * Ejemplo:
         *
         * Entrada: {2, 4, 6, 7} -> Salida: 6
         * Entrada: {8, 3, 5, 9} -> Salida: 8
         * Entrada: {1, 3, 5} -> Salida: -1
         * Entrada: {} -> Salida: -1
         *
         */

        int[] array1 = {2, 4, 6, 7};
        int[] array2 = {8, 3, 5, 9};
        int[] array3 = {1, 3, 5};

        int ultimoPar1 = ultimoPar(array1);
        int ultimoPar2 = ultimoPar(array2);
        int ultimoPar3 = ultimoPar(array3);


        System.out.println("El último número par es: " + ultimoPar1);
        System.out.println("El último número par es: " + ultimoPar2);
        System.out.println("El último número par es: " + ultimoPar3);

    }

    // Busca desde el final. Si no encuentra un par, retorna -1
    public static int ultimoPar(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                return array[i];
            }
        }
        return -1;
    }
}
