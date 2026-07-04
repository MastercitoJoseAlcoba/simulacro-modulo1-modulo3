package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta33_Flujo_sin_excepcion;

public class FlujoSinExcepcion {

    public static void main(String[] args) {

        // Bloque antes del try.
        System.out.println("Bloque 1");

        try {

            // No ocurre excepción.
            System.out.println("Bloque 2");

        } catch (Exception e) {

            // No se ejecuta porque no hubo error.
            System.out.println("Bloque 4");

        } finally {

            // Se ejecuta siempre.
            System.out.println("Bloque 5");
        }

        // El programa continúa normalmente.
        System.out.println("Bloque 6");
    }
}

/*
SALIDA:

Bloque 1
Bloque 2
Bloque 5
Bloque 6

IDEA CLAVE:

Si no hay excepción:
catch no se ejecuta.

finally sí se ejecuta.

Después continúa el programa.
*/