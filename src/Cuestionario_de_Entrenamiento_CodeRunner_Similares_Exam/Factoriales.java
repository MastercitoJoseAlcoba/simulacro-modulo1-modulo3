package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

import java.util.Arrays;

public class Factoriales {

    public static void main(String[] args) {

        int[] resultado = factoriales(5);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] factoriales(int n) {

        // Si n es negativo, devolvemos un arreglo vacío
        if (n < 0) {
            return new int[0];
        }

        // Creamos un arreglo desde 0! hasta n!
        int[] resultado = new int[n + 1];

        // Por definición, 0! = 1
        resultado[0] = 1;

        // Calculamos cada factorial usando el anterior
        for (int i = 1; i < resultado.length; i++) {
            resultado[i] = resultado[i - 1] * i;
        }

        return resultado;
    }
}
