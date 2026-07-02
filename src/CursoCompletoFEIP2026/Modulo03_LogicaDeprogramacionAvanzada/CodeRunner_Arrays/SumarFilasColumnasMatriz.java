package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_Arrays;

public class SumarFilasColumnasMatriz { // Hecho
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] sumasFilas = sumarFilas(matriz);
        int[] sumasColumnas = sumarColumnas(matriz);

        System.out.println("Suma de filas: " + java.util.Arrays.toString(sumasFilas));
        System.out.println("Suma de columnas: " + java.util.Arrays.toString(sumasColumnas));
    }
    public static int[] sumarFilas(int[][] matriz) {
        // Verifica si la matriz no está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }
        // Crea un array para almacenar las sumas de filas
        int[] sumasFilas = new int [matriz.length];

        for (int fila = 0; fila < matriz.length; fila++) {
            int suma = 0;
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }
            sumasFilas[fila] = suma;

        }
        return sumasFilas;
    }
    public static int[] sumarColumnas(int[][] matriz) {
        // Verifica si la matriz no está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }

        // Crea un array para almacenar las sumas de columnas
        int[] sumasColumnas = new int[matriz[0].length];

        for (int columna = 0; columna < matriz[0].length; columna++) {
            int suma = 0;

            for (int fila = 0; fila < matriz.length; fila++) {
                suma += matriz[fila][columna];
            }

            sumasColumnas[columna] = suma;
        }

        return sumasColumnas;
    }
}




