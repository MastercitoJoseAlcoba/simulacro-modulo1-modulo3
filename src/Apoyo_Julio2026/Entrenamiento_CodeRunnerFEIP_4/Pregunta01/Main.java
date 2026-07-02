package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_4.Pregunta01;

public class Main {
    public static void analizarLongitudes(String texto) {
        if (texto == null || texto.isEmpty()) {
            return;
        }
        // La parte importante:
        // Se usa así porque el enunciado dice sin import. Entonces hay que escribir el nombre completo: java.util.TreeMap.
        // TreeMap además ordena las claves automáticamente, por eso las longitudes salen de menor a mayor.
        java.util.Map<Integer, Integer> conteo = new java.util.TreeMap<Integer, Integer>();

        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            if (!palabra.isEmpty()) {
                int longitud = palabra.length();

                if (conteo.containsKey(longitud)) {
                    conteo.put(longitud, conteo.get(longitud) + 1);
                } else {
                    conteo.put(longitud, 1);
                }
            }
        }

        for (Integer longitud : conteo.keySet()) {
            System.out.println(longitud + " -> " + conteo.get(longitud));
        }
    }

    public static void main(String[] args) {
        analizarLongitudes("sol luna cielo sol");
        analizarLongitudes("java es genial");
        analizarLongitudes("a aa aaa");

    }

}
