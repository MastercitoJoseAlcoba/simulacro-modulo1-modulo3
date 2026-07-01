package Entrenamiento_CodeRunnerFEIP_4.Pregunta09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double temperatura = N / 4.0 + 5;

        System.out.printf("%.2f", temperatura);

        sc.close();
    }
}

