package PruebaDZA.Modulo4.GestionPersona;

import Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona;

public interface GestionPersona {
    static final double DOLAR = 40; // Constante para la conversión de dólares a pesos

    // CRUD: Create - Read - Update - Delete
    public void altaPersona(Persona p); // Firma del método para agregar una persona
    public void bajaPersona(Persona p);
    public void modificarPersona(Persona p);
    public void leerPersona(Persona p);

    void altaPersona(PruebaDZA.Modulo4.GestionPersona.Persona p);

    void bajaPersona(PruebaDZA.Modulo4.GestionPersona.Persona p);

    void modificarPersona(PruebaDZA.Modulo4.GestionPersona.Persona p);

    void leerPersona(PruebaDZA.Modulo4.GestionPersona.Persona p);

    public void listarPersonas();
}
