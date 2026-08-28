package Cuestionario_de_entrenamiento_CodeRunner;

public class validarVocal {
    public static void main(String[] args) {

        String palabra = "Aei";

        System.out.println(validarVocal(palabra));
    }

    public static boolean validarVocal(String palabra) {

        // Validamos que no sea null
        // y que tenga entre 3 y 6 caracteres
        if (palabra == null || palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        // Pasamos todo a minúsculas
        palabra = palabra.toLowerCase();

        // Recorremos letra por letra
        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            // Si alguna letra no es vocal, devolvemos false
            if (letra != 'a' &&
                    letra != 'e' &&
                    letra != 'i' &&
                    letra != 'o' &&
                    letra != 'u') {

                return false;
            }
        }

        // Si todas son vocales, devuelve true
        return true;
    }
}
