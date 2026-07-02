package Espacio_De_Practicas.CodeRunner02.Pregunta12;

public class Main {
    public static int[] fiboCuadrado(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] resultado = new int[n];

        resultado[0] = 0;

        if (n == 1) {
            return resultado;
        }

        resultado[1] = 1;

        for (int i = 2; i < n; i++) {
            resultado[i] = resultado[i - 1] * resultado[i - 1]
                    + resultado[i - 2] * resultado[i - 2];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] caso = fiboCuadrado(8);
        System.out.println(java.util.Arrays.toString(caso));
    }


}
