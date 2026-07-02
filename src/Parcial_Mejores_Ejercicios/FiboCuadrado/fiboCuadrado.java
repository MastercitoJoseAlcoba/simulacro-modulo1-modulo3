package Parcial_Mejores_Ejercicios.FiboCuadrado;

public class fiboCuadrado {
    public static int[] fiboCuadrado(int n) {
        // Si n es 0, retornamos un arreglo vacío
        if (n == 0) {
            return new int[] {};
        }

        // Si n es 1, solo retornamos [0]
        if (n == 1) {
            return new int[] {0};
        }

        // Crear un arreglo para almacenar la secuencia de Fibonacci cuadrada
        int[] resultado = new int[n];

        // Primeros dos elementos de la secuencia
        resultado[0] = 0;
        resultado[1] = 1;

        // Calcular los siguientes elementos de la secuencia
        for (int i = 2; i < n; i++) { // No va i <= n, porque el array tiene tamaño n, y sus índices van de: 0 hasta n - 1
            // La lógica clave es esta: resultado[i] = resultado[i - 1]^2 + resultado[i - 2]^2; En Java no usamos ^2, porque ^ no es potencia. Por eso se escribe así: resultado[i - 1] * resultado[i - 1]
            // Ejemplo con n = 6 (6 elementos, pero el último índice es 5)
            // índice: 0 1 2 3 4 5
            // valor:  0 1 1 2 5 29
            resultado[i] = (resultado[i - 1] * resultado[i - 1])
                         + (resultado[i - 2] * resultado[i - 2]);
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] caso = fiboCuadrado(6);
        System.out.println(java.util.Arrays.toString(caso));
        }
    }


