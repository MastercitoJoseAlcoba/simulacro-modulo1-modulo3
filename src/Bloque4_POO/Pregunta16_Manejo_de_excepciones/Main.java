package Bloque4_POO.Pregunta16_Manejo_de_excepciones;

public class Main {
    public void prueba(String dato, int[] vector) {

        // ================================
        // PREGUNTA 16 — MANEJO DE EXCEPCIONES
        // ================================
        //
        // Este ejercicio trabaja con try/catch.
        //
        // La idea es entender qué pasa cuando Java intenta ejecutar
        // una línea que puede producir un error.
        //
        // Si ocurre un error dentro del try,
        // Java salta automáticamente al catch correspondiente.
        //
        // En este ejercicio hay DOS bloques try/catch:
        //
        // 1) Uno para trabajar con el arreglo vector.
        // 2) Otro para trabajar con el String dato.

        try {

            // Esta línea parece simple, pero tiene una trampa:
            //
            // vector[vector[1]]
            //
            // Primero Java evalúa lo que está dentro del segundo corchete:
            //
            // vector[1]
            //
            // Después usa ese valor como índice.
            //
            // Ejemplo:
            //
            // int[] vector = {4, 12, 2, 5};
            //
            // Posiciones:
            //
            // vector[0] = 4
            // vector[1] = 12
            // vector[2] = 2
            // vector[3] = 5
            //
            // Entonces:
            //
            // vector[1] vale 12.
            //
            // Por lo tanto, Java intenta hacer:
            //
            // vector[12]
            //
            // Pero el arreglo solo tiene posiciones:
            //
            // 0, 1, 2, 3
            //
            // Entonces vector[12] NO existe.
            //
            // Eso produce una excepción:
            //
            // ArrayIndexOutOfBoundsException
            //
            // Traducido:
            // "Te fuiste afuera del arreglo, campeón".
            System.out.println(vector[vector[1]]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Este catch captura específicamente el error
            // de intentar acceder a una posición inexistente del arreglo.
            //
            // Ejemplo:
            //
            // vector[12]
            //
            // en un arreglo que solo llega hasta vector[3].
            System.out.println("indice del array fuera de rango");

        } catch (Exception e) {

            // Este catch es general.
            //
            // Captura cualquier otro error que no haya sido capturado antes.
            //
            // IMPORTANTE:
            //
            // El catch más específico debe ir primero.
            //
            // Primero:
            // catch (ArrayIndexOutOfBoundsException e)
            //
            // Después:
            // catch (Exception e)
            //
            // Si ponés Exception primero, Java no deja compilar,
            // porque Exception atraparía todo antes de llegar al catch específico.
            System.out.println("error general");
        }

        try {

            // Ahora Java intenta obtener el largo del String dato.
            //
            // Si dato tiene texto, funciona.
            //
            // Ejemplo:
            //
            // dato = "Hola"
            //
            // dato.length() vale 4.
            //
            // Si dato = "", también funciona.
            //
            // "" es un String vacío.
            // Tiene largo 0.
            //
            // Pero si dato = null, NO funciona.
            //
            // null significa que no hay objeto.
            //
            // Entonces:
            //
            // dato.length()
            //
            // produce NullPointerException.
            System.out.println(dato.length());

            // Esta línea solo se ejecuta si la anterior NO falló.
            //
            // Si dato es null, Java salta directo al catch
            // y esta línea no se imprime.
            System.out.println("Llegamos al final ok");

        } catch (NullPointerException e) {

            // Este catch captura el caso en que dato sea null.
            //
            // Es decir:
            //
            // dato no apunta a ningún String real.
            System.out.println("String null, no se puede saber su largo");

        } catch (Exception e) {

            // Catch general por si ocurre otro error distinto.
            System.out.println("error general");
        }
    }
}

/*
================================================
CASO 1
================================================

String dato = null;
int[] vector = {4, 12, 2, 5};

prueba(dato, vector);

--------------------------------
PRIMER TRY
--------------------------------

vector = {4, 12, 2, 5}

vector[1] = 12

Entonces:

vector[vector[1]]

se transforma en:

vector[12]

Pero vector[12] no existe.

Por eso imprime:

indice del array fuera de rango

--------------------------------
SEGUNDO TRY
--------------------------------

dato = null

Entonces:

dato.length()

produce NullPointerException.

Por eso imprime:

String null, no se puede saber su largo

--------------------------------
SALIDA FINAL DEL CASO 1
--------------------------------

indice del array fuera de rango
String null, no se puede saber su largo


================================================
CASO 2
================================================

String dato = "";
int[] vector = {1, 1, 2, 5};

prueba(dato, vector);

--------------------------------
PRIMER TRY
--------------------------------

vector[1] = 1

Entonces:

vector[vector[1]]

se transforma en:

vector[1]

Y vector[1] vale 1.

Por eso imprime:

1

--------------------------------
SEGUNDO TRY
--------------------------------

dato = ""

Esto NO es null.

Es un String vacío.

Entonces:

dato.length()

vale 0.

Por eso imprime:

0

Después imprime:

Llegamos al final ok

--------------------------------
SALIDA FINAL DEL CASO 2
--------------------------------

1
0
Llegamos al final ok


================================================
IDEA CLAVE PARA EL PARCIAL
================================================

null y "" NO son lo mismo.

null:
No hay objeto.

"":
Hay un String, pero está vacío.

También acuérdate:

El catch específico va antes del catch general.

Bien:
catch (NullPointerException e)
catch (Exception e)

Mal:
catch (Exception e)
catch (NullPointerException e)

Java ahí no negocia. Te baja la persiana del compilador.
*/