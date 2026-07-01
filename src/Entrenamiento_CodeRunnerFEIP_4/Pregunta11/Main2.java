package Entrenamiento_CodeRunnerFEIP_4.Pregunta11;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldo = sc.nextDouble();

        if (sueldo < 1000.00) {
            sueldo = sueldo * 1.15;
        } else {
            sueldo = sueldo * 1.12;
        }

        System.out.printf("%.2f", sueldo);

        sc.close();
    }
}