package Espacio_De_Practicas.CodeRunner02.Pregunta01;

public class Main {
    public static boolean validarTarjeta(String tarjeta) {
        if (tarjeta == null || tarjeta.length() == 0) {
            return false;
        }

        int suma = 0;

        for (int i = tarjeta.length() - 1, posicion = 0; i >= 0; i--, posicion++) {

            char caracter = tarjeta.charAt(i);

            if (caracter < '0' || caracter > '9') {
                return false;
            }

            int digito = caracter - '0';

            if (posicion % 2 != 0) {
                digito = digito * 2;

                if (digito >= 10) {
                    digito = digito - 9;
                }
            }

            suma = suma + digito;
        }

        return suma % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(validarTarjeta("4556737586899855"));
        System.out.println(validarTarjeta("1234567812345678"));
        System.out.println(validarTarjeta("79927398713"));
        System.out.println(validarTarjeta("49927398717"));
        System.out.println(validarTarjeta("49927398716"));
    }
}
