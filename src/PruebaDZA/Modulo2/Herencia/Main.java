package PruebaDZA.Modulo2.Herencia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        // CREAR UNA DIRECCIÓN

        Direccion direccion = new Direccion(
                "Antonio Larrañaga",
                "10234",
                "Durazno",
                "Durazno",
                97000
        );

        // CREAR UNA PERSONA

        Persona persona = new Persona(
                "Juan",
                "099865741",
                "123456789"
        );

        System.out.println(persona);

        // CREAR UN PROFESOR

        Profesor profesor = new Profesor(
                "Juan",
                "098765432",
                "123456789",
                5000
        );

        System.out.println(profesor);

        // CREAR UN ESTUDIANTE

        Estudiante estudiante = new Estudiante(
                "Jose",
                "098765432",
                "123456789",
                123,
                "jose@gmail.com"
        );

        System.out.println(estudiante);

        // INGRESAR DATOS CON SCANNER

        System.out.println("\nIngrese los datos de un estudiante:");

        System.out.print("Nombre: ");
        String nombre = ingreso.nextLine();

        System.out.print("Telefono: ");
        String telefono = ingreso.nextLine();

        System.out.print("Cédula: ");
        String cedula = ingreso.nextLine();

        System.out.print("Código del estudiante: ");
        int codigo = Integer.parseInt(ingreso.nextLine());

        System.out.print("Correo: ");
        String correo = ingreso.nextLine();

        // CREAR ESTUDIANTE CON DATOS

        Estudiante estudiante2 = new Estudiante(
                nombre,
                telefono,
                cedula,
                codigo,
                correo
        );

        System.out.println(estudiante2);

        // COMPROBAR HERENCIA
        // ¿Qué hace instanceof?
        // El operador instanceof permite comprobar si un objeto pertenece a un determinado tipo.
        // System.out.println(estudiante instanceof Persona); true

        System.out.println(estudiante instanceof Persona); // true
        System.out.println(estudiante2 instanceof Persona); // true
        System.out.println(profesor instanceof Persona); // true
        System.out.println(persona instanceof Persona); // true

        System.out.println(persona instanceof Estudiante); // false

        // MOSTRAR RESULTADOS

        System.out.println("\n===== ESTUDIANTE REGISTRADO =====");
        System.out.println(estudiante);
        System.out.println(estudiante2);
        ingreso.close();
    }
}