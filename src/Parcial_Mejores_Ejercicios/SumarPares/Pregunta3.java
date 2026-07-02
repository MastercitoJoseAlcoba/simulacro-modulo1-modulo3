package Parcial_Mejores_Ejercicios.SumarPares;

public class Pregunta3 {
    public static int sumarPares(int[] numeros) {

        int suma = 0; // La lógica es:

        for (int i = 0; i < numeros.length; i++) { // Arrancas la suma en cero hasta el último.

            if (numeros[i] % 2 == 0) { // Preguntas si el número es par.
                suma += numeros[i];    // new int[]{2, 5, 8, 3, 10}
                                       // 2 + 8 + 10 = 20
            }

        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumarPares(new int[]{2, 5, 8, 3, 10}));
        System.out.println(sumarPares(new int[]{})); // El for no entra nunca y devuelve 0.
    }
}
