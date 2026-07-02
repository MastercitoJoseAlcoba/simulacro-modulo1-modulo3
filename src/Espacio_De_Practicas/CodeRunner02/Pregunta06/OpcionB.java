package Espacio_De_Practicas.CodeRunner02.Pregunta06;

public class OpcionB {
    public static int encontrarUltimoImpar(int[] numeros) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (numeros[i] % 2 != 0) {
                return numeros[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array4 = {};
        System.out.println(encontrarUltimoImpar(array4));

    }
}
