package Apoyo_Diciembre2026.Arrays_ArreglosOVectores;

public class Ej05_ProcesarTemperaturas {
    public static void main(String[] args) {
        /*
         * Ejercicio: 5
         *
         * Dificultad: intermedia
         *
         * Implementar un método que reciba un array de temperaturas y devuelva un nuevo array en orden inverso, cumpliendo las siguientes condiciones:
         * - Si la temperatura es mayor o igual a 25, multiplicarla por dos.
         * - Si la temperatura es menor a 25, mantener su valor original.
         *
         */

        int[] temperaturas1 = {30, 25, 20, 15, 10};
        int[] temperaturas2 = {10, 20, 30};
        int[] temperaturas3 = {25, 24};

        int[] temperaturasProcesadas1 = procesarTemperaturas(temperaturas1);
        int[] temperaturasProcesadas2 = procesarTemperaturas(temperaturas2);
        int[] temperaturasProcesadas3 = procesarTemperaturas(temperaturas3);

        System.out.println(java.util.Arrays.toString(temperaturasProcesadas1));
        System.out.println(java.util.Arrays.toString(temperaturasProcesadas2));
        System.out.println(java.util.Arrays.toString(temperaturasProcesadas3));

    }

    public static int[] procesarTemperaturas(int[] temperaturas){
        int[] temperaturasInversas = new int[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            int aux = temperaturas.length - 1 - i;
            if (temperaturas[i] >= 25) {
                temperaturasInversas[aux] = temperaturas[i] * 2;
            } else {
                temperaturasInversas[aux] = temperaturas[i];
            }
        }
        return temperaturasInversas;
    }

}
