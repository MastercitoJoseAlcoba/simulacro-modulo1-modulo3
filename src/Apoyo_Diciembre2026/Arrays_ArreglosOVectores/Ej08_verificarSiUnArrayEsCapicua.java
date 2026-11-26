package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

public class Ej08_verificarSiUnArrayEsCapicua {
    public static void main(String[] args) {
        /*
         * Ejercicio 8: verificar si un array es capicúa
         *
         * Dificultad: avanzada
         *
         * Implementar un método que determine si un array contiene los mismos elementos al recorrerlo desde el principio
         * o desde el final.
         *
         * Retornar true si es capicúa, false en caso contrario. Considerar un array vacío como capicúa.
         *
         */

        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {1, 2, 2, 1};
        int[] array3 = {5};

        System.out.println(esCapicua(array1));
        System.out.println(esCapicua(array2));
        System.out.println(esCapicua(array3));

    }

    public static boolean esCapicua(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            if (array[i] != array[array.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
