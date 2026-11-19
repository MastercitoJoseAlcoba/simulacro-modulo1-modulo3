package Apoyo_Diciembre2026.VC1P5_POO_NewOpcion;

public class Producto {
    // Atributos privados
    private String nombre;
    private String categoria;
    private int stock; // cantidad de unidades disponibles

    // Constructor sin parámetros
    public Producto(){
        this.nombre = "Producto sin nombre";
        this.categoria = "Categoría sin definir";
        this.stock = 0;
    }

    // Constructor con parámetros (String, String)
    public Producto(String nombre, String categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = 0;
    }

    // Constructor con parámetros (String, String, int)
    public Producto(String nombre, String categoria, int stock){
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if ( nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getCategoria(){
        if ( categoria != null && !categoria.isEmpty()) {
            return categoria;
        }
        return "";
    }

    public void setCategoria(String categoria){
        if ( categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        if ( stock >= 0){
            this.stock = stock;
        }
    }

    // Método para verificar si hay stock suficiente
    public boolean tieneStockSuficiente() {
        // «10 unidades o más» incluye exactamente 10.
        if (stock >= 10) {
            return true;
        }
        return false;
        // También se puede escribir return stock >= 10;

    }

    // Método para mostrar información del producto
    public void mostrar(){
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Stock: " + stock + " unidades");

    }

}
