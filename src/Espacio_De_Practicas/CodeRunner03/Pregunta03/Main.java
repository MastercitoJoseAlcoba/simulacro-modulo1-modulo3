package Espacio_De_Practicas.CodeRunner03.Pregunta03;

public class Main {
    public static int[][] crearTabla(int fila, int columna) {
        int[][] tabla = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        return tabla;
    }

    public static void main(String[] args) {
        int [][] tabla = crearTabla(4,3);
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
