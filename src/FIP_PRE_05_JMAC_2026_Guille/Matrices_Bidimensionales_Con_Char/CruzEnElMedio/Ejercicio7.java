package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.CruzEnElMedio;

public class Ejercicio7 {

    public static void main(String[] args) {

        int n = 5; // Tamaño de la matriz: 5 filas y 5 columnas

        char[][] matriz = new char[n][n]; // Creo una matriz de caracteres de 5 x 5


        for (int i = 0; i < matriz.length; i++) { // i recorre las FILAS

            for (int j = 0; j < matriz[i].length; j++) { // j recorre las COLUMNAS


                if (i == n / 2 ||      // Sí estamos en la FILA central
                        j == n / 2) {  // O en la COLUMNA central

                    matriz[i][j] = '#'; // Guarda '#' formando una cruz


                } else {

                    matriz[i][j] = '.'; // Si no está en la cruz, guarda '.'
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