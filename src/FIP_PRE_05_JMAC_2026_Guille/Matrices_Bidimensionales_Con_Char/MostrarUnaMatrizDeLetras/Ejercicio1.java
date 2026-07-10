package FIP_PRE_05_JMAC_2026_Guille.Matrices_Bidimensionales_Con_Char.MostrarUnaMatrizDeLetras;

public class Ejercicio1 {

    public static void main(String[] args) {

        char[][] matriz = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}