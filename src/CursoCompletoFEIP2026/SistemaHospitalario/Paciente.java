package CursoCompletoFEIP2026.SistemaHospitalario;

public class Paciente extends Persona implements Agendable {

    private String obraSocial;
    private String diagnostico;

    public Paciente(String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.obraSocial = "Sin obra social";
        this.diagnostico = "Sin diagnóstico";
    }

    public Paciente(String nombre, String documento, int edad, String obraSocial) {
        super(nombre, documento, edad);
        this.obraSocial = obraSocial;
        this.diagnostico = "Sin diagnóstico";
    }

    public Paciente(String nombre, String documento, int edad, String obraSocial, String diagnostico) {
        super(nombre, documento, edad);
        this.obraSocial = obraSocial;
        this.diagnostico = diagnostico;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public void agendarCita() {
        System.out.println("El paciente " + getNombre() + " tiene una cita agendada.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Paciente: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Obra social: " + obraSocial);
        System.out.println("Diagnóstico: " + diagnostico);
    }
}