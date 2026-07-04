package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta04_Operaciones_con_matrices;

public class OperacionesConMatrices {

    public int sumaElementosMatriz(int[][] matriz) {

        // Acumulador para guardar la suma total.
        int suma = 0;

        // Primer for: recorre las filas.
        for (int i = 0; i < matriz.length; i++) {

            // Segundo for: recorre las columnas de cada fila.
            for (int j = 0; j < matriz[i].length; j++) {

                // Sumamos cada elemento de la matriz.
                suma += matriz[i][j];
            }
        }

        // Devolvemos la suma total.
        return suma;
    }

    public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {

        // Creamos una matriz resultado con la misma cantidad de filas.
        int[][] resultado = new int[matriz1.length][];

        // Recorremos las filas.
        for (int i = 0; i < matriz1.length; i++) {

            // Cada fila del resultado tendrá el mismo largo
            // que la fila correspondiente de matriz1.
            resultado[i] = new int[matriz1[i].length];

            // Recorremos las columnas.
            for (int j = 0; j < matriz1[i].length; j++) {

                // Sumamos elemento a elemento.
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Devolvemos la matriz resultante.
        return resultado;
    }

    public void imprimirMatriz(int[][] matriz) {

        // Recorremos las filas.
        for (int i = 0; i < matriz.length; i++) {

            // Recorremos las columnas.
            for (int j = 0; j < matriz[i].length; j++) {

                // Imprimimos cada elemento.
                System.out.print(matriz[i][j] + " ");
            }

            // Al terminar cada fila, bajamos de línea.
            System.out.println();
        }
    }
}

/*
IDEA CLAVE:

Matriz = for dentro de for.

i -> fila
j -> columna

sumaElementosMatriz:
devuelve un int.

sumarMatrices:
devuelve una nueva matriz.

imprimirMatriz:
no devuelve nada, por eso es void.
*/