package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta23 {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        Podcast podcast = new Podcast();

        cancion.reproducir();
        podcast.reproducir();
    }

    }
    interface Reproducible {
        void reproducir();
    }

    class Cancion implements Reproducible {

        @Override
        public void reproducir() {
            System.out.println("Reproduciendo una canción");
        }
    }

    class Podcast implements Reproducible {

        @Override
        public void reproducir() {
            System.out.println("Reproduciendo un podcast");
        }
    }

