package PruebaDZA.Modulo3.Alumno;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 21, (byte) 8);
        Alumno alumno2 = new Alumno("Martin", 22, (byte) 8);
        Alumno alumno3 = new Alumno("Luis", 23, (byte) 8);
        Alumno alumno4 = new Alumno("Mylo", 24, (byte) 8);
        Alumno alumno5 = new Alumno("Gala", 25, (byte) 8);

        LinkedList<Alumno> listaAlumnos = new LinkedList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        System.out.println(listaAlumnos);
        System.out.println("Tamaño de la lista: " + listaAlumnos.size());

        // Mostrar Datos
        mostrarDatos(listaAlumnos);

        // For Each - Ideal para recorrer listas
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Lista de alumnos: " + alumno);
        }

        // For - Ideal para recorrer arrays
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre() + " -- "); // Obteniendo el elemento de la lista alumnos (Nombre)
            System.out.println(listaAlumnos.get(i).getEdad() + " -- "); // Obteniendo el elemento de la lista alumnos (Edad)
            System.out.println(listaAlumnos.get(i).getNota() + " -- "); // Obteniendo el elemento de la lista alumnos (Nota)
        }

        // Modificando, datos de la lista
        listaAlumnos.set(0, new Alumno("Pedro", 35, (byte) 4));
        System.out.println(listaAlumnos);
        System.out.println("Tamaño de la lista: " + listaAlumnos.size());

        // Si la lista está vacía
        if (listaAlumnos.isEmpty())
            System.out.println("La lista está vacía");

        // Sí contiene un alumno determinado
        if (listaAlumnos.contains(new Alumno("Pedro", 35, (byte) 4)))
            System.out.println("La lista contiene el alumno Pedro");

        if (listaAlumnos.addAll(listaAlumnos.reversed()))
            System.out.println("Se ha añadido la lista a la lista");

    }

    // Creando el método mostrar datos
    public static void mostrarDatos(LinkedList<Alumno> listaAlumnos){
        for (Alumno alumno : listaAlumnos)
            System.out.println("Mostrando datos: " + alumno);
    }

}
