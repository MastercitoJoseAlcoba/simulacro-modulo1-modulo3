package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.ContornoYPuntoEnElCentro;

public class Ejercicio3 {

    public static void main(String[] args) {

        int n = 5; // Tamaño de la matriz: 5 filas y 5 columnas

        char[][] matriz = new char[n][n]; // Creo una matriz de caracteres de 5 x 5


        for (int i = 0; i < matriz.length; i++) { // i recorre las FILAS

            for (int j = 0; j < matriz[i].length; j++) { // j recorre las COLUMNAS


                if (i == 0 ||                  // Primera fila
                        i == n - 1 ||              // Última fila
                        j == 0 ||                  // Primera columna
                        j == n - 1) {              // Última columna

                    matriz[i][j] = '#'; // Si está en el borde, guarda '#'


                } else if (i == n / 2 &&       // Fila central
                        j == n / 2) {        // Columna central

                    matriz[i][j] = '.'; // Si está exactamente en el centro, guarda '.'


                } else {

                    matriz[i][j] = ' '; // Si no es borde ni centro, guarda un espacio
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

            System.out.println(); // Al terminar una fila, salto de línea
        }
    }
}