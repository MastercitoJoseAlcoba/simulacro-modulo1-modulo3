package FIP_PRE_05_JMAC_2026_Guille.Pregunta01;

public class Main {
    public static void main(String[] args) {
        char[][] matriz = new char[6][6];
        matrizMostrar(matriz);
    }

    public static void matrizMostrar(char[][] matriz) {

        // Llenar la matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                // Primera fila
                // Última fila
                // Primera columna
                // Última columna
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = '#';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Mostrar contenido de la matriz (Te lo daba el ejercicio)
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}