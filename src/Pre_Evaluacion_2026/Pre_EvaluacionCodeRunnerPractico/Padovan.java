package Pre_Evaluacion_2026.Pre_EvaluacionCodeRunnerPractico;

public class Padovan {

    public int[] padovan(int n) {

        if (n <= 0) {
            return new int[0];
        }

        int[] resultado = new int[n];

        resultado[0] = 1;

        if (n >= 2) {
            resultado[1] = 1;
        }

        if (n >= 3) {
            resultado[2] = 1;
        }

        for (int i = 3; i < n; i++) {
            resultado[i] = resultado[i - 2] + resultado[i - 3];
        }

        return resultado;
    }
}