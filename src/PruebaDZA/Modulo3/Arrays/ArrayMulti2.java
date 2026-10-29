package PruebaDZA.Modulo3.Arrays;

public class ArrayMulti2 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int primerElemento = matriz[0][0]; // Accediendo al primer elemento de la matriz
        int elementoCentral = matriz[1][1]; // Accediendo al elemento central de la matriz
        int ultimoElemento = matriz[matriz.length - 1][matriz.length - 1]; // Accediendo al último elemento de la matriz
        System.out.println("Primer elemento: " + primerElemento + "\nElemento Central: " + elementoCentral + "\nUltimo Elemento: " + ultimoElemento);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Para i: " + i);
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ** ");
            }
            System.out.println();
            System.out.println("-".repeat(matriz.length));
        }


    }
}
