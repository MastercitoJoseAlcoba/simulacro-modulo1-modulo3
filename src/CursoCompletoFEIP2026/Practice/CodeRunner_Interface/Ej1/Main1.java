package CursoCompletoFEIP2026.Practice.CodeRunner_Interface.Ej1;

public class Main1 {
    public static void main(String[] args) {
        Reproducible cancion = new Cancion("Canción A");
        Reproducible podcast = new Podcast("Episodio 1");

        cancion.reproducir();
        podcast.reproducir();

        Reproducible cancionB = new Cancion("Canción B");

        cancionB.reproducir();
    }
}

interface Reproducible {
    void reproducir();
}

class Cancion implements Reproducible {
    private String titulo;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la canción: " + titulo);
    }
}

class Podcast implements Reproducible {
    private String titulo;

    public Podcast(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el episodio de podcast: " + titulo);
    }
}