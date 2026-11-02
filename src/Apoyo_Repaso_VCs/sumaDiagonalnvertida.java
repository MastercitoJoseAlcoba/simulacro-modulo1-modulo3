package Apoyo_Repaso_VCs;

public class sumaDiagonalnvertida {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        /**
                C0  C1  C2
        Fila 0  1   2  [3]
        Fila 1  4  [5]  6
        Fila 2 [7]  8   9
         */

        System.out.println(sumaInvertida(matriz));

    }

    public static int sumaInvertida(int[][] matriz) {

        if (matriz == null || matriz.length == 0 || matriz[0] == null) { // matriz no es válida
            return 0;                                                    // 0 es el valor neutro de la suma.

            // 1. matriz == null, Comprueba si la matriz es null, es decir, si la variable no hace referencia a ninguna matriz.
            // 2. matriz.length == 0, Comprueba si la matriz tiene cero filas.
            // 3. matriz[0] == null, Comprueba si la primera fila es null.
        }

        int suma = getSuma(matriz);

        return suma; // Suma de los elementos de la diagonal invertida
    }

    private static int getSuma(int[][] matriz) {
        int suma = 0; // Variable acumuladora
        int indice = matriz[0].length - 1; // Obtiene el índice de la última columna de la primera fila de la matriz.

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i] != null && indice >= 0 && indice < matriz[i].length) {

                // 1. matriz[i]!= null, Comprueba que la fila existe y no es null -
                // 2. indice >= 0, Comprueba que el índice de columna no sea negativo
                // 3. indice < matriz[i].length, Comprueba que la columna a la que queremos acceder existe dentro de la fila actual.

                suma += matriz[i][indice]; // Suma de los elementos de la diagonal invertida
            }

            indice--; // Disminuye el índice de columna para avanzar hacia la izquierda en la siguiente fila
        }
        return suma;
    }
}