package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.PilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        cola.offer(10); // Agregar elementos
        cola.offer(20);
        cola.offer(30);
        System.out.println("Elementos de la cola: " + cola);

        cola.poll(); // sacar elementos
        System.out.println("Elementos de la cola: " + cola);

        cola.isEmpty(); // verifica si la cola está vacía
        System.out.println("Elementos de la cola: " + cola);

        cola.forEach(System.out::println); // imprime todos los elementos de la cola



    }
}
