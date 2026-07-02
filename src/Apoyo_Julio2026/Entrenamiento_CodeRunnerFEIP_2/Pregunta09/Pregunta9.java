package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_2.Pregunta09;

public class Pregunta9 {
    public static boolean validarTarjeta(String tarjeta) {
        int suma = 0;
        boolean duplicar = false;

        // Recorremos desde el último dígito hacia el primero
        for (int i = tarjeta.length() - 1; i >= 0; i--) {
            int digito = tarjeta.charAt(i) - '0';

            if (duplicar) {
                digito = digito * 2;

                if (digito >= 10) {
                    digito = digito - 9;
                }
            }

            suma = suma + digito;

            // Cambia entre duplicar y no duplicar
            duplicar = !duplicar;
        }

        return suma % 10 == 0;
    }

    /**
     * Idea general: El detalle importante: se empieza desde la derecha, y el primer dígito no se duplica. Se duplica el
     * siguiente, después no, después sí, y así. Luhn es básicamente “uno sí, uno no”,
     */

    public static void main(String[] args) {
        Pregunta9 p = new Pregunta9();
        System.out.println(validarTarjeta("4556737586899855")); // true
        System.out.println(validarTarjeta("1234567812345678")); // false
        System.out.println(validarTarjeta("79927398713"));      // true
        System.out.println(validarTarjeta("49927398717"));      // false
        System.out.println(validarTarjeta("49927398716"));      // true
    }
}
