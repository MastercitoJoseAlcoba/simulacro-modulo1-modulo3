package PruebaDZA.Modulo3.Arrays;

public class ArrayMulti4 {
    public static void main(String[] args) {
        // Cargamos en las tablas de 0 a 9
        int [][] tabla = new int[10][10];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = i * j;
            }

        }
        System.out.println(" Cuenta 8 x 7: " + tabla[8][1]);
    }
}
