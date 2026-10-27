package PruebaDZA.Modulo1.Variables;

public class Laboratorio {
    /*
     * Declaración de variables:
     * 1. Declara variables para almacenar la siguiente información sobre un estudiante:
     * - Nombre del estudiante (cadena de texto)
     * - Edad del estudiante (entero)
     * - Nota del estudiante (decimal)
     * - Estado de aprobación (boolean)
     *
     * Actuación de nota:
     * - Cambia la nota del estudiante utilizando operadores y muestra la nueva información.
     * - Actualiza el estado de aprobación según la nueva nota.
     */

    public static void main(String[] args) {
        // Variables sin inicializar
        String nombre;
        int edad;
        double nota;
        boolean aprobado;

        // Variables inicializadas
        nombre = "Juan Perez";
        edad = 20;
        nota = 8.5;
        nota = 5.5;
        aprobado = true; // nota >= 6

        // Imprimir por consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
        System.out.println("Aprobado: " + aprobado);

    }
}
