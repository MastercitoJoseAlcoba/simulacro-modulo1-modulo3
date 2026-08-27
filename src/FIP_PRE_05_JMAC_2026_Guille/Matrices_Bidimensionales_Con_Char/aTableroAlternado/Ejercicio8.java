package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.aTableroAlternado;

public class Ejercicio8 {

    public static void main(String[] args) {

        int n = 5; // Tamaño de la matriz: 5 filas y 5 columnas

        char[][] matriz = new char[n][n]; // Creo una matriz de caracteres de 5 x 5


        for (int i = 0; i < matriz.length; i++) { // i recorre las FILAS

            for (int j = 0; j < matriz[i].length; j++) { // j recorre las COLUMNAS


                if ((i + j) % 2 == 0) { // Si la suma de fila + columna es PAR

                    matriz[i][j] = '#'; // Guarda '#'

                } else {

                    matriz[i][j] = '.'; // Si la suma es IMPAR, guarda '.'
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