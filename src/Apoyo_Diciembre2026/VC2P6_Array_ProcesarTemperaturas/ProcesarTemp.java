package Apoyo_Diciembre2026.VC2P6_Array_ProcesarTemperaturas;

import java.util.Arrays;

public class ProcesarTemp {

    public static void main(String[] args) {

        // Array original en grados Celsius
        int[] temperaturas = {30, 25, 20, 15, 10};

        // Llamamos al método y guardamos el resultado
        int[] resultado = procesarTemperaturas(temperaturas);

        // Imprimimos el array convertido e invertido
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] procesarTemperaturas(int[] temperaturas) {

        // Creamos el array resultado
        int[] resultado = new int[temperaturas.length];

        // Controlamos la posición del array resultado
        int posicion = 0;

        // Recorremos el array original desde el final
        for (int i = temperaturas.length - 1; i >= 0; i--) {

            // Obtenemos la temperatura en Celsius
            int celsius = temperaturas[i];

            // Aplicamos la fórmula de conversión
            int fahrenheit = celsius * 9 / 5 + 32;

            // Guardamos la temperatura convertida
            resultado[posicion] = fahrenheit;

            // Avanzamos en el array resultado
            posicion++;
        }

        // Retornamos el array completo
        return resultado;
    }
}