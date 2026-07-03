package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta30;

import java.util.Arrays;

public class Eje30 {
    public static void main(String[] args) {
        int num1[] = {23, 12, 10};
        int num2[] = {40, 30, 20};

        int num3[];

        num3 = sumar(num1, num2);

        System.out.println(Arrays.toString(num3));
    }

    private static int[] sumar(int[] num1, int[] num2) {

        int num[] = new int[3];

        for (int k = 0; k < num1.length; k = k + 1) {
            num[k] = num1[k] + num2[2];
        }

        return num;
    }
}

