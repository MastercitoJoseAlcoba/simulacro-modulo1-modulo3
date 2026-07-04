package Bloque7_Excepciones.Pregunta33_switch_vocal_consonante_o_caracter_especial;

public class Main {
    public static void clasificar(char caracter) {

        // ================================
        // PREGUNTA 33 — SWITCH: VOCAL, CONSONANTE O CARÁCTER ESPECIAL
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - switch
        // - char
        // - vocales
        // - consonantes
        // - caracteres especiales
        //
        // El objetivo es clasificar un carácter recibido.
        //
        // Puede ser:
        //
        // 1) vocal
        // 2) consonante
        // 3) no es una letra
        //
        // Primero se detectan las vocales con switch.
        //
        // Después, en default, se diferencia entre:
        //
        // - consonante
        // - carácter especial

        switch (caracter) {

            // Casos para vocales minúsculas.
            //
            // Si caracter es:
            //
            // 'a', 'e', 'i', 'o' o 'u'
            //
            // entra en este bloque.
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                // Casos para vocales mayúsculas.
                //
                // También se reconocen:
                //
                // 'A', 'E', 'I', 'O', 'U'
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                // Si llegó acá,
                // entonces el carácter es una vocal.
                System.out.println("es vocal");

                // break corta el switch.
                //
                // Si no se pone break,
                // Java podría seguir ejecutando el siguiente bloque.
                //
                // Eso se llama fall-through.
                //
                // En este caso no queremos eso.
                break;

            default:

                // default se ejecuta cuando el carácter
                // no coincide con ningún case anterior.
                //
                // Como los case anteriores eran vocales,
                // si llega acá significa que NO es vocal.
                //
                // Pero todavía puede ser:
                //
                // 1) consonante
                // 2) carácter especial
                //
                // Para saber si es consonante,
                // primero verificamos si es una letra.

                if ((caracter >= 'a' && caracter <= 'z') ||
                        (caracter >= 'A' && caracter <= 'Z')) {

                    // Esta condición pregunta si el carácter
                    // está dentro del rango de letras.
                    //
                    // Rango minúsculas:
                    //
                    // caracter >= 'a' && caracter <= 'z'
                    //
                    // Rango mayúsculas:
                    //
                    // caracter >= 'A' && caracter <= 'Z'
                    //
                    // Si está en alguno de esos rangos,
                    // entonces es una letra.
                    //
                    // Como ya sabemos que NO era vocal,
                    // entonces necesariamente es consonante.

                    System.out.println("es consonante");

                } else {

                    // Si no era vocal,
                    // y tampoco está en el rango de letras,
                    // entonces no es una letra.
                    //
                    // Ejemplos:
                    //
                    // '@'
                    // '5'
                    // '#'
                    // '?'
                    // ' '
                    //
                    // Todos esos entran acá.

                    System.out.println("no es una letra");
                }
        }
    }

/*
================================================
EJEMPLO 1
================================================

clasificar('a');

switch encuentra:

case 'a'

Entonces imprime:

es vocal


================================================
EJEMPLO 2
================================================

clasificar('E');

switch encuentra:

case 'E'

Entonces imprime:

es vocal


================================================
EJEMPLO 3
================================================

clasificar('b');

'b' no coincide con ninguna vocal.

Entonces entra en default.

Ahora pregunta:

'b' >= 'a' && 'b' <= 'z'

Eso es true.

Entonces 'b' es una letra.

Como no era vocal,
es consonante.

Imprime:

es consonante


================================================
EJEMPLO 4
================================================

clasificar('@');

'@' no coincide con ninguna vocal.

Entonces entra en default.

Ahora pregunta si '@' está entre:

'a' y 'z'

o entre:

'A' y 'Z'

No está en ninguno de esos rangos.

Entonces imprime:

no es una letra


================================================
IDEA CLAVE
================================================

El switch detecta vocales.

El default separa:

- consonantes
- caracteres especiales

Orden lógico:

1) ¿Es vocal?
2) Si no es vocal, ¿es letra?
3) Si es letra, entonces es consonante.
4) Si no es letra, entonces no es una letra.


================================================
DETALLE IMPORTANTE
================================================

En Java, los char se pueden comparar por rango.

Ejemplo:

caracter >= 'a' && caracter <= 'z'

Esto funciona porque internamente los caracteres
tienen valores numéricos.

No necesitás memorizar esos números.
Solo entender que Java puede comparar letras así.

switch + rangos:
una dupla más estable que algunos proyectos con Git.
*/
}
