package PruebaDZA.Modulo3.ClassMap;

import PruebaDZA.Modulo3.Alumno.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creamos el HashMap
        HashMap<Integer, Alumno> alumnos = new HashMap<>();

        // Agregamos alumnos
        alumnos.put(1, new Alumno("Juan", 21, (byte) 8));
        alumnos.put(2, new Alumno("Martin", 22, (byte) 8));
        alumnos.put(3, new Alumno("Luis", 23, (byte) 8));
        alumnos.put(4, new Alumno("Mylo", 24, (byte) 8));
        alumnos.put(5, new Alumno("Gala", 25, (byte) 8));
        alumnos.put(6, new Alumno("Antonella", 26, (byte) 8));

        // Convertimos los valores del HashMap en una lista
        List<Alumno> lista = new ArrayList<>(alumnos.values());

        // Ordenamos alfabéticamente por nombre
        lista.sort(Comparator.comparing(Alumno::getNombre));

        // Mostramos los alumnos ordenados
        for (Alumno alumno : lista) {
            System.out.println(
                    "Nombre: " + alumno.getNombre() +
                            " | Edad: " + alumno.getEdad() +
                            " | Nota: " + alumno.getNota()
            );
        }
    }
}