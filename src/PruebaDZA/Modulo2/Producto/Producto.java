package PruebaDZA.Modulo2.Producto;

import java.time.LocalDate;

public class Producto {
    // Atributos
    private int codigo;
    private String nombre;
    private double precio;
    private LocalDate fechaVencimiento;

    // Constructores
    public Producto(int codigo, String nombre, double precio, LocalDate fechaVencimiento) {
        this.codigo = codigo; // 0
        this.nombre = nombre; // Null
        this.precio = precio; // 0.0
        this.fechaVencimiento = fechaVencimiento; // Null
    }

    // Constructor vacio
    public Producto() {

    }

    // Getter y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // toString
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre='" + nombre + '\'' + ", precio=" + precio + ", fechaVencimiento=" + fechaVencimiento + '}';
        // Producto{codigo=1, nombre='Producto 1', precio=100.0, fechaVencimiento=2026-10-26}
    }

    // 1. Primer método: dólar con valor fijo
    public double convertirDolar(){
        double dolar = 38.50;
        return this.precio / dolar;
    }

    // 2. Segundo método: dólar con valor recibido
    public double convertirDolar2(double dolar){
        return this.precio / dolar;
    }
}
