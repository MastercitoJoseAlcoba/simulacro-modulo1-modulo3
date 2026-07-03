package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta06;

import java.util.Arrays;

public class EjeBienHecho {
    public static void main(String[] args) {

        int numeros[] = {14, 12, 1, 20, 3};

        // Primero ordenamos el array
        Arrays.sort(numeros);

        int numeroBuscar = 3;

        // Ahora sí usamos binarySearch
        int indice = Arrays.binarySearch(numeros, numeroBuscar);

        System.out.println(Arrays.toString(numeros));
        System.out.println(indice);
    }
}