package Bloque6_Colecciones.Pregunta26_Ordenamiento_burbuja_descendente;

public class Main {
    public static void ordenamientoBurbuja(int[] arreglo) {

        // ================================
        // PREGUNTA 26 — ORDENAMIENTO BURBUJA DESCENDENTE
        // ================================
        //
        // Este ejercicio trabaja con Bubble Sort.
        //
        // Bubble Sort significa "ordenamiento burbuja".
        //
        // La idea es comparar elementos vecinos:
        //
        // arreglo[j] y arreglo[j + 1]
        //
        // Si están en el orden incorrecto,
        // se intercambian.
        //
        // En este caso el orden pedido es DESCENDENTE.
        //
        // Descendente significa:
        //
        // de mayor a menor.
        //
        // Ejemplo:
        //
        // [10, 7, 5, 2]

        int n = arreglo.length;

        // Guardamos el largo del arreglo.
        //
        // Ejemplo:
        //
        // int[] arreglo = {3, 10, 2};
        //
        // arreglo.length vale 3.
        //
        // Entonces:
        //
        // n = 3

        for (int i = 0; i < n - 1; i++) {

            // Primer for:
            //
            // Controla la cantidad de pasadas.
            //
            // En Bubble Sort no alcanza con comparar una sola vez.
            //
            // Hay que hacer varias pasadas hasta que los elementos
            // queden ordenados.
            //
            // Si el arreglo tiene n elementos,
            // como máximo se necesitan n - 1 pasadas.
            //
            // Por eso:
            //
            // i < n - 1

            for (int j = 0; j < n - i - 1; j++) {

                // Segundo for:
                //
                // Compara elementos vecinos.
                //
                // j representa la posición actual.
                //
                // j + 1 representa la posición siguiente.
                //
                // Ejemplo:
                //
                // arreglo[j]
                // arreglo[j + 1]
                //
                // Si j = 0:
                //
                // arreglo[0] y arreglo[1]
                //
                // Si j = 1:
                //
                // arreglo[1] y arreglo[2]

                // Como queremos ordenar de mayor a menor,
                // el número más grande debe quedar antes.
                //
                // Entonces preguntamos:
                //
                // arreglo[j] < arreglo[j + 1]
                //
                // Si esto es true, significa que el elemento actual
                // es menor que el siguiente.
                //
                // Ejemplo:
                //
                // [3, 10, 2]
                //
                // arreglo[0] = 3
                // arreglo[1] = 10
                //
                // 3 < 10
                //
                // Están mal para orden descendente.
                //
                // Debería estar primero el 10.
                //
                // Entonces hay que intercambiar.
                if (arreglo[j] < arreglo[j + 1]) {

                    // Guardamos temporalmente el valor actual.
                    //
                    // Esto es necesario porque si hacemos directamente:
                    //
                    // arreglo[j] = arreglo[j + 1];
                    //
                    // perdemos el valor original de arreglo[j].
                    //
                    // temp sirve como "cajita auxiliar".
                    int temp = arreglo[j];

                    // Ahora copiamos el valor siguiente hacia la posición actual.
                    //
                    // El mayor se mueve hacia la izquierda.
                    arreglo[j] = arreglo[j + 1];

                    // Ahora ponemos el valor guardado en temp
                    // en la posición siguiente.
                    //
                    // El menor queda a la derecha.
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

/*
================================================
EJEMPLO
================================================

int[] arreglo = {3, 10, 2};

Queremos orden descendente:

[10, 3, 2]


================================================
RECORRIDO
================================================

Inicio:

[3, 10, 2]


--------------------------------
Primera comparación
--------------------------------

Comparamos:

3 y 10

Como:

3 < 10

true

Entonces se intercambian.

Resultado:

[10, 3, 2]


--------------------------------
Segunda comparación
--------------------------------

Comparamos:

3 y 2

Como:

3 < 2

false

No se intercambian.

Resultado:

[10, 3, 2]


================================================
RESULTADO FINAL
================================================

[10, 3, 2]


================================================
IDEA CLAVE
================================================

Bubble Sort compara vecinos.

Para ordenar ascendente:

if (arreglo[j] > arreglo[j + 1])

Para ordenar descendente:

if (arreglo[j] < arreglo[j + 1])

La diferencia está en el signo.

Ascendente:
el mayor se va hacia la derecha.

Descendente:
el mayor se va hacia la izquierda.

El método es void porque modifica el arreglo original.

No devuelve otro arreglo.

Trabaja sobre el mismo que recibió.

Bubble Sort es lento, sí.
Pero para parciales es como el mate: aparece siempre.
*/
}
