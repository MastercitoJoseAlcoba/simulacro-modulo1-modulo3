package Apoyo_Septiembre2026.coderunners_sep_2026;

import java.util.ArrayList;
import java.util.List;

public class TodosLosEjercicios {

    //EXEPCIONES
    public static void prueba(String dato,int[] vector){
        try {
            System.out.println(vector[vector[1]]);
        }  catch (ArrayIndexOutOfBoundsException e){
            System.out.println("indice del array fuera de rango");
        }
        try {
            System.out.println(dato.length());
            System.out.println("Llegamos al final ok");
        } catch (NullPointerException e) {
            System.out.println("String null, no se puede saber su largo");
        }
    }

    //MANEJO STRINGS
    public List<String> filtrarPalabras(List<String> palabras) {
        List<String> resultado = new ArrayList<>();

        for (String palabra : palabras) {
            String minuscula = palabra.toLowerCase();

            if (minuscula.contains("a") && minuscula.contains("e")) {
                resultado.add(palabra);
            }
        }

        return resultado;
    }

    //ARRAYS
    public int[] procesarTemperaturas(int[] temperaturas) {

        int[] resultado = new int[temperaturas.length];

        for (int i = 0; i < temperaturas.length; i++) {

            int temperatura = temperaturas[temperaturas.length - 1 - i];

            resultado[i] = temperatura * 9 / 5 + 32;
        }

        return resultado;
    }

    //MATRICES
    public int[] calcularLluviaAcumulada(int[][] registros) {

        int[] acumulados = new int[registros[0].length];

        for (int j = 0; j < registros[0].length; j++) {

            int suma = 0;

            for (int i = 0; i < registros.length; i++) {
                suma += registros[i][j];
            }

            acumulados[j] = suma;
        }

        return acumulados;
    }
}
