package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta05_Suma_por_filas_en_matriz_escalonada;

public class Main {
    public static void mostrarSumaFilas(int[][] matriz) {

        // Recorremos cada fila.
        for (int i = 0; i < matriz.length; i++) {

            // Acumulador para la fila actual.
            int suma = 0;

            // Recorremos los elementos de la fila i.
            //
            // Usamos matriz[i].length porque la matriz
            // puede ser escalonada.
            for (int j = 0; j < matriz[i].length; j++) {

                // Sumamos cada elemento de la fila.
                suma += matriz[i][j];
            }

            // Mostramos la suma de la fila.
            // i + 1 porque los índices arrancan en 0,
            // pero queremos mostrar Fila 1, Fila 2, etc.
            System.out.println("Fila " + (i + 1) + ": " + suma);
        }
    }

/*
EJEMPLO:

int[][] matriz = {
    {1, 2, 3},
    {4, 5},
    {},
    {10}
};

SALIDA:

Fila 1: 6
Fila 2: 9
Fila 3: 0
Fila 4: 10

IDEA CLAVE:

En matrices escalonadas,
cada fila puede tener distinto largo.

Por eso usamos:

matriz[i].length

No usamos matriz[0].length para todo.
*/
}
