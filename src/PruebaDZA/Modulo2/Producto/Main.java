package PruebaDZA.Modulo2.Producto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Producto
        Producto producto1 = new Producto(1, "Producto 1", 100.0, LocalDate.of (2021, 4, 26));

        // Cambie los valores del producto
        producto1.setCodigo(1);
        producto1.setNombre("Fideos");
        producto1.setPrecio(200.0);
        producto1.setFechaVencimiento(LocalDate.of(2022, 5, 20));

        // Mostrar el objeto Producto
        System.out.println(producto1);

        // Convertir usando dólar fijo
        System.out.println(producto1.convertirDolar()); // Fija: 38.50

        // Convertir usando dólar recibido por parámetro
        System.out.println(producto1.convertirDolar2(38.50)); // Variable: Se recibe por parámetro

    }
}
