package Cuestionario_de_entrenamiento_CodeRunner;

import java.util.HashMap;
import java.util.Map;

public class CRUD_con_HashMap {
    public static void main(String[] args) {

        ProductoService servicio = new ProductoService();

        // Agregamos productos
        servicio.agregar(1, new Producto("Mouse", 500));
        servicio.agregar(2, new Producto("Teclado", 1200));
        servicio.agregar(3, new Producto("Monitor", 8000));

        // Listamos
        servicio.listar();

        // Buscamos
        System.out.println("Buscado: " + servicio.buscar(2));

        // Modificamos
        servicio.modificar(2, new Producto("Teclado mecanico", 2500));

        // Eliminamos
        servicio.eliminar(1);

        System.out.println("Lista final:");
        servicio.listar();
    }
}


// Clase Producto
class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Permite mostrar los datos del producto
    @Override
    public String toString() {
        return "Producto{nombre='" + nombre + "', precio=" + precio + "}";
    }
}


// Interfaz CRUD
interface ProductoCRUD {

    void agregar(int clave, Producto producto);

    Producto buscar(int clave);

    void modificar(int clave, Producto producto);

    void eliminar(int clave);

    void listar();
}


// Clase que implementa CRUD
class ProductoService implements ProductoCRUD {

    // Integer = clave
    // Producto = valor
    private HashMap<Integer, Producto> productos = new HashMap<>();

    @Override
    public void agregar(int clave, Producto producto) {

        // put agrega el producto
        productos.put(clave, producto);
    }

    @Override
    public Producto buscar(int clave) {

        // get busca mediante la clave
        return productos.get(clave);
    }

    @Override
    public void modificar(int clave, Producto producto) {

        // put también reemplaza si la clave ya existe
        productos.put(clave, producto);
    }

    @Override
    public void eliminar(int clave) {

        // remove elimina mediante la clave
        productos.remove(clave);
    }

    @Override
    public void listar() {

        // Recorremos clave y producto al mismo tiempo
        for (Map.Entry<Integer, Producto> entrada : productos.entrySet()) {

            System.out.println(
                    "Clave: " + entrada.getKey()
                            + " Clave Producto: " + entrada.getValue()
            );
        }
    }
}
