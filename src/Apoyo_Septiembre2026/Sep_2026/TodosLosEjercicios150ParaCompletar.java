package Apoyo_Septiembre2026.Sep_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 150 ejercicios para completar reunidos en un solo archivo.
 *
 * Uso de ejemplo:
 * TodosLosEjercicios150ParaCompletar.Cadenas.filtrarConAYE(palabras);
 * TodosLosEjercicios150ParaCompletar.Arreglos.invertir(numeros);
 * TodosLosEjercicios150ParaCompletar.Matrices.sumarBordes(matriz);
 * TodosLosEjercicios150ParaCompletar.Excepciones.dividir(10, 2);
 */
public class TodosLosEjercicios150ParaCompletar {

    // =========================================================
    // EXCEPCIONES - 30 EJERCICIOS
    // =========================================================
    public static class Excepciones {

        // EJERCICIO 1: Dividir dos enteros. Si el divisor es cero, devolver 0.
            public static int dividir(int a, int b) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 2: Convertir un texto a entero. Si no es válido, devolver -1.
            public static int convertirEntero(String texto) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 3: Obtener un elemento. Si el índice no existe, devolver -1.
            public static int obtenerElemento(int[] numeros, int indice) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 4: Obtener el largo de un texto. Si es null, devolver 0.
            public static int obtenerLargo(String texto) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 5: Convertir un texto a double. Si falla, devolver 0.0.
            public static double convertirDecimal(String texto) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        
            // EJERCICIO 6: Dividir dos textos convertidos a entero. Controlar ambos errores.
            public static int dividirTextos(String a, String b) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 7: Devolver un carácter. Si texto o posición no son válidos, devolver '?'.
            public static char obtenerCaracter(String texto, int posicion) {
                // TODO: escribí aquí la solución del ejercicio.
                return '\0';
            }
        
            // EJERCICIO 8: Sumar el elemento de dos posiciones; ante un índice inválido, devolver 0.
            public static int sumarPosiciones(int[] numeros, int i, int j) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 9: Obtener una celda de una matriz; ante un índice inválido, devolver -1.
            public static int obtenerCelda(int[][] matriz, int fila, int columna) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 10: Lanzar IllegalArgumentException si la edad es negativa.
            public static void validarEdad(int edad) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        
            // EJERCICIO 11: Lanzar IllegalArgumentException si la nota no está entre 0 y 100.
            public static void validarNota(int nota) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        
            // EJERCICIO 12: Lanzar NullPointerException si el nombre es null.
            public static void validarNombre(String nombre) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        
            // EJERCICIO 13: Convertir a entero y ejecutar siempre un bloque finally.
            public static int convertirConFinally(String texto) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 14: Calcular el promedio; si el array está vacío, controlar la división por cero.
            public static int promedio(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 15: Leer un entero con Scanner; si el tipo es incorrecto, devolver -1.
            public static int leerEntero(Scanner scanner) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 16: Buscar una palabra en una posición; controlar lista null e índice inválido.
            public static String obtenerPalabra(String[] palabras, int indice) {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        
            // EJERCICIO 17: Calcular una raíz; lanzar excepción si el número es negativo.
            public static double raizCuadrada(double numero) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        
            // EJERCICIO 18: Validar que una contraseña tenga al menos 8 caracteres.
            public static void validarContrasena(String clave) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        
            // EJERCICIO 19: Convertir dos números y sumarlos; si alguno falla, devolver 0.
            public static int sumarTextos(String a, String b) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 20: Acceder a vector[vector[1]] y controlar índices fuera de rango.
            public static int accesoIndirecto(int[] vector) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 21: Lanzar una excepción si el saldo a retirar supera el disponible.
            public static double retirar(double saldo, double monto) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        
            // EJERCICIO 22: Pasar texto a mayúsculas; si es null, devolver una cadena vacía.
            public static String mayusculasSeguras(String texto) {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        
            // EJERCICIO 23: Devolver el primer número; controlar array null o vacío.
            public static int primerNumero(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 24: Validar que un precio sea mayor que cero.
            public static void validarPrecio(double precio) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        
            // EJERCICIO 25: Obtener una subcadena; controlar posiciones incorrectas.
            public static String extraer(String texto, int inicio, int fin) {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        
            // EJERCICIO 26: Convertir una posición de un array de textos a entero.
            public static int convertirPosicion(String[] datos, int posicion) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 27: Validar que el divisor no sea cero antes de dividir.
            public static double divisionValidada(double a, double b) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        
            // EJERCICIO 28: Obtener la primera letra del nombre; si no existe, devolver '-'.
            public static char inicial(String nombre) {
                // TODO: escribí aquí la solución del ejercicio.
                return '\0';
            }
        
            // EJERCICIO 29: Comprobar si un texto representa un entero válido.
            public static boolean esEntero(String texto) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        
            // EJERCICIO 30: Probar tres riesgos: array, conversión y división.
            public static int operacionCompleta(String numero, int[] datos, int posicion) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
    }

    // =========================================================
    // CADENAS - 30 EJERCICIOS
    // =========================================================
    public static class Cadenas {

        // EJERCICIO 1: Devolver palabras que contengan las letras "a" y "e".
            public static List<String> filtrarConAYE(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 2: Devolver palabras que comiencen con "a".
            public static List<String> filtrarQueEmpiezanConA(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 3: Devolver palabras que terminen con "s".
            public static List<String> filtrarQueTerminanConS(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 4: Devolver palabras que tengan más de cinco caracteres.
            public static List<String> filtrarLargas(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 5: Devolver palabras que tengan exactamente cuatro caracteres.
            public static List<String> filtrarLargoCuatro(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 6: Devolver palabras que contengan la letra indicada.
            public static List<String> filtrarPorLetra(List<String> palabras, char letra) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 7: Devolver palabras que no contengan la letra "a".
            public static List<String> filtrarSinA(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 8: Devolver cadenas que contengan al menos un número.
            public static List<String> filtrarConNumero(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 9: Devolver cadenas que no contengan números.
            public static List<String> filtrarSinNumeros(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 10: Devolver palabras palíndromas.
            public static List<String> filtrarPalindromos(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 11: Devolver palabras que comiencen y terminen con la misma letra.
            public static List<String> filtrarMismaInicialYFinal(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 12: Devolver palabras que contengan dos o más vocales.
            public static List<String> filtrarConDosVocales(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 13: Devolver palabras que contengan exactamente una vocal.
            public static List<String> filtrarConUnaVocal(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 14: Devolver cadenas que contengan algún espacio.
            public static List<String> filtrarConEspacios(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 15: Devolver cadenas completamente en mayúsculas.
            public static List<String> filtrarMayusculas(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 16: Devolver cadenas completamente en minúsculas.
            public static List<String> filtrarMinusculas(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 17: Devolver palabras cuyo largo sea par.
            public static List<String> filtrarLargoPar(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 18: Devolver palabras cuyo largo sea impar.
            public static List<String> filtrarLargoImpar(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 19: Devolver palabras que tengan el largo mínimo indicado.
            public static List<String> filtrarPorLargoMinimo(List<String> palabras, int minimo) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 20: Devolver palabras cuyo largo esté dentro del rango indicado.
            public static List<String> filtrarPorRangoDeLargo(List<String> palabras, int minimo, int maximo) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 21: Devolver palabras que contengan las cinco vocales.
            public static List<String> filtrarConTodasLasVocales(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 22: Devolver cadenas que contengan una arroba.
            public static List<String> filtrarConArroba(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 23: Devolver correos que terminen en "@gmail.com".
            public static List<String> filtrarCorreosGmail(List<String> correos) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 24: Devolver palabras que tengan una letra repetida seguida.
            public static List<String> filtrarConLetraDoble(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 25: Devolver cadenas que empiecen con un número.
            public static List<String> filtrarQueEmpiezanConNumero(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 26: Devolver cadenas que terminen con un punto.
            public static List<String> filtrarQueTerminanConPunto(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 27: Devolver cadenas sin espacios al principio ni al final.
            public static List<String> filtrarSinEspaciosExternos(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 28: Devolver cadenas que representen enteros positivos.
            public static List<String> filtrarEnterosPositivos(List<String> cadenas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 29: Devolver palabras que contengan la sílaba indicada.
            public static List<String> filtrarPorSilaba(List<String> palabras, String silaba) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
        
            // EJERCICIO 30: Devolver palabras que empiecen con vocal y tengan más de cinco letras.
            public static List<String> filtrarVocalYLargo(List<String> palabras) {
                // TODO: escribí aquí la solución del ejercicio.
                return new ArrayList<>();
            }
    }

    // =========================================================
    // ARRAYS - 30 EJERCICIOS
    // =========================================================
    public static class Arreglos {

        // EJERCICIO 1: Sumar todos los elementos del array.
            public static int sumar(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 2: Contar cuántos números son pares.
            public static int contarPares(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 3: Encontrar el número mayor.
            public static int mayor(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 4: Encontrar el número menor.
            public static int menor(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 5: Crear un nuevo array con los elementos en orden inverso.
            public static int[] invertir(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 6: Invertir el array y sumar 10 a los valores negativos.
            public static int[] invertirYModificarNegativos(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 7: Invertir temperaturas Celsius y convertirlas a Fahrenheit.
            public static int[] procesarTemperaturas(int[] temperaturas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 8: Duplicar solamente los números pares, manteniendo los impares.
            public static int[] duplicarPares(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 9: Contar las apariciones de un valor.
            public static int contarOcurrencias(int[] numeros, int buscado) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 10: Buscar la posición de un número; devolver -1 si no aparece.
            public static int buscarPosicion(int[] numeros, int buscado) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 11: Devolver el último número impar; devolver -1 si no existe.
            public static int ultimoImpar(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 12: Calcular el promedio de los elementos.
            public static double promedio(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        
            // EJERCICIO 13: Crear un array que contenga solamente los números positivos.
            public static int[] obtenerPositivos(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 14: Crear un array sin valores repetidos, conservando el orden.
            public static int[] quitarRepetidos(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 15: Copiar un array multiplicando cada valor por tres.
            public static int[] triplicar(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 16: Sumar solamente los elementos ubicados en posiciones pares.
            public static int sumarPosicionesPares(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 17: Comprobar si el array está ordenado de menor a mayor.
            public static boolean estaOrdenado(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        
            // EJERCICIO 18: Ordenar una copia usando el algoritmo burbuja.
            public static int[] ordenarBurbuja(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 19: Unir dos arrays en uno nuevo.
            public static int[] unir(int[] a, int[] b) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 20: Rotar una posición a la derecha: [1,2,3] -> [3,1,2].
            public static int[] rotarDerecha(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 21: Rotar una posición a la izquierda: [1,2,3] -> [2,3,1].
            public static int[] rotarIzquierda(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 22: Multiplicar los elementos que ocupan la misma posición.
            public static int[] multiplicarArrays(int[] a, int[] b) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 23: Calcular la diferencia entre el mayor y el menor.
            public static int rango(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 24: Cambiar cada número negativo por cero.
            public static int[] negativosACero(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 25: Comprobar si dos arrays contienen exactamente los mismos valores y orden.
            public static boolean sonIguales(int[] a, int[] b) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        
            // EJERCICIO 26: Realizar una búsqueda binaria en un array previamente ordenado.
            public static int busquedaBinaria(int[] numeros, int buscado) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 27: Crear un histograma: cada posición indica la frecuencia de ese número.
            public static int[] histograma(int[] numeros, int maximo) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 28: Devolver el segundo número mayor distinto.
            public static int segundoMayor(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 29: Invertir y duplicar los valores divisibles entre cuatro.
            public static int[] invertirYDuplicarDivisiblesPor4(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 30: Separar pares primero e impares después, manteniendo el orden interno.
            public static int[] paresLuegoImpares(int[] numeros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
    }

    // =========================================================
    // MATRICES - 30 EJERCICIOS
    // =========================================================
    public static class Matrices {

        // EJERCICIO 1: Sumar todos los elementos de la matriz.
            public static int sumarTodo(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 2: Encontrar el valor mayor de la matriz.
            public static int mayor(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 3: Encontrar el valor menor de la matriz.
            public static int menor(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 4: Contar cuántos valores pares contiene la matriz.
            public static int contarPares(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 5: Sumar la diagonal principal de una matriz cuadrada.
            public static int sumarDiagonalPrincipal(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 6: Sumar la diagonal secundaria de una matriz cuadrada.
            public static int sumarDiagonalSecundaria(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 7: Sumar los bordes sin repetir las esquinas.
            public static int sumarBordes(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 8: Devolver la suma de cada fila.
            public static int[] sumarFilas(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 9: Devolver la suma de cada columna.
            public static int[] sumarColumnas(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 10: Calcular la lluvia acumulada de cada columna.
            public static int[] calcularLluviaAcumulada(int[][] registros) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 11: Obtener el mayor valor de cada fila.
            public static int[] mayorPorFila(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 12: Obtener el menor valor de cada columna.
            public static int[] menorPorColumna(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 13: Crear la matriz transpuesta: las filas pasan a ser columnas.
            public static int[][] transponer(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 14: Multiplicar todos los valores por dos.
            public static int[][] duplicarValores(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 15: Reemplazar los números negativos por cero.
            public static int[][] negativosACero(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 16: Contar las apariciones de un valor dentro de la matriz.
            public static int contarOcurrencias(int[][] matriz, int buscado) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 17: Comprobar si un valor está presente.
            public static boolean contiene(int[][] matriz, int buscado) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        
            // EJERCICIO 18: Crear una matriz identidad de tamaño n.
            public static int[][] matrizIdentidad(int n) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 19: Comprobar si una matriz cuadrada es identidad.
            public static boolean esIdentidad(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        
            // EJERCICIO 20: Comprobar si una matriz cuadrada es simétrica.
            public static boolean esSimetrica(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        
            // EJERCICIO 21: Sumar dos matrices de iguales dimensiones.
            public static int[][] sumarMatrices(int[][] a, int[][] b) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 22: Generar una tabla de multiplicar desde 1 hasta n.
            public static int[][] tablaPitagorica(int n) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 23: Invertir el orden de las filas.
            public static int[][] invertirFilas(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 24: Invertir el orden de las columnas.
            public static int[][] invertirColumnas(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0][0];
            }
        
            // EJERCICIO 25: Sumar los elementos que están por encima de la diagonal principal.
            public static int sumarSobreDiagonal(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 26: Sumar los elementos que están por debajo de la diagonal principal.
            public static int sumarBajoDiagonal(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        
            // EJERCICIO 27: Contar ceros de cada fila.
            public static int[] contarCerosPorFila(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 28: Obtener la posición {fila, columna} del mayor valor.
            public static int[] posicionDelMayor(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 29: Convertir la matriz en un array recorriendo fila por fila.
            public static int[] aplanar(int[][] matriz) {
                // TODO: escribí aquí la solución del ejercicio.
                return new int[0];
            }
        
            // EJERCICIO 30: Dibujar el borde con # y el interior con puntos.
            public static char[][] crearMarco(int filas, int columnas) {
                // TODO: escribí aquí la solución del ejercicio.
                return new char[0][0];
            }
    }


    // =========================================================
    // CLASES Y MÉTODOS - 30 EJERCICIOS
    // =========================================================
    public static class Clases {

        // EJERCICIO 1: Crear Alumno. Calcular promedio (double), aprobación (boolean) y mostrar datos (void).
        public static class Alumno {
            private String nombre; private double nota1, nota2;
            public Alumno(String nombre, double nota1, double nota2) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularPromedio() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean puedeAprobar() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public void mostrarDatos() {
                // TODO: escribí aquí la solución del ejercicio.
            }
        }

        // EJERCICIO 2: Crear Producto. Calcular valor del stock y comprobar disponibilidad.
        public static class Producto {
            private String nombre; private double precio; private int stock;
            public Producto(String nombre, double precio, int stock) {
                // TODO: inicializá los atributos usando this.
            }
            public double valorDelStock() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean hayStock() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getStock() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 3: Crear CuentaBancaria. Depositar, retirar y consultar saldo.
        public static class CuentaBancaria {
            private String titular; private double saldo;
            public CuentaBancaria(String titular, double saldo) {
                // TODO: inicializá los atributos usando this.
            }
            public void depositar(double monto) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean retirar(double monto) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public double getSaldo() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        }

        // EJERCICIO 4: Crear Empleado. Calcular salario anual y comprobar si recibe bono.
        public static class Empleado {
            private String nombre; private double salarioMensual; private int antiguedad;
            public Empleado(String nombre, double salarioMensual, int antiguedad) {
                // TODO: inicializá los atributos usando this.
            }
            public double salarioAnual() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean recibeBono() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public String getNombre() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }

        // EJERCICIO 5: Crear Libro. Prestar, devolver y consultar si está disponible.
        public static class Libro {
            private String titulo; private boolean prestado;
            public Libro(String titulo) {
                // TODO: inicializá los atributos usando this.
            }
            public boolean prestar() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public void devolver() {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean estaDisponible() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 6: Crear Rectangulo. Calcular área, perímetro y determinar si es cuadrado.
        public static class Rectangulo {
            private double base, altura;
            public Rectangulo(double base, double altura) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularArea() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public double calcularPerimetro() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean esCuadrado() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 7: Crear Vehiculo. Calcular autonomía y comprobar si necesita combustible.
        public static class Vehiculo {
            private String modelo; private double combustible, consumoPorKm;
            public Vehiculo(String modelo, double combustible, double consumoPorKm) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularAutonomia() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean necesitaCombustible() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public String getModelo() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }

        // EJERCICIO 8: Crear Persona. Comprobar mayoría de edad y calcular año aproximado de nacimiento.
        public static class Persona {
            private String nombre; private int edad;
            public Persona(String nombre, int edad) {
                // TODO: inicializá los atributos usando this.
            }
            public boolean esMayorDeEdad() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int calcularAnioNacimiento(int anioActual) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
            public String presentarse() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }

        // EJERCICIO 9: Crear Temperatura. Convertir Celsius a Fahrenheit y comprobar si hace frío.
        public static class Temperatura {
            private double celsius;
            public Temperatura(double celsius) {
                // TODO: inicializá los atributos usando this.
            }
            public double convertirAFahrenheit() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean haceFrio() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public void aumentar(double grados) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        }

        // EJERCICIO 10: Crear Pedido. Calcular total, cantidad y envío gratuito.
        public static class Pedido {
            private double precioUnitario; private int cantidad;
            public Pedido(double precioUnitario, int cantidad) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularTotal() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public int getCantidad() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
            public boolean tieneEnvioGratis() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 11: Crear Pelicula. Determinar si es larga y si es apta para menores.
        public static class Pelicula {
            private String titulo; private int duracion, edadMinima;
            public Pelicula(String titulo, int duracion, int edadMinima) {
                // TODO: inicializá los atributos usando this.
            }
            public boolean esLarga() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public boolean esAptaPara(int edad) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getDuracion() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 12: Crear Curso. Inscribir estudiantes y comprobar si quedan cupos.
        public static class Curso {
            private String nombre; private int inscriptos, capacidad;
            public Curso(String nombre, int capacidad) {
                // TODO: inicializá los atributos usando this.
            }
            public boolean inscribir() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public boolean hayCupo() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int cuposDisponibles() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 13: Crear Circulo. Calcular área y diámetro.
        public static class Circulo {
            private double radio;
            public Circulo(double radio) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularArea() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public double calcularDiametro() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean esGrande() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 14: Crear Telefono. Cargar batería y comprobar batería baja.
        public static class Telefono {
            private String marca; private int bateria;
            public Telefono(String marca, int bateria) {
                // TODO: inicializá los atributos usando this.
            }
            public void cargar(int porcentaje) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean bateriaBaja() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getBateria() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 15: Crear Mascota. Cumplir años y describir sus datos.
        public static class Mascota {
            private String nombre, especie; private int edad;
            public Mascota(String nombre, String especie, int edad) {
                // TODO: inicializá los atributos usando this.
            }
            public void cumplirAnios() {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean esAdulta() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public String describir() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }

        // EJERCICIO 16: Crear Entrada. Calcular precio con descuento y validar acceso.
        public static class Entrada {
            private double precio; private int edadMinima;
            public Entrada(double precio, int edadMinima) {
                // TODO: inicializá los atributos usando this.
            }
            public double precioConDescuento(double porcentaje) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean permiteAcceso(int edad) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getEdadMinima() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 17: Crear Inventario. Agregar, retirar y consultar unidades.
        public static class Inventario {
            private String articulo; private int unidades;
            public Inventario(String articulo, int unidades) {
                // TODO: inicializá los atributos usando this.
            }
            public void agregar(int cantidad) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean retirar(int cantidad) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getUnidades() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 18: Crear Examen. Calcular porcentaje y determinar aprobación.
        public static class Examen {
            private int correctas, total;
            public Examen(int correctas, int total) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularPorcentaje() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean estaAprobado() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getCorrectas() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 19: Crear Viaje. Calcular costo por persona y comprobar presupuesto.
        public static class Viaje {
            private double costoTotal; private int pasajeros;
            public Viaje(double costoTotal, int pasajeros) {
                // TODO: inicializá los atributos usando this.
            }
            public double costoPorPersona() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean entraEnPresupuesto(double presupuesto) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getPasajeros() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 20: Crear Computadora. Aumentar RAM y comprobar requisito mínimo.
        public static class Computadora {
            private String modelo; private int ram;
            public Computadora(String modelo, int ram) {
                // TODO: inicializá los atributos usando this.
            }
            public void ampliarRam(int cantidad) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean cumpleRequisito(int minimo) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int getRam() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
        }

        // EJERCICIO 21: Crear Jugador. Sumar puntos y comprobar si alcanzó un nivel.
        public static class Jugador {
            private String nombre; private int puntos;
            public Jugador(String nombre, int puntos) {
                // TODO: inicializá los atributos usando this.
            }
            public void sumarPuntos(int cantidad) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public int calcularNivel() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
            public boolean alcanzoNivel(int nivel) {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 22: Crear Factura. Calcular subtotal, IVA y total.
        public static class Factura {
            private double precioUnitario; private int cantidad;
            public Factura(double precioUnitario, int cantidad) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularSubtotal() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public double calcularIva() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public double calcularTotal() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        }

        // EJERCICIO 23: Crear Asistencia. Registrar faltas y determinar si conserva el curso.
        public static class Asistencia {
            private int clases, faltas;
            public Asistencia(int clases, int faltas) {
                // TODO: inicializá los atributos usando this.
            }
            public void registrarFalta() {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public double porcentajeAsistencia() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean puedeAprobar() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 24: Crear Taxi. Calcular precio del viaje y determinar disponibilidad.
        public static class Taxi {
            private double bajadaBandera, precioPorKm; private boolean ocupado;
            public Taxi(double bajadaBandera, double precioPorKm) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularViaje(double kilometros) {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean estaDisponible() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public void setOcupado(boolean ocupado) {
                // TODO: escribí aquí la solución del ejercicio.
            }
        }

        // EJERCICIO 25: Crear Reloj. Avanzar una hora y devolver la hora formateada.
        public static class Reloj {
            private int hora, minuto;
            public Reloj(int hora, int minuto) {
                // TODO: inicializá los atributos usando this.
            }
            public void avanzarHora() {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public String mostrarHora() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
            public boolean esDeNoche() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 26: Crear Cancion. Comprobar duración y convertir segundos a minutos.
        public static class Cancion {
            private String titulo; private int segundos;
            public Cancion(String titulo, int segundos) {
                // TODO: inicializá los atributos usando this.
            }
            public double duracionEnMinutos() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean esLarga() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public String getTitulo() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }

        // EJERCICIO 27: Crear Hotel. Reservar habitaciones y calcular ocupación.
        public static class Hotel {
            private int habitaciones, ocupadas;
            public Hotel(int habitaciones, int ocupadas) {
                // TODO: inicializá los atributos usando this.
            }
            public boolean reservar() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public int disponibles() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0;
            }
            public double porcentajeOcupacion() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
        }

        // EJERCICIO 28: Crear Semaforo. Cambiar color y comprobar si permite avanzar.
        public static class Semaforo {
            private String color;
            public Semaforo(String color) {
                // TODO: inicializá los atributos usando this.
            }
            public void cambiarColor(String nuevoColor) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public boolean puedeAvanzar() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public String getColor() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }

        // EJERCICIO 29: Crear Prestamo. Calcular interés y total a devolver.
        public static class Prestamo {
            private double capital, tasa; private int meses;
            public Prestamo(double capital, double tasa, int meses) {
                // TODO: inicializá los atributos usando this.
            }
            public double calcularInteres() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public double totalADevolver() {
                // TODO: escribí aquí la solución del ejercicio.
                return 0.0;
            }
            public boolean esLargo() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
        }

        // EJERCICIO 30: Crear Usuario. Validar contraseña, cambiar correo y presentarse.
        public static class Usuario {
            private String nombre, correo, contrasena;
            public Usuario(String nombre, String correo, String contrasena) {
                // TODO: inicializá los atributos usando this.
            }
            public boolean contrasenaValida() {
                // TODO: escribí aquí la solución del ejercicio.
                return false;
            }
            public void cambiarCorreo(String nuevoCorreo) {
                // TODO: escribí aquí la solución del ejercicio.
            }
            public String presentarse() {
                // TODO: escribí aquí la solución del ejercicio.
                return null;
            }
        }
    }
}

