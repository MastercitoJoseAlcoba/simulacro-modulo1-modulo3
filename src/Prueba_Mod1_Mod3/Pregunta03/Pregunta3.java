package Prueba_Mod1_Mod3.Pregunta03;

public class Pregunta3 {
    public static void main(String[] args) {
        /**
         * Enunciado de la pregunta:
         * Sumar cada fila de una matriz.
         *
         * Enunciado: Implementa un método llamado sumarFilas que reciba como parámetro una matriz de números enteros y
         *            devuelva un array de enteros con la suma de cada fila.
         *
         * Método de la firma: public int [] sumarFilas(int[][] matriz)
         *
         * Cada posición del array resultante debe contener la suma de los elementos de la fila correspondiente de la matriz.
         *
         * Ejemplo: Si la matriz recibida es: {
         *                                     {1,2,3},
         *                                     {4,5,6},
         *                                     {7,8,9}
         *                                    };
         *
         *                                    El método debe devolver el siguiente array: {6,15,24}
         *
         *                                    Esto ocurre porque: Fila 0: 1 + 2 + 3 = 6
         *                                                        Fila 1: 4 + 5 + 6 = 15
         *                                                        Fila 2: 7 + 8 + 9 = 24
         *
         * Requisitos importantes:
         *
         * 1. El método debe llamarse exactamente sumarFilas.
         * 2. Debe recibir como parámetro una matriz de enteros int [][].
         * 3. Debe devolver un array de enteros int [].
         * 4. No debe imprimir el resultado en pantalla.
         * 5. No se debe implementar el método main.
         *
         * Consejo: Puedes recorrer la matriz usando ciclos anidados. El ciclo externo puede recorrer las filas y el ciclo
         * interno puede recorrer los elementos de cada fila.
         *
         * Ejemplo:
         *
         * int [][] matriz = {
         *       {3,5,2},
         *       {4,8,1},
         *       {7,6,9}
         *};
         *
         * System.out.println(java.util.Arrays.toString(sumarFilas(matriz)));
         *
         * [10,13,22]
         *
         */

        // No forma parte del ejercicio que pide el CodeRunner

        int[][] matriz = {
                {3,5,2},
                {4,8,1},
                {7,6,9}
        };

        System.out.println(java.util.Arrays.toString(sumarFilas(matriz)));


    }
    // Forma parte del ejercicio que pide el CodeRunner

    public static int[] sumarFilas(int[][] matriz) {
        int[] sumaFilas = new int[matriz.length]; // Crea un array con la misma cantidad de posiciones que filas tiene
                                                  // la matriz.
                                                  // Tiene 3 filas, entonces el resultado tendrá 3 posiciones.

        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz.
            sumaFilas[i] = 0;

            for (int j = 0; j < matriz[i].length; j++) { // Recorre los valores dentro de cada fila.
                // Paso a paso:
                // Fila 0: 3 + 4 + 2 = 10
                // Fila 1: 4 + 8 + 1 = 13
                // Fila 2: 7 + 6 + 9 = 22

                sumaFilas[i] += matriz[i][j]; // i = fila y j = columna.
            }
        }
        return sumaFilas; // Devuelve el array con la suma de cada fila. [10, 13, 22]
    }

}
