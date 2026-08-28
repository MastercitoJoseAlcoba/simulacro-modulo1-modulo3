package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class Histograma {
    public static void main(String[] args) {

        numeros(new int[]{5, 4, 3, 2, 1});
    }

    public static void numeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // Mostramos primero el número
            System.out.print(arr[i] + " ");

            for (int j = 0; j < arr[i]; j++) {

                System.out.print("#");

                // Evitamos poner guion después del último #
                if (j < arr[i] - 1) {

                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}
