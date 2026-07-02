package CursoCompletoFEIP2026.Pre_EvaluacionCodeRunnerPractico;

public class PromedioPares {

    public static double calcularPromedioPares(int[] array) {
        int suma = 0;
        int contadorPares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                suma += array[i];
                contadorPares++;
            }
        }

        if (contadorPares == 0) {
            return 0;
        }

        return (double) suma / contadorPares;
    }
}