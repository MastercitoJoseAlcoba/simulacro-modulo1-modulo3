package Apoyo_Diciembre2026.VC1P5_POO_NewOpcion;

public class Producto {

    private String nombre;
    private String categoria;
    private int stock;

    // Sin parámetros, usa los valores por defecto de la letra.
    public Producto() {
        this.nombre = "Producto sin nombre";
        this.categoria = "Categoría sin definir";
        this.stock = 0;
    }

    // Recibe nombre y categoría. El stock empieza en 0.
    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = 0;
    }

    // Recibe los tres datos del producto.
    public Producto(String nombre, String categoria, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // «Distinto de null y no vacío» exige las dos condiciones.
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        // La misma regla se aplica al texto recibido como categoría.
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        // «Mayor o igual a 0» permite guardar cero.
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public boolean tieneStockSuficiente() {
        // «10 unidades o más» incluye exactamente 10.
        if (stock >= 10) {
            return true;
        }
        return false;
    }

    public void mostrar() {
        // La letra pide mostrar cada dato en una línea distinta.
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Stock: " + stock + " unidades");
    }
}