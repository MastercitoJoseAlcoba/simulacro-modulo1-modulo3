package Espacio_De_Practicas.CodeRunner02.Pregunta10;

public class Main {
    public static int[] duplicarInvertido(int[] numeros) {
        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[numeros.length - 1 - i] * 2;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] caso = {1, 2};
        System.out.println(java.util.Arrays.toString(duplicarInvertido(caso)));

    }
}
