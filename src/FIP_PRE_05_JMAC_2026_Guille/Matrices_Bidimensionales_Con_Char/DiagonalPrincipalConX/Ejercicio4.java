package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.DiagonalPrincipalConX;

public class Ejercicio4 {

    public static void main(String[] args) {

        int n = 5; // Tamaño de la matriz: 5 filas y 5 columnas

        char[][] matriz = new char[n][n]; // Creo una matriz de caracteres de 5 x 5


        for (int i = 0; i < matriz.length; i++) { // i recorre las FILAS

            for (int j = 0; j < matriz[i].length; j++) { // j recorre las COLUMNAS


                if (i == j) { // Si el índice de la fila es igual al índice de la columna

                    matriz[i][j] = 'X'; // Coloca 'X' en la diagonal principal

                } else {

                    matriz[i][j] = '.'; // En el resto de las posiciones coloca '.'
                }
            }
        }


        // =====================================================
        // IMPRIMIR LA MATRIZ
        // =====================================================

        for (int i = 0; i < matriz.length; i++) { // Recorro nuevamente las FILAS

            for (int j = 0; j < matriz[i].length; j++) { // Recorro las COLUMNAS

                System.out.print(matriz[i][j] + " "); // Imprimo cada posición
            }

            System.out.println(); // Cuando termina una fila, hago salto de línea
        }
    }
}