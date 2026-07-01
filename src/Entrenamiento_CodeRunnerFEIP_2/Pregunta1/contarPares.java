package Entrenamiento_CodeRunnerFEIP_2.Pregunta1;

public class contarPares {
    /**
     * Completar la función contar, que recibe como parámetro una matriz que es de dos dimensiones. Esta matriz es de
     * números enteros, y la función debe recorrer toda la matriz y devolver la cantidad de elementos que son pares.
     *
     * La firma de la función es la siguiente: public int contarPares(int[][] matriz)
     *
     */

    public static int contarPares(int[][] matriz) {
        // Creamos un contador para guardar la cantidad de pares
        int contador = 0;

        // Recorremos las filas de la matriz
        for (int fila = 0; fila < matriz.length; fila++) {

            // Recorremos las columnas de cada fila
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                // Si el número es par, aumentamos el contador
                if (matriz[fila][columna] % 2 == 0) { // En esta condición pregunta si el número es par: 20, 32, 22, 44, 34, 24, 44, 34, 24, 22, 12
                                                      // Total: 11
                    contador++;
                }
            }
        }

        // Devolvemos la cantidad de números pares encontrados
        return contador;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {11,20,32,41},
                {22,33,44,55,34,24},
                {33,44,55,34,24,22},
                {3,9,12}
        };
        int contar = contarPares(matriz);
        System.out.println(contar);
    }

}
