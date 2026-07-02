package Padovan_Y_Fibonacci.Padovan;

public class padovan {
    public static void main(String[] args) {
        int[] resultado = padovan(10);
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }
    // Si n es 0 o negativo, devuelvo array vacío.
    public static int[] padovan(int n) {
        // Si n es 0 o negativo, devuelvo array vacío.
        if (n <= 0) {
            return new int[0];
        }

        // Creo el array con n posiciones.
        int[] resultado = new int[n];

        // Inicializo el primer elemento del array.
        if (n >= 1) {
            resultado[0] = 1;
        }

        // Inicializo el segundo elemento del array.
        if (n >= 2) {
            resultado[1] = 1;
        }

        // Inicializo el tercer elemento del array.
        if (n >= 3) {
            resultado[2] = 1;
        }

        // Recorro el array desde el tercer elemento hasta el n-1.
        for (int i = 3; i < n; i++) {
            // Formula:
            // P (i) = P (i - 2) + P (i - 3)
            resultado[i] = resultado[i - 2] + resultado[i - 3];
        }

        // Devuelvo el array.
        return resultado;
    }

}
