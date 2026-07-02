package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.HashMap;

public class Ej_16 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Marcos");
        mapa.put(2, "Juan");
        mapa.put(3, "Pedro");
        mapa.put(4, "Ana");
        System.out.println(mapa);

        // Como puedo hacer para mostrar la clave y valor y que salga con este formato:
        // Clave: 1 valor: Marcos

        for (Integer key : mapa.keySet()) {
            System.out.println(key + " -> " + mapa.get(key));
        }
    }
}
