package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta19_Clase_Libro_completa;

public class Libro {

    private String titulo;
    private String autor;
    private int cantidadPaginas;

    public Libro(String titulo, String autor, int cantidadPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = 0;
    }

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.cantidadPaginas = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String mostrarInformacion() {

        // Devuelve los datos del libro como texto.
        return "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Cantidad de paginas: " + cantidadPaginas;
    }

    public boolean esLargo() {

        // Devuelve true si tiene más de 300 páginas.
        return cantidadPaginas > 300;
    }
}

/*
IDEA CLAVE:

Constructores:
permiten crear objetos de distintas formas.

Getters:
devuelven datos.

Setters:
modifican datos.

mostrarInformacion:
devuelve String.

esLargo:
devuelve boolean.
*/