package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

import java.util.Scanner;

public class EjerciciosArraysMatrices {

    public static void main(String[] args) {
        sumaVentas();
        promedioTemperaturas();
        notaMasAlta();
        notaMasBaja();
        paresEImpares();
        invertirArray();
        buscarEdad();
        contarRepeticiones();
        segundoMasGrande();
        estaOrdenado();

        mostrarMatriz();
        sumaTotalMatriz();
        diagonalPrincipal();
        diagonalSecundaria();
        sumaPorFilas();
        sumaPorColumnas();
        mayorValorMatriz();
        buscarNumeroMatriz();
        contarVocales();
        taTeTi();
    }

    // =========================
    // EJERCICIOS DE ARRAYS
    // =========================

    public static void sumaVentas() {
        int[] ventas = {120, 85, 200, 150, 90, 180, 210};

        int suma = 0;

        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }

        System.out.println("Suma total de ventas: " + suma);
    }

    public static void promedioTemperaturas() {
        double[] temperaturas = {18.5, 20.0, 17.8, 21.2, 19.4};

        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }

        double promedio = suma / temperaturas.length;

        System.out.println("Promedio de temperaturas: " + promedio);
    }

    public static void notaMasAlta() {
        int[] notas = {78, 95, 62, 88, 74};

        int mayor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }

        System.out.println("Nota más alta: " + mayor);
    }

    public static void notaMasBaja() {
        int[] notas = {78, 95, 62, 88, 74};

        int menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        System.out.println("Nota más baja: " + menor);
    }

    public static void paresEImpares() {
        int[] numeros = {12, 7, 4, 15, 8, 11, 20};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public static void invertirArray() {
        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = aux;
        }

        System.out.print("Array invertido: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }

    public static void buscarEdad() {
        Scanner sc = new Scanner(System.in);

        int[] edades = {18, 25, 30, 22, 40, 35};

        System.out.print("Ingrese una edad: ");
        int edadBuscada = sc.nextInt();

        boolean existe = false;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] == edadBuscada) {
                existe = true;
            }
        }

        if (existe) {
            System.out.println("La edad existe en el array");
        } else {
            System.out.println("La edad no existe en el array");
        }
    }

    public static void contarRepeticiones() {
        int[] numeros = {5, 8, 5, 2, 5, 9, 8};

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 5) {
                contador++;
            }
        }

        System.out.println("El número 5 aparece: " + contador + " veces");
    }

    public static void segundoMasGrande() {
        int[] numeros = {45, 12, 78, 32, 65, 90, 22};

        int mayor = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                segundo = mayor;
                mayor = numeros[i];
            } else if (numeros[i] > segundo && numeros[i] != mayor) {
                segundo = numeros[i];
            }
        }

        System.out.println("Segundo número más grande: " + segundo);
    }

    public static void estaOrdenado() {
        int[] numeros = {10, 20, 30, 40, 50};

        boolean ordenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
            }
        }

        if (ordenado) {
            System.out.println("El array está ordenado ascendentemente");
        } else {
            System.out.println("El array no está ordenado");
        }
    }

    // =========================
    // EJERCICIOS DE MATRICES
    // =========================

    public static void mostrarMatriz() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz:");

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static void sumaTotalMatriz() {
        int[][] matriz = {
                {2, 4, 6},
                {1, 3, 5},
                {7, 8, 9}
        };

        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }
        }

        System.out.println("Suma total de la matriz: " + suma);
    }

    public static void diagonalPrincipal() {
        int[][] matriz = {
                {5, 2, 1},
                {4, 8, 7},
                {3, 6, 9}
        };

        System.out.print("Diagonal principal: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
    }

    public static void diagonalSecundaria() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Diagonal secundaria: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }

        System.out.println();
    }

    public static void sumaPorFilas() {
        int[][] matriz = {
                {2, 3, 4},
                {1, 5, 6},
                {7, 8, 2}
        };

        for (int fila = 0; fila < matriz.length; fila++) {
            int suma = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }

            System.out.println("Suma de fila " + fila + ": " + suma);
        }
    }

    public static void sumaPorColumnas() {
        int[][] matriz = {
                {2, 3, 4},
                {1, 5, 6},
                {7, 8, 2}
        };

        for (int columna = 0; columna < matriz[0].length; columna++) {
            int suma = 0;

            for (int fila = 0; fila < matriz.length; fila++) {
                suma += matriz[fila][columna];
            }

            System.out.println("Suma de columna " + columna + ": " + suma);
        }
    }

    public static void mayorValorMatriz() {
        int[][] matriz = {
                {12, 8, 5},
                {3, 25, 7},
                {14, 2, 10}
        };

        int mayor = matriz[0][0];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] > mayor) {
                    mayor = matriz[fila][columna];
                }
            }
        }

        System.out.println("Mayor valor de la matriz: " + mayor);
    }

    public static void buscarNumeroMatriz() {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                {4, 8, 2},
                {9, 5, 7},
                {1, 6, 3}
        };

        System.out.print("Ingrese un número: ");
        int buscado = sc.nextInt();

        boolean encontrado = false;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == buscado) {
                    System.out.println("Encontrado en fila " + fila + ", columna " + columna);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encontró");
        }
    }

    public static void contarVocales() {
        char[][] letras = {
                {'A', 'B', 'C'},
                {'E', 'F', 'G'},
                {'I', 'O', 'U'}
        };

        int contador = 0;

        for (int fila = 0; fila < letras.length; fila++) {
            for (int columna = 0; columna < letras[fila].length; columna++) {
                char letra = Character.toLowerCase(letras[fila][columna]);

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contador++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }

    public static void taTeTi() {
        char[][] tablero = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', ' ', 'O'}
        };

        boolean ganaX = false;
        boolean ganaO = false;

        // Revisar filas
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == tablero[fila][1] &&
                tablero[fila][1] == tablero[fila][2] &&
                tablero[fila][0] != ' ') {

                if (tablero[fila][0] == 'X') {
                    ganaX = true;
                } else {
                    ganaO = true;
                }
            }
        }

        // Revisar columnas
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == tablero[1][columna] &&
                tablero[1][columna] == tablero[2][columna] &&
                tablero[0][columna] != ' ') {

                if (tablero[0][columna] == 'X') {
                    ganaX = true;
                } else {
                    ganaO = true;
                }
            }
        }

        // Revisar diagonal principal
        if (tablero[0][0] == tablero[1][1] &&
            tablero[1][1] == tablero[2][2] &&
            tablero[0][0] != ' ') {

            if (tablero[0][0] == 'X') {
                ganaX = true;
            } else {
                ganaO = true;
            }
        }

        // Revisar diagonal secundaria
        if (tablero[0][2] == tablero[1][1] &&
            tablero[1][1] == tablero[2][0] &&
            tablero[0][2] != ' ') {

            if (tablero[0][2] == 'X') {
                ganaX = true;
            } else {
                ganaO = true;
            }
        }

        if (ganaX) {
            System.out.println("Ganador: X");
        } else if (ganaO) {
            System.out.println("Ganador: O");
        } else {
            System.out.println("No hay ganador");
        }
    }
}