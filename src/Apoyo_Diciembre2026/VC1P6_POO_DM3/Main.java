package Apoyo_Diciembre2026.VC1P6_POO_DM3;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George Orwell");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Número de páginas: " + libro1.getNumeroPaginas());

        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Número de páginas: " + libro2.getNumeroPaginas());

        Libro libro3 = new Libro();
        System.out.println("Título: " + libro3.getTitulo());
        System.out.println("Autor: " + libro3.getAutor());
        System.out.println("Número de páginas: " + libro3.getNumeroPaginas());

        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        System.out.println();
        libro3.mostrarInformacion();
    }
}
