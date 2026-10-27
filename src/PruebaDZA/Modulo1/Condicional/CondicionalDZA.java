package PruebaDZA.Modulo1.Condicional;

import java.util.Scanner;

public class CondicionalDZA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        if (edad >= 10) {
            System.out.println("Eres un niño");
        } else if (edad >= 10 && edad <= 18) {
            System.out.println("Eres un adolescente");
        } else if (edad > 18 && edad <= 60) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }

    }
}
