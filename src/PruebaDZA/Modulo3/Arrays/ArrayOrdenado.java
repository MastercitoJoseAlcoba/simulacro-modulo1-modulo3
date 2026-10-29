package PruebaDZA.Modulo3.Arrays;

import java.util.Arrays;

public class ArrayOrdenado {
    public static void main(String[] args) {
        int [] numeros = {11, 22, -33, 44, 55};
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
