package Apoyo_Septiembre2026.coderunners_sep_2026;

public class ProcesarTemp {

    public static void main(String[] args) {
        // Lo que no pide el CodeRune
        int[] temperaturas = {30, 25, 20, 15, 10};

        ProcesarTemp procesador = new ProcesarTemp();
        int[] resultado = procesador.procesarTemperaturas(temperaturas);

        System.out.println("Temperaturas en grados Celsius:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }

        System.out.println("\nTemperaturas en grados Fahrenheit:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }

    public int[] procesarTemperaturas(int[] temperaturas) {
        // Lo que pide el CodeRunner (Logica del ejercicio)
        int[] resultado = new int[temperaturas.length];

        for (int i = 0; i < temperaturas.length; i++) {
            int temperatura = temperaturas[temperaturas.length - 1 - i];
            resultado[i] = temperatura * 9 / 5 + 32;
        }

        return resultado;
    }
}

