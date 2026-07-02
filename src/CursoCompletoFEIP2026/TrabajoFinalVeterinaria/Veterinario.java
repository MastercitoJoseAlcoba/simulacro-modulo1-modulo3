package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

public class Veterinario extends Persona implements ServicioVeterinario {

    private String especialidad;

    public Veterinario(String nombre, String documento, String email) {
        super(nombre, documento, email);
        this.especialidad = "General";
    }

    public Veterinario(String nombre, String documento, String email, String especialidad) {
        super(nombre, documento, email);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void realizarServicio(String tipoServicio) {
        System.out.println("El veterinario " + getNombre() +
                " realizó el servicio: " + tipoServicio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Veterinario: " + getNombre() +
                " - Documento: " + getDocumento() +
                " - Email: " + getEmail() +
                " - Especialidad: " + especialidad);
    }
}