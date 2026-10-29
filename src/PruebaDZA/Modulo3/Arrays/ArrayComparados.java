package PruebaDZA.Modulo3.Arrays;

import java.util.Arrays;

public class ArrayComparados {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {1, 2, 3, 4, 5};

        boolean sonIguales = Arrays.equals(array1, array2);
        System.out.println("Los arrays son iguales: " + sonIguales);

        sonIguales = Arrays.equals(array1, array2);
        System.out.println("Los arrays son iguales: " + sonIguales);
    }
}
