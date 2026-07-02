package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

import java.util.Arrays;

public class metodoEquals {
    public static void main(String[] args) {
        int [] array1 = {4, 7, 2, 8, 1};
        int [] array2 = {4, 7, 2, 8, 1};
        int [] array3 = {1, 2, 7, 4, 8};

        // Comparar dos arrays
        boolean iguales = Arrays.equals(array1, array2); // true
        System.out.println("Son array1 y array2 iguales? " + iguales);

        iguales = Arrays.equals(array1, array3); // false
        System.out.println("Son array1 y array3 iguales? " + iguales);
    }
}
