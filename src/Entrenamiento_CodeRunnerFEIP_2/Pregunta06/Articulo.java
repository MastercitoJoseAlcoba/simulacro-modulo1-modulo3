package Entrenamiento_CodeRunnerFEIP_2.Pregunta06;

public class Articulo {
    private String descripcion;
    private double costo;
    private int stock;

    // Constructor con descripción y costo

    // La clave de este ejercicio esta aca:
    // Artículo a = new Articulo("Laptop", 1500.50); (no pasan stock, entonces debe quedar automáticamente en 0.)

    public Articulo(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.stock = 0;
    }

    // Constructor con descripcion, costo y stock
    public Articulo(String descripcion, double costo, int stock) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.stock = stock;
    }

    // Constructor sin parámetros
    public Articulo() {
        this.descripcion = "Sin descripción";
        this.costo = 0.0;
        this.stock = 0;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public int getStock() {
        return stock;
    }
}