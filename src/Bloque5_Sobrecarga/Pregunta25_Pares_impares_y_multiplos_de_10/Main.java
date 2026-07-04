package Bloque5_Sobrecarga.Pregunta25_Pares_impares_y_multiplos_de_10;

public class Main {
    public static void evenOddSum(int n) {

        // ================================
        // PREGUNTA 25 — PARES, IMPARES Y MÚLTIPLOS DE 10
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - for
        // - if
        // - else if
        // - else
        // - operador módulo %
        //
        // El método recorre desde 1 hasta n inclusive.
        //
        // Para cada número imprime:
        //
        // - "evenTen" si el número es múltiplo de 10.
        // - "even" si el número es par.
        // - "odd" si el número es impar.
        //
        // La condición más específica debe ir primero.

        for (int i = 1; i <= n; i++) {

            // El for empieza en i = 1.
            //
            // Sigue mientras:
            //
            // i <= n
            //
            // Eso significa que incluye el valor n.
            //
            // Ejemplo:
            //
            // Si n = 10,
            // i toma estos valores:
            //
            // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            // --------------------------------
            // PRIMERA CONDICIÓN
            // --------------------------------
            //
            // Preguntamos si i es múltiplo de 10.
            //
            // Un número es múltiplo de 10 si:
            //
            // i % 10 == 0
            //
            // Ejemplos:
            //
            // 10 % 10 = 0
            // 20 % 10 = 0
            // 30 % 10 = 0
            //
            // Si esto se cumple, imprime:
            //
            // evenTen
            //
            // Esta condición va primero porque es la más específica.
            //
            // OJO:
            //
            // 10 también es par.
            //
            // Entonces si preguntáramos primero:
            //
            // i % 2 == 0
            //
            // el número 10 imprimiría "even"
            // y nunca llegaría a imprimir "evenTen".
            if (i % 10 == 0) {

                System.out.println("evenTen");

            } else if (i % 2 == 0) {

                // --------------------------------
                // SEGUNDA CONDICIÓN
                // --------------------------------
                //
                // Si NO era múltiplo de 10,
                // recién ahí preguntamos si es par.
                //
                // Un número es par si:
                //
                // i % 2 == 0
                //
                // Ejemplos:
                //
                // 2 % 2 = 0
                // 4 % 2 = 0
                // 6 % 2 = 0
                // 8 % 2 = 0
                //
                // Si esto se cumple, imprime:
                //
                // even
                System.out.println("even");

            } else {

                // --------------------------------
                // TERCER CASO
                // --------------------------------
                //
                // Si el número:
                //
                // - no es múltiplo de 10
                // - no es par
                //
                // entonces es impar.
                //
                // Por eso imprime:
                //
                // odd
                System.out.println("odd");
            }
        }
    }
}

/*
================================================
EJEMPLO
================================================

evenOddSum(10);


================================================
RECORRIDO PASO A PASO
================================================

i = 1

1 % 10 != 0
1 % 2 != 0

Imprime:

odd


--------------------------------

i = 2

2 % 10 != 0
2 % 2 == 0

Imprime:

even


--------------------------------

i = 3

3 % 10 != 0
3 % 2 != 0

Imprime:

odd


--------------------------------

i = 4

4 % 10 != 0
4 % 2 == 0

Imprime:

even


--------------------------------

i = 5

5 % 10 != 0
5 % 2 != 0

Imprime:

odd


--------------------------------

i = 6

6 % 10 != 0
6 % 2 == 0

Imprime:

even


--------------------------------

i = 7

7 % 10 != 0
7 % 2 != 0

Imprime:

odd


--------------------------------

i = 8

8 % 10 != 0
8 % 2 == 0

Imprime:

even


--------------------------------

i = 9

9 % 10 != 0
9 % 2 != 0

Imprime:

odd


--------------------------------

i = 10

10 % 10 == 0

Imprime:

evenTen

OJO:
Aunque 10 también es par,
no llega al else if,
porque ya entró en el primer if.


================================================
SALIDA PARA evenOddSum(10)
================================================

odd
even
odd
even
odd
even
odd
even
odd
evenTen


================================================
IDEA CLAVE
================================================

Cuando hay condiciones que se pisan,
la condición más específica va primero.

En este caso:

1) múltiplo de 10
2) par
3) impar

¿Por qué?

Porque todo múltiplo de 10 es par,
pero no todo par es múltiplo de 10.

Ejemplo:

10 es múltiplo de 10 y también par.
Pero queremos que imprima evenTen.

Entonces esa condición debe ir antes.

Si ponés primero el par,
el código compila,
pero la lógica queda mal.

El compilador revisa sintaxis.
La cabeza revisa la trampa.
*/

