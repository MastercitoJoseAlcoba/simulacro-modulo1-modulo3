package Prueba_Mod1_Mod3;

public class Pregunta5 {
    public static void main(String[] args) {

        boolean seguir = true;

        for (int i = 1; i <= 12 && seguir; i++) { // O sea: mientras i sea hasta 12 y seguir sea true.

            if (i % 3 == 0) { // Si i es múltiplo de 3, hace continue, o sea salta esa vuelta y no imprime.
                              // Entonces se saltean: 3, 6, 9, 12.
                continue;
            }

            if (i == 10) { // Cuando i vale 10, entra al if y hace:
                seguir = false;
            } else { // Pero no entra al else, entonces no imprime el 10.
                System.out.println(i + "-");
            }
        }
    }
}

/**
 * ¿Al ejecutarse este programa que se muestra en la consola?
 * a. 1-2-4-5-7-8-10-
 * b. 1-2-3-4-5-6-7-8-9-10-11-12-
 * c. 3-6-9-12-
 * d. 1-2-4-5-7-8-
 *
 * La correcta es: d. 1-2-4-5-7-8-
 *
 */
