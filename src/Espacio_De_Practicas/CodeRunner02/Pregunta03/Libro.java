package Espacio_De_Practicas.CodeRunner02.Pregunta03;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}