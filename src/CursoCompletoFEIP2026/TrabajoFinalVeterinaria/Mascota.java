package CursoCompletoFEIP2026.TrabajoFinalVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mascota implements ServicioVeterinario {

    private String nombre;
    private String tipo;
    private int edad;
    private Cliente clienteDuenio;
    private ArrayList<String> historialServicios;

    public Mascota(String nombre, String tipo, Cliente clienteDuenio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = 0;
        this.clienteDuenio = clienteDuenio;
        this.historialServicios = new ArrayList<>();
    }

    public Mascota(String nombre, String tipo, int edad, Cliente clienteDuenio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.clienteDuenio = clienteDuenio;
        this.historialServicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public Cliente getClienteDuenio() {
        return clienteDuenio;
    }

    public ArrayList<String> getHistorialServicios() {
        return historialServicios;
    }

    @Override
    public void realizarServicio(String tipoServicio) {
        String registro = tipoServicio + " - Fecha: " + LocalDate.now();
        historialServicios.add(registro);

        System.out.println("La mascota " + nombre +
                " recibió el servicio: " + tipoServicio +
                " en la fecha: " + LocalDate.now());
    }

    public void mostrarInformacion() {
        System.out.println("Mascota: " + nombre +
                " - Tipo: " + tipo +
                " - Edad: " + edad +
                " - Dueño: " + clienteDuenio.getNombre());

        System.out.println("Historial de servicios:");

        if (historialServicios.isEmpty()) {
            System.out.println("No tiene servicios registrados.");
        } else {
            for (String servicio : historialServicios) {
                System.out.println("- " + servicio);
            }
        }
    }
}