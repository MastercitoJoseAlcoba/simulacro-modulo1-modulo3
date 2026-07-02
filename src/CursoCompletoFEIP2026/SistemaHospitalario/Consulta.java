package CursoCompletoFEIP2026.SistemaHospitalario;

import java.time.LocalDate;

public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;
    private String motivo;

    public Consulta(Paciente paciente, Medico medico, LocalDate fecha, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void mostrarConsulta() {
        System.out.println("Consulta médica:");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Médico: " + medico.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Motivo: " + motivo);
    }
}