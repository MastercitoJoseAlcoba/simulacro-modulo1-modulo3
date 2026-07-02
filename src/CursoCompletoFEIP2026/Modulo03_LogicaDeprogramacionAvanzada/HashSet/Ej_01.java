package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.HashSet;

import java.util.HashSet;

public class Ej_01 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Carlos");

        System.out.println(nombres);
        System.out.println(nombres.size());
        System.out.println(nombres.contains("Juan"));

    }
}
