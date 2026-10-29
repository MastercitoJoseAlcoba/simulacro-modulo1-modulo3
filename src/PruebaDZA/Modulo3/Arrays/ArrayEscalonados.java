package PruebaDZA.Modulo3.Arrays;

public class ArrayEscalonados {
    public static void main(String[] args) {
        // Array escalona en Java
        int [][] matriz = new int[3][]; // Columnas queda vacía
        matriz[0] = new int[]{1,2,3,4,5,6};
        matriz[1] = new int[]{7,8,9};
        matriz[2] = new int[]{10,11,12,13};
        System.out.println("Array escalonados en Java.");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento en la posición [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
