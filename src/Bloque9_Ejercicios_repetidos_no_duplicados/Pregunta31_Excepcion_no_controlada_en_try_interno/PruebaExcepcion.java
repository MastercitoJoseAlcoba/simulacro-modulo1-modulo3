package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta31_Excepcion_no_controlada_en_try_interno;

public class PruebaExcepcion {

    public static void main(String[] args) {

        try {

            int[] numeros = {10, 20, 30};

            try {

                // Índices válidos:
                // 0, 1, 2
                //
                // numeros[5] no existe.
                //
                // Esto produce ArrayIndexOutOfBoundsException.
                System.out.println(numeros[5]);

            } catch (ArithmeticException e) {

                // Este catch solo captura errores aritméticos.
                //
                // No captura ArrayIndexOutOfBoundsException.
                System.out.println("Error aritmético");
            }

            // No se ejecuta porque la excepción no fue capturada.
            System.out.println("Fin del bloque interno");

        } catch (NullPointerException e) {

            // Este catch tampoco sirve,
            // porque el error no es NullPointerException.
            System.out.println("Error de referencia nula");
        }

        // Tampoco se ejecuta.
        System.out.println("Fin del programa");
    }
}

/*
RESULTADO:

Se produce una excepción no controlada
y el programa se detiene.

IDEA CLAVE:

Una excepción solo se captura
si existe un catch compatible.

Error real:
ArrayIndexOutOfBoundsException

Catch interno:
ArithmeticException

Catch externo:
NullPointerException

Ninguno coincide.
*/