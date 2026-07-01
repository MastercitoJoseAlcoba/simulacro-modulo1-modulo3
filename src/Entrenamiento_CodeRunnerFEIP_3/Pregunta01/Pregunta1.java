package Entrenamiento_CodeRunnerFEIP_3.Pregunta01;

public class Pregunta1 {
    public static int diferenciaParesImpares(int[][] matriz) {
        /**
         *La lógica es:
         *
         * Recorremos toda la matriz.
         * Si la columna es par, sumamos en sumaColumnasPares.
         * Si la fila es impar, sumamos en sumaFilasImpares.
         * Restamos ambas sumas.
         * Devolvemos el valor positivo con Math.abs().
         *
         */

        int sumaColumnasPares = 0;
        int sumaFilasImpares = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                // Columnas pares: 0, 2, 4...
                if (columna % 2 == 0) { // significa columna par.
                    sumaColumnasPares += matriz[fila][columna];
                }

                // Filas impares: 1, 3, 5...
                if (fila % 2 != 0) { // significa fila impar.
                    sumaFilasImpares += matriz[fila][columna];
                }
            }
        }

        return Math.abs(sumaColumnasPares - sumaFilasImpares);
    }

    /**
     * O sea: columna mira columna, fila mira fila.
     */

    public static void main(String[] args) {
        System.out.println(diferenciaParesImpares(new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }));
    }
}
