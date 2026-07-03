package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta05;

import java.util.Arrays;

public class Eje5 {
    public static void main(String[] args) {

        int num1[] = {23, 12, 10};
        int num2[] = {40, 30, 20};

        int num3[] = new int[3];

        num3 = sumar(num1, num2);

        System.out.println(Arrays.toString(num3));
    }

    private static int[] sumar(int[] num1, int[] num2) {

        int num[] = new int[3];

        for (int k = 0; k < num1.length; k = k + 1) {
            num[k] = num1[k] + num2[k];

            /*
             * Porque el método suma posición por posición:
             * num[0] = num1[0] + num2[0]; // 23 + 40 = 63
             * num[1] = num1[1] + num2[1]; // 12 + 30 = 42
             * num[2] = num1[2] + num2[2]; // 10 + 20 = 30
             *
             * Entonces num3 queda:
             * [63, 42, 30]
             *
             * Clave del ejercicio: no suma todo junto, suma índice con índice.
             *
             */
        }

        return num; // [63, 42, 30]
    }
}