package Entrenamiento_CodeRunnerFEIP_2.Pregunta8;

public class Pregunta8 {
    public static String normalizar(String texto) {
        // Eliminar espacios al inicio y al final
        texto = texto.trim();

        /**
         * Trim: En Java, trim() se usa para eliminar los espacios en blanco al inicio y al final de un String.
         * Ejemplo básico:
         * String texto = " Hola Java   ";
         * texto = texto.trim(); // texto = "Hola Java"
         *
         * System.out.println(texto);
         */

        // Convertir todo a minúsculas
        texto = texto.toLowerCase(); // Baja letras

        /**
         * En Java para convertir texto a minúsculas se usa: toLowerCase()
         * Ejemplo básico:
         * String texto = "HOLA JAVA";
         * texto = texto.toLowerCase();
         *
         * System.out.println(texto);
         *
         *
         * En Java para convertir texto a mayúsculas se usa: toUpperCase()
         * Ejemplo básico:
         * String texto = "hola mundo";
         * texto = texto.toUpperCase();
         *
         * System.out.println(texto);
         *
         */

        // Reemplazar vocales con tilde
        texto = texto.replace("á", "a");
        texto = texto.replace("é", "e");
        texto = texto.replace("í", "i");
        texto = texto.replace("ó", "o");
        texto = texto.replace("ú", "u");

        // Eliminar caracteres especiales
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        texto = texto.replace(";", "");
        texto = texto.replace(":", "");
        texto = texto.replace("!", "");
        texto = texto.replace("?", "");
        texto = texto.replace("¿", "");
        texto = texto.replace("¡", "");

        /**
         * En Java, replace se usa para reemplazar texto o caracteres dentro de un String.
         *
         * Ejemplo básico:
         * String texto = "Hola mundo";
         * texto = texto.replace("mundo", "Java");
         *
         * System.out.println(texto);
         */

        return texto;
    }

    public static void main(String[] args) {
        System.out.println(normalizar("¡Hola, cómo estás? "));
        System.out.println(normalizar("Mañana será un gran día!"));
        System.out.println(normalizar("¿Dónde estás?"));
        System.out.println(normalizar("¡Java es GENIAL!"));
        System.out.println(normalizar("Él tenía razón; tú también."));
    }

}
