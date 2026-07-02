package Espacio_De_Practicas.CodeRunner02.Pregunta14;

public class Main {
    public static void numeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (arr[i] > 0) {
                System.out.print(" ");

                for (int j = 1; j <= arr[i]; j++) {
                    System.out.print("#");

                    if (j < arr[i]) {
                        System.out.print("-");
                    }
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        numeros(new int[]{1});
        System.out.println();
        numeros(new int[]{2, 3, 1});
        System.out.println();
        numeros(new int[]{3, 3, 3});
        System.out.println();
        numeros(new int[]{1, 2, 3, 4, 5});
        System.out.println();
        numeros(new int[]{5, 4, 3, 2, 1});
        System.out.println();
        numeros(new int[]{10});
        System.out.println();
        numeros(new int[]{0, 2, 4});
        System.out.println();
        numeros(new int[]{-1, 3, -2, 5});
        System.out.println();
        numeros(new int[]{1, 10, 2, 9, 3, 8});
        System.out.println();
        numeros(new int[]{4, 4, 4, 4});
    }
}