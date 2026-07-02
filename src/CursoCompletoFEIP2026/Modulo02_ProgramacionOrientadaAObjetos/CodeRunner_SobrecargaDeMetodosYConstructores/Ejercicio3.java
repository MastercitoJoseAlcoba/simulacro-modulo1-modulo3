package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_SobrecargaDeMetodosYConstructores;

public class Ejercicio3 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop");
        Producto producto2 = new Producto("Teléfono", 499.99);
        Producto producto3 = new Producto("Tablet", 299.99, 50);
        producto1.mostrarInformacion(true);
        System.out.println("------------------------");
        producto2.mostrarInformacion(true);
        System.out.println("------------------------");
        producto3.mostrarInformacion(true, 20.0);

    }

    public static class Producto {
        private final String nombre;
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

        // Constructor que toma el nombre, el precio y la cantidad en stock
        public Producto(String nombre, double precio, int cantidadEnStock) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadEnStock = cantidadEnStock;
        }

        // Metodo para calcular el valor total del stock
        public double calcularValorTotal() {
            return precio * cantidadEnStock;
        }

        // Sobrecarga del método para calcular el valor total con descuento
        public double calcularValorTotal(double descuento) {
            return calcularValorTotal() - descuento;
        }

        // Método para mostrar la información básica del producto
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad en Stock: " + cantidadEnStock);
        }

        // Sobrecarga del método para mostrar información adicional
        public void mostrarInformacion(boolean mostrarValorTotal) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad en Stock: " + cantidadEnStock);

            if (mostrarValorTotal) {
                System.out.println("Valor Total del Stock: $" + calcularValorTotal());
            }
        }

        // Sobrecarga del método para mostrar información adicional con descuento
        public void mostrarInformacion(boolean mostrarValorTotal, double descuento) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad en Stock: " + cantidadEnStock);

            if (mostrarValorTotal) {
                System.out.println("Valor Total del Stock con Descuento: $" + calcularValorTotal(descuento));
            }
        }
    }
}

