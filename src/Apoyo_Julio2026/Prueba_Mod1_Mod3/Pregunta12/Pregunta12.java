package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta12;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pregunta12 {
    public static void main(String[] args) {
        String[] palabras = {
                "java", "python", "java", "kotlin",
                "java", "python", "html", "kotlin",
                "java"
        };

        Map<String, Integer> frecuencias = new LinkedHashMap<>(); // Mantiene el orden en que aparecen por primera vez
                                                                  // las claves: java -> python -> html -> kotlin.
        // Map: guarda clave -> valor. Aca la clave es la palabra y el valor es cuantas veces apareció.

        for (String palabra : palabras) {
            if (frecuencias.containsKey(palabra)) {
                frecuencias.put(palabra, frecuencias.get(palabra) + 1);
            } else {
                frecuencias.put(palabra, 1);
            }
        }

        System.out.println(frecuencias);
    }
}

/**
 * ¿Qué se imprime en consola al ejecutar este programa?
 * A. {java=4, python=2, kotlin=2, html=1}
 *
 */