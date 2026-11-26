package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

public class Ej04_invertirDuplicarPares {
    public static void main(String[] args) {
        /*
         * Ejercicio 4: Invertir y duplicar los números pares de un array
         *
         * Dificultad: intermedia
         *
         * Implementar un método que devuelva un nuevo array en orden inverso, multiplicando por dos únicamente los números
         * pares. Los impares deben mantenerse sin modificaciones.
         *
         */

        int [] array1 = {1, 2, 3, 4};
        int [] array2 = {2, 5, 8};
        int [] array3 = {1, 3, 5};

        int [] resultado1 = invertirDuplicarPares(array1);
        int [] resultado2 = invertirDuplicarPares(array2);
        int [] resultado3 = invertirDuplicarPares(array3);

        System.out.println(java.util.Arrays.toString(resultado1));
        System.out.println(java.util.Arrays.toString(resultado2));
        System.out.println(java.util.Arrays.toString(resultado3));

    }

    public static int[] invertirDuplicarPares(int[] array) {
        int [] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int valor = array[array.length - i - 1] * 2;
            if (valor % 2 == 0){
                resultado[i] = valor * 2;
            }
            resultado[i] = valor;
        }

        return resultado;
    }
}
