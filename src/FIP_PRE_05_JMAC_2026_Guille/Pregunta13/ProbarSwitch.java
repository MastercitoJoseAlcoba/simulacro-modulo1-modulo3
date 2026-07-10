package FIP_PRE_05_JMAC_2026_Guille.Pregunta13;

public class ProbarSwitch {
    public static void main(String[] args) {
        // ¿Qué se imprime por consola al ejecutar el programa?
        for (int i = 4; i > 0; i--) {
            switch (i - 1) {
                case 0:
                    System.out.println("A-");
                    break;
                case 1:
                    System.out.println("B-");
                case 2:
                    System.out.println("C-");
                    break;
                default:
                    System.out.println("D-");
            }

        }
    }
}


/**
 * Explicación:
 *
 * 1. El ciclo recorre i = 4, 3, 2 y 1.
 * 2. La expresión del switch es i - 1, por lo tanto, se evalúan 3,2, 1 y 0.
 * 3. Para 3 se ejecuta default e imprime D-.
 * 4. Para 1 imprime B- y, al no tener break, continúa en case 2 e imprime C-.
 * La salida final es D-C-B-C-A-
 *
 * Respuesta correcta: d. D-C-B-C-A-
 *
 */
