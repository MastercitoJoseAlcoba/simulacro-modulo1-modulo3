package Entrenamiento_CodeRunnerFEIP_1.Pregunta2;

public class Prueba {
    /**
     * Tenemos un procedimiento que recibe 2 parámetros un String, y un array de tipo entero unidimensional.
     * Dentro del procedimiento se muestran unos mensajes de acuerdo a los parámetros recibidos, se debe controlar y
     * colocar el código si se puede producir una excepción y controlarla.
     * <p>
     * La firma del procedimiento es el siguiente:
     * <p>
     * public void prueba(String dato, int[] vector)
     * <p>
     * Por ejemplo:
     * <p>
     * Prueba 1:
     * String dato = null;
     * int [] vector = {4,12,2,5};
     * prueba(dato, vector);
     * <p>
     * Resultado 1: índice del array fuera de rango
     * String null, no se puede saber su largo
     * <p>
     * Prueba 2: String dato = "Hola";
     * int [] vector = {1,2,2,5,6};
     * prueba(dato, vector);
     * <p>
     * Resultado 2: 2
     * 4
     * Llegamos al final ok
     *
     */

    public void prueba(String dato, int[] vector) {
        try {
            System.out.println(vector[1]); // Intenta mostrar el valor que está en el índice 1 del array.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indice del array fuera de rango");
        }

        try {
            System.out.println(dato.length());
            System.out.println("Llegamos al final ok");
        } catch (NullPointerException e) {
            System.out.println("String null, no se puede saber su largo");
        }
    }

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.prueba(null, new int[]{4, 12, 2, 5});
        p.prueba("Hola", new int[]{1, 2, 2, 5, 6});
        p.prueba("Hola", new int[]{1, 2, 2, 5});
    }
}


