package PruebaDZA.Modulo4.TryCatch;

import java.util.Scanner;

public class Caso1 {
    public static void main(String[] args) {

        int a = 24;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingresar el valor de b: ");
        int b = ingreso.nextInt();

        try {
            int resultado = a / b;
            System.out.println("La división entre a/b = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");

        } finally {
            System.out.println("Fin del programa.");
            ingreso.close();
        }
    }
}