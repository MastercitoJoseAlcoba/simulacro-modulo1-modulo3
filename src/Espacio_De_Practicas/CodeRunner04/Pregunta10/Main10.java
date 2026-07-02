package Espacio_De_Practicas.CodeRunner04.Pregunta10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calificacion = sc.nextDouble();

        if (calificacion >= 8) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
}