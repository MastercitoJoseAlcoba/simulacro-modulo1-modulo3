package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta30_Flujo_con_try_catch_finally;

public class ExcepcionesTeoria {

    /*
    Afirmación 1:
    "El bloque try contiene el código que puede producir una excepción."

    Correcta.
    */

    public void ejemploTry() {
        try {
            int x = 10 / 0; // Puede producir ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético");
        }
    }

    /*
    Afirmación 2:
    "El bloque catch se ejecuta siempre, ocurra o no una excepción."

    Incorrecta.

    catch solo se ejecuta si ocurre una excepción compatible.
    */

    /*
    Afirmación 3:
    "El bloque finally se ejecuta siempre haya o no excepción."

    Correcta.
    */

    /*
    Afirmación 4:
    "La palabra throw se usa para lanzar una excepción."

    Correcta.

    Ejemplo:
    throw new RuntimeException("Error");
    */

    /*
    Afirmación 5:
    "La palabra throws se usa dentro del bloque catch."

    Incorrecta.

    throws se usa en la firma del método.
    */

    public void metodo() throws Exception {
        // Este método declara que puede lanzar una excepción.
    }

    /*
    Afirmación 6:
    "Un try no puede existir sin al menos un catch o un finally."

    Correcta.
    */
}

/*
AFIRMACIONES CORRECTAS:
1, 3, 4 y 6

IDEA CLAVE:

try:
código riesgoso.

catch:
captura errores.

finally:
se ejecuta al final.

throw:
lanza excepción.

throws:
declara excepción en la firma.
*/