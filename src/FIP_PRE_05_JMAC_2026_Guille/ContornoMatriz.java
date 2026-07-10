package FIP_PRE_05_JMAC_2026_Guille;

public class ContornoMatriz {
    public static void main(String[] args) {
        char[][] matriz = new char[6][6];
        matrizMostrar(matriz);
        System.out.println("-".repeat(10));
        char[][] matriz2 = new char[4][4];
        matrizMostrar(matriz2);
        System.out.println("-".repeat(10));
        char[][] matriz3 = new char[8][8];
        matrizMostrar(matriz3);
    }

    //Solución del ejercicio, se agrega static para probarlo en el main.
    public static void matrizMostrar(char[][] matriz) {

        // Recorre las filas de la matriz.
        for (int i = 0; i < matriz.length; i++) {

            // Recorre las columnas de cada fila.
            for (int j = 0; j < matriz[i].length; j++) {

                // Si está en la primera o última fila, coloca '#'.
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j] = '#';

                    // Si está en la primera o última columna, coloca '#'.
                } else if (j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = '#';

                    // En las posiciones internas coloca un espacio en blanco.
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Recorre nuevamente la matriz para mostrar su contenido.
        for (int i = 0; i < matriz.length; i++) {

            // Imprime cada elemento de la fila actual.
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            // Salto de línea al terminar cada fila.
            System.out.println();
        }
    }
}
