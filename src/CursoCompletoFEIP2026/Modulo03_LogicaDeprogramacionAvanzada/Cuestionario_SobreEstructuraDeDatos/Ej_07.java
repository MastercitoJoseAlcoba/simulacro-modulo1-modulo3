package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;
import java.util.Queue;

public class Ej_07 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer("A");
        cola.offer("B");
        cola.offer("C");
        cola.offer("D");
        cola.offer("E");

        // Imprimir la cola
        System.out.println("Elementos de la cola: " + cola);

        // Sacar elementos de la cola
        System.out.println("Elemento : " + cola.poll());
        System.out.println("Elemento : " + cola.poll());

        // Frente de la cola
        System.out.println("Frente de la cola: " + cola.peek());

        // Elementos al final de la cola
        System.out.println("Elementos al final: " + cola);
    }
}
/**
 * ¿Qué se imprime al final del contenido de la variable cola?
 *
 * c. [C, D, E]
 *
 */
