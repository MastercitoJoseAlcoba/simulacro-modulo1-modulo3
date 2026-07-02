package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada;

import java.util.Iterator;
import java.util.LinkedList;

public class IterandoCollectionConFor {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Agregar elementos a la lista
        lista.add("Hola");
        lista.add("chau");
        lista.add("otro texto");

        // Devuelve la colección donde estamos parados, situado en el primer elemento de la colección.
        Iterator<String>it = lista.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        // Por ejemplo
        // Iterar sobre la lista
        for (String elemento: lista) {
            System.out.println(elemento);
        }

        // Otra forma
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
}