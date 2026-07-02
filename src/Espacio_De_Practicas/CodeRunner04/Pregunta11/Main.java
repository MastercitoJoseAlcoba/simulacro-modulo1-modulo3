package Espacio_De_Practicas.CodeRunner04.Pregunta11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldo = sc.nextDouble();
        double nuevoSueldo;

        if (sueldo < 1000.00) {
            nuevoSueldo = sueldo * 1.15;
        } else {
            nuevoSueldo = sueldo * 1.12;
        }

        System.out.printf("%.2f", nuevoSueldo);
    }
}