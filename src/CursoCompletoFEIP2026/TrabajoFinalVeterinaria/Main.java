package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        SistemaVeterinaria sistema = new SistemaVeterinaria();

        Cliente cliente1 = new Cliente("María López", "12345678", "maria@gmail.com");
        Cliente cliente2 = new Cliente("Carlos Gómez", "98765432", "carlos@gmail.com");

        Mascota mascota1 = new Mascota("Luna", "Perro", 4, cliente1);
        Mascota mascota2 = new Mascota("Michi", "Gato", cliente1);
        Mascota mascota3 = new Mascota("Rocky", "Perro", 5, cliente2);

        cliente1.agregarMascota(mascota1);
        cliente1.agregarMascota(mascota2);
        cliente2.agregarMascota(mascota3);

        Veterinario veterinario1 = new Veterinario(
                "Dra. Ana Suárez",
                "45678912",
                "ana@veterinaria.com",
                "Cirugía"
        );

        Veterinario veterinario2 = new Veterinario(
                "Dr. Pedro Núñez",
                "78945612",
                "pedro@veterinaria.com"
        );

        sistema.agregarCliente(cliente1);
        sistema.agregarCliente(cliente2);

        sistema.agregarVeterinario(veterinario1);
        sistema.agregarVeterinario(veterinario2);

        System.out.println("=== INFORMACIÓN DE PERSONAS ===");
        sistema.mostrarPersonas();

        System.out.println("=== RESERVA DE TURNOS ===");

        try {
            sistema.reservarTurno(
                    mascota1,
                    veterinario1,
                    LocalDate.of(2025, 12, 10),
                    "Consulta"
            );

            sistema.reservarTurno(
                    mascota2,
                    veterinario2,
                    LocalDate.of(2025, 12, 12),
                    "Baño"
            );

            sistema.reservarTurno(
                    mascota3,
                    veterinario1,
                    LocalDate.of(2025, 12, 15),
                    "Operación"
            );

        } catch (MascotaNoEncontradaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=== TURNOS REGISTRADOS ===");
        sistema.mostrarTurnos();

        System.out.println("=== HISTORIAL DE MASCOTA ===");
        mascota1.mostrarInformacion();
    }
}