package PruebaDZA.Modulo3.ClassSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> colores = new HashSet<>(); // Lista aleatoria
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Blanco");
        colores.add("Azul"); // Color repetido no se imprime
        colores.add("Negro"); // Color repetido no se imprime

        System.out.println(colores);

        // Recorrido con foreach
        for (String color : colores) {
            System.out.println(color);
        }

        // Recorriendo con for tradicional
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.toArray()[i]);
        }

        // Recorrido con iterador
        java.util.Iterator<String> str = colores.iterator();
        while (str.hasNext()) {
            System.out.println(str.next());
        }
    }
}
