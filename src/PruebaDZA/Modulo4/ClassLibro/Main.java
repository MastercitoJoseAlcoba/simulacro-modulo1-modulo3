package PruebaDZA.Modulo4.ClassLibro;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        Libro l2 = new Libro("Don Quijote2", "Miguel de Cervantes2", 1605);

        // Creando un Array
        Libro [] libros = {l1, l2};
        Libreria libreria = new Libreria(libros);
        try {
            libreria.prestarLibro(String.valueOf(l1));
        } catch (LibroNoDisponibleException | LibroNoExisteException e) {
            System.out.println(e.getMessage());
        }
    }
}
