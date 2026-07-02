package Espacio_De_Practicas.CodeRunner04.Pregunta04;

public class Main {
    public static void generarColumnas(int dimension) {
        int[][] matriz = new int[dimension][dimension];

        for (int fila = 0; fila < dimension; fila++) {
            for (int columna = 0; columna < dimension; columna++) {
                if (columna == 0 || columna == dimension - 1) {
                    matriz[fila][columna] = 7;
                }
            }
        }

        for (int fila = 0; fila < dimension; fila++) {
            for (int columna = 0; columna < dimension; columna++) {
                System.out.print(matriz[fila][columna]);

                if (columna < dimension - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        generarColumnas(3);
        generarColumnas(2);
        generarColumnas(7);
    }
}
