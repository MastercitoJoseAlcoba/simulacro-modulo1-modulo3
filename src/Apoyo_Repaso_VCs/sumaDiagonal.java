package Apoyo_Repaso_VCs;

public class sumaDiagonal {

    public static void main(String[] args) {

        int[][] matriz = {
                {4, 8, 2},   // Fila 0 -> matriz[0].length -> cantidad de columnas de la fila 0. tiene 3 columnas.
                {5, 7},      // Fila 1 -> matriz[1].length -> cantidad de columnas de la fila 1. tiene 2 columnas.
                {9},         // Fila 2 -> matriz[2].length -> cantidad de columnas de la fila 2. tiene 1 columna.
                {1, 2, 3, 6} // Fila 3 -> matriz[3].length -> cantidad de columnas de la fila 3. tiene 4 columnas.

        };

        System.out.println("La suma es: " + sumarDiagonalValida(matriz));
    }

    public static int sumarDiagonalValida(int[][] matriz) {

        if (matriz == null) {
            return 0; // Si la matriz no existe devolvemos cero, porque no podemos recorrer una matriz cuyo valor es null.
                      // Sin esta comprobación, podríamos provocar un NUllPointerException.
        }

        int suma = 0; // Creamos el acumulador para almacenar la suma de los elementos de la diagonal.

        for (int i = 0; i < matriz.length; i++) { // Usamos un solo for para recorrer la matriz.
            if (matriz[i] != null && matriz[i].length > i) { // matriz[i]!= null ()¿La fila actual existe y no es nula? Si la fila es null no podemos acceder a sus elementos.
                                                             // matriz[i].length > i) ¿La fila actual tiene más elementos que la posición actual? Si no tiene más elementos no podemos acceder al elemento en la posición i.
                suma += matriz[i][i]; // Sumamos el elemento de la diagonal a la suma.
            }
        }

        return suma; // Devolvemos la suma de los elementos de la diagonal.
    }

    /**
     * 🧠 Resumen para FEIP:
     * Tu algoritmo sigue cinco pasos:
     *
     * 1. Validar: comprobar que la matriz no es null.
     * 2. Inicializar: crear el acumulador para almacenar la suma de los elementos de la diagonal.
     * 3. Recorrer: utilizar un for para recorrer la matriz.
     * 4. Comprobar y sumar: verificar que exista matriz[i][i] y agregar su valor.
     * 5. Retornar: devolver la suma después de terminar el recorrido.
     *
     * Recordar:
     * 1. matriz.length -> cantidad de filas de la matriz.(4)
     * 2. matriz[i].length -> cantidad de columnas de la fila i. // matriz[3].length -> cantidad de columnas de la fila 3.
     * 3. matriz[i][i] -> elemento de la diagonal en la posición i.
     *
     */
}