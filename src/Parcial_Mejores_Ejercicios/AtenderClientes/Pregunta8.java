package Parcial_Mejores_Ejercicios.AtenderClientes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pregunta8 {
    public static class Solucion {

        public static List<String> atenderClientes(Queue<String> cola, int cantidad) {

            List<String> atendidos = new ArrayList<String>();

            int contador = 0;

            while (!cola.isEmpty() && contador < cantidad) { // Mientras la cola no esté vacía y todavía no llegué a la cantidad máxima, sigo atendiendo clientes.
                String cliente = cola.poll(); // saca el primer cliente de la cola. En una Queue, poll() atiende al primero que llegó. Es la fila del súper.
                atendidos.add(cliente);
                contador++;
            }

            return atendidos;
        }
    }

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("Ana");
        cola.add("Luis");
        cola.add("Marta");
        cola.add("Juan");

        System.out.println(Solucion.atenderClientes(cola, 2));
    }
}
