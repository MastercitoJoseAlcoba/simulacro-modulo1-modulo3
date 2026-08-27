package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Matrices;

public class BordesYPerimetro {

    public static void main(String[] args) {

        int n = 5; // Matriz 5 x 5

        char[][] matriz = new char[n][n]; // Creo la matriz


        for (int i = 0; i < matriz.length; i++) { // Filas

            for (int j = 0; j < matriz[i].length; j++) { // Columnas

                if (i == 0 ||                  // Primera fila
                        i == n - 1 ||              // Última fila
                        j == 0 ||                  // Primera columna
                        j == n - 1) {              // Última columna

                    matriz[i][j] = '#';

                } else {

                    matriz[i][j] = ' ';
                }
            }
        }


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}