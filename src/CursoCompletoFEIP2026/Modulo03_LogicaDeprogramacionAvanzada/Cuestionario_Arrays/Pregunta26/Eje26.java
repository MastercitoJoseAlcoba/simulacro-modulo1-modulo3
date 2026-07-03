package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta26;

import java.util.Arrays;

public class Eje26 {
    public static void main(String[] args) {

        int[][] mapaTerreno = {
                {0, 0, 1, 1},
                {0, 1, 2, 2},
                {1, 2, 2, 1},
                {0, 1, 1, 0}
        };

        // Mostrar mapa original
        System.out.println("Mapa original:");
        mostrarMapa(mapaTerreno);

        // Marcar toda la tercera fila como agua
        // Tercera fila = índice 2
        // Agua = valor 2
        for (int columna = 0; columna < mapaTerreno[2].length; columna++) {
            mapaTerreno[2][columna] = 2; // Parte clave del ejercicio es esta.
        }

        // Mostrar mapa modificado
        System.out.println("Mapa modificado:");
        mostrarMapa(mapaTerreno);
    }

    public static void mostrarMapa(int[][] mapaTerreno) {

        for (int fila = 0; fila < mapaTerreno.length; fila++) {
            System.out.println(Arrays.toString(mapaTerreno[fila]));
        }

        System.out.println();
    }
}