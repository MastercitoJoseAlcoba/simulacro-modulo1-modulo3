package PruebaDZA.Modulo1.Switch;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario por teclado
        byte opc = 4; // Definimos la variable opc y le asignamos el valor 4

        // Le asignamos el valor 4 a la variable opc
        while (opc != 0){ // Sentencia repetitiva
            System.out.println(" M e n u ");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opc = scanner.nextByte(); // Leemos la opción ingresada por el usuario

            switch (opc){
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada");
                    break;
                case 0:
                    break;
            }
        }
    }
}
