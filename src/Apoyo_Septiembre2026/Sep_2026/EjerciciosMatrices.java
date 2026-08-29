package Apoyo_Septiembre2026.Sep_2026;

import java.util.Arrays;

public class EjerciciosMatrices {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("\n1. Suma total:");
        System.out.println(sumarElementos(matriz));

        System.out.println("\n2. Cantidad de pares:");
        System.out.println(contarPares(matriz));

        System.out.println("\n3. Suma de pares:");
        System.out.println(sumarPares(matriz));

        System.out.println("\n4. Mayor elemento:");
        System.out.println(encontrarMayor(matriz));

        System.out.println("\n5. Menor elemento:");
        System.out.println(encontrarMenor(matriz));

        System.out.println("\n6. Suma por filas:");
        System.out.println(Arrays.toString(sumarFilas(matriz)));

        System.out.println("\n7. Suma por columnas:");
        System.out.println(Arrays.toString(sumarColumnas(matriz)));

        System.out.println("\n8. Suma diagonal principal:");
        System.out.println(sumarDiagonalPrincipal(matriz));

        System.out.println("\n9. Suma diagonal secundaria:");
        System.out.println(sumarDiagonalSecundaria(matriz));

        System.out.println("\n10. Suma del contorno:");
        System.out.println(sumarContorno(matriz));

        System.out.println("\n11. Diferencia entre pares e impares:");
        System.out.println(diferenciaParesImpares(matriz));

        System.out.println("\n12. Generar columnas de extremos con 7:");
        generarColumnasExtremos(5);

        System.out.println("\n13. Generar perímetro con 7:");
        llenarPerimetro(5);

        System.out.println("\n14. Tabla pitagórica:");
        tablaPitagorica(5);
    }


    // =====================================================
    // 1. IMPRIMIR MATRIZ
    // =====================================================

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }


    // =====================================================
    // 2. SUMAR TODOS LOS ELEMENTOS
    // =====================================================

    public static int sumarElementos(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }
        }

        return suma;
    }


    // =====================================================
    // 3. CONTAR NÚMEROS PARES
    // =====================================================

    public static int contarPares(int[][] matriz) {

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }

        return contador;
    }


    // =====================================================
    // 4. SUMAR NÚMEROS PARES
    // =====================================================

    public static int sumarPares(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0) {
                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }


    // =====================================================
    // 5. ENCONTRAR EL MAYOR
    // =====================================================

    public static int encontrarMayor(int[][] matriz) {

        int mayor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        return mayor;
    }


    // =====================================================
    // 6. ENCONTRAR EL MENOR
    // =====================================================

    public static int encontrarMenor(int[][] matriz) {

        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }


    // =====================================================
    // 7. SUMAR CADA FILA
    // =====================================================

    public static int[] sumarFilas(int[][] matriz) {

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }

            resultado[i] = suma;
        }

        return resultado;
    }


    // =====================================================
    // 8. SUMAR CADA COLUMNA
    // =====================================================

    public static int[] sumarColumnas(int[][] matriz) {

        int columnas = matriz[0].length;

        int[] resultado = new int[columnas];

        for (int j = 0; j < columnas; j++) {

            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {

                suma += matriz[i][j];
            }

            resultado[j] = suma;
        }

        return resultado;
    }


    // =====================================================
    // 9. SUMAR DIAGONAL PRINCIPAL
    // =====================================================

    public static int sumarDiagonalPrincipal(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[i][i];
        }

        return suma;
    }


    // =====================================================
    // 10. SUMAR DIAGONAL SECUNDARIA
    // =====================================================

    public static int sumarDiagonalSecundaria(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[i][matriz.length - 1 - i];
        }

        return suma;
    }


    // =====================================================
    // 11. SUMAR CONTORNO
    // =====================================================

    public static int sumarContorno(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 0 ||
                        i == matriz.length - 1 ||
                        j == 0 ||
                        j == matriz[i].length - 1) {

                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }


    // =====================================================
    // 12. DIFERENCIA ENTRE SUMA DE PARES E IMPARES
    // =====================================================

    public static int diferenciaParesImpares(int[][] matriz) {

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                } else {
                    sumaImpares += matriz[i][j];
                }
            }
        }

        return sumaPares - sumaImpares;
    }


    // =====================================================
    // 13. GENERAR COLUMNAS DE LOS EXTREMOS CON 7
    // =====================================================

    public static void generarColumnasExtremos(int dimension) {

        int[][] matriz = new int[dimension][dimension];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 7;
                }
            }
        }

        imprimirMatriz(matriz);
    }


    // =====================================================
    // 14. LLENAR TODO EL PERÍMETRO CON 7
    // =====================================================

    public static void llenarPerimetro(int dimension) {

        int[][] matriz = new int[dimension][dimension];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 0 ||
                        i == matriz.length - 1 ||
                        j == 0 ||
                        j == matriz[i].length - 1) {

                    matriz[i][j] = 7;
                }
            }
        }

        imprimirMatriz(matriz);
    }


    // =====================================================
    // 15. TABLA PITAGÓRICA
    // =====================================================

    public static void tablaPitagorica(int dimension) {

        int[][] matriz = new int[dimension][dimension];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        imprimirMatriz(matriz);
    }
}