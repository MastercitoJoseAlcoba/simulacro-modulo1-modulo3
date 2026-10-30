package PruebaDZA.Modulo4.ClassLibro;

public class Libreria {
    private Libro[] libros;

    public Libreria(Libro[] libros) {
        this.libros = libros;
    }

    public void prestarLibro(String titulo) throws LibroNoExisteException, LibroNoDisponibleException {
        Libro prestamo = null;
        for (Libro l : libros) {
            if (l.getTitulo().equals(titulo)) {
                prestamo = l;
                break;
            }
        }
        if (prestamo == null) {
            throw new LibroNoExisteException("El libro " +titulo+ " no existe en la librería.");
        }

        if (prestamo.getCantidadDisponible() == 0){
            throw new LibroNoDisponibleException("El libro " +titulo+ " no está disponible.");
        }
        prestamo.prestarLibro();

    }


}
