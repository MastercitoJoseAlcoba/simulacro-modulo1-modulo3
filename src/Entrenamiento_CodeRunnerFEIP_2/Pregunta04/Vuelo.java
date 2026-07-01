package Entrenamiento_CodeRunnerFEIP_2.Pregunta04;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int capacidadMaxima;
    private int pasajerosActuales;

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int capacidadMaxima) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActuales = 0;
    }

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, int capacidadMaxima) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = 20000.0;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActuales = 0;
    }

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.capacidadMaxima = 180;
        this.pasajerosActuales = 0;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public boolean agregarPasajero() {
        if (pasajerosActuales < capacidadMaxima) {
            pasajerosActuales++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vuelo " + identificador + ": " + ciudadOrigen + " -> " + ciudadDestino
                + ", Precio: $" + precio
                + ", Capacidad: " + capacidadMaxima
                + ", Pasajeros actuales: " + pasajerosActuales;
    }
}