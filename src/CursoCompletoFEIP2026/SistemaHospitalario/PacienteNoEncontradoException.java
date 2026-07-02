package CursoCompletoFEIP2026.SistemaHospitalario;

public class PacienteNoEncontradoException extends Exception {

    public PacienteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}