package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;

public class Ej_13 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(23);
        numeros.add(1);
        numeros.add(32);
        numeros.add(-4);
        numeros.add(35);

        System.out.println(numeros.isEmpty()); // Imprime: false

    }
}
