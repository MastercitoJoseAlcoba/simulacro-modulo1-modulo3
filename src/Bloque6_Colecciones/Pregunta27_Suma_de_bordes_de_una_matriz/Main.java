package Bloque6_Colecciones.Pregunta27_Suma_de_bordes_de_una_matriz;

public class Main {
    public static int sumaBordes(int[][] matriz, boolean sentidoHorario) {

        // ================================
        // PREGUNTA 27 — SUMA DE BORDES DE UNA MATRIZ
        // ================================
        //
        // Este ejercicio trabaja con matrices cuadradas.
        //
        // Una matriz cuadrada tiene la misma cantidad de filas
        // que de columnas.
        //
        // Ejemplo 3x3:
        //
        // 1 2 3
        // 4 5 6
        // 7 8 9
        //
        // El borde está formado por:
        //
        // 1, 2, 3, 6, 9, 8, 7, 4
        //
        // El centro 5 NO se suma.
        //
        // El método recibe:
        //
        // int[][] matriz
        //
        // y también:
        //
        // boolean sentidoHorario
        //
        // Pero para sumar, el sentido no cambia el resultado.
        //
        // Sumar en sentido horario o antihorario da lo mismo.
        //
        // Ejemplo:
        //
        // 1 + 2 + 3
        //
        // da lo mismo que:
        //
        // 3 + 2 + 1
        //
        // El orden cambia, pero la suma final no.

        int n = matriz.length;

        // n guarda la cantidad de filas.
        //
        // Como la matriz es cuadrada,
        // también representa la cantidad de columnas.
        //
        // Ejemplo:
        //
        // matriz 3x3:
        //
        // n = 3

        if (n == 0) {

            // Caso especial:
            //
            // Si la matriz está vacía,
            // no hay filas.
            //
            // Si no hay filas, no hay bordes para sumar.
            //
            // Entonces devolvemos 0.
            return 0;
        }

        if (n == 1) {

            // Caso especial:
            //
            // Matriz de 1x1.
            //
            // Ejemplo:
            //
            // [5]
            //
            // El único elemento es borde.
            //
            // Entonces devolvemos ese único valor.
            return matriz[0][0];
        }

        int suma = 0;

        // suma es el acumulador.
        //
        // Va guardando la suma de los elementos del borde.
        //
        // Empieza en 0 porque todavía no sumamos nada.

        for (int j = 0; j < n; j++) {

            // PRIMER RECORRIDO:
            //
            // Fila superior, de izquierda a derecha.
            //
            // En una matriz 3x3:
            //
            // 1 2 3
            // 4 5 6
            // 7 8 9
            //
            // Suma:
            //
            // matriz[0][0] = 1
            // matriz[0][1] = 2
            // matriz[0][2] = 3
            //
            // Es decir:
            //
            // 1 + 2 + 3
            suma += matriz[0][j];
        }

        for (int i = 1; i < n; i++) {

            // SEGUNDO RECORRIDO:
            //
            // Columna derecha.
            //
            // Recorremos desde la segunda fila hasta la última.
            //
            // Empezamos en i = 1 para NO repetir
            // la esquina superior derecha.
            //
            // En matriz 3x3:
            //
            // Ya sumamos el 3 en la fila superior.
            //
            // Ahora sumamos:
            //
            // matriz[1][2] = 6
            // matriz[2][2] = 9
            //
            // Es decir:
            //
            // 6 + 9
            suma += matriz[i][n - 1];
        }

        for (int j = n - 2; j >= 0; j--) {

            // TERCER RECORRIDO:
            //
            // Fila inferior, de derecha a izquierda.
            //
            // Empezamos en n - 2.
            //
            // ¿Por qué?
            //
            // Porque la esquina inferior derecha ya fue sumada
            // en la columna derecha.
            //
            // En matriz 3x3:
            //
            // La fila inferior es:
            //
            // 7 8 9
            //
            // El 9 ya fue sumado.
            //
            // Entonces empezamos en el 8:
            //
            // matriz[2][1] = 8
            // matriz[2][0] = 7
            //
            // Es decir:
            //
            // 8 + 7
            suma += matriz[n - 1][j];
        }

        for (int i = n - 2; i >= 1; i--) {

            // CUARTO RECORRIDO:
            //
            // Columna izquierda, de abajo hacia arriba.
            //
            // Evitamos repetir esquinas.
            //
            // En matriz 3x3:
            //
            // La columna izquierda es:
            //
            // 1
            // 4
            // 7
            //
            // El 7 ya fue sumado en la fila inferior.
            // El 1 ya fue sumado en la fila superior.
            //
            // Entonces solo falta:
            //
            // matriz[1][0] = 4
            //
            // Por eso:
            //
            // i empieza en n - 2
            // y termina mientras i >= 1.
            suma += matriz[i][0];
        }

        // Devolvemos la suma total de los bordes.
        return suma;
    }

/*
================================================
EJEMPLO 1
================================================

int[][] matriz = {
    {1, 2},
    {3, 4}
};

Borde:

1, 2, 4, 3

Suma:

1 + 2 + 4 + 3 = 10

Resultado:

10


================================================
EJEMPLO 2
================================================

int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Borde:

1, 2, 3, 6, 9, 8, 7, 4

Suma:

1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 = 40

Resultado:

40


================================================
¿Y EL CENTRO?
================================================

El centro es:

5

No se suma porque no está en el borde.


================================================
SOBRE sentidoHorario
================================================

El parámetro sentidoHorario está en la firma:

boolean sentidoHorario

Pero para una suma no cambia el resultado.

Sentido horario:

1 + 2 + 3 + 6 + 9 + 8 + 7 + 4

Sentido antihorario:

1 + 4 + 7 + 8 + 9 + 6 + 3 + 2

Resultado en ambos casos:

40

Por eso el código puede ignorar ese parámetro
si solamente pide devolver la suma.


================================================
IDEA CLAVE
================================================

Para sumar bordes hay que evitar repetir esquinas.

Errores comunes:

1) Sumar toda la matriz.
2) Repetir las esquinas.
3) Olvidar la matriz vacía.
4) Olvidar la matriz 1x1.

La matriz es como una cancha:
acá caminamos por la línea de afuera,
no por el medio.
*/
}
