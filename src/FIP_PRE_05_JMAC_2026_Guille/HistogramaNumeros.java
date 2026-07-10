package FIP_PRE_05_JMAC_2026_Guille;

public class HistogramaNumeros {
    public static void main(String[] args) {
        numeros(new int[]{1});
        System.out.println("-".repeat(10));
        numeros(new int[]{2, 3, 1});
        System.out.println("-".repeat(10));
        numeros(new int[]{3, 3, 3});
        System.out.println("-".repeat(10));
        numeros(new int[]{1, 2, 3, 4, 5});
        System.out.println("-".repeat(10));
        numeros(new int[]{5, 4, 3, 2, 1});
        System.out.println("-".repeat(10));
        numeros(new int[]{0, 2, 4});
        System.out.println("-".repeat(10));
        numeros(new int[]{-1, 3, -2, 5});
        System.out.println("-".repeat(10));
        numeros(new int[]{1, 10, 2, 9, 3, 8});
    }

    //Solución del ejercicio, se agrega static para probarlo en el main.
    public static void numeros(int[] arr) {

        // Recorre cada número dentro del arreglo.
        for (int num : arr) {

            // Imprime el número actual seguido de un espacio.
            System.out.print(num + " ");

            // Imprime tantos símbolos "#" como indique el valor del número.
            for (int i = 0; i < num; i++) {

                // Imprime un símbolo "#".
                System.out.print("#");

                // Si no es el último "#", imprime un guion después.
                if (i < num - 1) {
                    System.out.print("-");
                }
            }

            // Realiza un salto de línea para pasar al siguiente número.
            System.out.println();
        }
    }
}
