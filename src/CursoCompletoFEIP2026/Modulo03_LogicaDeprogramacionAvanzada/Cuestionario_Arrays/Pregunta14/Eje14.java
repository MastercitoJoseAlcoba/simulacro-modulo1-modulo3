package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta14;

import java.util.Arrays;

public class Eje14 {
    public static void main(String[] args) {
        int numeros[] = {25, 12, 14, -2, 37, 16};

        multiplicar(numeros, 2);
    }

    private static void multiplicar(int[] num, int valor) {

        for (int i = 0; i < num.length; i++) {
            num[i] *= valor;
        }

        System.out.println(Arrays.toString(num));
    }
}
