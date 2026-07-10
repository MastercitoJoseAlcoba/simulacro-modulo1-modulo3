package FIP_PRE_05_JMAC_2026_Guille.Pregunta16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PruebaLista {
    public static void main(String[] args) {
        List<String> nombres = new LinkedList<>();
        nombres.add("Gonzalo");
        nombres.add("Ariel");
        nombres.set(0, "Blanca");
        nombres.add("Hector");
        nombres.add("Pablo");
        nombres.add("Daniel");
        nombres.remove(2);
        nombres.set(2, "Juan");
        Collections.sort(nombres);
        Collections.reverse(nombres);
        nombres.add("Ernesto");
        nombres.add(3, "Nair");
        System.out.println(nombres);

        // Respuesta correcta: [Juan, Daniel, Blanca, Nair, Ariel, Ernesto];
    }
}

/**
 * Explicación:
 *
 * La lista se modifica paso a paso por índice y luego se ordena.
 *
 * 1. set (0, "Blanca") reemplaza Gonzalo por Blanca.
 * 2. remove(2) elimina Hector y set(2, "Juan") reemplaza Pablo por Juan.
 * 3. sort ordena alfabéticamente: [Ariel, Blanca, Daniel, Juan].
 * 4. reverse invierte el orden: [Juan, Daniel, Blanca, Ariel].
 * 5. Luego se agrega Ernesto al final y Nair en la posición 3.
 *
 */
