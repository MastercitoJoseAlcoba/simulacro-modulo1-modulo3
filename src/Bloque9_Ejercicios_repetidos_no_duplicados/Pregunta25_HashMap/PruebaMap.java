package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta25_HashMap;

import java.util.HashMap;
import java.util.Map;

public class PruebaMap {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        // Agregamos tres claves.
        stock.put("Lapiz", 10);
        stock.put("Cuaderno", 5);
        stock.put("Goma", 8);

        // Actualizamos Lapiz.
        //
        // stock.get("Lapiz") devuelve 10.
        // 10 + 5 = 15.
        stock.put("Lapiz", stock.get("Lapiz") + 5);

        // Eliminamos Cuaderno.
        stock.remove("Cuaderno");

        // Agregamos Regla.
        stock.put("Regla", 7);

        // Actualizamos Goma.
        //
        // 8 - 3 = 5.
        stock.put("Goma", stock.get("Goma") - 3);

        System.out.println(stock);
    }
}

/*
ESTADO FINAL:

Lapiz = 15
Goma = 5
Regla = 7

Cuaderno ya no está.

IDEA CLAVE:

put(clave, valor):
agrega o reemplaza.

get(clave):
obtiene el valor.

remove(clave):
elimina la clave.
*/