package Apoyo_Septiembre2026.coderunners_sep_2026;

public class Producto {

    // =========================================================
    // ATRIBUTOS
    // =========================================================
    // Los atributos son privados para aplicar encapsulamiento.
    // Esto significa que no pueden modificarse directamente
    // desde fuera de la clase, sino mediante los métodos set.

    private String nombre;
    private String categoria;
    private int stock;


    // =========================================================
    // CONSTRUCTOR 1: SIN PARÁMETROS
    // =========================================================
    // Este constructor se ejecuta cuando creamos un objeto así:
    //
    // Producto producto = new Producto();
    //
    // Como no recibimos ningún dato, inicializamos los atributos
    // con los valores por defecto indicados en la consigna.

    public Producto() {
        this.nombre = "Producto sin nombre";
        this.categoria = "Categoría sin definir";
        this.stock = 0;
    }


    // =========================================================
    // CONSTRUCTOR 2: NOMBRE Y CATEGORÍA
    // =========================================================
    // Este constructor recibe solamente nombre y categoría.
    //
    // Ejemplo:
    // Producto producto = new Producto("Mouse", "Informática");
    //
    // Primero utilizamos this() para llamar al constructor
    // sin parámetros. De esta manera el objeto ya queda
    // inicializado con los valores por defecto.
    //
    // Después usamos los métodos set para asignar nombre
    // y categoría. Esto nos permite reutilizar las validaciones
    // que ya existen en esos métodos.
    //
    // El stock permanece en 0 porque no se recibe como parámetro.

    public Producto(String nombre, String categoria) {
        this();

        setNombre(nombre);
        setCategoria(categoria);
    }


    // =========================================================
    // CONSTRUCTOR 3: NOMBRE, CATEGORÍA Y STOCK
    // =========================================================
    // Este constructor permite recibir los tres datos.
    //
    // Ejemplo:
    // Producto producto =
    //     new Producto("Mouse", "Informática", 15);
    //
    // Nuevamente llamamos primero al constructor sin parámetros
    // para garantizar valores iniciales válidos.
    //
    // Luego utilizamos los setters para cargar los nuevos valores
    // aplicando las validaciones correspondientes.

    public Producto(String nombre, String categoria, int stock) {
        this();

        setNombre(nombre);
        setCategoria(categoria);
        setStock(stock);
    }


    // =========================================================
    // MÉTODOS GET
    // =========================================================
    // Los getters permiten consultar el valor de los atributos
    // privados desde fuera de la clase.


    // Devuelve el nombre del producto.
    public String getNombre() {
        return nombre;
    }


    // Devuelve la categoría del producto.
    public String getCategoria() {
        return categoria;
    }


    // Devuelve el stock disponible.
    public int getStock() {
        return stock;
    }


    // =========================================================
    // MÉTODOS SET
    // =========================================================
    // Los setters permiten modificar los atributos.
    // Antes de hacerlo, validamos que el dato recibido sea válido.


    // Modifica el nombre solamente si:
    //
    // 1. nombre no es null.
    // 2. nombre no está vacío.
    //
    // trim() elimina los espacios al principio y al final.
    //
    // Por ejemplo:
    // ""
    // "     "
    //
    // son considerados nombres inválidos.

    public void setNombre(String nombre) {

        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }

    }


    // Funciona de forma similar a setNombre().
    // La categoría solamente se modifica si contiene
    // un valor válido.

    public void setCategoria(String categoria) {

        if (categoria != null && !categoria.trim().isEmpty()) {
            this.categoria = categoria;
        }

    }


    // El stock solamente puede modificarse cuando
    // el valor recibido es mayor o igual a cero.
    //
    // Por ejemplo:
    //
    // setStock(10);  // válido
    // setStock(0);   // válido
    // setStock(-5);  // inválido
    //
    // Si el valor es negativo, simplemente no se modifica
    // el atributo.

    public void setStock(int stock) {

        if (stock >= 0) {
            this.stock = stock;
        }

    }


    // =========================================================
    // MÉTODO MOSTRAR
    // =========================================================
    // Es un procedimiento porque utiliza void.
    //
    // Esto significa que el método NO devuelve ningún valor.
    // Su responsabilidad es simplemente mostrar la información
    // del producto utilizando System.out.println().
    //
    // Ejemplo de salida:
    //
    // Producto: Mouse
    // Categoría: Informática
    // Stock disponible: 15

    public void mostrar() {

        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Stock disponible: " + stock);

    }
}