package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

public abstract class Persona {

    private String nombre;
    private String documento;
    private String email;

    public Persona(String nombre, String documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public abstract void mostrarInformacion();
}