package Entrenamiento_CodeRunnerFEIP_1.Pregunta5;

public class Main {
    /**
     * Completar la función validarLetras, se debe pasar como parámetro un String que contenga letras, estas letras deben
     * de ser las letras vocales, y el largo del String es válido si el largo es entre 3 y 6 letras. Se debe tomar como
     * letras vocales tanto las minúsculas como las mayúsculas.
     * Se deben cumplir ambas condiciones:
     *
     * La firma de la función es la siguiente:
     * public boolean validarVocal(String palabra)
     *
     *
     * Comentarios: Comienza diciendo completar la función validarLetras y despues vemos que la firma cambia a
     */

    public boolean validarVocal(String palabra) {
        // Si la palabra es null, no es válida
        if (palabra == null) {
            return false;
        }

        // El largo debe estar entre 3 y 6 inclusive
        if (palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        // Recorremos cada letra de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));

            // Si alguna letra NO es vocal, retorna false
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                return false;
            }
        }

        // Si pasó todas las condiciones, es válida
        return true;
    }

    public static void main(String[] args) {
        Main prueba = new Main();

        System.out.println(prueba.validarVocal("aei"));      // true
        System.out.println(prueba.validarVocal("AEIOU"));    // true
        System.out.println(prueba.validarVocal("ae"));       // false
        System.out.println(prueba.validarVocal("aeioua"));   // true
        System.out.println(prueba.validarVocal("aeioubb"));  // false
        System.out.println(prueba.validarVocal("abc"));      // false
        System.out.println(prueba.validarVocal(null));       // false

    }
}
