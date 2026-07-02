package Apoyo_Julio2026.Ejercicios_de_Entrenamiento_Varios.Pregunta04;

import Apoyo_Julio2026.Ejercicios_de_Entrenamiento_Varios.Pregunta09.Pregunta9;

public class Pregunta4 {
    public static int[] invertirArray(int[] numeros) {

        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {

            int valor = numeros[numeros.length - 1 - i]; // La clave está en esta línea.
                                                         // Recorre el array desde atrás hacia adelante.

            if (valor % 4 == 0) {
                resultado[i] = valor * 2;
            } else {
                resultado[i] = valor;
            }

        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 4};

        System.out.println(java.util.Arrays.toString(Pregunta9.Solucion.ordenarBurbuja(numeros)));                                                                  // 2 4 3 16

    }
}
