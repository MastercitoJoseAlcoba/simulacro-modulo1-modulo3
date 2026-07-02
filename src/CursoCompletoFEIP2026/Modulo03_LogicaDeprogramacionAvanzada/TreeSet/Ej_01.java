package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.TreeSet;

import java.util.TreeSet;

public class Ej_01 {
    public static void main(String[] args) {
        TreeSet<String> nombres = new TreeSet<>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Jose");

        // Imprime lista ordenada
        System.out.println(nombres);

        // Opciones de uso de TreeSet
        System.out.println(nombres.size());
        System.out.println(nombres.first());
        System.out.println(nombres.last());
        System.out.println(nombres.contains("Juan"));
        System.out.println(nombres.contains("Jose"));

    }
}
