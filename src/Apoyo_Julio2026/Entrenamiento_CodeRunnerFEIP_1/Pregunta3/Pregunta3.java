package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_1.Pregunta3;

public class Pregunta3 {
    public static void main(String[] args) {
        int[][] matriz = {
                {11,20,32,41},
                {22,33,44,55,34,24},
                {33,44,55,34,24,22},
                {3,9,12}
        };
        int contar = contarPares(matriz);
        System.out.println(contar);

    }
    public static int contarPares(int[][] matriz) {
        int contar = 0;

        for (int i = 0; i < matriz.length; i++) {         // recorre las filas de la matriz.
            for (int j = 0; j < matriz[i].length; j++) {  // recorre los valores dentro de cada fila.
                if (matriz[i][j] % 2 == 0) {              // pregunta si el número es par.
                    contar++;                             // suma 1 al contador cada vez que encuentra un par.
                }
            }
        }
        return contar;
    }
}
