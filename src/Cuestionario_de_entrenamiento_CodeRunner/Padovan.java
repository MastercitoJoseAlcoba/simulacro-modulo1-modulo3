package Cuestionario_de_entrenamiento_CodeRunner;

import java.util.Arrays;

public class Padovan {
    public static void main(String[] args) {

        int n = 10;

        int[] resultado = padovan(n);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] padovan(int n) {

        // Si n es 0 o negativo,
        // devolvemos un arreglo vacío
        if (n <= 0) {
            return new int[0];
        }

        // Creamos el arreglo con n posiciones
        int[] resultado = new int[n];

        // Primer término
        resultado[0] = 1;

        // Segundo término
        if (n > 1) {
            resultado[1] = 1;
        }

        // Tercer término
        if (n > 2) {
            resultado[2] = 1;
        }

        // Empezamos en 3 porque
        // los primeros tres ya están cargados
        for (int i = 3; i < n; i++) {

            // Fórmula de Padovan:
            // P(i) = P(i - 2) + P(i - 3)
            resultado[i] = resultado[i - 2] + resultado[i - 3];
        }

        return resultado;
    }
}
