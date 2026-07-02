package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.PilasYColas;

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        // Apilando elementos (push)
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Elementos de la pila: " + pila);

        // Sacando elementos (pop)
        System.out.println("Elemento sacado de la pila: " + pila.pop());
        System.out.println("Elementos de la pila: " + pila);

        // Observando el elemento en la cima de la pila
        System.out.println("Elemento en la cima de la pila: " + pila.peek());

        // Verificando si la pila está vacía
        System.out.println("La pila está vacía: " + pila.isEmpty());

        //
        pila.forEach(System.out::println); // imprime todos los elementos de la pila

    }

}
