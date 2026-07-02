package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.PilasYColas;

public class PriorityQueue {
    public static void main(String[] args) {
        // Prioridad:
        java.util.PriorityQueue<String> cola = new java.util.PriorityQueue<>();
        cola.add("A");
        cola.add("B");
        cola.add("C");
        System.out.println("Elementos de la cola: " + cola);

        cola.poll(); // sacar elementos
        System.out.println("Elementos de la cola: " + cola);

        cola.peek(); // ver el elemento en la cima de la cola
        System.out.println("Elemento en la cima de la cola: " + cola.peek());

        cola.forEach(System.out::println); // imprime todos los elementos de la cola
    }
}

