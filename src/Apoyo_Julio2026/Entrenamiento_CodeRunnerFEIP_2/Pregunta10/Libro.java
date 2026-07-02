package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_2.Pregunta10;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor con título y autor
    // La clave está en el constructor: Libro libro1 = new Libro("1984", "George Orwell");
    // Como no pasan número de páginas, debe quedar en 0. CodeRunner ahí está revisando si el constructor incompleto inicializa bien lo que falta.

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
    }

    // Constructor con título, autor y número de páginas
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