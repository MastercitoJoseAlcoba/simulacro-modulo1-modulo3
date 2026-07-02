package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

import java.util.Arrays;

public class metodoFill {
    public static void main(String[] args) {
        String [] nombres = new String[4];
        Arrays.fill(nombres, "Juan");
        System.out.println("Array lleno de Inés: " + Arrays.toString(nombres)); // Imprime: [Juan, Juan, Juan, Juan]
    }
}
