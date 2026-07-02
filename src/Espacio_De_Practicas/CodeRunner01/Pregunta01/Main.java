package Espacio_De_Practicas.CodeRunner01.Pregunta01;

public class Main {
    public static void prueba(String dato, int[] vector) {
        try {
            System.out.println(vector[vector[1]]);
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
        String dato=null;
        int [] vector={4,12,2,5};
        prueba(dato,vector);
    }
}
