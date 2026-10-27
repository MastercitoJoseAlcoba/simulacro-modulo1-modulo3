package Apoyo_Julio2026.Preparacion_Diciembre2026;

public class SumarLaDiagonalValidaDeLaMatrizEscalonada {
    public static void main(String[] args) {
        int[][] matriz = {
                {4, 8, 2},
                {5, 7},
                {9},
                {1, 2, 3, 6}
        };

    }

    public static int sumarDiagonalValida(int[][] matriz) {
        // Acá debe de colocar su respuesta
        // Dentro de los controles debe verificar que lo que pasa por parametro exista.
        if (matriz == null)
            return 0;

        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) { // fila: 0

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == columna) {
                    suma += matriz[fila][columna];
                }
            }
            if (matriz[fila] != null && fila < matriz[fila].length) {
                suma += matriz[fila][fila];
            }
        }
        return suma;
    }
}
