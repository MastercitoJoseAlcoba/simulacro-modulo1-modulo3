package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;

public class Ej_17 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10); // 0
        lista.add(20); // 1
        lista.add(30); // 2

        // ¿Que sale por consola?
        System.out.println(lista.lastIndexOf(30));

    }
}
