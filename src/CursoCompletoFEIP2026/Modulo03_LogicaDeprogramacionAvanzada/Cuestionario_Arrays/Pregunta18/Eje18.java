package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta18;

public class Eje18 {
    public static void main(String[] args) {

        Articulo articulos[] = new Articulo[5];

        articulos[0] = new Articulo("Azucar", 60, 10);
        articulos[1] = new Articulo("Refresco", 100, 100);
        articulos[2] = new Articulo("Cafe", 160, 100);
        articulos[3] = new Articulo("Mayonesa", 70, 300);
        articulos[4] = new Articulo("Aceite", 80, 100);

        // Se cambia el segundo elemento del array
        articulos[1] = new Articulo("Yerba", 170, 200);

        // Mostrar el primer elemento del array
        System.out.println(articulos[0]);
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

    @Override
    public String toString() {
        return nombre;
    }
}