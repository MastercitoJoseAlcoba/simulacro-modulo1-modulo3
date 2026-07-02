package Espacio_De_Practicas.CodeRunner04.Pregunta08;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldo = sc.nextDouble();

        if (sueldo < 1000.00) {
            sueldo = sueldo * 1.15;
        }

        System.out.printf("%.2f", sueldo);
    }
}