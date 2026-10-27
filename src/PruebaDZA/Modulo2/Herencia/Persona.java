package PruebaDZA.Modulo2.Herencia;

// Clase padre de Estudiante y Profesor
public class Persona {

    // Atributos
    private String nombre;
    private String telefono;
    private String cedula;
    private Direccion direccion;

    // Constructor
    public Persona(String nombre, String telefono, String cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Método toString corregido
    @Override
    public String toString() {
        return """
                Persona{
                    nombre='%s',
                    telefono='%s',
                    cedula='%s',
                    direccion=%s
                }
                """.formatted(nombre, telefono, cedula, direccion);
    }
}