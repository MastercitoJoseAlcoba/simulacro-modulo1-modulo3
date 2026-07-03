package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta19;

public class Eje19 {
    public static void main(String[] args) {
        int numeros[] = {
                1, 3, 4, 5, 1, 2, 3, 5, 1, 4,
                2, 4, 1, 6, 2, 3, 1, 2, 5, 5,
                1, 4, 1, 2, 1
        };

        int contador = contar(numeros);

        System.out.println(contador);
    }

    private static int contar(int[] numeros) {

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == 1) {
                contador++;
            }
        }

        return contador;
    }
}
