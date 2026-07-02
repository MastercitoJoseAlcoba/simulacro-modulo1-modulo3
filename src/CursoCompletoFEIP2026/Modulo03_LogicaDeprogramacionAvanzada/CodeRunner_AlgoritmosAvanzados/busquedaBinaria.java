package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class busquedaBinaria {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = 6;
        System.out.println(buscar(array, valor));
    }
    public static int buscar(int[] arreglo, int valor) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int mitad = (izquierda + derecha) / 2;

            /** Comprobar si el valor está presente en el medio */
            if (arreglo[mitad] == valor) {
                return mitad;
            /** Si el valor es mayor, ignorar la mitad izquierda */
            } else if (arreglo[mitad] < valor) {
                izquierda = mitad + 1;
            /** Si el valor es menor, ignorar la mitad derecha */
            } else {
                derecha = mitad - 1;
            }
        }

        // Si el valor no se encuentra en el arreglo
        return -1;
    }
}
