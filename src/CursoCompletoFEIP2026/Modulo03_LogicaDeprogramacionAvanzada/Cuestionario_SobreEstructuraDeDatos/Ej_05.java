package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.HashMap;

public class Ej_05 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Juan");
        mapa.put(2, "Hector");
        mapa.put(3, "Alberto");
        mapa.put(1, "Ana"); // Reemplaza el valor de Juan por Ana
        System.out.println(mapa);
    }
}
/**
 * ¿Qué se imprime por la consola?
 *
 * d. {1=Ana, 2=Hector, 3=Alberto}
 *
 */
