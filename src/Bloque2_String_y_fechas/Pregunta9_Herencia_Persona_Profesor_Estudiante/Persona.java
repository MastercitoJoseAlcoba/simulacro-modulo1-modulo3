package Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante;

public class Persona {
    // Atributos propios de Persona.
    //
    // Como Profesor y Estudiante heredan de Persona,
    // ambos van a tener estos datos generales.
    private String nombre;
    private String cedula;
    private String direccion;

    // Constructor de Persona.
    //
    // Sirve para inicializar los atributos comunes:
    // nombre, cedula y direccion.
    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public Persona(String carlos, int i) {
        this.nombre = carlos;
        this.cedula = "123456789";
        this.direccion = "Calle 123";
    }

    @Override
    public String toString() {

        // toString() devuelve una representación en texto del objeto.
        //
        // Se usa mucho cuando queremos imprimir un objeto.
        //
        // Ejemplo:
        // System.out.println(persona);
        //
        // Java llama automáticamente a persona.toString().
        return "Persona{nombre='" + nombre + "', cedula='" + cedula
                + "', direccion='" + direccion + "'}";
    }

    public int getEdad() {
        return 0;
    }
}

