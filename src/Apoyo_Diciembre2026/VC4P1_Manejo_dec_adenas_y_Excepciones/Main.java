package Apoyo_Diciembre2026.VC4P1_Manejo_dec_adenas_y_Excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String patente = sc.nextLine();

            if (patente == null || patente.isEmpty()) {
                throw new NullPointerException();
            }

            if (patente.length() < 6) {
                throw new StringIndexOutOfBoundsException();
            }

            System.out.println("Patente registrada");

        } catch (NullPointerException e) {
            System.out.println("Patente vacia");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Patente incompleta");

        } finally {
            System.out.println("Proceso terminado");
        }
    }
}