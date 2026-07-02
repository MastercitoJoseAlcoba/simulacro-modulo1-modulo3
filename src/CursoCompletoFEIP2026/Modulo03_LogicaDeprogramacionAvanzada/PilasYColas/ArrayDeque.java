package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.PilasYColas;

public class ArrayDeque {
    public static void main(String[] args) {
        // Pilas: Se implementa porque es más completa y consistente
        java.util.ArrayDeque<Integer> pila = new java.util.ArrayDeque<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Elementos de la cola: " + pila);

        pila.forEach(System.out::println); // imprime todos los elementos de la cola

    }
}
