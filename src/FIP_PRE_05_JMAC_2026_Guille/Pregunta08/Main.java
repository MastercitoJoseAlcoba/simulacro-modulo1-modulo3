package FIP_PRE_05_JMAC_2026_Guille.Pregunta08;

/**
 * El Bloque 2 se produce una excepción del tipo NullPointerException, ¿cual sería la secuencia de ejecución
 * del programa?
 *
 * Respuesta correcta y explicación
 *
 * Correcta: c
 *
 * NullPointerException capturada por catch (Exception e).
 *
 * 1. Primero se ejecuta el código anterior al try y luego el Bloque 2.
 * 2. El catch de ArrayIndexOutOfBoundsException no coincide con NullPointerException.
 * 3. El catch genérico Exception sí captura la excepción.
 * 4. El bloque finally siempre se ejecuta antes de continuar con el Bloque 6.
 *
 * a. Bloque 1 -> Bloque 2 -> Bloque 3 -> Bloque 5 -> Bloque 6
 * b. Bloque 1 -> Bloque 2 -> se detiene el programa y lanza una excepción.
 * c. Bloque 1 -> Bloque 2 -> Bloque 4 -> Bloque 5 -> Bloque 6
 * d. Bloque 1 -> Bloque 2 -> Bloque 5 -> Bloque 6
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Bloque 1");

        try {
            System.out.println("Bloque 2");

            String texto = null;

            // Esto genera NullPointerException
            System.out.println(texto.length());

            System.out.println("Bloque 3");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bloque 4 - Error de índice del array");

        } catch (Exception e) {
            System.out.println("Bloque 5 - Error general capturado");

        } finally {
            System.out.println("Bloque finally");
        }

        System.out.println("Bloque 6");
    }
}
