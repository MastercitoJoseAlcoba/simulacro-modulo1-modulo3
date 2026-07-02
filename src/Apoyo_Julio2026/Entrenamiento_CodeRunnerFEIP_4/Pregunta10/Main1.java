package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_4.Pregunta10;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calificacion = sc.nextDouble();

        if (calificacion >= 8) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }

        sc.close();
    }
}