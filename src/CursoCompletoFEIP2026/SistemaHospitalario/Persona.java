package CursoCompletoFEIP2026.SistemaHospitalario;

public abstract class Persona {

    private String nombre;
    private String documento;
    private int edad;

    public Persona(String nombre, String documento, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void mostrarInformacion();
}