package CursoCompletoFEIP2026.Pre_EvaluacionCodeRunnerPractico;

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
        return "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Cantidad de paginas: " + cantidadPaginas;
    }

    public boolean esLargo() {
        return cantidadPaginas >= 230;
    }
}