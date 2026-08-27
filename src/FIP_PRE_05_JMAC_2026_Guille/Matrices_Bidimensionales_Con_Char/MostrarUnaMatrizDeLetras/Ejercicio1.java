package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.MostrarUnaMatrizDeLetras;

public class Ejercicio1 {

    public static void main(String[] args) {

        char[][] matriz = { // Creo una matriz de caracteres de 3 filas x 3 columnas
                {'a', 'b', 'c'}, // Fila 0
                {'d', 'e', 'f'}, // Fila 1
                {'g', 'h', 'i'}  // Fila 2
        };


        for (int i = 0; i < matriz.length; i++) { // i recorre las FILAS: 0, 1, 2

            for (int j = 0; j < matriz[i].length; j++) { // j recorre las COLUMNAS de cada fila

                System.out.print(matriz[i][j] + " "); // Imprime el carácter de la posición [fila][columna]
            }

            System.out.println(); // Cuando termina una fila, hace salto de línea
        }
    }
}