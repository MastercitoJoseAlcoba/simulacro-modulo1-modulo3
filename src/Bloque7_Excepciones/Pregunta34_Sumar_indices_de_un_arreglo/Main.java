package Bloque7_Excepciones.Pregunta34_Sumar_indices_de_un_arreglo;

public class Main {

    public static void main(String[] args) {

        // ================================
        // PREGUNTA 34 — SUMAR ÍNDICES DE UN ARREGLO
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - arreglo
        // - for
        // - incremento de 2 en 2
        // - acumulador
        // - diferencia entre índice y valor
        //
        // La trampa principal:
        //
        // El código suma i.
        //
        // NO suma arr[i].

        int[] arr = {10, 20, 30, 40, 50};

        // Arreglo:
        //
        // índice 0 -> valor 10
        // índice 1 -> valor 20
        // índice 2 -> valor 30
        // índice 3 -> valor 40
        // índice 4 -> valor 50

        int suma = 0;

        // suma es un acumulador.
        //
        // Va a guardar la suma de los índices.
        //
        // Empieza en 0.

        for (int i = 0; i < arr.length; i += 2) {

            // El for empieza con:
            //
            // i = 0
            //
            // La condición es:
            //
            // i < arr.length
            //
            // arr.length vale 5.
            //
            // El incremento es:
            //
            // i += 2
            //
            // Eso significa:
            //
            // i = i + 2
            //
            // Entonces i toma estos valores:
            //
            // 0, 2, 4
            //
            // Cuando i pasa a 6,
            // la condición 6 < 5 es false
            // y el ciclo termina.

            suma += i;

            // ATENCIÓN:
            //
            // Esta línea suma i.
            //
            // i es el índice.
            //
            // NO suma arr[i].
            //
            // Diferencia:
            //
            // i representa la posición.
            //
            // arr[i] representa el valor guardado en esa posición.
            //
            // Ejemplo:
            //
            // Si i = 2:
            //
            // i vale 2.
            //
            // arr[i] es arr[2],
            // y arr[2] vale 30.
            //
            // Pero el código dice:
            //
            // suma += i;
            //
            // Entonces suma 2, no suma 30.
        }

        // Imprime la suma final.
        System.out.println(suma);
    }
}

/*
================================================
ARREGLO
================================================

int[] arr = {10, 20, 30, 40, 50};

Índices y valores:

índice 0 -> valor 10
índice 1 -> valor 20
índice 2 -> valor 30
índice 3 -> valor 40
índice 4 -> valor 50


================================================
VALORES QUE TOMA i
================================================

El for es:

for (int i = 0; i < arr.length; i += 2)

arr.length = 5

Entonces:

i = 0
i = 2
i = 4


================================================
CÁLCULO
================================================

suma = 0

Primera vuelta:

i = 0

suma += i

suma = 0 + 0

suma = 0


--------------------------------

Segunda vuelta:

i = 2

suma += i

suma = 0 + 2

suma = 2


--------------------------------

Tercera vuelta:

i = 4

suma += i

suma = 2 + 4

suma = 6


================================================
SALIDA
================================================

6


================================================
RESPUESTA
================================================

b. 6


================================================
ERROR COMÚN
================================================

Pensar que suma:

arr[0] + arr[2] + arr[4]

Eso sería:

10 + 30 + 50 = 90

Pero el código no dice:

suma += arr[i];

El código dice:

suma += i;

Por eso suma:

0 + 2 + 4 = 6


================================================
IDEA CLAVE
================================================

i       -> índice / posición

arr[i]  -> valor guardado en esa posición

Diferencia chica en escritura.
Diferencia gigante en el resultado.

Acá el parcial te mira fijo y pregunta:
"¿Leíste el código o leíste lo que querías ver?"
*/