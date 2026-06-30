package Entrenamiento_CodeRunnerFEIP_1.Pregunta4;

public class Main {
    /**
     * Completar la función padovan(n), donde la función de cada término es la suma de los términos tres y de dos lugares
     * anteriores. Los primeros términos de la serie de Padovan son: 1112234579
     *
     * P(n) = P(n-2) + P(n-3)
     *
     * Se debe devolver un array con los terminos de la serie solicitada, en el caso de n=10 se debe devolver 1112234579
     * en caso de que n sea menor o igual a cero se debe devolver el array vacio.
     *
     * La firma de la función es la siguiente:
     * public int[] padovan(int n)
     *
     */

    public static int [] padovan(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int [] resultado = new int[n];

        for (int i = 0; i < n; i++) { // Clave para resolver el problema:
            /**
             * Porque necesitas cargar todos los índices desde el principio:
             * índice:  0 1 2 3 4 5 6 7 8 9
             * valores: 1 1 1 2 2 3 4 5 7 9
             *
             * Cuando i vale 0, 1 o 2, pone 1.
             *
             * Cuando i vale 3:
             * resultado[3] = resultado[1] + resultado[0];
             * resultado[3] = 1 + 1
             * resultado[3] = 2
             *
             * Cuando i vale 4:
             * resultado[4] = resultado[2] + resultado[1];
             * resultado[4] = 2 + 1
             * resultado[4] = 3
             *
             */

            if (i == 0 || i == 1 || i == 2) {
                resultado[i] = 1; // Te dice que si es 0, 1 o 2, pone 1.
            } else {
                resultado[i] = resultado[i-2] + resultado[i-3]; // Fórmula de Padovan.
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int n = 10; // Número de términos a generar
        int[] padovanSeries = padovan(n);

        // Imprimir los términos de la serie de Padovan
        for (int i = 0; i < padovanSeries.length; i++) {
            System.out.print(padovanSeries[i] + " ");
        }

    }
}
