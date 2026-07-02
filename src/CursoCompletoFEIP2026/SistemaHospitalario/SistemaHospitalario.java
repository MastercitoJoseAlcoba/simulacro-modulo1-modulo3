package CursoCompletoFEIP2026.SistemaHospitalario;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaHospitalario {

    private ArrayList<Paciente> pacientes;
    private ArrayList<Medico> medicos;
    private ArrayList<Consulta> consultas;

    public SistemaHospitalario() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public Paciente buscarPacientePorDocumento(String documento) throws PacienteNoEncontradoException {
        for (Paciente paciente : pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }

        throw new PacienteNoEncontradoException("No se encontró un paciente con el documento: " + documento);
    }

    public void realizarConsulta(Paciente paciente, Medico medico, LocalDate fecha, String motivo)
            throws PacienteNoEncontradoException {

        if (!pacienteRegistrado(paciente)) {
            throw new PacienteNoEncontradoException("El paciente no está registrado en el sistema.");
        }

        Consulta consulta = new Consulta(paciente, medico, fecha, motivo);
        consultas.add(consulta);

        paciente.agendarCita();
        medico.agendarCita();

        System.out.println("Consulta registrada correctamente.");
    }

    private boolean pacienteRegistrado(Paciente pacienteBuscado) {
        for (Paciente paciente : pacientes) {
            if (paciente == pacienteBuscado) {
                return true;
            }
        }

        return false;
    }

    public void mostrarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente paciente : pacientes) {
                paciente.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
        } else {
            for (Medico medico : medicos) {
                medico.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("No hay consultas registradas.");
        } else {
            for (Consulta consulta : consultas) {
                consulta.mostrarConsulta();
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.addAll(pacientes);
        personas.addAll(medicos);

        for (Persona persona : personas) {
            persona.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
}