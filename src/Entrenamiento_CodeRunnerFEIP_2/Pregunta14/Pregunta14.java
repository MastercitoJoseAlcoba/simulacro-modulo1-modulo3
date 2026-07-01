package Entrenamiento_CodeRunnerFEIP_2.Pregunta14;

public class Pregunta14 {
    public static boolean validarISBN(String isbn) {
        // Debe tener exactamente 10 caracteres
        if (isbn.length() != 10) {
            return false;
        }

        int suma = 0;

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);
            int valor;

            // Si es el último carácter y es X, vale 10
            // Solo se permite X en la última posición. Si aparece antes, devuelve false.
            if (i == 9 && c == 'X') {
                valor = 10;
            } else if (Character.isDigit(c)) {
                valor = Character.getNumericValue(c);
            } else {
                return false;
            }

            // Multiplicamos por la posición, que va de 1 a 10
            suma = suma + valor * (i + 1); // La clave está acá: Porque el índice empieza en 0, pero la posición del ISBN empieza en 1.

            /**
             * Ejemplo:
             * i = 0 → posición 1
             * i = 1 → posición 2
             * i = 9 → posición 10
             */
        }

        return suma % 11 == 0;
    }

    public static void main(String[] args) {

        Pregunta14 p = new Pregunta14();
        System.out.println(validarISBN("0306406152"));
        System.out.println(validarISBN("047195869X"));
        System.out.println(validarISBN("0471958697"));
        System.out.println(validarISBN("123456789X"));
        System.out.println(validarISBN("1234567890"));
        System.out.println(validarISBN("01360918X4"));
        System.out.println(validarISBN("ABCDEFGHIJ"));
        System.out.println(validarISBN("0000000000"));
    }
}
