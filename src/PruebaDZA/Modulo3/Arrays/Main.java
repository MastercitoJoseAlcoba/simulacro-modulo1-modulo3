package PruebaDZA.Modulo3.Arrays;

import Apoyo_Septiembre2026.Sep_2026.EjerciciosArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3;
            System.out.println(Arrays.toString(numeros));
        }

        // Calcular el promedio
        double promedio = sumarArray(numeros);
        System.out.println("El promedio es: " + promedio);
    }

    // Método para calcular la suma de un array de números
    public static double sumarArray(int[] numeros) {
        double promedio = 0; // Variable acumuladora
        double suma = EjerciciosArrays.sumarElementos(numeros);
        promedio = suma / numeros.length;
        return promedio;
    }
}
