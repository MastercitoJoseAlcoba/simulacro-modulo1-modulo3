package Entrenamiento_CodeRunnerFEIP_2.Pregunta12;

public class Pregunta12 {
    public static void trianguloAsteriscos(int n) {
        // Controla las filas
        for (int i = 1; i <= n; i++) {

            // Imprime el número inicial
            System.out.print(i);

            // Imprime los asteriscos de cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                /**
                 * La lógica es:
                 * i = 1 → 1*1
                 * i = 2 → 2**2
                 * i = 3 → 3***3
                 * i = 4 → 4****4
                 *
                 * El primer for controla las filas.
                 * El segundo for imprime los asteriscos de cada fila. Ahí está el “triángulo”.
                 */
            }

            // Imprime el número final y salto de línea
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        trianguloAsteriscos(8);
        System.out.println();
    }
}
