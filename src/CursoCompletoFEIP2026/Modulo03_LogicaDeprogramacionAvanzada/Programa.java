package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada;

import CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.HashMap.Persona;

import java.util.LinkedList;

public class Programa {
    public static void main(String[] args) {
        LinkedList<Persona> listaPersonas = new LinkedList<>();

        Persona p1 = new Persona("Juan", 1, "4.547.166-8");
        Persona p2 = new Persona("Maria", 2, "4.196.456-1");
        Persona p3 = new Persona("Pedro", 3, "4.123.456-7");

        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);

        // Buscamos en la lista la persona con CI que deseamos
        Persona personaBuscada = null;
        for (Persona persona : listaPersonas) {
            if (persona.getCi().equals("4.123.456-7")) {
                personaBuscada = persona;
                break;
            };
        }
        System.out.println("Nombre: " + personaBuscada.getNombre());
        System.out.println("Residencia: " + personaBuscada.getCiudadResidencia());
        System.out.println("CI: " + personaBuscada.getCi());

    }

}



