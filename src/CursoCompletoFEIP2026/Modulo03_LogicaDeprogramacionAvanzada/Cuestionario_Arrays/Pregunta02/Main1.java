package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta02;

public class Main1 {
    public static void main(String[] args) {

        Articulo articulos[] = new Articulo[5];

        articulos[0] = new Articulo("Azucar", 60, 10);
        articulos[1] = new Articulo("Refresco", 100, 100);
        articulos[2] = new Articulo("Cafe", 160, 100);
        articulos[3] = new Articulo("Mayonesa", 70, 300);
        articulos[4] = new Articulo("Aceite", 80, 100);

        // Acá se cambia el artículo de la posición 1
        articulos[1] = new Articulo("Yerba", 170, 200);

        // Mostrar el último elemento del array
        System.out.println(articulos[articulos.length - 1]);
    }
}

class Articulo {
    private String nombre;
    private int precio;
    private int cantidad;

    public Articulo(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
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