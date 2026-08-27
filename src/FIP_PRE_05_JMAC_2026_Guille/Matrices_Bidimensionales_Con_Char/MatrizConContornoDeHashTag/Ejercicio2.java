package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.MatrizConContornoDeHashTag;

public class Ejercicio2 {

    public static void main(String[] args) {
        int n = 5; // Tamaño de la matriz: 5 filas y 5 columnas

        char[][] matriz = new char[n][n]; // Creo una matriz de caracteres de 5 x 5

        for (int i = 0; i < matriz.length; i++) { // i recorre las FILAS: 0, 1, 2, 3, 4

            for (int j = 0; j < matriz[i].length; j++) { // j recorre las COLUMNAS de cada fila


                if (i == 0 ||                         // Primera fila
                        i == matriz.length - 1 ||     // Última fila
                        j == 0 ||                     // Primera columna
                        j == matriz[i].length - 1) {  // Última columna

                    matriz[i][j] = '#'; // Si está en algún borde, guarda '#'

                } else {

                    matriz[i][j] = ' '; // Si está en el interior, guarda un espacio
                }
            }
        }


        // =====================================================
        // IMPRIMIR LA MATRIZ
        // =====================================================

        for (int i = 0; i < matriz.length; i++) { // Recorro nuevamente las filas

            for (int j = 0; j < matriz[i].length; j++) { // Recorro las columnas

                System.out.print(matriz[i][j] + " "); // Imprimo cada posición sin saltar de línea
            }

            System.out.println(); // Al terminar una fila, paso a la siguiente línea
        }
    }
}