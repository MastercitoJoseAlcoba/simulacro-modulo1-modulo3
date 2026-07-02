package Espacio_De_Practicas.CodeRunner02.Pregunta08;

public class Articulo {

    private String descripcion;
    private double costo;
    private int stock;

    public Articulo() {
        this.descripcion = "Sin descripción";
        this.costo = 0.0;
        this.stock = 0;
    }

    public Articulo(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.stock = 0;
    }

    public Articulo(String descripcion, double costo, int stock) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.stock = stock;
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