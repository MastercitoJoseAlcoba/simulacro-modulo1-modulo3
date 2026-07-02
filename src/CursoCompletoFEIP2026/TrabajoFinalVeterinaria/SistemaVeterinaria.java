package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaVeterinaria {

    private ArrayList<Cliente> clientes;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Turno> turnos;

    public SistemaVeterinaria() {
        this.clientes = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public void reservarTurno(Mascota mascota, Veterinario veterinario, LocalDate fecha, String tipoServicio)
            throws MascotaNoEncontradaException {

        if (!mascotaRegistrada(mascota)) {
            throw new MascotaNoEncontradaException("La mascota no está registrada en el sistema.");
        }

        Turno turno = new Turno(mascota, veterinario, fecha, tipoServicio);
        turnos.add(turno);

        mascota.realizarServicio(tipoServicio);
        veterinario.realizarServicio(tipoServicio);

        System.out.println("Turno reservado correctamente.");
    }

    private boolean mascotaRegistrada(Mascota mascotaBuscada) {
        for (Cliente cliente : clientes) {
            for (Mascota mascota : cliente.getMascotas()) {
                if (mascota == mascotaBuscada) {
                    return true;
                }
            }
        }

        return false;
    }

    public void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos registrados.");
        } else {
            for (Turno turno : turnos) {
                turno.mostrarTurno();
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarPersonas() {
        for (Cliente cliente : clientes) {
            cliente.mostrarInformacion();
            System.out.println("--------------------");
        }

        for (Veterinario veterinario : veterinarios) {
            veterinario.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
}