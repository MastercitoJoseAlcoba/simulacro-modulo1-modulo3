package Apoyo_Diciembre2026.VC1P4_POO_DM1;

public class Pelicula {

    // La letra pide tres atributos privados. La duración se guarda en minutos.
    private String titulo;
    private String genero;
    private int duracion;

    // Constructor 1. Sin parámetros, usa los tres valores por defecto.
    public Pelicula() {
        this.titulo = "Película sin título";
        this.genero = "Género sin definir";
        this.duracion = 0;
    }

    // Constructor 2. Recibe título y género. La duración queda en 0.
    public Pelicula(String titulo, String genero) {
        this(); // Carga los valores por defecto antes de llamar a los setters.
        setTitulo(titulo);
        setGenero(genero);
    }

    // Constructor 3. Recibe título, género y duración.
    public Pelicula(String titulo, String genero, int duracion) {
        this(titulo, genero); // Llama al constructor de dos parámetros.
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        // «Ni nulo ni vacío» significa que ambas condiciones deben cumplirse.
        // Si titulo es null, && evita que se ejecute isEmpty().
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo; // Guarda en el atributo el valor del parámetro.
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        // El género tiene la misma validación que el título.
        if (genero != null && !genero.isEmpty()) {
            this.genero = genero;
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        // «Mayor o igual a 0» se traduce como >= 0.
        if (duracion >= 0) {
            this.duracion = duracion;
        }
    }

    public boolean esLarga() {
        // «120 minutos o más» incluye exactamente 120.
        return duracion >= 120;
    }

    public void mostrar() {
        // Cada println imprime una de las tres líneas que pide la letra.
        System.out.println("Película: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
    }
}