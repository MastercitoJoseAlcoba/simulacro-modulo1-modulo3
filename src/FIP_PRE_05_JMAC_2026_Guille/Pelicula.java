package FIP_PRE_05_JMAC_2026_Guille;

public class Pelicula {

    private String titulo;
    private String genero;
    private int duracion;

    public Pelicula() {
        this.titulo = "Película sin título";
        this.genero = "Género sin definir";
        this.duracion = 0;
    }

    public Pelicula(String titulo, String genero) {
        setTitulo(titulo);
        setGenero(genero);
        this.duracion = 0;
    }

    public Pelicula(String titulo, String genero, int duracion) {
        setTitulo(titulo);
        setGenero(genero);
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.isEmpty()) {
            this.genero = genero;
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion >= 0) {
            this.duracion = duracion;
        }
    }

    public boolean esLarga() {
        return duracion >= 120;
    }

    public void mostrar() {
        System.out.println("Película: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
    }
}