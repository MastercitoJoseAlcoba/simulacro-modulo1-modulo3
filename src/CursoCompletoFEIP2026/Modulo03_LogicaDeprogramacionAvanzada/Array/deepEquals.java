package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

import java.util.Arrays;

public class deepEquals {
    public static void main(String[] args) {
        // Comparar dos arrays
        int [][] matriz1 = {{1,2}, {3,4}};
        int [][] matriz2 = {{1,2}, {3,4}};
        int [][] matriz3 = {{4,3}, {2,1}};

        boolean iguales = Arrays.deepEquals(matriz1, matriz2);
        System.out.println("Son matriz1 y matriz2 iguales? " + iguales); // true

        iguales = Arrays.deepEquals(matriz1, matriz3);
        System.out.println("Son matriz1 y matriz3 iguales? " + iguales); // false

        }
    }

