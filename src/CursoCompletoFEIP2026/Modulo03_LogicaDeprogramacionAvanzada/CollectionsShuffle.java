package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsShuffle {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Carlos");

        // Mezcla los elementos de la lista
        Collections.shuffle(nombres);
        System.out.println(nombres);

        // Imprime los elementos de la lista
        nombres.forEach(System.out::println);
    }
}
