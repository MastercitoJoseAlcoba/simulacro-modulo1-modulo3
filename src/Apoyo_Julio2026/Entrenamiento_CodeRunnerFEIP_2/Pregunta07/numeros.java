package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_2.Pregunta07;

public class numeros {
    public void numeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // Imprimimos primero el número original
            System.out.print(arr[i]);

            // Si el número es positivo, imprimimos los numerales
            if (arr[i] > 0) {
                System.out.print(" ");

                for (int j = 1; j <= arr[i]; j++) {
                    System.out.print("#");

                    // Imprime guion solo si no es el último numeral
                    // La parte clave es esta: Eso evita que quede un guion sobrante al final.
                    // Ejemplo correcto: 3 #-#-#

                    if (j < arr[i]) {
                        System.out.print("-");
                    }
                }
            }

            // Salto de línea al final de cada número
            System.out.println();
        }
    }
}
