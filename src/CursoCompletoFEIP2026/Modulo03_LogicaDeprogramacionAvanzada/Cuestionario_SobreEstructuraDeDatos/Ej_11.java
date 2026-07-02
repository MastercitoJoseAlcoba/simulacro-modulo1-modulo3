package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.HashMap.Persona;

import java.util.LinkedList;

public class Ej_11 {
    public static void main(String[] args) {
        // Si quiero crear una lista de tipo Persona, como debo escribir para crear la lista:

        LinkedList<Persona> listaPersonas = new LinkedList<Persona>();

        listaPersonas.add(new Persona("Juan", 1, "4.547.166-8"));
        listaPersonas.add(new Persona("Maria", 2, "4.196.456-1"));
        listaPersonas.add(new Persona("Pedro", 3, "4.123.456-7"));

    }

}
