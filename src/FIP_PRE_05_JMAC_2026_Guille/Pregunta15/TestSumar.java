package FIP_PRE_05_JMAC_2026_Guille.Pregunta15;

public class TestSumar {
    public static void main(String[] args) {
        Sumar sumar = new Sumar();
        sumar.sumar(10, 10);

    }

    public static class Sumar {
        public void sumar(int a, int b) { // Método invocado
            System.out.println("Entre a int " + (a + b));
        }

        public void sumar(short a, short b) {
            System.out.println("Entre a short " + (a + b));
        }

        public void sumar(long a, long b) {
            System.out.println("Entre a byte " + (a + b));

            // Respuesta correcta: a. Entre a int 20.
        }
    }
}

/**
 * Explicación:
 *
 * Los literales enteros 10 y 10 son de tipo int.
 *
 * 1. java selecciona el método sobrecargado según la firma más adecuada.
 * 2. Los valores 10 y 10, escritos sin conversión explicita, son int.
 * 3. Por eso se invoca sumar(int a, int b).
 * 4. La suma numérica 10+10 produce 20.
 * 5. La salida es Entre a int 20.
 *
 */

