package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta13;

public class Producto {

    private String nombre;
    private String categoria;
    private int stock;

    public Producto() {
        this.nombre = "Producto sin nombre";
        this.categoria = "Categoría sin definir";
        this.stock = 0;
    }

    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = 0;
    }

    public Producto(String nombre, String categoria, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Stock disponible: " + stock);
    }

    public static void main(String[] args) {

        Producto p1 = new Producto();

        System.out.println("Prueba constructor sin parámetros:");
        System.out.println(p1.getNombre());
        System.out.println(p1.getCategoria());
        System.out.println(p1.getStock());

        System.out.println("--------------------");

        Producto p2 = new Producto("Mouse", "Informática");

        System.out.println("Prueba constructor con dos parámetros:");
        System.out.println(p2.getNombre());
        System.out.println(p2.getCategoria());
        System.out.println(p2.getStock());

        System.out.println("--------------------");

        Producto p3 = new Producto("Teclado", "Periféricos", 20);

        System.out.println("Prueba constructor con tres parámetros:");
        System.out.println(p3.getNombre());
        System.out.println(p3.getCategoria());
        System.out.println(p3.getStock());

        p3.mostrar();
    }
}