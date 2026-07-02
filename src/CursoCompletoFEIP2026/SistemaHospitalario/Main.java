package CursoCompletoFEIP2026.SistemaHospitalario;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        SistemaHospitalario sistema = new SistemaHospitalario();

        Paciente paciente1 = new Paciente(
                "María López",
                "12345678",
                35,
                "ASSE",
                "Dolor de cabeza"
        );

        Paciente paciente2 = new Paciente(
                "Carlos Gómez",
                "98765432",
                48,
                "Médica Uruguaya"
        );

        Paciente paciente3 = new Paciente(
                "Lucía Fernández",
                "45678912",
                22
        );

        Medico medico1 = new Medico(
                "Dra. Ana Suárez",
                "11122233",
                45,
                "Cardiología",
                1001
        );

        Medico medico2 = new Medico(
                "Dr. Pedro Núñez",
                "44455566",
                50,
                "Medicina general"
        );

        Medico medico3 = new Medico(
                "Dra. Sofía Pereira",
                "77788899",
                39
        );

        sistema.agregarPaciente(paciente1);
        sistema.agregarPaciente(paciente2);
        sistema.agregarPaciente(paciente3);

        sistema.agregarMedico(medico1);
        sistema.agregarMedico(medico2);
        sistema.agregarMedico(medico3);

        System.out.println("=== PACIENTES REGISTRADOS ===");
        sistema.mostrarPacientes();

        System.out.println("=== MÉDICOS REGISTRADOS ===");
        sistema.mostrarMedicos();

        System.out.println("=== INFORMACIÓN POLIMÓRFICA DE PERSONAS ===");
        sistema.mostrarPersonas();

        System.out.println("=== CONSULTAS MÉDICAS ===");

        try {
            sistema.realizarConsulta(
                    paciente1,
                    medico1,
                    LocalDate.of(2025, 11, 10),
                    "Control cardiológico"
            );

            sistema.realizarConsulta(
                    paciente2,
                    medico2,
                    LocalDate.of(2025, 11, 12),
                    "Dolor abdominal"
            );

            sistema.realizarConsulta(
                    paciente3,
                    medico3,
                    LocalDate.of(2025, 11, 15),
                    "Consulta general"
            );

        } catch (PacienteNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=== CONSULTAS REGISTRADAS ===");
        sistema.mostrarConsultas();

        System.out.println("=== BÚSQUEDA DE PACIENTE ===");

        try {
            Paciente pacienteEncontrado = sistema.buscarPacientePorDocumento("12345678");
            System.out.println("Paciente encontrado:");
            pacienteEncontrado.mostrarInformacion();

        } catch (PacienteNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=== PRUEBA DE EXCEPCIÓN ===");

        try {
            Paciente pacienteNoRegistrado = new Paciente(
                    "Paciente Fantasma",
                    "00000000",
                    99
            );

            sistema.realizarConsulta(
                    pacienteNoRegistrado,
                    medico1,
                    LocalDate.of(2025, 12, 1),
                    "Consulta inexistente"
            );

        } catch (PacienteNoEncontradoException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }
}