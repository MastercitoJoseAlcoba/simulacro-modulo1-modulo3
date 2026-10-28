package PruebaDZA.Modulo3.LinkedList;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        // Lista de colores
        LinkedList<String> lista = new LinkedList<>(); // No lleva datos primitivos
        lista.add("Rojo");
        lista.add("Amarillo");
        lista.add("Blanco");
        lista.add("Negro");

        // Mostrar el tamaño
        System.out.println(lista.size());

        // Mostrar el primer elemento
        System.out.println(lista.getFirst());

        // Mostrar el último elemento
        System.out.println(lista.getLast());

        // Mostrar el elemento en la posición 2
        System.out.println(lista.get(2));

        // Remover el elemento en la posición 2
        lista.remove(2);

        // Set el elemento en la posición 2
        lista.set(2, "Azul");

        // 1. Mostrar los elementos de la lista (forEach)
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // 2. Mostrar los elementos de la lista (forTradicional)
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // 3. Mostrar los elementos de la lista (Iterator)
        Iterator<String> str = lista.iterator();
        while (str.hasNext()) { // hasNext: Si ay un elemento siguiente para mostrar
            System.out.println(str.next());
        }

        // 4. Utilizar split en la lista
        // (" "), que permite dividir un String utilizando un separador.

        ArrayList<String> lista2 = new ArrayList<>(
                Arrays.asList("Pato Caballo Perro Vaca Conejo".split(" "))
        );

        System.out.println(lista2);

    }

}

