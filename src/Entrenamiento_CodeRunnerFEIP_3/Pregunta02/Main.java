package Entrenamiento_CodeRunnerFEIP_3.Pregunta02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Este ejercicio sí pide programa completo, porque hay entrada con Scanner y salida por pantalla.
        Scanner sc = new Scanner(System.in);

        // Validar que el primer dato sea entero
        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida");
            return;
        }

        int N = sc.nextInt();

        // Validar que el segundo dato sea entero
        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida");
            return;
        }

        int M = sc.nextInt();

        // Validar rango
        if (N < 1 || N > 10 || M < 1 || M > 10) {
            System.out.println("Número fuera de rango");
            return;
        }

        int[][] matriz = new int[N][M];

        // Llenar la matriz con la tabla pitagórica
        for (int fila = 0; fila < N; fila++) {
            for (int columna = 0; columna < M; columna++) {
                // La parte clave es esta:
                matriz[fila][columna] = (fila + 1) * (columna + 1);
                // Porque los índices arrancan en 0, pero la tabla pitagórica arranca en 1. Por eso usamos fila + 1 y columna + 1.
            }
        }

        // Mostrar la matriz
        for (int fila = 0; fila < N; fila++) {
            for (int columna = 0; columna < M; columna++) {
                System.out.print(matriz[fila][columna]);

                if (columna < M - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}