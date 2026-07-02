package Padovan_Y_Fibonacci.Fibonacci;

import java.util.ArrayList;

public class fibonacci1 {
    public static void main(String[] args) {
        // Fibonacci es una sucesión donde cada número se obtiene sumando los dos anteriores.
        ArrayList<Integer> fibonacci = new ArrayList<>();

        int n = 8;
        int resultado = fibonacci(n);
        System.out.println(resultado);

    }
    public static int fibonacci(int n) {

        // Caso base: si n es 0 o 1, devuelve n.
        if (n <= 1) {
            return n;
        }

        if (n == 1) {
            return 1;
        }

        // Variables iniciales
        int anterior2 = 0;
        int anterior1 = 1;
        int resultado = 0;

        // Recorremos desde el índice 2 hasta n-1.
        for (int i = 2; i <= n; i++) {

            // Sumamos los dos anteriores y guardamos el resultado en una variable.
            resultado = anterior1 + anterior2;

            // Actualizamos los valores de los anteriores.
            anterior2 = anterior1;
            anterior1 = resultado;
        }

        return resultado;
    }
}
