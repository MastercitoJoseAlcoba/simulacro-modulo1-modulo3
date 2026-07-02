package Espacio_De_Practicas.CodeRunner01.Pregunta05;

public class Main {
    public static int[] padovan(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1 || i == 2) {
                resultado[i] = 1;
            } else {
                resultado[i] = resultado[i - 2] + resultado[i - 3];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int n = 10; // Número de términos a generar
        int[] padovanSeries = padovan(n);

        // Imprimir los términos de la serie de Padovan
        for (int i = 0; i < padovanSeries.length; i++) {
            System.out.print(padovanSeries[i] + " ");
        }
        System.out.println();
    }
}
