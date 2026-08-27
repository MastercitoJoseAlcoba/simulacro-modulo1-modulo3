package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Matrices;

public class MatricesBasicas {

    public static void main(String[] args) {

        int[][] matriz = {          // Creo una matriz de enteros
                {1, 2, 3},         // Fila 0
                {4, 5, 6},         // Fila 1
                {7, 8, 9}          // Fila 2
        };

        System.out.println(matriz[0][0]); // Fila 0, columna 0 -> 1
        System.out.println(matriz[1][2]); // Fila 1, columna 2 -> 6

        System.out.println("Filas: " + matriz.length); // Cantidad de filas

        System.out.println(
                "Columnas: " + matriz[0].length
        ); // Cantidad de columnas de la fila 0
    }
}