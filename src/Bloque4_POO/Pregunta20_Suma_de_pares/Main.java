package Bloque4_POO.Pregunta20_Suma_de_pares;

public class Main {

    public static void main(String[] args) {

        // ================================
        // PREGUNTA 20 — SUMA DE NÚMEROS PARES
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - arreglos
        // - recorrido con for
        // - condición if
        // - acumulador
        // - operador módulo %
        //
        // El objetivo es sumar solamente los números pares del arreglo.

        int arr[] = {1, 3, 5, 7, 9, 13, 17};

        // Este arreglo tiene estos valores:
        //
        // posición 0 -> 1
        // posición 1 -> 3
        // posición 2 -> 5
        // posición 3 -> 7
        // posición 4 -> 9
        // posición 5 -> 13
        // posición 6 -> 17
        //
        // Todos son impares.
        //
        // No hay ningún número par.

        int sum = 0;

        // sum es un acumulador.
        //
        // Sirve para ir guardando una suma.
        //
        // Empieza en 0 porque todavía no sumamos nada.
        //
        // Si encontramos un número par,
        // hacemos:
        //
        // sum += arr[i];
        //
        // Eso significa:
        //
        // sum = sum + arr[i];

        for (int i = 0; i < arr.length; i++) {

            // El for recorre todo el arreglo.
            //
            // arr.length vale 7.
            //
            // Entonces i toma estos valores:
            //
            // i = 0
            // i = 1
            // i = 2
            // i = 3
            // i = 4
            // i = 5
            // i = 6
            //
            // Cuando i llega a 7, corta,
            // porque i < arr.length ya sería falso.

            // Esta condición pregunta si el número actual es par.
            //
            // Un número es par cuando al dividirlo entre 2
            // el resto es 0.
            //
            // Ejemplos:
            //
            // 4 % 2 = 0
            // Entonces 4 es par.
            //
            // 5 % 2 = 1
            // Entonces 5 es impar.
            //
            // En Java:
            //
            // arr[i] % 2 == 0
            //
            // significa:
            //
            // "el elemento actual es par".
            if (arr[i] % 2 == 0) {

                // Esta línea solo se ejecuta si arr[i] es par.
                //
                // Como en este arreglo todos los números son impares,
                // esta línea nunca se ejecuta.
                sum += arr[i];
            }
        }

        // Al final se imprime la suma de los pares.
        //
        // Como no había pares,
        // sum nunca cambió.
        //
        // Entonces sigue valiendo 0.
        System.out.println(sum);
    }
}

/*
================================================
RECORRIDO PASO A PASO
================================================

Arreglo:

{1, 3, 5, 7, 9, 13, 17}

sum = 0


--------------------------------
i = 0
--------------------------------

arr[0] = 1

1 % 2 = 1

No es par.

sum sigue valiendo 0.


--------------------------------
i = 1
--------------------------------

arr[1] = 3

3 % 2 = 1

No es par.

sum sigue valiendo 0.


--------------------------------
i = 2
--------------------------------

arr[2] = 5

5 % 2 = 1

No es par.

sum sigue valiendo 0.


--------------------------------
i = 3
--------------------------------

arr[3] = 7

7 % 2 = 1

No es par.

sum sigue valiendo 0.


--------------------------------
i = 4
--------------------------------

arr[4] = 9

9 % 2 = 1

No es par.

sum sigue valiendo 0.


--------------------------------
i = 5
--------------------------------

arr[5] = 13

13 % 2 = 1

No es par.

sum sigue valiendo 0.


--------------------------------
i = 6
--------------------------------

arr[6] = 17

17 % 2 = 1

No es par.

sum sigue valiendo 0.


================================================
RESULTADO FINAL
================================================

No se encontró ningún número par.

Entonces:

sum = 0


================================================
SALIDA
================================================

0


================================================
RESPUESTA
================================================

b. 0


================================================
IDEA CLAVE
================================================

La variable sum solo cambia si se cumple esta condición:

arr[i] % 2 == 0

Como ningún elemento cumple esa condición,
sum queda en 0.

La trampa es leer "suma de pares"
y ponerse a sumar todo como si el if fuera decoración.

Primero se filtra.
Después se acumula.
*/