package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Ej_09 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        lista.add(80);
        lista.add(90);
        lista.add(100);

        lista.add(10);
        System.out.println(lista); // Se agrega el mismo valor 10 en la última posición.
    }
}
