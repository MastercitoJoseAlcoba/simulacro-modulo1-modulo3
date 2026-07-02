package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.HashSet;

public class Ej_18 {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>(); // No permite duplicados
        numeros.add(10);
        numeros.add(15);
        numeros.add(2);
        numeros.add(1);
        numeros.add(10);
        numeros.add(2);
        System.out.println(numeros);

    }
}
