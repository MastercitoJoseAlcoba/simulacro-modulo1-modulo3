package Entrenamiento_CodeRunnerFEIP_2.Pregunta13;

public class Pregunta13 {
    public int encontrarUltimoImpar(int[] numeros) {
        int ultimoImpar = -1; // Arranca en -1 por si no encuentra ningún impar.

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                ultimoImpar = numeros[i]; // Después recorre todo el array. Cada vez que encuentra un impar, guarda ese valor:
                                          // Como sigue recorriendo hasta el final, el valor que queda guardado es el último impar.
            }
        }

        return ultimoImpar;
    }

    public static void main(String[] args) {
        Pregunta13 p = new Pregunta13();
        System.out.println(p.encontrarUltimoImpar(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}