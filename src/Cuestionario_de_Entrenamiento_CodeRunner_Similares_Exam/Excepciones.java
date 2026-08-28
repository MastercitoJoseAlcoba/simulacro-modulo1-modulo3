package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class Excepciones {
    public static void main(String[] args) {

        String dato = null;
        int[] vector = {4, 12, 2, 5};

        prueba(dato, vector);
    }

    public static void prueba(String dato, int[] vector) {

        try {

            // vector[0] se usa como índice
            System.out.println(vector[vector[0]]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("indice del array fuera de rango");
        }

        try {

            // Si dato es null, ocurre NullPointerException
            System.out.println(dato.length());

            System.out.println("Llegamos al final ok");

        } catch (NullPointerException e) {

            System.out.println("String null, no se puede saber su largo");
        }
    }
}