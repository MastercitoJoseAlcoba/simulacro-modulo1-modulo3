package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta25;

import java.util.Arrays;

public class Eje25 {
    public static void main(String[] args) {
        Articulo articulos[] = new Articulo[5];

        articulos[0] = new Articulo("Azucar", 60, 10);
        articulos[1] = new Articulo("Refresco", 100, 100);
        articulos[2] = new Articulo("Cafe", 160, 100);
        articulos[3] = new Articulo("Mayonesa", 70, 300);

        // Acá se pisa el artículo que estaba en la posición 0
        articulos[0] = new Articulo("Aceite", 80, 100);

        // Acá se pisa el artículo que estaba en la posición 1
        articulos[1] = new Articulo("Yerba", 170, 200);

        System.out.println(Arrays.toString(articulos));

        mostrar(articulos);
    }

    public static void mostrar(Articulo[] arti) {

        double suma = 0;

        for (int i = 0; i < arti.length; i++) {

            if (arti[i] != null) {
                suma += arti[i].getPrecio() * arti[i].getCantidad();
            }
        }

        System.out.println("Total inventario :" + suma);
    }
}

class Articulo {
    private String nombre;
    private double precio;
    private int cantidad;

    public Articulo(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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

    @Override
    public String toString() {
        return nombre;
    }
}
