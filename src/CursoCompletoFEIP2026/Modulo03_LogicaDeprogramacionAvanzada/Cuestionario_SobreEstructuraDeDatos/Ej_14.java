package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej_14 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Iterator
        Iterator<Integer> it = numeros.iterator();

        int num;

        while (it.hasNext()) {
            num = it.next();
            System.out.println(num);
        }
    }
}