package CursoCompletoFEIP2026.Modulo05_CuestionarioFinal;

import java.util.ArrayList;

abstract class Persona {

    protected String nombre;
    protected String documento;
    protected int edad;

    public Persona(String nombre, String documento, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
    }

    public Persona(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = 0;
    }

    public String getDocumento() {
        return documento;
    }

    public abstract void mostrarInformacion();
}

interface Agendable {

    void agendarCita(String fecha, String motivo);
}

class Paciente extends Persona implements Agendable {

    private ArrayList<String> citas;

    public Paciente(String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.citas = new ArrayList<>();
    }

    public Paciente(String nombre, String documento) {
        super(nombre, documento);
        this.citas = new ArrayList<>();
    }

    @Override
    public void agendarCita(String fecha, String motivo) {
        citas.add("Fecha: " + fecha + ", Motivo: " + motivo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre + " - Documento: " + documento + " - Edad: " + edad);
        System.out.println("Citas: " + citas);
    }
}

class Medico extends Persona implements Agendable {

    private String especialidad;
    private ArrayList<String> citas;

    public Medico(String nombre, String documento, int edad, String especialidad) {
        super(nombre, documento, edad);
        this.especialidad = especialidad;
        this.citas = new ArrayList<>();
    }

    public Medico(String nombre, String documento, String especialidad) {
        super(nombre, documento);
        this.especialidad = especialidad;
        this.citas = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void agendarCita(String fecha, String motivo) {
        citas.add("Fecha: " + fecha + ", Motivo: " + motivo);
        System.out.println("Médico " + nombre + " ha sido agendado para una cita el " + fecha + " por: " + motivo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Médico: " + nombre + " - Documento: " + documento + " - Especialidad: " + especialidad);
    }
}

class Consulta {

    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String motivo;

    public Consulta(Paciente paciente, Medico medico, String fecha, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public void mostrarDetalle() {
        System.out.println("Consulta:");
        paciente.mostrarInformacion();
        System.out.println("Médico: " + medico.nombre + " - Documento: " + medico.documento + " - Especialidad: " + medico.getEspecialidad());
        System.out.println("Fecha: " + fecha + " - Motivo: " + motivo);
        System.out.println("---------------");
    }
}

class PacienteNoEncontradoException extends Exception {

    public PacienteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

class Utilidades {

    public static Paciente buscarPacientePorDocumento(ArrayList<Paciente> pacientes, String documento)
            throws PacienteNoEncontradoException {

        for (Paciente paciente : pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }

        throw new PacienteNoEncontradoException("No se encontró un paciente con documento: " + documento);    }
}