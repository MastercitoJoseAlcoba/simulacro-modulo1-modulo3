package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Ej_15 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(55);                  // [55]
        numeros.add(32);                  // [55, 32]
        numeros.add(1, 25); // [55, 25, 32] , No remueve agrega a la lista
        numeros.set(0, 10);               // [10, 25, 32]

        int i = 0;
        while (i < numeros.size()) {
            System.out.println(numeros.get(i));
            i++;
        }
    }
}
