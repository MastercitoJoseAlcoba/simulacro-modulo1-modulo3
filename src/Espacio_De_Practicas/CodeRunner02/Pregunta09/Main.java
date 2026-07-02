package Espacio_De_Practicas.CodeRunner02.Pregunta09;

public class Main {
    public static boolean validarISBN(String isbn) {
        if (isbn == null || isbn.length() != 10) {
            return false;
        }

        int suma = 0;

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);
            int valor;

            if (i == 9 && c == 'X') {
                valor = 10;
            } else if (Character.isDigit(c)) {
                valor = Character.getNumericValue(c);
            } else {
                return false;
            }

            suma += valor * (i + 1);
        }

        return suma % 11 == 0;
    }

    public static void main(String[] args) {
        System.out.println(validarISBN("0306406152")); // true
        System.out.println(validarISBN("047195869X")); // false
        System.out.println(validarISBN("0471958697")); // true
        System.out.println(validarISBN("123456789X")); // true
        System.out.println(validarISBN("1234567890")); // false
        System.out.println(validarISBN("01360918X4")); // false
        System.out.println(validarISBN("ABCDEFGHIJ")); // false
        System.out.println(validarISBN("0000000000")); // true
    }
}
