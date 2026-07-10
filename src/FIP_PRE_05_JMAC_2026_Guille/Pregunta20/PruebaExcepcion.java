package FIP_PRE_05_JMAC_2026_Guille.Pregunta20;

public class PruebaExcepcion {
    public static void main(String[] args) {
        try {
            System.out.println(calcular());
        } catch (Exception e) {
            System.out.println("Excepción en calcular");
        }
    }

    public static int calcular() {
        int valor = 10;

        try {
            valor++;        // valor = 11
            valor += 10;    // valor = 21

            // Esto genera NumberFormatException
            valor += Integer.parseInt("el 5");

            // Esta línea NO se ejecuta porque antes hubo excepción
            valor++;

        } catch (NumberFormatException e) {

            // Para que el resultado final sea 35,
            // acá sumamos 10
            valor += Integer.parseInt("10"); // valor = 31

        } finally {

            // El finally siempre se ejecuta
            valor += 5; // valor = 36
        }

        valor--; // valor = 35

        return valor;
    }
}

/**
 * Explicación:
 *
 * La excepción se captura dentro de calcular() y luego se ejecuta finally.
 *
 * 1. valor inicia en 10, luego pasa a 11 y después a 21.
 * 2. Integer.parseint("el 5") produce NumberFormatException.
 * 3. El catch suma 20, por lo tanto, valor pasa a 41.
 * 4. finally resta 5 y luego, fuera del try-catch, valor-deja el resultado en 35.
 *
 * 10 + 1 + 10 = 21
 * 21 + 10 = 31
 * 31 + 5 = 36
 * 36 - 1 = 35
 *
 */
