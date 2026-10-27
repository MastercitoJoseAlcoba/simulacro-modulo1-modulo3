package PruebaDZA.Modulo2.sobreCargaDeMetodosYConstructores;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor que toma solo el nombre
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    // Constructor que toma el nombre y el precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor que toma el nombre, precio y cantidad en stock
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
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

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método para calcular el valor del stock
    public double calcularValorStock() {
        return precio * cantidadEnStock;
    }

    // Sobrecarga el método para calcular el valor del stock con descuento
    public double calcularValorStockConDescuento(double descuento) {
        return precio * cantidadEnStock * (1 - descuento);
    }

    // Metodo para mostrar la información básica del producto
    public void mostrarInformacionBasica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en Stock: " + cantidadEnStock);
    }

    // Sobrecarga el método para mostrar información completa del producto
    public void mostrarInformacionCompleta(boolean mostrarValorStock) {
        mostrarInformacionBasica();
        if (mostrarValorStock) {
            System.out.println("Valor del Stock: " + calcularValorStock());
        }
    }

    // Sobrecarga del método para mostrar información adicional con descuento
    public void mostrarInformacionConDescuento(boolean mostrarValorStock, double descuento) {
        mostrarInformacionBasica();
        if (mostrarValorStock) {
            System.out.println("Valor del Stock con Descuento: " + calcularValorStockConDescuento(descuento));
        }
    }
}

