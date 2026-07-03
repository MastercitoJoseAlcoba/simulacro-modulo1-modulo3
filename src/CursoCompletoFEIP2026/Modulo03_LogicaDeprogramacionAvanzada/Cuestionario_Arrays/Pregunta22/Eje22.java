package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta22;

import java.util.Arrays;

public class Eje22 {
    public static void main(String[] args) {
        int numeros[] = {14, 12, 1, 20, 3};

        int numeroBuscar = 3;

        // Primero ordenamos el array
        Arrays.sort(numeros);

        // Ahora sí usamos binarySearch
        int indice = Arrays.binarySearch(numeros, numeroBuscar);

        System.out.println("El elemento buscado esta en el indice: " + indice + " y su valor es " + numeros[indice]);
    }
}
