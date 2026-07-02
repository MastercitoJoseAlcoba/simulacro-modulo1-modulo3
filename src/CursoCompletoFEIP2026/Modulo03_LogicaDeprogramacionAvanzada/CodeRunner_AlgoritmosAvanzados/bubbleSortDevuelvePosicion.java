package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class bubbleSortDevuelvePosicion {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = 6;
        System.out.println(buscar(array, valor));

    }
    public static int buscar(int[] array, int valor){
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int mitad = (izquierda + derecha) / 2;
            if (array[mitad] == valor) {
                return mitad;
            } else if (array[mitad] < valor) {
                izquierda = mitad + 1;
            } else {
                derecha = mitad - 1;
            }
        }
        return -1;
    }
}
