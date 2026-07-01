package Entrenamiento_CodeRunnerFEIP_4.Pregunta07;

public class Main {
    public static int[] procesarBaterias(int[] cargas) {
        int[] resultado = new int[cargas.length];

        for (int i = 0; i < cargas.length; i++) {
            int valor = cargas[cargas.length - 1 - i];

            if (valor % 2 == 0) {
                resultado[i] = valor * 4;
            } else {
                resultado[i] = valor;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] entrada = {2, 5, 8, 3};
        int[] resultado = procesarBaterias(entrada);
        for (int valor : resultado) {
            System.out.println(valor);
        }
    }
}
