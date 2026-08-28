package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class evenOddSum {
    public static void main(String[] args) {

        evenOddSum(10);
    }

    public static void evenOddSum(int n) {

        // Recorremos desde 1 hasta n inclusive
        for (int i = 1; i <= n; i++) {

            // Primero múltiplos de 10
            if (i % 10 == 0) {

                System.out.println("evenTen");

                // Después números pares
            } else if (i % 2 == 0) {

                System.out.println("even");

                // Si no, es impar
            } else {

                System.out.println("odd");
            }
        }
    }
}

