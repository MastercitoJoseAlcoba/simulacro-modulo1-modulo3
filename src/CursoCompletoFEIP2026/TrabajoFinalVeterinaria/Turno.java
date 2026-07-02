package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

import java.time.LocalDate;

public class Turno {

    private Mascota mascota;
    private Veterinario veterinario;
    private LocalDate fecha;
    private String tipoServicio;

    public Turno(Mascota mascota, Veterinario veterinario, LocalDate fecha, String tipoServicio) {
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void mostrarTurno() {
        System.out.println("Turno:");
        System.out.println("Mascota: " + mascota.getNombre());
        System.out.println("Veterinario: " + veterinario.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Servicio: " + tipoServicio);
    }
}