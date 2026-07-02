package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada;

import java.util.LinkedList;

public class Persona2 {
   private String nombre;
   private int edad;
   private byte cantHijos;

   public Persona2(String nombre, int edad, byte cantHijos) {
       this.nombre = nombre;
       this.edad = edad;
       this.cantHijos = cantHijos;
   }

   public String toString() {
       return "Nombre: " + nombre + ", Edad: " + edad + ", Cantidad de hijos: " + cantHijos;

   }

    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Dante", 25, (byte) 2);
        Persona2 p2 = new Persona2("Maria", 30, (byte) 0);
        Persona2 p3 = new Persona2("Pedro", 22, (byte) 1);
        Persona2 p4 = new Persona2("Ana", 28, (byte) 3);
        Persona2 p5 = new Persona2("Jose", 23, (byte) 4);

        LinkedList<Persona2> persona1 = new LinkedList<>();
        persona1.add(p1);
        persona1.add(p2);
        persona1.add(p3);
        persona1.add(p4);
        persona1.add(p5);

        for (Persona2 persona : persona1) {
            System.out.println(persona);

        }
        // Informar si hay alguna persona que no tiene hijos en la lista usamos un for que nos permita cortar la iteración,
        // porque no sería necesario recorrer toda la lista.
        // Alcanza que encuentre una persona que no tenga hijos para responder la pregunta.


        boolean encontre = false; // Definimos una variable que oficie de bandera

        // Opciones de recorrer la lista
        for (int i = 0; i < persona1.size() && !encontre; i++){
            if (persona1.get(i).cantHijos == 0) {
                encontre = true;
                System.out.println(persona1.get(i));
            }

            // Otra forma de recorrer la lista
            int i2 = 0;
            while (i2 < persona1.size() && !encontre) {
                if (persona1.get(i2).cantHijos == 0) {
                    encontre = true;
                    System.out.println(persona1.get(i2));
                }
                i2++;
            }


        }
    }
}
