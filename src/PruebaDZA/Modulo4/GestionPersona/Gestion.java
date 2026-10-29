package PruebaDZA.Modulo4.GestionPersona;

import java.util.ArrayList;
import java.util.List;

public class Gestion implements GestionPersona {

    private List<Persona> personas = new ArrayList<>();

    @Override
    public void altaPersona(Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona p) {

    }

    @Override
    public void bajaPersona(Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona p) {

    }

    @Override
    public void modificarPersona(Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona p) {

    }

    @Override
    public void leerPersona(Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona p) {

    }

    @Override
    public void altaPersona(Persona p) {
        personas.add(p);
        System.out.println("Persona agregada: " + p);
    }

    @Override
    public void bajaPersona(Persona p) {
        if (personas.remove(p)) {
            System.out.println("Persona eliminada: " + p);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    @Override
    public void modificarPersona(Persona p) {
        if (personas.contains(p)) {
            p.setNombre("Nombre modificado");
            p.setEdad(30);
            System.out.println("Persona modificada: " + p);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    @Override
    public void leerPersona(Persona p) {
        if (personas.contains(p)) {
            System.out.println("Persona encontrada: " + p);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    @Override
    public void listarPersonas() {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}