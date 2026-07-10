package FIP_PRE_05_JMAC_2026_Guille.Pregunta24;

import java.util.ArrayList;
import java.util.List;

public class EjemploListaFrutas {
    public static void main(String[] args) {
        // ArrayList, add, set y remove

        List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");

        frutas.add(1, "Durazno");
        frutas.set(3, "Naranja");

        frutas.add("Kiwi");
        frutas.add(2, "Uva");

        frutas.remove("Banana");
        frutas.remove("Banana");

        frutas.remove(0);
        frutas.remove(2);

        System.out.println(frutas);
    }
}