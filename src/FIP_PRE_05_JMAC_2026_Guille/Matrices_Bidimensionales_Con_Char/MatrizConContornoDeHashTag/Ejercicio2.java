package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.MatrizConContornoDeHashTag;

public class Ejercicio2 {

    public static void main(String[] args) {

        int n = 5;

        char[][] matriz = new char[n][n];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
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