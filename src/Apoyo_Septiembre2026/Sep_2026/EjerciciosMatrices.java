package Apoyo_Septiembre2026.Sep_2026;

import java.util.Arrays;

/**
 * 50 ejercicios variados de matrices resueltos.
 * Cada método incluye la letra y la idea principal dentro del código.
 * Se supone que las matrices recibidas no son null y, salvo indicación,
 * tienen al menos una fila y una columna.
 */
public class EjerciciosMatrices {

    /* EJERCICIO 1
       Letra: sumar todos los elementos de una matriz.
       Explicación: recorrer cada fila y cada columna acumulando sus valores. */
    public static int ejercicio01(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) suma += matriz[i][j];
        return suma;
    }

    /* EJERCICIO 2
       Letra: sumar solamente los elementos pares.
       Explicación: un valor es par cuando valor % 2 == 0. */
    public static int ejercicio02(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz)
            for (int valor : fila) if (valor % 2 == 0) suma += valor;
        return suma;
    }

    /* EJERCICIO 3
       Letra: contar cuántos números positivos contiene la matriz.
       Explicación: aumentar el contador cuando el valor sea mayor que cero. */
    public static int ejercicio03(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz)
            for (int valor : fila) if (valor > 0) contador++;
        return contador;
    }

    /* EJERCICIO 4
       Letra: devolver el mayor elemento de la matriz.
       Explicación: comenzar con matriz[0][0] y actualizar el mayor. */
    public static int ejercicio04(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int[] fila : matriz)
            for (int valor : fila) if (valor > mayor) mayor = valor;
        return mayor;
    }

    /* EJERCICIO 5
       Letra: devolver el menor elemento de la matriz.
       Explicación: comparar cada valor con el menor encontrado. */
    public static int ejercicio05(int[][] matriz) {
        int menor = matriz[0][0];
        for (int[] fila : matriz)
            for (int valor : fila) if (valor < menor) menor = valor;
        return menor;
    }

    /* EJERCICIO 6
       Letra: sumar la diagonal principal de una matriz cuadrada.
       Explicación: en la diagonal principal se cumple i == j. */
    public static int ejercicio06(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) suma += matriz[i][i];
        return suma;
    }

    /* EJERCICIO 7
       Letra: sumar la diagonal secundaria de una matriz cuadrada.
       Explicación: la columna contraria es matriz.length - 1 - i. */
    public static int ejercicio07(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++)
            suma += matriz[i][matriz.length - 1 - i];
        return suma;
    }

    /* EJERCICIO 8
       Letra: sumar todos los elementos de los bordes.
       Explicación: es borde si i o j está en la primera o última posición. */
    public static int ejercicio08(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 ||
                        j == 0 || j == matriz[i].length - 1) suma += matriz[i][j];
            }
        }
        return suma;
    }

    /* EJERCICIO 9
       Letra: devolver un array con la suma de cada fila.
       Explicación: resultado[i] guarda la suma de la fila i. */
    public static int[] ejercicio09(int[][] matriz) {
        int[] resultado = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) resultado[i] += matriz[i][j];
        return resultado;
    }

    /* EJERCICIO 10
       Letra: devolver un array con la suma de cada columna.
       Explicación: resultado[j] acumula los valores de la columna j. */
    public static int[] ejercicio10(int[][] matriz) {
        int[] resultado = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) resultado[j] += matriz[i][j];
        return resultado;
    }

    /* EJERCICIO 11
       Letra: obtener el mayor número de cada fila.
       Explicación: reiniciar mayor al comenzar cada nueva fila. */
    public static int[] ejercicio11(int[][] matriz) {
        int[] resultado = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int mayor = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++)
                if (matriz[i][j] > mayor) mayor = matriz[i][j];
            resultado[i] = mayor;
        }
        return resultado;
    }

    /* EJERCICIO 12
       Letra: obtener el menor número de cada columna.
       Explicación: fijar una columna y recorrer todas sus filas. */
    public static int[] ejercicio12(int[][] matriz) {
        int[] resultado = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < matriz.length; i++)
                if (matriz[i][j] < menor) menor = matriz[i][j];
            resultado[j] = menor;
        }
        return resultado;
    }

    /* EJERCICIO 13
       Letra: contar las apariciones de un número buscado.
       Explicación: comparar cada celda con buscado. */
    public static int ejercicio13(int[][] matriz, int buscado) {
        int contador = 0;
        for (int[] fila : matriz)
            for (int valor : fila) if (valor == buscado) contador++;
        return contador;
    }

    /* EJERCICIO 14
       Letra: indicar si un número existe en la matriz.
       Explicación: devolver true en la primera coincidencia. */
    public static boolean ejercicio14(int[][] matriz, int buscado) {
        for (int[] fila : matriz)
            for (int valor : fila) if (valor == buscado) return true;
        return false;
    }

    /* EJERCICIO 15
       Letra: comprobar si una matriz es cuadrada.
       Explicación: cada fila debe tener tantas columnas como filas hay. */
    public static boolean ejercicio15(int[][] matriz) {
        for (int[] fila : matriz) if (fila.length != matriz.length) return false;
        return true;
    }

    /* EJERCICIO 16
       Letra: devolver la matriz transpuesta.
       Explicación: intercambiar posiciones: resultado[j][i] = matriz[i][j]. */
    public static int[][] ejercicio16(int[][] matriz) {
        int[][] resultado = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) resultado[j][i] = matriz[i][j];
        return resultado;
    }

    /* EJERCICIO 17
       Letra: crear otra matriz con todos los valores duplicados.
       Explicación: conservar la posición y multiplicar cada valor por 2. */
    public static int[][] ejercicio17(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) resultado[i][j] = matriz[i][j] * 2;
        return resultado;
    }

    /* EJERCICIO 18
       Letra: copiar la matriz reemplazando los negativos por cero.
       Explicación: usar una condición antes de guardar cada celda. */
    public static int[][] ejercicio18(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                resultado[i][j] = matriz[i][j] < 0 ? 0 : matriz[i][j];
        return resultado;
    }

    /* EJERCICIO 19
       Letra: crear un patrón de ajedrez de 0 y 1.
       Explicación: si (i + j) es par guardar 0; de lo contrario, guardar 1. */
    public static int[][] ejercicio19(int filas, int columnas) {
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++) resultado[i][j] = (i + j) % 2;
        return resultado;
    }

    /* EJERCICIO 20
       Letra: crear una matriz identidad de tamaño n.
       Explicación: guardar 1 cuando i == j; las demás celdas quedan en 0. */
    public static int[][] ejercicio20(int n) {
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) resultado[i][i] = 1;
        return resultado;
    }

    /* EJERCICIO 21
       Letra: comprobar si una matriz cuadrada es simétrica.
       Explicación: matriz[i][j] debe ser igual a matriz[j][i]. */
    public static boolean ejercicio21(int[][] matriz) {
        if (!ejercicio15(matriz)) return false;
        for (int i = 0; i < matriz.length; i++)
            for (int j = i + 1; j < matriz.length; j++)
                if (matriz[i][j] != matriz[j][i]) return false;
        return true;
    }

    /* EJERCICIO 22
       Letra: elevar al cuadrado todos los elementos.
       Explicación: multiplicar cada valor por sí mismo. */
    public static int[][] ejercicio22(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                resultado[i][j] = matriz[i][j] * matriz[i][j];
        return resultado;
    }

    /* EJERCICIO 23
       Letra: sumar los valores ubicados encima de la diagonal principal.
       Explicación: encima de la diagonal se cumple j > i. */
    public static int ejercicio23(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++)
            for (int j = i + 1; j < matriz[i].length; j++) suma += matriz[i][j];
        return suma;
    }

    /* EJERCICIO 24
       Letra: sumar los valores ubicados debajo de la diagonal principal.
       Explicación: debajo de la diagonal se cumple i > j. */
    public static int ejercicio24(int[][] matriz) {
        int suma = 0;
        for (int i = 1; i < matriz.length; i++)
            for (int j = 0; j < i && j < matriz[i].length; j++) suma += matriz[i][j];
        return suma;
    }

    /* EJERCICIO 25
       Letra: contar números pares en la diagonal principal.
       Explicación: revisar únicamente matriz[i][i]. */
    public static int ejercicio25(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++)
            if (matriz[i][i] % 2 == 0) contador++;
        return contador;
    }

    /* EJERCICIO 26
       Letra: invertir horizontalmente cada fila.
       Explicación: tomar la columna contraria con length - 1 - j. */
    public static int[][] ejercicio26(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                resultado[i][j] = matriz[i][matriz[i].length - 1 - j];
        return resultado;
    }

    /* EJERCICIO 27
       Letra: invertir verticalmente el orden de las filas.
       Explicación: tomar la fila contraria con length - 1 - i. */
    public static int[][] ejercicio27(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                resultado[i][j] = matriz[matriz.length - 1 - i][j];
        return resultado;
    }

    /* EJERCICIO 28
       Letra: girar una matriz 180 grados.
       Explicación: invertir simultáneamente filas y columnas. */
    public static int[][] ejercicio28(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                resultado[i][j] = matriz[matriz.length - 1 - i][matriz[i].length - 1 - j];
        return resultado;
    }

    /* EJERCICIO 29
       Letra: intercambiar dos filas indicadas.
       Explicación: copiar la matriz y cambiar filaA por filaB. */
    public static int[][] ejercicio29(int[][] matriz, int filaA, int filaB) {
        int[][] resultado = copiar(matriz);
        int[] temporal = resultado[filaA];
        resultado[filaA] = resultado[filaB];
        resultado[filaB] = temporal;
        return resultado;
    }

    /* EJERCICIO 30
       Letra: intercambiar dos columnas indicadas.
       Explicación: en cada fila intercambiar columnaA y columnaB. */
    public static int[][] ejercicio30(int[][] matriz, int columnaA, int columnaB) {
        int[][] resultado = copiar(matriz);
        for (int i = 0; i < resultado.length; i++) {
            int temporal = resultado[i][columnaA];
            resultado[i][columnaA] = resultado[i][columnaB];
            resultado[i][columnaB] = temporal;
        }
        return resultado;
    }

    /* EJERCICIO 31
       Letra: contar cuántos ceros hay en cada fila.
       Explicación: resultado[i] es el contador correspondiente a la fila i. */
    public static int[] ejercicio31(int[][] matriz) {
        int[] resultado = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++)
            for (int valor : matriz[i]) if (valor == 0) resultado[i]++;
        return resultado;
    }

    /* EJERCICIO 32
       Letra: devolver el índice de la fila con mayor suma.
       Explicación: calcular cada suma y conservar su índice si supera al mayor. */
    public static int ejercicio32(int[][] matriz) {
        int indiceMayor = 0;
        int mayorSuma = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int valor : matriz[i]) suma += valor;
            if (suma > mayorSuma) {
                mayorSuma = suma;
                indiceMayor = i;
            }
        }
        return indiceMayor;
    }

    /* EJERCICIO 33
       Letra: devolver el índice de la columna con mayor suma.
       Explicación: fijar una columna j y sumar todas sus filas. */
    public static int ejercicio33(int[][] matriz) {
        int indiceMayor = 0;
        int mayorSuma = Integer.MIN_VALUE;
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) suma += matriz[i][j];
            if (suma > mayorSuma) {
                mayorSuma = suma;
                indiceMayor = j;
            }
        }
        return indiceMayor;
    }

    /* EJERCICIO 34
       Letra: sumar únicamente las cuatro esquinas.
       Explicación: acceder directamente a primera/última fila y columna. */
    public static int ejercicio34(int[][] matriz) {
        int ultimaFila = matriz.length - 1;
        int ultimaColumna = matriz[0].length - 1;
        if (ultimaFila == 0 && ultimaColumna == 0) return matriz[0][0];
        if (ultimaFila == 0) return matriz[0][0] + matriz[0][ultimaColumna];
        if (ultimaColumna == 0) return matriz[0][0] + matriz[ultimaFila][0];
        return matriz[0][0] + matriz[0][ultimaColumna]
                + matriz[ultimaFila][0] + matriz[ultimaFila][ultimaColumna];
    }

    /* EJERCICIO 35
       Letra: calcular el promedio general.
       Explicación: dividir la suma total entre la cantidad total de celdas. */
    public static double ejercicio35(int[][] matriz) {
        int suma = 0;
        int cantidad = 0;
        for (int[] fila : matriz)
            for (int valor : fila) { suma += valor; cantidad++; }
        return (double) suma / cantidad;
    }

    /* EJERCICIO 36
       Letra: calcular el promedio de cada fila.
       Explicación: sumar la fila y dividir entre su cantidad de columnas. */
    public static double[] ejercicio36(int[][] matriz) {
        double[] resultado = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int valor : matriz[i]) suma += valor;
            resultado[i] = (double) suma / matriz[i].length;
        }
        return resultado;
    }

    /* EJERCICIO 37
       Letra: calcular el promedio de cada columna.
       Explicación: sumar una columna y dividir entre la cantidad de filas. */
    public static double[] ejercicio37(int[][] matriz) {
        double[] resultado = new double[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) suma += matriz[i][j];
            resultado[j] = (double) suma / matriz.length;
        }
        return resultado;
    }

    /* EJERCICIO 38
       Letra: copiar la matriz duplicando solamente los números pares.
       Explicación: comprobar valor % 2 == 0 antes de guardar. */
    public static int[][] ejercicio38(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];
                if (valor % 2 == 0) valor *= 2;
                resultado[i][j] = valor;
            }
        }
        return resultado;
    }

    /* EJERCICIO 39
       Letra: convertir una matriz Celsius a Fahrenheit.
       Explicación: usar F = C * 9.0 / 5.0 + 32 en cada celda. */
    public static double[][] ejercicio39(double[][] celsius) {
        double[][] resultado = new double[celsius.length][celsius[0].length];
        for (int i = 0; i < celsius.length; i++)
            for (int j = 0; j < celsius[i].length; j++)
                resultado[i][j] = celsius[i][j] * 9.0 / 5.0 + 32.0;
        return resultado;
    }

    /* EJERCICIO 40
       Letra: crear una matriz boolean que indique qué valores superan un límite.
       Explicación: guardar directamente el resultado de valor > limite. */
    public static boolean[][] ejercicio40(int[][] matriz, int limite) {
        boolean[][] resultado = new boolean[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                resultado[i][j] = matriz[i][j] > limite;
        return resultado;
    }

    /* EJERCICIO 41
       Letra: convertir una matriz en un array recorriendo por filas.
       Explicación: calcular posición = i * cantidadColumnas + j. */
    public static int[] ejercicio41(int[][] matriz) {
        int columnas = matriz[0].length;
        int[] resultado = new int[matriz.length * columnas];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < columnas; j++)
                resultado[i * columnas + j] = matriz[i][j];
        return resultado;
    }

    /* EJERCICIO 42
       Letra: convertir un array en una matriz de filas y columnas dadas.
       Explicación: leer numeros[i * columnas + j] para cada celda. */
    public static int[][] ejercicio42(int[] numeros, int filas, int columnas) {
        if (numeros.length != filas * columnas)
            throw new IllegalArgumentException("El tamaño no coincide");
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                resultado[i][j] = numeros[i * columnas + j];
        return resultado;
    }

    /* EJERCICIO 43
       Letra: sumar una matriz irregular, cuyas filas tienen distintos tamaños.
       Explicación: for-each permite recorrer cada fila sin asumir su longitud. */
    public static int ejercicio43(int[][] matrizIrregular) {
        int suma = 0;
        for (int[] fila : matrizIrregular)
            for (int valor : fila) suma += valor;
        return suma;
    }

    /* EJERCICIO 44
       Letra: crear una tabla de multiplicar de tamaño n por n.
       Explicación: guardar (i + 1) * (j + 1) en cada posición. */
    public static int[][] ejercicio44(int n) {
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) resultado[i][j] = (i + 1) * (j + 1);
        return resultado;
    }

    /* EJERCICIO 45
       Letra: recorrer el borde en sentido horario y devolverlo como array.
       Explicación: recorrer arriba, derecha, abajo al revés e izquierda al revés. */
    public static int[] ejercicio45(int[][] matriz) {
        int filas = matriz.length, columnas = matriz[0].length;
        if (filas == 1) return Arrays.copyOf(matriz[0], columnas);
        if (columnas == 1) {
            int[] borde = new int[filas];
            for (int i = 0; i < filas; i++) borde[i] = matriz[i][0];
            return borde;
        }
        int[] borde = new int[2 * filas + 2 * columnas - 4];
        int k = 0;
        for (int j = 0; j < columnas; j++) borde[k++] = matriz[0][j];
        for (int i = 1; i < filas; i++) borde[k++] = matriz[i][columnas - 1];
        for (int j = columnas - 2; j >= 0; j--) borde[k++] = matriz[filas - 1][j];
        for (int i = filas - 2; i > 0; i--) borde[k++] = matriz[i][0];
        return borde;
    }

    /* EJERCICIO 46
       Letra: contar cuántos vecinos tiene una celda indicada.
       Explicación: revisar las 8 posiciones cercanas sin salir de la matriz. */
    public static int ejercicio46(int[][] matriz, int fila, int columna) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                boolean dentro = i >= 0 && i < matriz.length &&
                        j >= 0 && j < matriz[0].length;
                if (dentro && !(i == fila && j == columna)) contador++;
            }
        }
        return contador;
    }

    /* EJERCICIO 47
       Letra: indicar si una celda es mayor que todos sus vecinos.
       Explicación: si algún vecino es mayor o igual, devolver false. */
    public static boolean ejercicio47(int[][] matriz, int fila, int columna) {
        int centro = matriz[fila][columna];
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                boolean dentro = i >= 0 && i < matriz.length &&
                        j >= 0 && j < matriz[0].length;
                if (dentro && !(i == fila && j == columna) && matriz[i][j] >= centro)
                    return false;
            }
        }
        return true;
    }

    /* EJERCICIO 48
       Letra: comprobar si existe una línea ganadora en un tatetí 3x3.
       Explicación: revisar 3 filas, 3 columnas y 2 diagonales; '-' es vacío. */
    public static boolean ejercicio48(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1]
                    && tablero[i][1] == tablero[i][2]) return true;
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i]
                    && tablero[1][i] == tablero[2][i]) return true;
        }
        return tablero[1][1] != '-' &&
                ((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) ||
                 (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]));
    }

    /* EJERCICIO 49
       Letra: comprobar si una matriz cuadrada es un cuadrado mágico.
       Explicación: filas, columnas y diagonales deben tener la misma suma. */
    public static boolean ejercicio49(int[][] matriz) {
        if (!ejercicio15(matriz)) return false;
        int objetivo = ejercicio06(matriz);
        if (ejercicio07(matriz) != objetivo) return false;
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0, sumaColumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != objetivo || sumaColumna != objetivo) return false;
        }
        return true;
    }

    /* EJERCICIO 50
       Letra: devolver la fila y columna donde está el mayor elemento.
       Explicación: resultado[0] es la fila y resultado[1] es la columna. */
    public static int[] ejercicio50(int[][] matriz) {
        int mayor = matriz[0][0], filaMayor = 0, columnaMayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }
        return new int[]{filaMayor, columnaMayor};
    }

    /* Método de apoyo para copiar sin modificar la matriz original. */
    private static int[][] copiar(int[][] matriz) {
        int[][] copia = new int[matriz.length][];
        for (int i = 0; i < matriz.length; i++)
            copia[i] = Arrays.copyOf(matriz[i], matriz[i].length);
        return copia;
    }

    /* Casos de prueba: cambiá los datos para seguir practicando. */
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Suma total: " + ejercicio01(matriz));
        System.out.println("Diagonal principal: " + ejercicio06(matriz));
        System.out.println("Diagonal secundaria: " + ejercicio07(matriz));
        System.out.println("Suma de bordes: " + ejercicio08(matriz));
        System.out.println("Mayor por fila: " + Arrays.toString(ejercicio11(matriz)));
        System.out.println("Matriz invertida horizontalmente:");
        imprimir(ejercicio26(matriz));
        System.out.println("Posición del mayor: " + Arrays.toString(ejercicio50(matriz)));
    }

    private static void imprimir(int[][] matriz) {
        for (int[] fila : matriz) System.out.println(Arrays.toString(fila));
    }
}
