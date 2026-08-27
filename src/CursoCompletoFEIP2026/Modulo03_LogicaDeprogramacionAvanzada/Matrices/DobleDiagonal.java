package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Matrices;

public class DobleDiagonal {

    public static void main(String[] args) {

        int n = 5;

        char[][] matriz = new char[n][n];


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j || i + j == n - 1) {

                    matriz[i][j] = 'X';

                } else {

                    matriz[i][j] = '.';
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