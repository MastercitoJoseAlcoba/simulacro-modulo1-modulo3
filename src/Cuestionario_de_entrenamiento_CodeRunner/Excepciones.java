package Cuestionario_de_entrenamiento_CodeRunner;

public class Excepciones {
    public static void main(String[] args) {

        String dato = null;

        int[] vector = {4, 12, 2, 5};

        prueba(dato, vector);
    }

    public static void prueba(String dato, int[] vector) {

        // Controlamos posible índice fuera de rango
        try {

            // vector[0] se usa como índice
            System.out.println(vector[vector[0]]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("indice del array fuera de rango");
        }


        // Controlamos posible String null
        try {

            // Si dato es null, length() genera excepción
            System.out.println(dato.length());

            // Solo llega acá si no hubo excepción
            System.out.println("Llegamos al final ok");

        } catch (NullPointerException e) {

            System.out.println("String null, no se puede saber su largo");
        }
    }
}