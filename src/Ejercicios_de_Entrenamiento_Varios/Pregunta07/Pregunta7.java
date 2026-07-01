package Ejercicios_de_Entrenamiento_Varios.Pregunta07;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Pregunta7 {
    public static class Solution {

        public static Map<String, Integer> contarFrecuencias(List<String> palabras) {

            Map<String, Integer> resultado = new LinkedHashMap<String, Integer>();

            for (int i = 0; i < palabras.size(); i++) {

                String palabra = palabras.get(i);

                if (resultado.containsKey(palabra)) {
                    resultado.put(palabra, resultado.get(palabra) + 1); // Si la palabra ya existe en el mapa, le sumás 1.
                                                                        // Si no existe, la agregás con valor 1.
                } else {
                    resultado.put(palabra, 1);
                }
            }

            return resultado;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.contarFrecuencias(java.util.Arrays.asList("java", "sql", "java", "python", "sql", "java")));

        System.out.println(Solution.contarFrecuencias(java.util.Arrays.asList("11", "11", "22", "33", "11", "22")));

        java.util.List<String> nombres = java.util.Arrays.asList("Ana", "Luis", "Ana", "Beto", "Beto", "Juan","Luis","Ana");
        System.out.println(Solution.contarFrecuencias(nombres));

        java.util.List<String> colores = java.util.Arrays.asList("rojo", "verde", "verde", "verde", "azul", "rojo","rojo","celeste");
        System.out.println(Solution.contarFrecuencias(colores));

        java.util.List<String> lenguajes = java.util.Arrays.asList("Java", "java", "JAVA", "java", "Java");
        System.out.println(Solution.contarFrecuencias(lenguajes));

    }
}
