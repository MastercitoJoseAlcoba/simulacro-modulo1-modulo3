package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_EstructurasDeDatos;

import java.util.LinkedList;

public class OperacionesLinkedList {
    private LinkedList<Integer> lista;

    public OperacionesLinkedList() {
        this.lista = new LinkedList<>();
    }

    /** Agregar elementos */
    public void agregarElemento(int elemento) {
        lista.add(elemento);
    }

    /** Eliminar un elemento */
    public void eliminarElemento(int elemento) {
        lista.remove(Integer.valueOf(elemento));
    }

    /** Mostrar la lista */
    public String mostrarLista() {
        return lista.toString();
    }

    public static void main(String[] args) {
        OperacionesLinkedList operaciones = new OperacionesLinkedList();

        operaciones.agregarElemento(1);
        operaciones.agregarElemento(2);
        operaciones.agregarElemento(3);
        operaciones.agregarElemento(1);
        operaciones.agregarElemento(2);
        operaciones.agregarElemento(7);

        System.out.println("Lista inicial: " + operaciones.mostrarLista());

        operaciones.eliminarElemento(2);

        System.out.println("Lista después de eliminar 2: " + operaciones.mostrarLista());

    }
}
