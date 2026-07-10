package FIP_PRE_05_JMAC_2026_Guille.Pregunta02;

public class Main {
    public static void main(String[] args) {
        // Película usando el constructor vacío
        Pelicula p1 = new Pelicula();

        // Película usando constructor con título y género
        Pelicula p2 = new Pelicula("Avatar", "Ciencia ficción");

        // Película usando constructor con título, género y duración
        Pelicula p3 = new Pelicula("Titanic", "Drama", 195);

        // Película con datos inválidos para probar validaciones
        Pelicula p4 = new Pelicula("", null, -50);

        System.out.println("=== PELÍCULA 1 ===");
        p1.mostrar();
        System.out.println("¿Es larga? " + p1.esLarga());

        System.out.println();

        System.out.println("=== PELÍCULA 2 ===");
        p2.mostrar();
        System.out.println("¿Es larga? " + p2.esLarga());

        System.out.println();

        System.out.println("=== PELÍCULA 3 ===");
        p3.mostrar();
        System.out.println("¿Es larga? " + p3.esLarga());

        System.out.println();

        System.out.println("=== PELÍCULA 4 ===");
        p4.mostrar();
        System.out.println("¿Es larga? " + p4.esLarga());
    }
}
