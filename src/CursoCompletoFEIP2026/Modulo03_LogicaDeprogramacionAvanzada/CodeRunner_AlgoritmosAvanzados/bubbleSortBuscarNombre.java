package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class bubbleSortBuscarNombre {
    public static void main(String[] args) {
        String [] array = {"Juan", "Maria", "Pedro", "Ana", "Carlos"};
        String nombreBuscado = "Jose";

        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha){
            int mitad = (izquierda + derecha) / 2;

            int comparacion = array[mitad].compareTo(nombreBuscado);

            if (comparacion == 0){
                System.out.println("Nombre encontrado en la posición: " + mitad);
                return;
            } else if (comparacion < 0){
                izquierda = mitad + 1;
            } else {
                derecha = mitad - 1;
            }
        }
        System.out.println("Nombre no encontrado");
    }
}

