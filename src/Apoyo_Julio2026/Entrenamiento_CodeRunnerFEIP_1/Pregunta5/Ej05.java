package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_1.Pregunta5;

public class Ej05 {
    public static void main(String[] args) {
        Ej05 ej05 = new Ej05();
        System.out.println(ej05.validarVocal("aeiou"));
    }

    public boolean validarVocal(String palabra) {

        // Validamos la palabra y su longitud
        if (palabra == null || palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        // Convertimos a minúsculas
        palabra = palabra.toLowerCase();

        // Recorremos todos los caracteres
        for (int i = 0; i < palabra.length(); i++) {

            // Obtenemos la letra actual
            char letra = palabra.charAt(i);

            // Verificamos si no es una vocal
            if (letra != 'a' &&
                    letra != 'e' &&
                    letra != 'i' &&
                    letra != 'o' &&
                    letra != 'u') {

                return false;
            }
        }

        // Todas las letras son vocales
        return true;
    }
}
