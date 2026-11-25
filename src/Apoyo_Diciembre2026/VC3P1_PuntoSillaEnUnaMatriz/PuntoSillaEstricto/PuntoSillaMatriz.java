package Apoyo_Diciembre2026.VC3P1_PuntoSillaEnUnaMatriz.PuntoSillaEstricto;

public class PuntoSillaMatriz {
    /*
     * 1. Enunciado
     * Implementar un método en Java llamado buscarPuntoSilla que reciba una matriz bidimensional de números enteros.
     * Un elemento es considerado un punto silla estricto cuando cumple simultáneamente las siguientes condiciones:
     * - Es el menor elemento de su fila y no se repite en ella.
     * - Es estrictamente mayor que todos los demás elementos de su columna.
     *
     * EL método debe recorrer la matriz, identificar el punto silla y retornar sus coordenadas; fila y columna.
     * Si no encuentra ningún punto silla, retorna null.
     */

    public static int[][] buscarPuntoSilla(int[][] matriz) {

        // Paso 1: VALIDAR LA MATRIZ

        // matriz == null: comprueba si la matriz no existe.
        // matriz.length == 0: comprueba si no tiene filas.
        // matriz[0].length == 0: comprueba si no tiene columnas.
        // El operador || significa "O" (OR).
        // Si alguna condición es verdadera, retorna null.


        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return null;
        }

        // Paso 2: RECORRER LAS FILAS

        // i es una variable de control.
        // Representa el índice de la fila actual.
        // matriz.length devuelve la cantidad de filas.

        for (int i = 0; i < matriz.length; i++) {

            // Variable de almacenamiento.
            // Guarda el menor valor encontrado en la fila.
            // MAX_VALUE es el mayor entero permitido en Java.
            // Su valor es 2147483647

            int minimo = Integer.MAX_VALUE;

            // Variable de posición.
            // Guarda el índice de la columna del mínimo.
            // Se inicializa en -1 porque todavía no encontramos
            // ninguna posición válida.

            int indiceMinimo = -1;

            // Variable bandera de tipo boolean.
            // Controla si el menor elemento es único.
            // true significa verdadero.
            // false significa falso.

            boolean esMinUnico = true;

            // PASO: 3 Recorrer columnas

            // j es una variable de control.
            // Permite recorrer horizontalmente las columnas.
            // La variable i permanece fija mientras j cambia.
            // matriz[i].length devuelve las columnas de la fila.

            for (int j = 0; j < matriz[i].length; j++) {

                // Comparamos el elemento actual con el mínimo.
                // Si todavía no encontramos un mínimo válido
                // o encontramos un número menor, lo guardamos.

                if (indiceMinimo == -1 || matriz[i][j] < minimo) {

                    // Actualizamos el menor valor encontrado.
                    minimo = matriz[i][j];

                    // Guardamos la posición de su columna.
                    indiceMinimo = j;

                    // Encontramos un nuevo mínimo.
                    // Por el momento no está repetido.
                    esMinUnico = true;

                } else if (matriz[i][j] == minimo) {

                    // Si encontramos otro elemento igual
                    // al mínimo, significa que está repetido.
                    // Por lo tanto, deja de ser único.

                    esMinUnico = false;
                }
            }

            // RESULTADO DEL PRIMER RECORRIDO

            // Ejemplo: fila 0 = {7, 8, 5}
            //
            // minimo = 5
            // indiceMinimo = 2
            // esMinUnico = true
            //
            // Ya encontramos el menor elemento de la fila.
            // Ahora debemos comprobar su columna.

            // ==============================================
            // PASO 4: VERIFICAR EL MAYOR ESTRICTO
            // ==============================================

            // Segunda variable bandera.
            // Inicialmente suponemos que el mínimo encontrado
            // es el mayor estricto de su columna.
            //
            // Si encontramos otro número mayor o igual,
            // cambiamos la bandera a false.

            // Verificar si es el mayor estricto
            boolean esMayorEstricto = true;

            // k es una variable de control.
            // Permite recorrer verticalmente la matriz.
            //
            // k cambia de fila en cada iteración.
            // indiceMinimo permanece fijo.
            //
            // Ejemplo:
            // matriz[0][2] = 5
            // matriz[1][2] = 2
            // matriz[2][2] = 1

            for (int k = 0; k < matriz.length; k++) {

                // k != i:
                // Evita comparar el elemento consigo mismo.
                //
                // &&:
                // Operador lógico AND (Y).
                // Ambas condiciones deben ser verdaderas.
                //
                // matriz[k][indiceMinimo]:
                // Accede al elemento de otra fila,
                // manteniendo fija la columna.
                //
                // >= minimo:
                // Comprueba si existe otro elemento
                // mayor o igual al mínimo encontrado.
                //
                // Utilizamos >= porque el mayor es estricto.
                // No puede existir otro elemento igual.
                if (k != i && matriz[k][indiceMinimo] >= minimo) {

                    // Encontramos un elemento mayor o igual.
                    // Por lo tanto, no es el mayor estricto.
                    esMayorEstricto = false;

                    // break finaliza únicamente el for de k.
                    // No necesitamos seguir comparando,
                    // porque el candidato ya fue descartado.
                    break;
                }
            }

            // PASO 5: COMPROBAR LAS DOS BANDERAS

            // Para que exista un punto silla estricto,
            // deben cumplirse las dos condiciones:
            //
            // esMinUnico == true:
            // Es el menor único de su fila.
            //
            // esMayorEstricto == true:
            // Es el mayor estricto de su columna.
            //
            // Si ambas son verdaderas, encontramos
            // el punto silla.

            // Comprobar ambas condiciones
            if (esMinUnico && esMayorEstricto) {

                // Retornamos una matriz bidimensional
                // que contiene las coordenadas.
                //
                // i representa la fila.
                // indiceMinimo representa la columna.
                //
                // Ejemplo: {{0, 2}}
                //
                // El return finaliza completamente el método.

                return new int[][]{{i, indiceMinimo}};
            }

            // Si alguna bandera es false,
            // continuamos evaluando la siguiente fila
        }

        // PASO 6: NO EXISTE PUNTO SILLA

        // Este return está fuera de todos los ciclos.
        // Se ejecuta únicamente cuando terminamos de recorrer
        // la matriz sin encontrar un punto silla.

        return null;
    }

    public static void main(String[] args) {

        // MÉTODO PRINCIPAL: PROBAR EL FUNCIONAMIENTO

        int[][] matriz = {
                {7, 8, 5},
                {3, 9, 2},
                {6, 4, 1}
        };

        int[][] resultado = buscarPuntoSilla(matriz);

        // Comprobar si encontramos un punto silla.
        // != null significa que el método devolvió un resultado.
        if (resultado != null) {

            // Recuperar la coordenada de la fila.
            int fila = resultado[0][0];

            // Recuperar la coordenada de la columna.
            int columna = resultado[0][1];

            // Mostrar la posición de la fila.
            System.out.println("Fila: " + fila);

            // Mostrar la posición de la columna.
            System.out.println("Columna: " + columna);

            // Acceder a la matriz original utilizando
            // las coordenadas obtenidas para mostrar el valor.
            System.out.println("Punto silla: " + matriz[fila][columna]);

        } else {

            // Si resultado es null, no se encontró un punto silla.
            System.out.println("No existe punto silla");
        }
    }
}

