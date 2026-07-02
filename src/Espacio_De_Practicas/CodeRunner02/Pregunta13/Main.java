package Espacio_De_Practicas.CodeRunner02.Pregunta13;

public class Main {
    public static String normalizar(String texto) {
        texto = texto.trim();
        texto = texto.toLowerCase();

        texto = texto.replace("á", "a");
        texto = texto.replace("é", "e");
        texto = texto.replace("í", "i");
        texto = texto.replace("ó", "o");
        texto = texto.replace("ú", "u");

        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        texto = texto.replace(";", "");
        texto = texto.replace(":", "");
        texto = texto.replace("!", "");
        texto = texto.replace("?", "");
        texto = texto.replace("¿", "");
        texto = texto.replace("¡", "");

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
