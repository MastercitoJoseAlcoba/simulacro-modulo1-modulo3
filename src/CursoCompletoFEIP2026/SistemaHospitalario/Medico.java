package CursoCompletoFEIP2026.SistemaHospitalario;

public class Medico extends Persona implements Agendable {

    private String especialidad;
    private int numeroRegistro;

    public Medico(String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.especialidad = "Medicina general";
        this.numeroRegistro = 0;
    }

    public Medico(String nombre, String documento, int edad, String especialidad) {
        super(nombre, documento, edad);
        this.especialidad = especialidad;
        this.numeroRegistro = 0;
    }

    public Medico(String nombre, String documento, int edad, String especialidad, int numeroRegistro) {
        super(nombre, documento, edad);
        this.especialidad = especialidad;
        this.numeroRegistro = numeroRegistro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    @Override
    public void agendarCita() {
        System.out.println("El médico " + getNombre() + " tiene una consulta agendada.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Médico: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Número de registro: " + numeroRegistro);
    }
}