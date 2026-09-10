package Apoyo_Septiembre2026.Sep_2026;

import java.util.Arrays;

/**
 * 50 ejercicios resueltos de arrays invertidos.
 *
 * Estructura que se repite:
 * 1) INVERTIR: numeros[numeros.length - 1 - i]
 * 2) COMPROBAR una condición.
 * 3) MODIFICAR el valor cuando corresponda.
 * 4) GUARDAR: resultado[i] = valor.
 */
public class EjerciciosArraysInvertidos {

    /*
     * EJERCICIO 1 - Invertir un array.
     * Letra: devolver un nuevo array con los elementos en orden contrario.
     * Entrada: {1, 2, 3, 4} | Salida: {4, 3, 2, 1}
     */
    public static int[] ejercicio01(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[numeros.length - 1 - i];
        }
        return resultado;
    }

    /*
     * EJERCICIO 2 - Invertir y duplicar los pares.
     * Letra: invertir el array y multiplicar por 2 cada valor par.
     * Entrada: {2, 5, 8, 3} | Salida: {3, 16, 5, 4}
     */
    public static int[] ejercicio02(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 == 0) {
                valor = valor * 2;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 3 - Invertir y triplicar los múltiplos de 3.
     * Letra: invertir el array y multiplicar por 3 cada múltiplo de 3.
     * Entrada: {2, 6, 5, 9} | Salida: {27, 5, 18, 2}
     */
    public static int[] ejercicio03(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 3 == 0) {
                valor = valor * 3;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 4 - Invertir y sumar 10 a los negativos.
     * Letra: invertir el array; si un valor es negativo, sumarle 10.
     * Entrada: {-5, 8, -12, 4} | Salida: {4, -2, 8, 5}
     */
    public static int[] ejercicio04(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor < 0) {
                valor = valor + 10;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 5 - Invertir y sumar 5 a los impares.
     * Letra: invertir el array; si un valor es impar, sumarle 5.
     * Entrada: {1, 4, 7, 2} | Salida: {2, 12, 4, 6}
     */
    public static int[] ejercicio05(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 != 0) {
                valor = valor + 5;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 6 - Invertir y dividir entre 2 los múltiplos de 4.
     * Letra: invertir el array; si un valor es divisible entre 4, dividirlo entre 2.
     * Entrada: {8, 5, 12, 3} | Salida: {3, 6, 5, 4}
     */
    public static int[] ejercicio06(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 4 == 0) {
                valor = valor / 2;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 7 - Invertir y elevar al cuadrado los positivos.
     * Letra: invertir el array; reemplazar cada positivo por su cuadrado.
     * Entrada: {-2, 3, 0, 4} | Salida: {16, 0, 9, -2}
     */
    public static int[] ejercicio07(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor > 0) {
                valor = valor * valor;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 8 - Invertir y reemplazar los ceros.
     * Letra: invertir el array y reemplazar cada 0 por 100.
     * Entrada: {0, 7, 0, 2} | Salida: {2, 100, 7, 100}
     */
    public static int[] ejercicio08(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor == 0) {
                valor = 100;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 9 - Invertir y restar 10 a los mayores que 50.
     * Letra: invertir el array; si un valor es mayor que 50, restarle 10.
     * Entrada: {60, 20, 80} | Salida: {70, 20, 50}
     */
    public static int[] ejercicio09(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor > 50) {
                valor = valor - 10;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 10 - Invertir y duplicar los menores que 20.
     * Letra: invertir el array; duplicar únicamente los valores menores que 20.
     * Entrada: {10, 25, 5} | Salida: {10, 25, 20}
     */
    public static int[] ejercicio10(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor < 20) {
                valor = valor * 2;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 11 - Invertir y sumar 5 a los múltiplos de 5.
     * Letra: invertir el array; sumar 5 a los valores divisibles entre 5.
     * Entrada: {10, 7, 15} | Salida: {20, 7, 15}
     */
    public static int[] ejercicio11(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 5 == 0) {
                valor = valor + 5;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 12 - Invertir y cambiar el signo de los pares.
     * Letra: invertir el array; convertir cada valor par en su opuesto.
     * Entrada: {2, 3, 4} | Salida: {-4, 3, -2}
     */
    public static int[] ejercicio12(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 == 0) {
                valor = -valor;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 13 - Invertir y obtener el valor absoluto.
     * Letra: invertir el array y transformar los negativos en positivos.
     * Entrada: {-3, 5, -8} | Salida: {8, 5, 3}
     */
    public static int[] ejercicio13(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor < 0) {
                valor = -valor;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 14 - Invertir y elevar al cuadrado los impares.
     * Letra: invertir el array; reemplazar cada impar por su cuadrado.
     * Entrada: {3, 4, 5} | Salida: {25, 4, 9}
     */
    public static int[] ejercicio14(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 != 0) {
                valor = valor * valor;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 15 - Invertir y dividir los múltiplos de 10.
     * Letra: invertir el array; dividir entre 10 cada múltiplo de 10.
     * Entrada: {20, 7, 50} | Salida: {5, 7, 2}
     */
    public static int[] ejercicio15(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 10 == 0) {
                valor = valor / 10;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 16 - Invertir y aumentar los valores entre 10 y 30.
     * Letra: invertir; sumar 1 cuando el valor esté entre 10 y 30 inclusive.
     * Entrada: {10, 40, 25} | Salida: {26, 40, 11}
     */
    public static int[] ejercicio16(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor >= 10 && valor <= 30) {
                valor = valor + 1;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 17 - Invertir y anular valores fuera del intervalo.
     * Letra: invertir; reemplazar por 0 los valores menores que -20 o mayores que 20.
     * Entrada: {-30, 10, 25} | Salida: {0, 10, 0}
     */
    public static int[] ejercicio17(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor < -20 || valor > 20) {
                valor = 0;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 18 - Invertir y duplicar los positivos pares.
     * Letra: invertir; duplicar un valor solamente si es positivo Y par.
     * Entrada: {-2, 3, 4} | Salida: {8, 3, -2}
     */
    public static int[] ejercicio18(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor > 0 && valor % 2 == 0) {
                valor = valor * 2;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 19 - Invertir y triplicar los negativos impares.
     * Letra: invertir; triplicar un valor solamente si es negativo Y es impar.
     * Entrada: {-3, -4, 5} | Salida: {5, -4, -9}
     */
    public static int[] ejercicio19(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor < 0 && valor % 2 != 0) {
                valor = valor * 3;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 20 - Invertir y modificar múltiplos de 2 y 3.
     * Letra: invertir; sumar 6 si el valor es divisible entre 2 Y entre 3.
     * Entrada: {6, 8, 12} | Salida: {18, 8, 12}
     */
    public static int[] ejercicio20(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 == 0 && valor % 3 == 0) {
                valor = valor + 6;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 21 - Invertir y modificar múltiplos de 2 o de 5.
     * Letra: invertir; sumar 1 si el valor es divisible entre 2 O entre 5.
     * Entrada: {3, 10, 8} | Salida: {9, 11, 3}
     */
    public static int[] ejercicio21(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 == 0 || valor % 5 == 0) {
                valor = valor + 1;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 22 - Invertir y reducir los no múltiplos de 3.
     * Letra: invertir; restar 1 si el valor NO es divisible entre 3.
     * Entrada: {4, 6, 8} | Salida: {7, 6, 3}
     */
    public static int[] ejercicio22(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 3 != 0) {
                valor = valor - 1;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 23 - Invertir temperaturas y convertir Celsius a Fahrenheit.
     * Letra: invertir un array de grados Celsius y convertir cada valor usando
     * Fahrenheit = Celsius * 9 / 5 + 32.
     * Entrada: {0, 10, 20} | Salida: {68.0, 50.0, 32.0}
     */
    public static double[] ejercicio23(double[] temperaturas) {
        double[] resultado = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            double valor = temperaturas[temperaturas.length - 1 - i];
            valor = valor * 9.0 / 5.0 + 32.0;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 24 - Invertir centímetros y convertirlos a metros.
     * Letra: invertir el array y dividir cada cantidad de centímetros entre 100.
     * Entrada: {100, 250, 400} | Salida: {4.0, 2.5, 1.0}
     */
    public static double[] ejercicio24(double[] centimetros) {
        double[] resultado = new double[centimetros.length];
        for (int i = 0; i < centimetros.length; i++) {
            double valor = centimetros[centimetros.length - 1 - i];
            valor = valor / 100.0;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 25 - Invertir precios y agregar IVA.
     * Letra: invertir los precios y aumentar cada uno un 22%.
     * Fórmula: precioConIVA = precio * 1.22.
     * Entrada: {100, 200} | Salida: {244.0, 122.0}
     */
    public static double[] ejercicio25(double[] precios) {
        double[] resultado = new double[precios.length];
        for (int i = 0; i < precios.length; i++) {
            double valor = precios[precios.length - 1 - i];
            valor = valor * 1.22;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 26 - Invertir precios y aplicar descuento.
     * Letra: invertir; aplicar 10% de descuento a los precios mayores que 100.
     * Entrada: {50, 200} | Salida: {180.0, 50.0}
     */
    public static double[] ejercicio26(double[] precios) {
        double[] resultado = new double[precios.length];
        for (int i = 0; i < precios.length; i++) {
            double valor = precios[precios.length - 1 - i];
            if (valor > 100) {
                valor = valor * 0.90;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 27 - Invertir kilómetros y convertirlos a millas.
     * Letra: invertir el array y multiplicar cada valor por 0.621371.
     * Entrada: {1, 10} | Salida aproximada: {6.21371, 0.621371}
     */
    public static double[] ejercicio27(double[] kilometros) {
        double[] resultado = new double[kilometros.length];
        for (int i = 0; i < kilometros.length; i++) {
            double valor = kilometros[kilometros.length - 1 - i];
            valor = valor * 0.621371;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 28 - Invertir segundos y convertirlos a minutos.
     * Letra: invertir el array y dividir cada cantidad de segundos entre 60.
     * Entrada: {60, 180} | Salida: {3.0, 1.0}
     */
    public static double[] ejercicio28(double[] segundos) {
        double[] resultado = new double[segundos.length];
        for (int i = 0; i < segundos.length; i++) {
            double valor = segundos[segundos.length - 1 - i];
            valor = valor / 60.0;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 29 - Invertir y reemplazar negativos por cero.
     * Letra: invertir el array; todo valor negativo debe convertirse en 0.
     * Entrada: {-2, 5, -7} | Salida: {0, 5, 0}
     */
    public static int[] ejercicio29(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor < 0) {
                valor = 0;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 30 - Invertir notas y ayudar a las insuficientes.
     * Letra: invertir las notas; sumar 1 a cada nota menor que 6.
     * Entrada: {4, 7, 5} | Salida: {6, 7, 5}
     */
    public static int[] ejercicio30(int[] notas) {
        int[] resultado = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            int valor = notas[notas.length - 1 - i];
            if (valor < 6) {
                valor = valor + 1;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 31 - Invertir aplicando dos transformaciones.
     * Letra: invertir; duplicar los pares y triplicar los impares.
     * Entrada: {2, 3, 4} | Salida: {8, 9, 4}
     */
    public static int[] ejercicio31(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 == 0) {
                valor = valor * 2;
            } else {
                valor = valor * 3;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 32 - Invertir y alejar los valores del cero.
     * Letra: invertir; sumar 1 a los positivos, restar 1 a los negativos
     * y dejar los ceros sin cambios.
     * Entrada: {-2, 0, 3} | Salida: {4, 0, -3}
     */
    public static int[] ejercicio32(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor > 0) {
                valor = valor + 1;
            } else if (valor < 0) {
                valor = valor - 1;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 33 - Invertir y anular números pequeños.
     * Letra: invertir; reemplazar por 0 todo valor menor o igual que 10.
     * Entrada: {5, 20, 10} | Salida: {0, 20, 0}
     */
    public static int[] ejercicio33(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor <= 10) {
                valor = 0;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 34 - Invertir y simplificar múltiplos de 7.
     * Letra: invertir; reemplazar cada múltiplo de 7 por el número 7.
     * Entrada: {7, 8, 14} | Salida: {7, 8, 7}
     */
    public static int[] ejercicio34(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 7 == 0) {
                valor = 7;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 35 - Invertir y modificar números terminados en cero.
     * Letra: invertir; sumar 1 a los valores divisibles entre 10.
     * Entrada: {10, 25, 30} | Salida: {31, 25, 11}
     */
    public static int[] ejercicio35(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 10 == 0) {
                valor = valor + 1;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 36 - Invertir y sumar el índice de salida.
     * Letra: invertir y sumar i a cada valor antes de guardarlo.
     * Entrada: {10, 20, 30} | Salida: {30, 21, 12}
     */
    public static int[] ejercicio36(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            valor = valor + i;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 37 - Invertir y restar el índice de salida.
     * Letra: invertir y restar i a cada valor antes de guardarlo.
     * Entrada: {10, 20, 30} | Salida: {30, 19, 8}
     */
    public static int[] ejercicio37(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            valor = valor - i;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 38 - Invertir y multiplicar por la posición.
     * Letra: invertir y multiplicar cada valor por i + 1.
     * Entrada: {2, 3, 4} | Salida: {4, 6, 6}
     */
    public static int[] ejercicio38(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            valor = valor * (i + 1);
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 39 - Invertir y duplicar posiciones pares.
     * Letra: invertir; duplicar el valor cuando su índice de salida i sea par.
     * Entrada: {1, 2, 3, 4} | Salida: {8, 3, 4, 1}
     */
    public static int[] ejercicio39(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (i % 2 == 0) {
                valor = valor * 2;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 40 - Invertir y negar posiciones impares.
     * Letra: invertir; cambiar el signo cuando el índice de salida i sea impar.
     * Entrada: {1, 2, 3, 4} | Salida: {4, -3, 2, -1}
     */
    public static int[] ejercicio40(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (i % 2 != 0) {
                valor = -valor;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 41 - Invertir y comparar valor con índice.
     * Letra: invertir; si el valor es mayor que i, sumarle i.
     * Entrada: {1, 5, 2} | Salida: {2, 6, 1}
     */
    public static int[] ejercicio41(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor > i) {
                valor = valor + i;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 42 - Invertir y marcar la primera posición.
     * Letra: invertir y reemplazar el primer elemento del resultado por 999.
     * Entrada: {1, 2, 3} | Salida: {999, 2, 1}
     */
    public static int[] ejercicio42(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (i == 0) {
                valor = 999;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 43 - Invertir y marcar la última posición.
     * Letra: invertir y reemplazar el último elemento del resultado por -999.
     * Entrada: {1, 2, 3} | Salida: {3, 2, -999}
     */
    public static int[] ejercicio43(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (i == numeros.length - 1) {
                valor = -999;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 44 - Invertir y anular el centro.
     * Letra: para un array de longitud impar, invertir y colocar 0 en el centro.
     * Entrada: {1, 2, 3, 4, 5} | Salida: {5, 4, 0, 2, 1}
     */
    public static int[] ejercicio44(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (i == numeros.length / 2) {
                valor = 0;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 45 - Sumar cada valor con su opuesto.
     * Letra: en resultado[i], guardar numeros[i] más el valor de la posición contraria.
     * Entrada: {1, 2, 3} | Salida: {4, 4, 4}
     */
    public static int[] ejercicio45(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int invertido = numeros[numeros.length - 1 - i];
            resultado[i] = numeros[i] + invertido;
        }
        return resultado;
    }

    /*
     * EJERCICIO 46 - Invertir palabras y convertirlas a mayúsculas.
     * Letra: devolver las palabras en orden contrario y todas en mayúsculas.
     * Entrada: {"hola", "java"} | Salida: {"JAVA", "HOLA"}
     */
    public static String[] ejercicio46(String[] palabras) {
        String[] resultado = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            String valor = palabras[palabras.length - 1 - i];
            valor = valor.toUpperCase();
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 47 - Invertir y poner en mayúsculas palabras largas.
     * Letra: invertir; convertir a mayúsculas solo palabras con más de 5 letras.
     * Entrada: {"gato", "elefante", "sol"} | Salida: {"sol", "ELEFANTE", "gato"}
     */
    public static String[] ejercicio47(String[] palabras) {
        String[] resultado = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            String valor = palabras[palabras.length - 1 - i];
            if (valor.length() > 5) {
                valor = valor.toUpperCase();
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 48 - Invertir caracteres y poner las vocales en mayúscula.
     * Letra: invertir; si el carácter es una vocal, convertirlo a mayúscula.
     * Entrada: {'a', 'b', 'e'} | Salida: {'E', 'b', 'A'}
     */
    public static char[] ejercicio48(char[] caracteres) {
        char[] resultado = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            char valor = caracteres[caracteres.length - 1 - i];
            char minuscula = Character.toLowerCase(valor);
            if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i'
                    || minuscula == 'o' || minuscula == 'u') {
                valor = Character.toUpperCase(valor);
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 49 - Invertir booleanos y negar sus valores.
     * Letra: invertir un array boolean y cambiar true por false y false por true.
     * Entrada: {true, false, true} | Salida: {false, true, false}
     */
    public static boolean[] ejercicio49(boolean[] estados) {
        boolean[] resultado = new boolean[estados.length];
        for (int i = 0; i < estados.length; i++) {
            boolean valor = estados[estados.length - 1 - i];
            valor = !valor;
            resultado[i] = valor;
        }
        return resultado;
    }

    /*
     * EJERCICIO 50 - Desafío final con dos caminos.
     * Letra: invertir; elevar al cuadrado los pares y triplicar los impares.
     * Entrada: {2, 3, 4} | Salida: {16, 9, 4}
     */
    public static int[] ejercicio50(int[] numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[numeros.length - 1 - i];
            if (valor % 2 == 0) {
                valor = valor * valor;
            } else {
                valor = valor * 3;
            }
            resultado[i] = valor;
        }
        return resultado;
    }

    /* Pruebas breves: podés cambiar los datos para practicar. */
    public static void main(String[] args) {
        System.out.println("Ejercicio 1:  "
                + Arrays.toString(ejercicio01(new int[]{1, 2, 3, 4})));
        System.out.println("Ejercicio 2:  "
                + Arrays.toString(ejercicio02(new int[]{2, 5, 8, 3})));
        System.out.println("Ejercicio 4:  "
                + Arrays.toString(ejercicio04(new int[]{-5, 8, -12, 4})));
        System.out.println("Ejercicio 23: "
                + Arrays.toString(ejercicio23(new double[]{0, 10, 20})));
        System.out.println("Ejercicio 50: "
                + Arrays.toString(ejercicio50(new int[]{2, 3, 4})));
    }
}
