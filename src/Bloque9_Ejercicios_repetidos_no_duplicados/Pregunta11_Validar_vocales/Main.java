package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta11_Validar_vocales;

public class Main {
    public boolean validarVocal(String palabra) {

        // Validamos el largo.
        //
        // Debe estar entre 3 y 6 inclusive.
        if (palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        // Recorremos cada letra.
        for (int i = 0; i < palabra.length(); i++) {

            // Obtenemos la letra actual.
            char letra = palabra.charAt(i);

            // Verificamos que sea vocal válida.
            //
            // Se aceptan vocales minúsculas y mayúsculas.
            // No se aceptan tildes.
            if (letra != 'a' && letra != 'e' && letra != 'i' &&
                    letra != 'o' && letra != 'u' &&
                    letra != 'A' && letra != 'E' && letra != 'I' &&
                    letra != 'O' && letra != 'U') {

                // Si una letra no es vocal, la palabra no sirve.
                return false;
            }
        }

        // Si pasó todas las validaciones, es válida.
        return true;
    }

/*
EJEMPLO:

"Aei" -> true
"aeijk" -> false
"aeiAEI" -> true
"Aáaui" -> false

IDEA CLAVE:

Debe cumplir dos cosas:

1) Largo entre 3 y 6.
2) Todas las letras deben ser vocales sin tilde.
*/
}
