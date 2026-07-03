package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta06;

import java.util.Arrays;

public class Eje6 {
    public static void main(String[] args) {

        int numeros[] = {14, 12, 1, 20, 3}; //

        int numeroBuscar = 3;

        int indice = Arrays.binarySearch(numeros, numeroBuscar);

        System.out.println(indice);
    }
}