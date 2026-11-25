package Apoyo_Diciembre2026.Feip_CodeRunner;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio) {
        this(id, nombre, precio, 0);
    }

    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
