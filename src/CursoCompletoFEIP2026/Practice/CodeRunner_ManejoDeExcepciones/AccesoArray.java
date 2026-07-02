package CursoCompletoFEIP2026.Practice.CodeRunner_ManejoDeExcepciones;

import java.util.Scanner;

public class AccesoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Ingresa una posición: ");
            int posicion = scanner.nextInt();

            int valor = numeros[posicion];
            System.out.println("Valor en la posición " + posicion + ": " + valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intento de acceso a una posición no válida en el array.");
        }

        scanner.close();
    }
}