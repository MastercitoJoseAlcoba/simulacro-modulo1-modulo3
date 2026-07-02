package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_1.Pregunta1;// clase Producto

class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

// Interfaz que tienen los métodos abstractos

interface ICrudProductos {
    public void agregar(Producto p);

    public void modificar(Producto p);

    public void eliminar(Producto p);

    public void listar();
}

// Clase que implementa la interfaz

class CrudProductosImpl implements ICrudProductos {

    java.util.HashMap<Integer, Producto> productos = new java.util.HashMap<Integer, Producto>();

    @Override
    public void agregar(Producto p) {
        productos.put(p.getId(), p); // Esta parte te pide el CodeRunner
    }

    @Override
    public void modificar(Producto p) {
        if (productos.containsKey(p.getId())) {

            productos.put(p.getId(), p); // Esta parte te pide el CodeRunner

        } else {
            System.out.println("No se pudo modificar al producto");
        }
    }

    @Override
    public void eliminar(Producto p) {
        if (productos.containsKey(p.getId())) {

            productos.remove(p.getId()); // Esta parte te pide el CodeRunner

        } else {
            System.out.println("No se pudo eliminar al producto");
        }
    }

    @Override
    public void listar() {
        for (Integer clave : productos.keySet()) { // Esta parte te pide el CodeRunner
            System.out.println("Clave: " + clave + " valor: " + productos.get(clave));
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ICrudProductos gestorProductos = new CrudProductosImpl();

        Producto p1 = new Producto(1, "Arroz", 55);
        Producto p2 = new Producto(2, "Harina", 60);
        Producto p3 = new Producto(3, "Cafe", 180);
        Producto p4 = new Producto(4, "Mayonesa", 130);

        gestorProductos.agregar(p1);
        gestorProductos.agregar(p2);
        gestorProductos.agregar(p3);
        gestorProductos.agregar(p4);

        Producto p5 = new Producto(10, "Fideos", 70);
        gestorProductos.modificar(p5);

        p5 = new Producto(1, "Yerba", 180);
        gestorProductos.modificar(p5);

        p5 = new Producto(8, "Refresco", 90);

        gestorProductos.eliminar(p5);
        gestorProductos.agregar(p5);
        gestorProductos.eliminar(p4);
        gestorProductos.listar();
    }
}




