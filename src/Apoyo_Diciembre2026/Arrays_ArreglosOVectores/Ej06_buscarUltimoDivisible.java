package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

public class Ej06_buscarUltimoDivisible {
    public static void main(String[] args) {
        /*
         * Ejercicio 6: buscarUltimoDivisible
         *
         * Dificultad: intermedia
         *
         * Implementar un método que recorra un array desde el final y retorne el primer número encontrado que sea
         * divisible por 3 y por 5 simultáneamente.
         *
         */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30};
        int resultado = buscarUltimoDivisible(array);
        System.out.println("El último número divisible por 3 y 5 es: " + resultado);

    }
    public static int buscarUltimoDivisible(int[] array){
        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] % 3 == 0 && array [i] % 5 == 0){
                return array[i];
            }

        }
        return -1;
    }
}
