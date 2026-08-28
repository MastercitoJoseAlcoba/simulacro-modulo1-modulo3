package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

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

    public Libro() {

        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
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

    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George Orwell");

        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Número de páginas: " + libro1.getNumeroPaginas());

        Libro libro2 = new Libro(
                "El Principito",
                "Antoine de Saint-Exupéry",
                96
        );

        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getAutor());
        System.out.println(libro2.getNumeroPaginas());
    }
}
