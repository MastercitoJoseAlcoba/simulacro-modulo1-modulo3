package Bloque7_Excepciones.Pregunta32_Mayor_elemento_de_cada_fila;

public class Main {
    private static void mayorFilas(int[][] matriz) {

        // ================================
        // PREGUNTA 32 — MAYOR ELEMENTO DE CADA FILA
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - matriz bidimensional
        // - bucles anidados
        // - búsqueda del máximo
        // - recorrido fila por fila
        //
        // El objetivo es imprimir el mayor número
        // de cada fila de la matriz.
        //
        // El método es void.
        //
        // Eso significa que NO devuelve nada.
        //
        // Solo imprime resultados.

        for (int i = 0; i < matriz.length; i++) {

            // Primer for:
            //
            // Recorre las filas de la matriz.
            //
            // matriz.length devuelve la cantidad de filas.
            //
            // Ejemplo:
            //
            // int[][] matriz = {
            //     {1, 2, 3, 4},
            //     {5, 8, 7},
            //     {9, 10, 12}
            // };
            //
            // matriz.length vale 3.
            //
            // Porque hay 3 filas:
            //
            // fila 0
            // fila 1
            // fila 2

            int max = matriz[i][0];

            // Tomamos el primer elemento de la fila
            // como máximo inicial.
            //
            // Esto es MUY importante.
            //
            // ¿Por qué no empezar max en 0?
            //
            // Porque la fila podría tener números negativos.
            //
            // Ejemplo:
            //
            // {-8, -3, -10}
            //
            // Si max empieza en 0,
            // el resultado quedaría 0.
            //
            // Pero 0 ni siquiera está en la fila.
            //
            // El mayor real sería -3.
            //
            // Por eso se inicializa con:
            //
            // matriz[i][0]

            for (int j = 0; j < matriz[i].length; j++) {

                // Segundo for:
                //
                // Recorre las columnas de la fila actual.
                //
                // matriz[i].length devuelve la cantidad de elementos
                // que tiene la fila i.
                //
                // Esto permite trabajar también con matrices escalonadas.
                //
                // Una matriz escalonada puede tener filas
                // de distinto largo.
                //
                // Ejemplo:
                //
                // fila 0: {1, 2, 3, 4} tiene 4 elementos.
                // fila 1: {5, 8, 7} tiene 3 elementos.
                // fila 2: {9, 10, 12} tiene 3 elementos.

                if (matriz[i][j] > max) {

                    // matriz[i][j] es el elemento actual.
                    //
                    // Si el elemento actual es mayor que max,
                    // encontramos un nuevo máximo para esa fila.
                    //
                    // Entonces actualizamos max.

                    max = matriz[i][j];
                }
            }

            // Cuando termina el segundo for,
            // ya recorrimos toda la fila i.
            //
            // Entonces max contiene el mayor valor de esa fila.
            //
            // Se imprime el resultado de esa fila.
            System.out.println("Mayor fila :" + i + " es " + max);
        }
    }

/*
================================================
EJEMPLO
================================================

int[][] matriz = {
    {1, 2, 3, 4},
    {5, 8, 7},
    {9, 10, 12}
};


================================================
RECORRIDO FILA 0
================================================

Fila 0:

{1, 2, 3, 4}

max empieza en:

matriz[0][0]

Entonces:

max = 1

Comparaciones:

1 > 1 -> false

max sigue siendo 1.

2 > 1 -> true

max = 2

3 > 2 -> true

max = 3

4 > 3 -> true

max = 4

Al terminar la fila 0, el mayor es 4.

Imprime:

Mayor fila :0 es 4


================================================
RECORRIDO FILA 1
================================================

Fila 1:

{5, 8, 7}

max empieza en:

matriz[1][0]

Entonces:

max = 5

Comparaciones:

5 > 5 -> false

max sigue siendo 5.

8 > 5 -> true

max = 8

7 > 8 -> false

max sigue siendo 8.

Al terminar la fila 1, el mayor es 8.

Imprime:

Mayor fila :1 es 8


================================================
RECORRIDO FILA 2
================================================

Fila 2:

{9, 10, 12}

max empieza en:

matriz[2][0]

Entonces:

max = 9

Comparaciones:

9 > 9 -> false

max sigue siendo 9.

10 > 9 -> true

max = 10

12 > 10 -> true

max = 12

Al terminar la fila 2, el mayor es 12.

Imprime:

Mayor fila :2 es 12


================================================
SALIDA
================================================

Mayor fila :0 es 4
Mayor fila :1 es 8
Mayor fila :2 es 12


================================================
IDEA CLAVE
================================================

Para matrices se usan bucles anidados:

i recorre filas.
j recorre columnas.

Para encontrar el mayor de cada fila:

1) Tomás el primer elemento de la fila como máximo inicial.
2) Recorres esa fila.
3) Si encontrás un valor mayor, actualizás max.
4) Al terminar la fila, imprimís max.

No se devuelve nada porque el método es void.

La trampa típica es iniciar max en 0.
Eso puede fallar con números negativos.
Java no perdona el optimismo excesivo.
*/
}
