package Espacio_De_Practicas.CodeRunner02.Pregunta06;

public class OpcionA {
    public static int encontrarUltimoImpar(int[] numeros) {
        int ultimoImpar = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                ultimoImpar = numeros[i];
            }
        }

        return ultimoImpar;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 9, 10};
        System.out.println(encontrarUltimoImpar(array1));

    }
}
