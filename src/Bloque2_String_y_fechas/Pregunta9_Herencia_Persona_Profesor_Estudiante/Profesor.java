package Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante;

public class Profesor extends Persona {

    // Profesor hereda de Persona.
    //
    // Eso significa que Profesor también tiene:
    // nombre, cedula y direccion.
    //
    // Además, Profesor agrega sus propios atributos:
    private String carnetSalud;
    private String materia;

    public Profesor(String nombre, String cedula, String direccion,
                    String carnetSalud, String materia) {

        // super(...) llama al constructor de la clase padre.
        //
        // En este caso, llama al constructor de Persona.
        //
        // Sirve para cargar:
        // nombre, cedula y direccion.
        super(nombre, cedula, direccion);

        // Ahora cargamos los atributos propios de Profesor.
        this.carnetSalud = carnetSalud;
        this.materia = materia;
    }

    @Override
    public String toString() {

        // super.toString() llama al toString() de Persona.
        //
        // Entonces primero imprime los datos generales:
        // nombre, cedula y direccion.
        //
        // Después agregamos los datos propios del profesor.
        return super.toString() + " Profesor{carnetSalud='" + carnetSalud
                + "', materia='" + materia + "'}";
    }
}
