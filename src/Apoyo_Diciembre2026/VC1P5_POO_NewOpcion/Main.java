package Apoyo_Diciembre2026.VC1P5_POO_NewOpcion;

public class Main {
    public static void main(String[] args) {
        // Creando un objeto Producto
        Producto producto1 = new Producto("Yerba", "Almacén", 10);
        // Llamando al método para verificar stock suficiente y mostrar información
        producto1.tieneStockSuficiente(); // Devuelve true
        producto1.mostrar();

        // Salida esperada por terminal:
        // Producto: Yerba
        // Categoría: Almacén
        // Stock: 10
    }
}
