package Espacio_De_Practicas.CodeRunner03.Pregunta01;

public class Main {
    public static int diferenciaParesImpares(int[][] matriz) {
        int sumaColumnasPares = 0;
        int sumaFilasImpares = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (columna % 2 == 0) {
                    sumaColumnasPares += matriz[fila][columna];
                }

                if (fila % 2 != 0) {
                    sumaFilasImpares += matriz[fila][columna];
                }
            }
        }

        int diferencia = sumaColumnasPares - sumaFilasImpares;

        if (diferencia < 0) {
            diferencia = diferencia * -1;
        }

        return diferencia;
    }

    public static void main(String[] args) {
        System.out.println(diferenciaParesImpares(new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }));
    }
}
