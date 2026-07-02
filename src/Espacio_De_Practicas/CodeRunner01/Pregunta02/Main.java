package Espacio_De_Practicas.CodeRunner01.Pregunta02;

public class Main {
    public static int contarPares(int[][] matriz) {
        int contar = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] % 2 == 0) {
                    contar++;
                }
            }
        }

        return contar;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {11,20,32,41},
                {22,33,44,55,34,24},
                {33,44,55,34,24,22},
                {3,9,12}
        };
        int contar = contarPares(matriz);
        System.out.println(contar);
    }
}
