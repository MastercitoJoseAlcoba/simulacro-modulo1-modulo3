package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class BusquedaBinariaNormal {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = 6;

        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int mitad = (izquierda + derecha) / 2;

            // Primer if dentro del while
            if (array[mitad] == valor) {
                System.out.println("Valor encontrado en la posición: " + (mitad + 1));
                return;
            }
            if (valor > array[mitad]) {
                izquierda = mitad + 1;
            } else {
                derecha = mitad - 1;
            }
        }
        System.out.println("Valor no encontrado");

    }

}

