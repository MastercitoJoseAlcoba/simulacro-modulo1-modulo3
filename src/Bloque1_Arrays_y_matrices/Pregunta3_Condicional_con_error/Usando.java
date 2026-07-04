package Bloque1_Arrays_y_matrices.Pregunta3_Condicional_con_error;

public class Usando {

    public static void main(String[] args) {

        // Creamos una variable entera llamada valor.
        // Su valor inicial es 10.
        int valor = 10;

        // ACÁ ESTÁ EL ERROR:
        //
        // En Java, el símbolo = sirve para ASIGNAR un valor.
        //
        // Ejemplo:
        // valor = 2;
        //
        // Eso significa:
        // "guardar el número 2 dentro de la variable valor".
        //
        // Pero dentro de un if Java necesita una condición booleana.
        //
        // Una condición booleana es algo que da:
        // true
        // o
        // false
        //
        // Este código:
        // if (valor = 2)
        //
        // intenta asignar 2 a valor.
        //
        // El problema es que esa asignación trabaja con int,
        // no con boolean.
        //
        // Por eso el programa NO compila.
        if (valor == 2) { // if (valor = 2) - No compila.

            // Esta línea nunca llega a ejecutarse,
            // porque el programa tiene error de compilación antes.
            System.out.println("caso 1");

        } else {

            // Esta línea tampoco se ejecuta.
            System.out.println("caso 2");
        }
    }
}

/*
RESPUESTA CORRECTA:
c. El programa tiene un error de compilación.

POR QUÉ:

En Java:

=  sirve para asignar.
== sirve para comparar.

Incorrecto:

if (valor = 2)

Correcto:

if (valor == 2)

CÓDIGO CORREGIDO:

public class Usando {

    public static void main(String[] args) {

        int valor = 10;

        if (valor == 2) {
            System.out.println("caso 1");
        } else {
            System.out.println("caso 2");
        }
    }
}

Con el código corregido, imprimiría:

caso 2

Porque valor vale 10, y 10 == 2 es false.

IDEA CLAVE:
Dentro de un if tiene que haber una condición.
Para comparar números se usa ==.
Para asignar valores se usa =.

Esta es una trampa clásica.
El compilador acá te salva de vos mismo, raro pero útil.
*/