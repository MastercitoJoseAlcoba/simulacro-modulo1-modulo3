package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

import java.util.Arrays;

public class metodoSort {
    public static void main(String[] args) {
        int [] numeros = {10, 20, -30, 40, 50};
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros)); // Array ordenado: [-30, 10, 20, 40, 50]
    }
}
