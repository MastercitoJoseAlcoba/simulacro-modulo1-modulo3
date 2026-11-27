package Apoyo_Diciembre2026.VC3P1_PuntoSillaEnUnaMatriz.PuntoSillaMatrizNuevo;

import Apoyo_Diciembre2026.VC3P1_PuntoSillaEnUnaMatriz.PuntoSillaEstricto.PuntoSillaMatriz;

import java.util.Arrays;

public class Ejercicio2_BuscarPuntoSilla {
    public static void main(String[] args) {

        int[][] m1 = {
                {7, 8, 5},
                {3, 9, 2},
                {6, 4, 1}
        };
        int[][] resultado = PuntoSillaMatriz.buscarPuntoSilla(m1);
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] buscarPuntoSilla(int[][] matriz) {

        // Validar la matriz
        if (matriz == null || matriz.length == 0 ||
                matriz[0].length == 0) {
            return null;
        }

        // Recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int valor = matriz[i][j];

                boolean esMenor = true;
                boolean esMayor = true;

                // Verificar si es el menor de su fila
                for (int k = 0; k < matriz[i].length; k++) {

                    if (k != j && matriz[i][k] <= valor) {
                        esMenor = false;
                        break;
                    }
                }

                // Verificar si es el mayor de su columna
                for (int k = 0; k < matriz.length; k++) {

                    if (k != i && matriz[k][j] >= valor) {
                        esMayor = false;
                        break;
                    }
                }

                // Si cumple ambas condiciones
                if (esMenor && esMayor) {
                    return new int[]{i, j};
                }
            }
        }

        // No existe punto silla
        return null;
    }
}

