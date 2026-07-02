package Espacio_De_Practicas.CodeRunner03.Pregunta02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida");
            return;
        }

        int n = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida");
            return;
        }

        int m = sc.nextInt();

        if (n < 1 || n > 10 || m < 1 || m > 10) {
            System.out.println("Número fuera de rango");
            return;
        }

        int[][] matriz = new int[n][m];

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < m; columna++) {
                matriz[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < m; columna++) {
                System.out.print(matriz[fila][columna]);

                if (columna < m - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}