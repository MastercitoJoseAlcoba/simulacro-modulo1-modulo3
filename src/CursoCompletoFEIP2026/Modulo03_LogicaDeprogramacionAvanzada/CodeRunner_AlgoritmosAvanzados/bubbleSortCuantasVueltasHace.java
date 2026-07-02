package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class bubbleSortCuantasVueltasHace {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(cuantasVeces(array));


    }
    public static int cuantasVeces(int[] array){
        int izquierda = 0;
        int derecha = array.length - 1;
        int vueltas = 0;
        int valor = 1;

        while (izquierda <= derecha) {
            vueltas++;
            int medio = (izquierda + derecha) / 2;

            if (array[medio] > valor) {
                return vueltas;
            } else if (array[medio] < valor) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return vueltas;
    }
}
