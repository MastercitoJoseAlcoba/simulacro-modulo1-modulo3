package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta21;

public class Eje21 {
    public static void main(String[] args) {
        int numeros[] = {13, 1, -90, 0, 56, -12, 104, 235, 122};

        int maximo = maximoNumero(numeros);

        System.out.println(maximo);
    }

    private static int maximoNumero(int[] num) {

        int max = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > max) {
                max = num[i];
            }
        }

        return max;
    }
}
