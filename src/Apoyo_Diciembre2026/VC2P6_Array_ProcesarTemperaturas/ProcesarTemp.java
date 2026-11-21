package Apoyo_Diciembre2026.VC2P6_Array_ProcesarTemperaturas;

import java.util.Arrays;

public class ProcesarTemp {

    public static void main(String[] args) {
        int[] temperaturas = {30, 25, 20, 15, 10};
        int[] resultado = procesarTemperaturas(temperaturas);

        System.out.println("Celsius: " + Arrays.toString(temperaturas)
                + "\nFahrenheit: " + Arrays.toString(resultado));
    }

    public static int[] procesarTemperaturas(int[] temperaturas) {
        int[] resultado = new int[temperaturas.length];
        int posicion = 0;

        // Leemos el original desde el último elemento hasta el primero.
        for (int i = temperaturas.length - 1; i >= 0; i--) {
            int celsius = temperaturas[i];
            int fahrenheit = celsius * 9 / 5 + 32;

            // Guardamos el valor convertido desde la posición 0.
            resultado[posicion] = fahrenheit;
            posicion++;
        }

        return resultado;
    }
}