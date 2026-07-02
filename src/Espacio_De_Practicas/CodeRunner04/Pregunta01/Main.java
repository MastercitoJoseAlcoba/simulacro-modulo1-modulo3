package Espacio_De_Practicas.CodeRunner04.Pregunta01;

public class Main {
    public static void analizarLongitudes(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return;
        }

        java.util.Map<Integer, Integer> longitudes = new java.util.TreeMap<Integer, Integer>();

        String[] palabras = texto.trim().split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            int largo = palabras[i].length();

            if (longitudes.containsKey(largo)) {
                longitudes.put(largo, longitudes.get(largo) + 1);
            } else {
                longitudes.put(largo, 1);
            }
        }

        for (Integer largo : longitudes.keySet()) {
            System.out.println(largo + " -> " + longitudes.get(largo));
        }
    }

    public static void main(String[] args) {

        analizarLongitudes("sol luna cielo sol");
        analizarLongitudes("java es genial");
        analizarLongitudes("a aa aaa");
    }
}
