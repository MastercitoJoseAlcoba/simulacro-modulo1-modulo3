package CursoCompletoFEIP2026.Modulo05_CuestionarioFinal;

import java.util.ArrayList;

abstract class Entidad {

    protected String nombre;
    protected String documento;
    protected String email;

    public Entidad(String nombre, String documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }

    public abstract void mostrarInformacion();
}

interface ServicioVeterinario {

    void realizarServicio(String tipoServicio);
}

class Cliente extends Entidad {

    private ArrayList<Mascota> mascotas;

    public Cliente(String nombre, String documento, String email) {
        super(nombre, documento, email);
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " - Documento: " + documento + " - Email: " + email);
        System.out.println("Mascotas:");

        for (Mascota mascota : mascotas) {
            System.out.println("- " + mascota.getNombre() + " (" + mascota.getTipo() + ")");
        }
    }
}

class Veterinario extends Entidad implements ServicioVeterinario {

    private String especialidad;

    public Veterinario(String nombre, String documento, String email) {
        super(nombre, documento, email);
        this.especialidad = "General";
    }

    public Veterinario(String nombre, String documento, String email, String especialidad) {
        super(nombre, documento, email);
        this.especialidad = especialidad;
    }

    @Override
    public void realizarServicio(String tipoServicio) {
        System.out.println("Veterinario " + nombre + " realizó servicio: " + tipoServicio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Veterinario: " + nombre + " - Documento: " + documento + " - Email: " + email + " - Especialidad: " + especialidad);
    }
}

class Mascota implements ServicioVeterinario {

    private String nombre;
    private String tipo;
    private int edad;
    private Cliente clienteDueño;
    private ArrayList<String> historialServicios;

    public Mascota(String nombre, String tipo, int edad, Cliente clienteDueño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.clienteDueño = clienteDueño;
        this.historialServicios = new ArrayList<>();
    }

    public Mascota(String nombre, String tipo, Cliente clienteDueño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = 0;
        this.clienteDueño = clienteDueño;
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

    public Cliente getClienteDueño() {
        return clienteDueño;
    }

    @Override
    public void realizarServicio(String tipoServicio) {
        historialServicios.add("Servicio: " + tipoServicio);
        System.out.println("Mascota " + nombre + " recibió servicio: " + tipoServicio);
    }

    public void mostrarHistorialServicios() {
        System.out.println("Historial de servicios de " + nombre + ": " + historialServicios);
    }

    public void mostrarInformacion() {
        System.out.println("Mascota: " + nombre + " - Tipo: " + tipo + " - Edad: " + edad);
        System.out.println("Dueño: " + clienteDueño.nombre);
    }
}

class Turno {

    private Mascota mascota;
    private Veterinario veterinario;
    private String fecha;
    private String tipoServicio;

    public Turno(Mascota mascota, Veterinario veterinario, String fecha, String tipoServicio) {
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
    }

    public void mostrarDetalle() {
        System.out.println("Turno:");
        System.out.println("- Mascota: " + mascota.getNombre());
        System.out.println("- Dueño: " + mascota.getClienteDueño().nombre);
        System.out.println("- Veterinario: " + veterinario.nombre);
        System.out.println("- Fecha: " + fecha);
        System.out.println("- Servicio: " + tipoServicio);
        System.out.println("---------------");
    }
}

class MascotaNoEncontradaException extends Exception {

    public MascotaNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}

class GestorVeterinaria {

    public static Mascota buscarMascotaPorNombre(ArrayList<Mascota> mascotas, String nombre)
            throws MascotaNoEncontradaException {

        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                return mascota;
            }
        }

        throw new MascotaNoEncontradaException("No se encontró la mascota con nombre: " + nombre);
    }
}