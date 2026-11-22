public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;
    private boolean estaDisponible;

    public Libro(String titulo, String autor, int anioPublicacion,
                 String isbn, boolean estaDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.estaDisponible = estaDisponible;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("ISBN: " + isbn);
        System.out.println("Esta Disponible: " + estaDisponible);
    }

    public void estaDisponible() {
        if (estaDisponible) {
            System.out.println("Está disponible.");
        } else {
            System.out.println("No está disponible.");
        }
    }
}
