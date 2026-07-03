package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta11;

public class Eje11 {
    public static void main(String[] args) {

        int numeros[] = {13, 1, -90, 0, 56, -12, 104, 235, 122};

        int minimo = minimoNumero(numeros);

        System.out.println(minimo);
    }

    private static int minimoNumero(int[] num) {

        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            min = (num[i] < min) ? num[i] : min;
        }

        return min;
    }
}