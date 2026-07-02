package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_4.Pregunta03;

public class Main {
    public static String procesarValores(int[] datos) {
        int[] nuevo = new int[datos.length];

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > 10) {
                nuevo[i] = datos[i] / 2;
            } else {
                nuevo[i] = datos[i] * 3;
            }
        }

        String resultado = "";

        for (int i = 0; i < nuevo.length; i++) {
            resultado += nuevo[i];

            if (i < nuevo.length - 1) {
                resultado += ","; // Está línea
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(procesarValores(new int[]{4, 12, 8}));
        System.out.println(procesarValores(new int[]{20, 2}));
        System.out.println(procesarValores(new int[]{10}));
        System.out.println(procesarValores(new int[]{30, 0}));
    }
}
