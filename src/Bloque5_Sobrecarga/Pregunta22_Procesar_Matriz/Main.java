package Bloque5_Sobrecarga.Pregunta22_Procesar_Matriz;

public class Main {

    public static void main(String[] args) {

        // ================================
        // PREGUNTA 22 — PROCESAR MATRIZ
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - matriz bidimensional
        // - for anidado
        // - números pares
        // - acumulador
        // - return con multiplicación final
        //
        // El objetivo del método procesarMatriz es:
        //
        // 1) Recorrer toda la matriz.
        // 2) Sumar solamente los números pares.
        // 3) Multiplicar esa suma por 3.
        // 4) Devolver el resultado.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Visualmente la matriz queda así:
        //
        // fila 0: 1  2  3
        // fila 1: 4  5  6
        // fila 2: 7  8  9
        //
        // Índices:
        //
        // matriz[0][0] = 1
        // matriz[0][1] = 2
        // matriz[0][2] = 3
        //
        // matriz[1][0] = 4
        // matriz[1][1] = 5
        // matriz[1][2] = 6
        //
        // matriz[2][0] = 7
        // matriz[2][1] = 8
        // matriz[2][2] = 9

        int resultado = procesarMatriz(matriz);

        // Imprime el resultado devuelto por el método.
        System.out.println("El resultado es: " + resultado);
    }

    public static int procesarMatriz(int[][] matriz) {

        // suma es un acumulador.
        //
        // Va guardando la suma de los números pares encontrados.
        //
        // Empieza en 0 porque todavía no encontramos ningún par.
        int suma = 0;

        // Primer for:
        //
        // Recorre las filas.
        //
        // matriz.length devuelve la cantidad de filas.
        //
        // En este caso:
        //
        // matriz.length = 3
        //
        // Entonces i toma estos valores:
        //
        // i = 0
        // i = 1
        // i = 2
        for (int i = 0; i < matriz.length; i++) {

            // Segundo for:
            //
            // Recorre las columnas de la fila actual.
            //
            // matriz[i].length devuelve la cantidad de columnas
            // que tiene la fila i.
            //
            // En esta matriz todas las filas tienen 3 columnas.
            //
            // Pero escribir matriz[i].length es mejor,
            // porque también funciona si las filas tienen distintos largos.
            for (int j = 0; j < matriz[i].length; j++) {

                // matriz[i][j] representa el elemento actual.
                //
                // Ejemplos:
                //
                // Si i = 0 y j = 0:
                // matriz[0][0] = 1
                //
                // Si i = 0 y j = 1:
                // matriz[0][1] = 2
                //
                // Si i = 1 y j = 0:
                // matriz[1][0] = 4

                // Esta condición pregunta si el número actual es par.
                //
                // Un número es par cuando el resto de dividirlo entre 2 es 0.
                //
                // Ejemplo:
                //
                // 2 % 2 = 0  -> par
                // 3 % 2 = 1  -> impar
                //
                // Entonces:
                //
                // matriz[i][j] % 2 == 0
                //
                // significa:
                //
                // "el elemento actual es par".
                if (matriz[i][j] % 2 == 0) {

                    // Si el número es par,
                    // lo sumamos al acumulador.
                    //
                    // Esto equivale a:
                    //
                    // suma = suma + matriz[i][j];
                    suma += matriz[i][j];
                }
            }
        }

        // Cuando termina el doble for,
        // ya recorrimos toda la matriz.
        //
        // En esta matriz los pares son:
        //
        // 2, 4, 6, 8
        //
        // La suma es:
        //
        // 2 + 4 + 6 + 8 = 20
        //
        // Pero el método NO devuelve solo suma.
        //
        // Devuelve:
        //
        // suma * 3
        //
        // Entonces:
        //
        // 20 * 3 = 60
        return suma * 3;
    }
}

/*
================================================
MATRIZ
================================================

1 2 3
4 5 6
7 8 9


================================================
NÚMEROS PARES
================================================

2
4
6
8


================================================
SUMA DE PARES
================================================

2 + 4 + 6 + 8 = 20


================================================
MULTIPLICACIÓN FINAL
================================================

20 * 3 = 60


================================================
SALIDA
================================================

El resultado es: 60


================================================
RESPUESTA
================================================

d. 60


================================================
IDEA CLAVE
================================================

Hay dos cosas importantes:

1) No se suman todos los números.
   Solo se suman los pares.

2) Al final se multiplica la suma por 3.

El doble for recorre.
El if filtra.
El acumulador suma.
El return remata.

Java versión cocina:
recorrés la matriz, separás los pares,
sumás y le tirás el x3 al final.
*/