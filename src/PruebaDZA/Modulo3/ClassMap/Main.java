package PruebaDZA.Modulo3.ClassMap;

import PruebaDZA.Modulo3.Alumno.Alumno;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creamos un HashMap para almacenar los alumnos
        HashMap<Integer, Alumno> alumnos = new HashMap<>();
        Alumno alumno1 = new Alumno("Juan", 21, (byte) 8);
        Alumno alumno2 = new Alumno("Martin", 22, (byte) 8);
        Alumno alumno3 = new Alumno("Luis", 23, (byte) 8);
        Alumno alumno4 = new Alumno("Mylo", 24, (byte) 8);
        Alumno alumno5 = new Alumno("Gala", 25, (byte) 8);

        // Agregamos los alumnos al HashMap
       alumnos.put(1, alumno1);
       alumnos.put(2, alumno2);
       alumnos.put(3, alumno3);
       alumnos.put(4, alumno4);
       alumnos.put(5, alumno5);

       // Recorremos el HashMap
       for (Integer key : alumnos.keySet()) {
           System.out.println("Clave: "+key+" Valor: " + alumnos.get(key) + "\n");
           System.out.println(alumnos.get(key).getNombre());
           System.out.println(alumnos.get(key).getEdad());
           System.out.println(alumnos.get(key).getNota());
       }

       // Nuevo alumno agregado a la clase HashMap
        alumnos.put(6, new Alumno("Antonella", 26, (byte) 8));

       // Recorremos el HashMap
        for (Integer key : alumnos.keySet()) {
            System.out.println("Clave: "+ key +" Valor: " + alumnos.get(key) + "\n");
            System.out.println(alumnos.get(key).getNombre());
            System.out.println(alumnos.get(key).getEdad());
            System.out.println(alumnos.get(key).getNota());
        }
    }
}
