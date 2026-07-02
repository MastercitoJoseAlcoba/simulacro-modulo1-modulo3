package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int [] numeros = {10, 20, 30, 40, 50};
        // sino ordeno el array antes de la búsqueda no lo encuentra
        Arrays.sort(numeros);
        int buscar = 40;
        int indice = Arrays.binarySearch(numeros, buscar);
        if (indice >= 0) {
            System.out.println("Elemento " + buscar + " encontrado en el índice " + indice);
        } else {
            System.out.println("Elemento " + buscar + " no encontrado en el array.");
        }
    }
}
