package Espacio_De_Practicas.CodeRunner04.Pregunta09;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double temperatura = n / 4.0 + 5;

        System.out.printf("%.2f", temperatura);
    }
}