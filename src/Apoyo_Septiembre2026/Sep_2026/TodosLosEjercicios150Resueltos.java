package Apoyo_Septiembre2026.Sep_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 150 ejercicios resueltos reunidos en un solo archivo.
 *
 * Uso de ejemplo:
 * TodosLosEjercicios150Resueltos.Cadenas.filtrarConAYE(palabras);
 * TodosLosEjercicios150Resueltos.Arreglos.invertir(numeros);
 * TodosLosEjercicios150Resueltos.Matrices.sumarBordes(matriz);
 * TodosLosEjercicios150Resueltos.Excepciones.dividir(10, 2);
 */
public class TodosLosEjercicios150Resueltos {

    // =========================================================
    // EXCEPCIONES - 30 EJERCICIOS
    // =========================================================
    public static class Excepciones {

        // EJERCICIO 1: Dividir dos enteros. Si el divisor es cero, devolver 0.
            public static int dividir(int a, int b) {
                try { return a / b; }
                catch (ArithmeticException e) { return 0; }
            }
        
            // EJERCICIO 2: Convertir un texto a entero. Si no es válido, devolver -1.
            public static int convertirEntero(String texto) {
                try { return Integer.parseInt(texto); }
                catch (NumberFormatException e) { return -1; }
            }
        
            // EJERCICIO 3: Obtener un elemento. Si el índice no existe, devolver -1.
            public static int obtenerElemento(int[] numeros, int indice) {
                try { return numeros[indice]; }
                catch (ArrayIndexOutOfBoundsException e) { return -1; }
            }
        
            // EJERCICIO 4: Obtener el largo de un texto. Si es null, devolver 0.
            public static int obtenerLargo(String texto) {
                try { return texto.length(); }
                catch (NullPointerException e) { return 0; }
            }
        
            // EJERCICIO 5: Convertir un texto a double. Si falla, devolver 0.0.
            public static double convertirDecimal(String texto) {
                try { return Double.parseDouble(texto); }
                catch (NumberFormatException e) { return 0.0; }
            }
        
            // EJERCICIO 6: Dividir dos textos convertidos a entero. Controlar ambos errores.
            public static int dividirTextos(String a, String b) {
                try { return Integer.parseInt(a) / Integer.parseInt(b); }
                catch (NumberFormatException | ArithmeticException e) { return 0; }
            }
        
            // EJERCICIO 7: Devolver un carácter. Si texto o posición no son válidos, devolver '?'.
            public static char obtenerCaracter(String texto, int posicion) {
                try { return texto.charAt(posicion); }
                catch (NullPointerException | StringIndexOutOfBoundsException e) { return '?'; }
            }
        
            // EJERCICIO 8: Sumar el elemento de dos posiciones; ante un índice inválido, devolver 0.
            public static int sumarPosiciones(int[] numeros, int i, int j) {
                try { return numeros[i] + numeros[j]; }
                catch (ArrayIndexOutOfBoundsException e) { return 0; }
            }
        
            // EJERCICIO 9: Obtener una celda de una matriz; ante un índice inválido, devolver -1.
            public static int obtenerCelda(int[][] matriz, int fila, int columna) {
                try { return matriz[fila][columna]; }
                catch (ArrayIndexOutOfBoundsException e) { return -1; }
            }
        
            // EJERCICIO 10: Lanzar IllegalArgumentException si la edad es negativa.
            public static void validarEdad(int edad) {
                if (edad < 0) throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        
            // EJERCICIO 11: Lanzar IllegalArgumentException si la nota no está entre 0 y 100.
            public static void validarNota(int nota) {
                if (nota < 0 || nota > 100) throw new IllegalArgumentException("Nota fuera de rango");
            }
        
            // EJERCICIO 12: Lanzar NullPointerException si el nombre es null.
            public static void validarNombre(String nombre) {
                if (nombre == null) throw new NullPointerException("El nombre no puede ser null");
            }
        
            // EJERCICIO 13: Convertir a entero y ejecutar siempre un bloque finally.
            public static int convertirConFinally(String texto) {
                try { return Integer.parseInt(texto); }
                catch (NumberFormatException e) { return 0; }
                finally { System.out.println("Conversión finalizada"); }
            }
        
            // EJERCICIO 14: Calcular el promedio; si el array está vacío, controlar la división por cero.
            public static int promedio(int[] numeros) {
                int suma = 0;
                for (int numero : numeros) suma += numero;
                try { return suma / numeros.length; }
                catch (ArithmeticException e) { return 0; }
            }
        
            // EJERCICIO 15: Leer un entero con Scanner; si el tipo es incorrecto, devolver -1.
            public static int leerEntero(Scanner scanner) {
                try { return scanner.nextInt(); }
                catch (InputMismatchException e) { scanner.nextLine(); return -1; }
            }
        
            // EJERCICIO 16: Buscar una palabra en una posición; controlar lista null e índice inválido.
            public static String obtenerPalabra(String[] palabras, int indice) {
                try { return palabras[indice]; }
                catch (NullPointerException | ArrayIndexOutOfBoundsException e) { return "No disponible"; }
            }
        
            // EJERCICIO 17: Calcular una raíz; lanzar excepción si el número es negativo.
            public static double raizCuadrada(double numero) {
                if (numero < 0) throw new IllegalArgumentException("No existe raíz real");
                return Math.sqrt(numero);
            }
        
            // EJERCICIO 18: Validar que una contraseña tenga al menos 8 caracteres.
            public static void validarContrasena(String clave) {
                if (clave == null || clave.length() < 8)
                    throw new IllegalArgumentException("Contraseña demasiado corta");
            }
        
            // EJERCICIO 19: Convertir dos números y sumarlos; si alguno falla, devolver 0.
            public static int sumarTextos(String a, String b) {
                try { return Integer.parseInt(a) + Integer.parseInt(b); }
                catch (NumberFormatException e) { return 0; }
            }
        
            // EJERCICIO 20: Acceder a vector[vector[1]] y controlar índices fuera de rango.
            public static int accesoIndirecto(int[] vector) {
                try { return vector[vector[1]]; }
                catch (NullPointerException | ArrayIndexOutOfBoundsException e) { return -1; }
            }
        
            // EJERCICIO 21: Lanzar una excepción si el saldo a retirar supera el disponible.
            public static double retirar(double saldo, double monto) {
                if (monto > saldo) throw new IllegalArgumentException("Saldo insuficiente");
                if (monto < 0) throw new IllegalArgumentException("Monto inválido");
                return saldo - monto;
            }
        
            // EJERCICIO 22: Pasar texto a mayúsculas; si es null, devolver una cadena vacía.
            public static String mayusculasSeguras(String texto) {
                try { return texto.toUpperCase(); }
                catch (NullPointerException e) { return ""; }
            }
        
            // EJERCICIO 23: Devolver el primer número; controlar array null o vacío.
            public static int primerNumero(int[] numeros) {
                try { return numeros[0]; }
                catch (NullPointerException | ArrayIndexOutOfBoundsException e) { return 0; }
            }
        
            // EJERCICIO 24: Validar que un precio sea mayor que cero.
            public static void validarPrecio(double precio) {
                if (precio <= 0) throw new IllegalArgumentException("El precio debe ser positivo");
            }
        
            // EJERCICIO 25: Obtener una subcadena; controlar posiciones incorrectas.
            public static String extraer(String texto, int inicio, int fin) {
                try { return texto.substring(inicio, fin); }
                catch (NullPointerException | IndexOutOfBoundsException e) { return ""; }
            }
        
            // EJERCICIO 26: Convertir una posición de un array de textos a entero.
            public static int convertirPosicion(String[] datos, int posicion) {
                try { return Integer.parseInt(datos[posicion]); }
                catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException e) { return -1; }
            }
        
            // EJERCICIO 27: Validar que el divisor no sea cero antes de dividir.
            public static double divisionValidada(double a, double b) {
                if (b == 0) throw new IllegalArgumentException("El divisor no puede ser cero");
                return a / b;
            }
        
            // EJERCICIO 28: Obtener la primera letra del nombre; si no existe, devolver '-'.
            public static char inicial(String nombre) {
                try { return nombre.charAt(0); }
                catch (NullPointerException | StringIndexOutOfBoundsException e) { return '-'; }
            }
        
            // EJERCICIO 29: Comprobar si un texto representa un entero válido.
            public static boolean esEntero(String texto) {
                try { Integer.parseInt(texto); return true; }
                catch (NumberFormatException e) { return false; }
            }
        
            // EJERCICIO 30: Probar tres riesgos: array, conversión y división.
            public static int operacionCompleta(String numero, int[] datos, int posicion) {
                try { return datos[posicion] / Integer.parseInt(numero); }
                catch (NullPointerException | ArrayIndexOutOfBoundsException |
                       NumberFormatException | ArithmeticException e) { return 0; }
            }
    }

    // =========================================================
    // CADENAS - 30 EJERCICIOS
    // =========================================================
    public static class Cadenas {

        // EJERCICIO 1: Devolver palabras que contengan las letras "a" y "e".
            public static List<String> filtrarConAYE(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    String p = palabra.toLowerCase();
                    if (p.contains("a") && p.contains("e")) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 2: Devolver palabras que comiencen con "a".
            public static List<String> filtrarQueEmpiezanConA(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.toLowerCase().startsWith("a")) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 3: Devolver palabras que terminen con "s".
            public static List<String> filtrarQueTerminanConS(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.toLowerCase().endsWith("s")) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 4: Devolver palabras que tengan más de cinco caracteres.
            public static List<String> filtrarLargas(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.length() > 5) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 5: Devolver palabras que tengan exactamente cuatro caracteres.
            public static List<String> filtrarLargoCuatro(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.length() == 4) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 6: Devolver palabras que contengan la letra indicada.
            public static List<String> filtrarPorLetra(List<String> palabras, char letra) {
                List<String> resultado = new ArrayList<>();
                String buscada = String.valueOf(letra).toLowerCase();
                for (String palabra : palabras)
                    if (palabra.toLowerCase().contains(buscada)) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 7: Devolver palabras que no contengan la letra "a".
            public static List<String> filtrarSinA(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (!palabra.toLowerCase().contains("a")) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 8: Devolver cadenas que contengan al menos un número.
            public static List<String> filtrarConNumero(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (cadena.matches(".*\\d.*")) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 9: Devolver cadenas que no contengan números.
            public static List<String> filtrarSinNumeros(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (!cadena.matches(".*\\d.*")) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 10: Devolver palabras palíndromas.
            public static List<String> filtrarPalindromos(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    String p = palabra.toLowerCase();
                    String invertida = new StringBuilder(p).reverse().toString();
                    if (p.equals(invertida)) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 11: Devolver palabras que comiencen y terminen con la misma letra.
            public static List<String> filtrarMismaInicialYFinal(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    String p = palabra.toLowerCase();
                    if (!p.isEmpty() && p.charAt(0) == p.charAt(p.length() - 1)) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 12: Devolver palabras que contengan dos o más vocales.
            public static List<String> filtrarConDosVocales(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    int vocales = 0;
                    for (char letra : palabra.toLowerCase().toCharArray())
                        if ("aeiouáéíóú".indexOf(letra) >= 0) vocales++;
                    if (vocales >= 2) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 13: Devolver palabras que contengan exactamente una vocal.
            public static List<String> filtrarConUnaVocal(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    int vocales = 0;
                    for (char letra : palabra.toLowerCase().toCharArray())
                        if ("aeiouáéíóú".indexOf(letra) >= 0) vocales++;
                    if (vocales == 1) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 14: Devolver cadenas que contengan algún espacio.
            public static List<String> filtrarConEspacios(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (cadena.contains(" ")) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 15: Devolver cadenas completamente en mayúsculas.
            public static List<String> filtrarMayusculas(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (!cadena.isEmpty() && cadena.equals(cadena.toUpperCase())) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 16: Devolver cadenas completamente en minúsculas.
            public static List<String> filtrarMinusculas(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (!cadena.isEmpty() && cadena.equals(cadena.toLowerCase())) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 17: Devolver palabras cuyo largo sea par.
            public static List<String> filtrarLargoPar(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.length() % 2 == 0) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 18: Devolver palabras cuyo largo sea impar.
            public static List<String> filtrarLargoImpar(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.length() % 2 != 0) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 19: Devolver palabras que tengan el largo mínimo indicado.
            public static List<String> filtrarPorLargoMinimo(List<String> palabras, int minimo) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.length() >= minimo) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 20: Devolver palabras cuyo largo esté dentro del rango indicado.
            public static List<String> filtrarPorRangoDeLargo(List<String> palabras, int minimo, int maximo) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.length() >= minimo && palabra.length() <= maximo) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 21: Devolver palabras que contengan las cinco vocales.
            public static List<String> filtrarConTodasLasVocales(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    String p = palabra.toLowerCase();
                    if (p.contains("a") && p.contains("e") && p.contains("i")
                            && p.contains("o") && p.contains("u")) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 22: Devolver cadenas que contengan una arroba.
            public static List<String> filtrarConArroba(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (cadena.contains("@")) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 23: Devolver correos que terminen en "@gmail.com".
            public static List<String> filtrarCorreosGmail(List<String> correos) {
                List<String> resultado = new ArrayList<>();
                for (String correo : correos)
                    if (correo.toLowerCase().endsWith("@gmail.com")) resultado.add(correo);
                return resultado;
            }
        
            // EJERCICIO 24: Devolver palabras que tengan una letra repetida seguida.
            public static List<String> filtrarConLetraDoble(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    boolean tieneDoble = false;
                    String p = palabra.toLowerCase();
                    for (int i = 0; i < p.length() - 1; i++)
                        if (p.charAt(i) == p.charAt(i + 1)) tieneDoble = true;
                    if (tieneDoble) resultado.add(palabra);
                }
                return resultado;
            }
        
            // EJERCICIO 25: Devolver cadenas que empiecen con un número.
            public static List<String> filtrarQueEmpiezanConNumero(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (!cadena.isEmpty() && Character.isDigit(cadena.charAt(0))) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 26: Devolver cadenas que terminen con un punto.
            public static List<String> filtrarQueTerminanConPunto(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (cadena.endsWith(".")) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 27: Devolver cadenas sin espacios al principio ni al final.
            public static List<String> filtrarSinEspaciosExternos(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (cadena.equals(cadena.trim())) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 28: Devolver cadenas que representen enteros positivos.
            public static List<String> filtrarEnterosPositivos(List<String> cadenas) {
                List<String> resultado = new ArrayList<>();
                for (String cadena : cadenas)
                    if (cadena.matches("[1-9]\\d*")) resultado.add(cadena);
                return resultado;
            }
        
            // EJERCICIO 29: Devolver palabras que contengan la sílaba indicada.
            public static List<String> filtrarPorSilaba(List<String> palabras, String silaba) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras)
                    if (palabra.toLowerCase().contains(silaba.toLowerCase())) resultado.add(palabra);
                return resultado;
            }
        
            // EJERCICIO 30: Devolver palabras que empiecen con vocal y tengan más de cinco letras.
            public static List<String> filtrarVocalYLargo(List<String> palabras) {
                List<String> resultado = new ArrayList<>();
                for (String palabra : palabras) {
                    String p = palabra.toLowerCase();
                    boolean empiezaConVocal = !p.isEmpty() && "aeiouáéíóú".indexOf(p.charAt(0)) >= 0;
                    if (empiezaConVocal && palabra.length() > 5) resultado.add(palabra);
                }
                return resultado;
            }
    }

    // =========================================================
    // ARRAYS - 30 EJERCICIOS
    // =========================================================
    public static class Arreglos {

        // EJERCICIO 1: Sumar todos los elementos del array.
            public static int sumar(int[] numeros) {
                int suma = 0;
                for (int numero : numeros) suma += numero;
                return suma;
            }
        
            // EJERCICIO 2: Contar cuántos números son pares.
            public static int contarPares(int[] numeros) {
                int cantidad = 0;
                for (int numero : numeros) if (numero % 2 == 0) cantidad++;
                return cantidad;
            }
        
            // EJERCICIO 3: Encontrar el número mayor.
            public static int mayor(int[] numeros) {
                int mayor = numeros[0];
                for (int numero : numeros) if (numero > mayor) mayor = numero;
                return mayor;
            }
        
            // EJERCICIO 4: Encontrar el número menor.
            public static int menor(int[] numeros) {
                int menor = numeros[0];
                for (int numero : numeros) if (numero < menor) menor = numero;
                return menor;
            }
        
            // EJERCICIO 5: Crear un nuevo array con los elementos en orden inverso.
            public static int[] invertir(int[] numeros) {
                int[] resultado = new int[numeros.length];
                for (int i = 0; i < numeros.length; i++)
                    resultado[i] = numeros[numeros.length - 1 - i];
                return resultado;
            }
        
            // EJERCICIO 6: Invertir el array y sumar 10 a los valores negativos.
            public static int[] invertirYModificarNegativos(int[] numeros) {
                int[] resultado = new int[numeros.length];
                for (int i = 0; i < numeros.length; i++) {
                    int valor = numeros[numeros.length - 1 - i];
                    if (valor < 0) valor += 10;
                    resultado[i] = valor;
                }
                return resultado;
            }
        
            // EJERCICIO 7: Invertir temperaturas Celsius y convertirlas a Fahrenheit.
            public static int[] procesarTemperaturas(int[] temperaturas) {
                int[] resultado = new int[temperaturas.length];
                for (int i = 0; i < temperaturas.length; i++) {
                    int celsius = temperaturas[temperaturas.length - 1 - i];
                    resultado[i] = celsius * 9 / 5 + 32;
                }
                return resultado;
            }
        
            // EJERCICIO 8: Duplicar solamente los números pares, manteniendo los impares.
            public static int[] duplicarPares(int[] numeros) {
                int[] resultado = new int[numeros.length];
                for (int i = 0; i < numeros.length; i++)
                    resultado[i] = numeros[i] % 2 == 0 ? numeros[i] * 2 : numeros[i];
                return resultado;
            }
        
            // EJERCICIO 9: Contar las apariciones de un valor.
            public static int contarOcurrencias(int[] numeros, int buscado) {
                int cantidad = 0;
                for (int numero : numeros) if (numero == buscado) cantidad++;
                return cantidad;
            }
        
            // EJERCICIO 10: Buscar la posición de un número; devolver -1 si no aparece.
            public static int buscarPosicion(int[] numeros, int buscado) {
                for (int i = 0; i < numeros.length; i++) if (numeros[i] == buscado) return i;
                return -1;
            }
        
            // EJERCICIO 11: Devolver el último número impar; devolver -1 si no existe.
            public static int ultimoImpar(int[] numeros) {
                for (int i = numeros.length - 1; i >= 0; i--) if (numeros[i] % 2 != 0) return numeros[i];
                return -1;
            }
        
            // EJERCICIO 12: Calcular el promedio de los elementos.
            public static double promedio(int[] numeros) {
                return numeros.length == 0 ? 0 : (double) sumar(numeros) / numeros.length;
            }
        
            // EJERCICIO 13: Crear un array que contenga solamente los números positivos.
            public static int[] obtenerPositivos(int[] numeros) {
                int cantidad = 0;
                for (int n : numeros) if (n > 0) cantidad++;
                int[] resultado = new int[cantidad];
                int j = 0;
                for (int n : numeros) if (n > 0) resultado[j++] = n;
                return resultado;
            }
        
            // EJERCICIO 14: Crear un array sin valores repetidos, conservando el orden.
            public static int[] quitarRepetidos(int[] numeros) {
                int[] temporal = new int[numeros.length];
                int cantidad = 0;
                for (int n : numeros) {
                    boolean existe = false;
                    for (int i = 0; i < cantidad; i++) if (temporal[i] == n) existe = true;
                    if (!existe) temporal[cantidad++] = n;
                }
                return Arrays.copyOf(temporal, cantidad);
            }
        
            // EJERCICIO 15: Copiar un array multiplicando cada valor por tres.
            public static int[] triplicar(int[] numeros) {
                int[] resultado = new int[numeros.length];
                for (int i = 0; i < numeros.length; i++) resultado[i] = numeros[i] * 3;
                return resultado;
            }
        
            // EJERCICIO 16: Sumar solamente los elementos ubicados en posiciones pares.
            public static int sumarPosicionesPares(int[] numeros) {
                int suma = 0;
                for (int i = 0; i < numeros.length; i += 2) suma += numeros[i];
                return suma;
            }
        
            // EJERCICIO 17: Comprobar si el array está ordenado de menor a mayor.
            public static boolean estaOrdenado(int[] numeros) {
                for (int i = 1; i < numeros.length; i++) if (numeros[i] < numeros[i - 1]) return false;
                return true;
            }
        
            // EJERCICIO 18: Ordenar una copia usando el algoritmo burbuja.
            public static int[] ordenarBurbuja(int[] numeros) {
                int[] resultado = Arrays.copyOf(numeros, numeros.length);
                for (int i = 0; i < resultado.length - 1; i++) {
                    for (int j = 0; j < resultado.length - 1 - i; j++) {
                        if (resultado[j] > resultado[j + 1]) {
                            int auxiliar = resultado[j];
                            resultado[j] = resultado[j + 1];
                            resultado[j + 1] = auxiliar;
                        }
                    }
                }
                return resultado;
            }
        
            // EJERCICIO 19: Unir dos arrays en uno nuevo.
            public static int[] unir(int[] a, int[] b) {
                int[] resultado = new int[a.length + b.length];
                for (int i = 0; i < a.length; i++) resultado[i] = a[i];
                for (int i = 0; i < b.length; i++) resultado[a.length + i] = b[i];
                return resultado;
            }
        
            // EJERCICIO 20: Rotar una posición a la derecha: [1,2,3] -> [3,1,2].
            public static int[] rotarDerecha(int[] numeros) {
                if (numeros.length == 0) return new int[0];
                int[] resultado = new int[numeros.length];
                resultado[0] = numeros[numeros.length - 1];
                for (int i = 1; i < numeros.length; i++) resultado[i] = numeros[i - 1];
                return resultado;
            }
        
            // EJERCICIO 21: Rotar una posición a la izquierda: [1,2,3] -> [2,3,1].
            public static int[] rotarIzquierda(int[] numeros) {
                if (numeros.length == 0) return new int[0];
                int[] resultado = new int[numeros.length];
                for (int i = 0; i < numeros.length - 1; i++) resultado[i] = numeros[i + 1];
                resultado[numeros.length - 1] = numeros[0];
                return resultado;
            }
        
            // EJERCICIO 22: Multiplicar los elementos que ocupan la misma posición.
            public static int[] multiplicarArrays(int[] a, int[] b) {
                int largo = Math.min(a.length, b.length);
                int[] resultado = new int[largo];
                for (int i = 0; i < largo; i++) resultado[i] = a[i] * b[i];
                return resultado;
            }
        
            // EJERCICIO 23: Calcular la diferencia entre el mayor y el menor.
            public static int rango(int[] numeros) { return mayor(numeros) - menor(numeros); }
        
            // EJERCICIO 24: Cambiar cada número negativo por cero.
            public static int[] negativosACero(int[] numeros) {
                int[] resultado = Arrays.copyOf(numeros, numeros.length);
                for (int i = 0; i < resultado.length; i++) if (resultado[i] < 0) resultado[i] = 0;
                return resultado;
            }
        
            // EJERCICIO 25: Comprobar si dos arrays contienen exactamente los mismos valores y orden.
            public static boolean sonIguales(int[] a, int[] b) { return Arrays.equals(a, b); }
        
            // EJERCICIO 26: Realizar una búsqueda binaria en un array previamente ordenado.
            public static int busquedaBinaria(int[] numeros, int buscado) {
                int izquierda = 0, derecha = numeros.length - 1;
                while (izquierda <= derecha) {
                    int medio = (izquierda + derecha) / 2;
                    if (numeros[medio] == buscado) return medio;
                    if (numeros[medio] < buscado) izquierda = medio + 1;
                    else derecha = medio - 1;
                }
                return -1;
            }
        
            // EJERCICIO 27: Crear un histograma: cada posición indica la frecuencia de ese número.
            public static int[] histograma(int[] numeros, int maximo) {
                int[] frecuencias = new int[maximo + 1];
                for (int numero : numeros) if (numero >= 0 && numero <= maximo) frecuencias[numero]++;
                return frecuencias;
            }
        
            // EJERCICIO 28: Devolver el segundo número mayor distinto.
            public static int segundoMayor(int[] numeros) {
                int mayor = Integer.MIN_VALUE, segundo = Integer.MIN_VALUE;
                for (int n : numeros) {
                    if (n > mayor) { segundo = mayor; mayor = n; }
                    else if (n > segundo && n != mayor) segundo = n;
                }
                return segundo;
            }
        
            // EJERCICIO 29: Invertir y duplicar los valores divisibles entre cuatro.
            public static int[] invertirYDuplicarDivisiblesPor4(int[] numeros) {
                int[] resultado = new int[numeros.length];
                for (int i = 0; i < numeros.length; i++) {
                    int valor = numeros[numeros.length - 1 - i];
                    resultado[i] = valor % 4 == 0 ? valor * 2 : valor;
                }
                return resultado;
            }
        
            // EJERCICIO 30: Separar pares primero e impares después, manteniendo el orden interno.
            public static int[] paresLuegoImpares(int[] numeros) {
                int[] resultado = new int[numeros.length];
                int j = 0;
                for (int n : numeros) if (n % 2 == 0) resultado[j++] = n;
                for (int n : numeros) if (n % 2 != 0) resultado[j++] = n;
                return resultado;
            }
    }

    // =========================================================
    // MATRICES - 30 EJERCICIOS
    // =========================================================
    public static class Matrices {

        // EJERCICIO 1: Sumar todos los elementos de la matriz.
            public static int sumarTodo(int[][] matriz) {
                int suma = 0;
                for (int[] fila : matriz) for (int valor : fila) suma += valor;
                return suma;
            }
        
            // EJERCICIO 2: Encontrar el valor mayor de la matriz.
            public static int mayor(int[][] matriz) {
                int mayor = matriz[0][0];
                for (int[] fila : matriz) for (int valor : fila) if (valor > mayor) mayor = valor;
                return mayor;
            }
        
            // EJERCICIO 3: Encontrar el valor menor de la matriz.
            public static int menor(int[][] matriz) {
                int menor = matriz[0][0];
                for (int[] fila : matriz) for (int valor : fila) if (valor < menor) menor = valor;
                return menor;
            }
        
            // EJERCICIO 4: Contar cuántos valores pares contiene la matriz.
            public static int contarPares(int[][] matriz) {
                int cantidad = 0;
                for (int[] fila : matriz) for (int valor : fila) if (valor % 2 == 0) cantidad++;
                return cantidad;
            }
        
            // EJERCICIO 5: Sumar la diagonal principal de una matriz cuadrada.
            public static int sumarDiagonalPrincipal(int[][] matriz) {
                int suma = 0;
                for (int i = 0; i < matriz.length; i++) suma += matriz[i][i];
                return suma;
            }
        
            // EJERCICIO 6: Sumar la diagonal secundaria de una matriz cuadrada.
            public static int sumarDiagonalSecundaria(int[][] matriz) {
                int suma = 0;
                for (int i = 0; i < matriz.length; i++) suma += matriz[i][matriz.length - 1 - i];
                return suma;
            }
        
            // EJERCICIO 7: Sumar los bordes sin repetir las esquinas.
            public static int sumarBordes(int[][] matriz) {
                int suma = 0;
                int ultimaFila = matriz.length - 1;
                int ultimaColumna = matriz[0].length - 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == 0 || i == ultimaFila || j == 0 || j == ultimaColumna) suma += matriz[i][j];
                    }
                }
                return suma;
            }
        
            // EJERCICIO 8: Devolver la suma de cada fila.
            public static int[] sumarFilas(int[][] matriz) {
                int[] resultado = new int[matriz.length];
                for (int i = 0; i < matriz.length; i++)
                    for (int valor : matriz[i]) resultado[i] += valor;
                return resultado;
            }
        
            // EJERCICIO 9: Devolver la suma de cada columna.
            public static int[] sumarColumnas(int[][] matriz) {
                int[] resultado = new int[matriz[0].length];
                for (int j = 0; j < matriz[0].length; j++)
                    for (int i = 0; i < matriz.length; i++) resultado[j] += matriz[i][j];
                return resultado;
            }
        
            // EJERCICIO 10: Calcular la lluvia acumulada de cada columna.
            public static int[] calcularLluviaAcumulada(int[][] registros) { return sumarColumnas(registros); }
        
            // EJERCICIO 11: Obtener el mayor valor de cada fila.
            public static int[] mayorPorFila(int[][] matriz) {
                int[] resultado = new int[matriz.length];
                for (int i = 0; i < matriz.length; i++) {
                    resultado[i] = matriz[i][0];
                    for (int valor : matriz[i]) if (valor > resultado[i]) resultado[i] = valor;
                }
                return resultado;
            }
        
            // EJERCICIO 12: Obtener el menor valor de cada columna.
            public static int[] menorPorColumna(int[][] matriz) {
                int[] resultado = new int[matriz[0].length];
                for (int j = 0; j < matriz[0].length; j++) {
                    resultado[j] = matriz[0][j];
                    for (int i = 1; i < matriz.length; i++) if (matriz[i][j] < resultado[j]) resultado[j] = matriz[i][j];
                }
                return resultado;
            }
        
            // EJERCICIO 13: Crear la matriz transpuesta: las filas pasan a ser columnas.
            public static int[][] transponer(int[][] matriz) {
                int[][] resultado = new int[matriz[0].length][matriz.length];
                for (int i = 0; i < matriz.length; i++)
                    for (int j = 0; j < matriz[i].length; j++) resultado[j][i] = matriz[i][j];
                return resultado;
            }
        
            // EJERCICIO 14: Multiplicar todos los valores por dos.
            public static int[][] duplicarValores(int[][] matriz) {
                int[][] resultado = new int[matriz.length][matriz[0].length];
                for (int i = 0; i < matriz.length; i++)
                    for (int j = 0; j < matriz[i].length; j++) resultado[i][j] = matriz[i][j] * 2;
                return resultado;
            }
        
            // EJERCICIO 15: Reemplazar los números negativos por cero.
            public static int[][] negativosACero(int[][] matriz) {
                int[][] resultado = new int[matriz.length][matriz[0].length];
                for (int i = 0; i < matriz.length; i++)
                    for (int j = 0; j < matriz[i].length; j++) resultado[i][j] = Math.max(0, matriz[i][j]);
                return resultado;
            }
        
            // EJERCICIO 16: Contar las apariciones de un valor dentro de la matriz.
            public static int contarOcurrencias(int[][] matriz, int buscado) {
                int cantidad = 0;
                for (int[] fila : matriz) for (int valor : fila) if (valor == buscado) cantidad++;
                return cantidad;
            }
        
            // EJERCICIO 17: Comprobar si un valor está presente.
            public static boolean contiene(int[][] matriz, int buscado) {
                for (int[] fila : matriz) for (int valor : fila) if (valor == buscado) return true;
                return false;
            }
        
            // EJERCICIO 18: Crear una matriz identidad de tamaño n.
            public static int[][] matrizIdentidad(int n) {
                int[][] resultado = new int[n][n];
                for (int i = 0; i < n; i++) resultado[i][i] = 1;
                return resultado;
            }
        
            // EJERCICIO 19: Comprobar si una matriz cuadrada es identidad.
            public static boolean esIdentidad(int[][] matriz) {
                if (matriz.length != matriz[0].length) return false;
                for (int i = 0; i < matriz.length; i++)
                    for (int j = 0; j < matriz.length; j++)
                        if (matriz[i][j] != (i == j ? 1 : 0)) return false;
                return true;
            }
        
            // EJERCICIO 20: Comprobar si una matriz cuadrada es simétrica.
            public static boolean esSimetrica(int[][] matriz) {
                if (matriz.length != matriz[0].length) return false;
                for (int i = 0; i < matriz.length; i++)
                    for (int j = i + 1; j < matriz.length; j++)
                        if (matriz[i][j] != matriz[j][i]) return false;
                return true;
            }
        
            // EJERCICIO 21: Sumar dos matrices de iguales dimensiones.
            public static int[][] sumarMatrices(int[][] a, int[][] b) {
                int[][] resultado = new int[a.length][a[0].length];
                for (int i = 0; i < a.length; i++)
                    for (int j = 0; j < a[i].length; j++) resultado[i][j] = a[i][j] + b[i][j];
                return resultado;
            }
        
            // EJERCICIO 22: Generar una tabla de multiplicar desde 1 hasta n.
            public static int[][] tablaPitagorica(int n) {
                int[][] tabla = new int[n][n];
                for (int i = 0; i < n; i++)
                    for (int j = 0; j < n; j++) tabla[i][j] = (i + 1) * (j + 1);
                return tabla;
            }
        
            // EJERCICIO 23: Invertir el orden de las filas.
            public static int[][] invertirFilas(int[][] matriz) {
                int[][] resultado = new int[matriz.length][matriz[0].length];
                for (int i = 0; i < matriz.length; i++)
                    for (int j = 0; j < matriz[i].length; j++) resultado[i][j] = matriz[matriz.length - 1 - i][j];
                return resultado;
            }
        
            // EJERCICIO 24: Invertir el orden de las columnas.
            public static int[][] invertirColumnas(int[][] matriz) {
                int[][] resultado = new int[matriz.length][matriz[0].length];
                for (int i = 0; i < matriz.length; i++)
                    for (int j = 0; j < matriz[i].length; j++) resultado[i][j] = matriz[i][matriz[i].length - 1 - j];
                return resultado;
            }
        
            // EJERCICIO 25: Sumar los elementos que están por encima de la diagonal principal.
            public static int sumarSobreDiagonal(int[][] matriz) {
                int suma = 0;
                for (int i = 0; i < matriz.length; i++)
                    for (int j = i + 1; j < matriz[i].length; j++) suma += matriz[i][j];
                return suma;
            }
        
            // EJERCICIO 26: Sumar los elementos que están por debajo de la diagonal principal.
            public static int sumarBajoDiagonal(int[][] matriz) {
                int suma = 0;
                for (int i = 1; i < matriz.length; i++)
                    for (int j = 0; j < i && j < matriz[i].length; j++) suma += matriz[i][j];
                return suma;
            }
        
            // EJERCICIO 27: Contar ceros de cada fila.
            public static int[] contarCerosPorFila(int[][] matriz) {
                int[] resultado = new int[matriz.length];
                for (int i = 0; i < matriz.length; i++)
                    for (int valor : matriz[i]) if (valor == 0) resultado[i]++;
                return resultado;
            }
        
            // EJERCICIO 28: Obtener la posición {fila, columna} del mayor valor.
            public static int[] posicionDelMayor(int[][] matriz) {
                int filaMayor = 0, columnaMayor = 0;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (matriz[i][j] > matriz[filaMayor][columnaMayor]) {
                            filaMayor = i;
                            columnaMayor = j;
                        }
                    }
                }
                return new int[]{filaMayor, columnaMayor};
            }
        
            // EJERCICIO 29: Convertir la matriz en un array recorriendo fila por fila.
            public static int[] aplanar(int[][] matriz) {
                int total = 0;
                for (int[] fila : matriz) total += fila.length;
                int[] resultado = new int[total];
                int k = 0;
                for (int[] fila : matriz) for (int valor : fila) resultado[k++] = valor;
                return resultado;
            }
        
            // EJERCICIO 30: Dibujar el borde con # y el interior con puntos.
            public static char[][] crearMarco(int filas, int columnas) {
                char[][] marco = new char[filas][columnas];
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        boolean esBorde = i == 0 || i == filas - 1 || j == 0 || j == columnas - 1;
                        marco[i][j] = esBorde ? '#' : '.';
                    }
                }
                return marco;
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
                this.nombre = nombre; this.nota1 = nota1; this.nota2 = nota2;
            }
            public double calcularPromedio() { return (nota1 + nota2) / 2; }
            public boolean puedeAprobar() { return calcularPromedio() >= 6; }
            public void mostrarDatos() { System.out.println(nombre + " - " + calcularPromedio()); }
        }

        // EJERCICIO 2: Crear Producto. Calcular valor del stock y comprobar disponibilidad.
        public static class Producto {
            private String nombre; private double precio; private int stock;
            public Producto(String nombre, double precio, int stock) {
                this.nombre = nombre; this.precio = precio; this.stock = stock;
            }
            public double valorDelStock() { return precio * stock; }
            public boolean hayStock() { return stock > 0; }
            public int getStock() { return stock; }
        }

        // EJERCICIO 3: Crear CuentaBancaria. Depositar, retirar y consultar saldo.
        public static class CuentaBancaria {
            private String titular; private double saldo;
            public CuentaBancaria(String titular, double saldo) { this.titular = titular; this.saldo = saldo; }
            public void depositar(double monto) { if (monto > 0) saldo += monto; }
            public boolean retirar(double monto) {
                if (monto > 0 && monto <= saldo) { saldo -= monto; return true; }
                return false;
            }
            public double getSaldo() { return saldo; }
        }

        // EJERCICIO 4: Crear Empleado. Calcular salario anual y comprobar si recibe bono.
        public static class Empleado {
            private String nombre; private double salarioMensual; private int antiguedad;
            public Empleado(String nombre, double salarioMensual, int antiguedad) {
                this.nombre = nombre; this.salarioMensual = salarioMensual; this.antiguedad = antiguedad;
            }
            public double salarioAnual() { return salarioMensual * 12; }
            public boolean recibeBono() { return antiguedad >= 5; }
            public String getNombre() { return nombre; }
        }

        // EJERCICIO 5: Crear Libro. Prestar, devolver y consultar si está disponible.
        public static class Libro {
            private String titulo; private boolean prestado;
            public Libro(String titulo) { this.titulo = titulo; this.prestado = false; }
            public boolean prestar() {
                if (!prestado) { prestado = true; return true; }
                return false;
            }
            public void devolver() { prestado = false; }
            public boolean estaDisponible() { return !prestado; }
        }

        // EJERCICIO 6: Crear Rectangulo. Calcular área, perímetro y determinar si es cuadrado.
        public static class Rectangulo {
            private double base, altura;
            public Rectangulo(double base, double altura) { this.base = base; this.altura = altura; }
            public double calcularArea() { return base * altura; }
            public double calcularPerimetro() { return 2 * (base + altura); }
            public boolean esCuadrado() { return base == altura; }
        }

        // EJERCICIO 7: Crear Vehiculo. Calcular autonomía y comprobar si necesita combustible.
        public static class Vehiculo {
            private String modelo; private double combustible, consumoPorKm;
            public Vehiculo(String modelo, double combustible, double consumoPorKm) {
                this.modelo = modelo; this.combustible = combustible; this.consumoPorKm = consumoPorKm;
            }
            public double calcularAutonomia() { return consumoPorKm == 0 ? 0 : combustible / consumoPorKm; }
            public boolean necesitaCombustible() { return combustible < 10; }
            public String getModelo() { return modelo; }
        }

        // EJERCICIO 8: Crear Persona. Comprobar mayoría de edad y calcular año aproximado de nacimiento.
        public static class Persona {
            private String nombre; private int edad;
            public Persona(String nombre, int edad) { this.nombre = nombre; this.edad = edad; }
            public boolean esMayorDeEdad() { return edad >= 18; }
            public int calcularAnioNacimiento(int anioActual) { return anioActual - edad; }
            public String presentarse() { return "Soy " + nombre + " y tengo " + edad + " años"; }
        }

        // EJERCICIO 9: Crear Temperatura. Convertir Celsius a Fahrenheit y comprobar si hace frío.
        public static class Temperatura {
            private double celsius;
            public Temperatura(double celsius) { this.celsius = celsius; }
            public double convertirAFahrenheit() { return celsius * 9 / 5 + 32; }
            public boolean haceFrio() { return celsius < 10; }
            public void aumentar(double grados) { celsius += grados; }
        }

        // EJERCICIO 10: Crear Pedido. Calcular total, cantidad y envío gratuito.
        public static class Pedido {
            private double precioUnitario; private int cantidad;
            public Pedido(double precioUnitario, int cantidad) {
                this.precioUnitario = precioUnitario; this.cantidad = cantidad;
            }
            public double calcularTotal() { return precioUnitario * cantidad; }
            public int getCantidad() { return cantidad; }
            public boolean tieneEnvioGratis() { return calcularTotal() >= 1000; }
        }

        // EJERCICIO 11: Crear Pelicula. Determinar si es larga y si es apta para menores.
        public static class Pelicula {
            private String titulo; private int duracion, edadMinima;
            public Pelicula(String titulo, int duracion, int edadMinima) {
                this.titulo = titulo; this.duracion = duracion; this.edadMinima = edadMinima;
            }
            public boolean esLarga() { return duracion > 120; }
            public boolean esAptaPara(int edad) { return edad >= edadMinima; }
            public int getDuracion() { return duracion; }
        }

        // EJERCICIO 12: Crear Curso. Inscribir estudiantes y comprobar si quedan cupos.
        public static class Curso {
            private String nombre; private int inscriptos, capacidad;
            public Curso(String nombre, int capacidad) { this.nombre = nombre; this.capacidad = capacidad; }
            public boolean inscribir() {
                if (hayCupo()) { inscriptos++; return true; }
                return false;
            }
            public boolean hayCupo() { return inscriptos < capacidad; }
            public int cuposDisponibles() { return capacidad - inscriptos; }
        }

        // EJERCICIO 13: Crear Circulo. Calcular área y diámetro.
        public static class Circulo {
            private double radio;
            public Circulo(double radio) { this.radio = radio; }
            public double calcularArea() { return Math.PI * radio * radio; }
            public double calcularDiametro() { return radio * 2; }
            public boolean esGrande() { return radio > 10; }
        }

        // EJERCICIO 14: Crear Telefono. Cargar batería y comprobar batería baja.
        public static class Telefono {
            private String marca; private int bateria;
            public Telefono(String marca, int bateria) { this.marca = marca; this.bateria = bateria; }
            public void cargar(int porcentaje) { bateria = Math.min(100, bateria + porcentaje); }
            public boolean bateriaBaja() { return bateria < 20; }
            public int getBateria() { return bateria; }
        }

        // EJERCICIO 15: Crear Mascota. Cumplir años y describir sus datos.
        public static class Mascota {
            private String nombre, especie; private int edad;
            public Mascota(String nombre, String especie, int edad) {
                this.nombre = nombre; this.especie = especie; this.edad = edad;
            }
            public void cumplirAnios() { edad++; }
            public boolean esAdulta() { return edad >= 2; }
            public String describir() { return nombre + " es un/a " + especie + " de " + edad + " años"; }
        }

        // EJERCICIO 16: Crear Entrada. Calcular precio con descuento y validar acceso.
        public static class Entrada {
            private double precio; private int edadMinima;
            public Entrada(double precio, int edadMinima) { this.precio = precio; this.edadMinima = edadMinima; }
            public double precioConDescuento(double porcentaje) { return precio * (1 - porcentaje / 100); }
            public boolean permiteAcceso(int edad) { return edad >= edadMinima; }
            public int getEdadMinima() { return edadMinima; }
        }

        // EJERCICIO 17: Crear Inventario. Agregar, retirar y consultar unidades.
        public static class Inventario {
            private String articulo; private int unidades;
            public Inventario(String articulo, int unidades) { this.articulo = articulo; this.unidades = unidades; }
            public void agregar(int cantidad) { if (cantidad > 0) unidades += cantidad; }
            public boolean retirar(int cantidad) {
                if (cantidad > 0 && cantidad <= unidades) { unidades -= cantidad; return true; }
                return false;
            }
            public int getUnidades() { return unidades; }
        }

        // EJERCICIO 18: Crear Examen. Calcular porcentaje y determinar aprobación.
        public static class Examen {
            private int correctas, total;
            public Examen(int correctas, int total) { this.correctas = correctas; this.total = total; }
            public double calcularPorcentaje() { return total == 0 ? 0 : correctas * 100.0 / total; }
            public boolean estaAprobado() { return calcularPorcentaje() >= 60; }
            public int getCorrectas() { return correctas; }
        }

        // EJERCICIO 19: Crear Viaje. Calcular costo por persona y comprobar presupuesto.
        public static class Viaje {
            private double costoTotal; private int pasajeros;
            public Viaje(double costoTotal, int pasajeros) { this.costoTotal = costoTotal; this.pasajeros = pasajeros; }
            public double costoPorPersona() { return pasajeros == 0 ? 0 : costoTotal / pasajeros; }
            public boolean entraEnPresupuesto(double presupuesto) { return costoTotal <= presupuesto; }
            public int getPasajeros() { return pasajeros; }
        }

        // EJERCICIO 20: Crear Computadora. Aumentar RAM y comprobar requisito mínimo.
        public static class Computadora {
            private String modelo; private int ram;
            public Computadora(String modelo, int ram) { this.modelo = modelo; this.ram = ram; }
            public void ampliarRam(int cantidad) { if (cantidad > 0) ram += cantidad; }
            public boolean cumpleRequisito(int minimo) { return ram >= minimo; }
            public int getRam() { return ram; }
        }

        // EJERCICIO 21: Crear Jugador. Sumar puntos y comprobar si alcanzó un nivel.
        public static class Jugador {
            private String nombre; private int puntos;
            public Jugador(String nombre, int puntos) { this.nombre = nombre; this.puntos = puntos; }
            public void sumarPuntos(int cantidad) { if (cantidad > 0) puntos += cantidad; }
            public int calcularNivel() { return puntos / 100 + 1; }
            public boolean alcanzoNivel(int nivel) { return calcularNivel() >= nivel; }
        }

        // EJERCICIO 22: Crear Factura. Calcular subtotal, IVA y total.
        public static class Factura {
            private double precioUnitario; private int cantidad;
            public Factura(double precioUnitario, int cantidad) {
                this.precioUnitario = precioUnitario; this.cantidad = cantidad;
            }
            public double calcularSubtotal() { return precioUnitario * cantidad; }
            public double calcularIva() { return calcularSubtotal() * 0.22; }
            public double calcularTotal() { return calcularSubtotal() + calcularIva(); }
        }

        // EJERCICIO 23: Crear Asistencia. Registrar faltas y determinar si conserva el curso.
        public static class Asistencia {
            private int clases, faltas;
            public Asistencia(int clases, int faltas) { this.clases = clases; this.faltas = faltas; }
            public void registrarFalta() { faltas++; }
            public double porcentajeAsistencia() {
                return clases == 0 ? 0 : (clases - faltas) * 100.0 / clases;
            }
            public boolean puedeAprobar() { return porcentajeAsistencia() >= 75; }
        }

        // EJERCICIO 24: Crear Taxi. Calcular precio del viaje y determinar disponibilidad.
        public static class Taxi {
            private double bajadaBandera, precioPorKm; private boolean ocupado;
            public Taxi(double bajadaBandera, double precioPorKm) {
                this.bajadaBandera = bajadaBandera; this.precioPorKm = precioPorKm;
            }
            public double calcularViaje(double kilometros) { return bajadaBandera + precioPorKm * kilometros; }
            public boolean estaDisponible() { return !ocupado; }
            public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
        }

        // EJERCICIO 25: Crear Reloj. Avanzar una hora y devolver la hora formateada.
        public static class Reloj {
            private int hora, minuto;
            public Reloj(int hora, int minuto) { this.hora = hora; this.minuto = minuto; }
            public void avanzarHora() { hora = (hora + 1) % 24; }
            public String mostrarHora() { return String.format("%02d:%02d", hora, minuto); }
            public boolean esDeNoche() { return hora >= 20 || hora < 6; }
        }

        // EJERCICIO 26: Crear Cancion. Comprobar duración y convertir segundos a minutos.
        public static class Cancion {
            private String titulo; private int segundos;
            public Cancion(String titulo, int segundos) { this.titulo = titulo; this.segundos = segundos; }
            public double duracionEnMinutos() { return segundos / 60.0; }
            public boolean esLarga() { return segundos > 240; }
            public String getTitulo() { return titulo; }
        }

        // EJERCICIO 27: Crear Hotel. Reservar habitaciones y calcular ocupación.
        public static class Hotel {
            private int habitaciones, ocupadas;
            public Hotel(int habitaciones, int ocupadas) {
                this.habitaciones = habitaciones; this.ocupadas = ocupadas;
            }
            public boolean reservar() {
                if (ocupadas < habitaciones) { ocupadas++; return true; }
                return false;
            }
            public int disponibles() { return habitaciones - ocupadas; }
            public double porcentajeOcupacion() { return habitaciones == 0 ? 0 : ocupadas * 100.0 / habitaciones; }
        }

        // EJERCICIO 28: Crear Semaforo. Cambiar color y comprobar si permite avanzar.
        public static class Semaforo {
            private String color;
            public Semaforo(String color) { this.color = color.toLowerCase(); }
            public void cambiarColor(String nuevoColor) { color = nuevoColor.toLowerCase(); }
            public boolean puedeAvanzar() { return color.equals("verde"); }
            public String getColor() { return color; }
        }

        // EJERCICIO 29: Crear Prestamo. Calcular interés y total a devolver.
        public static class Prestamo {
            private double capital, tasa; private int meses;
            public Prestamo(double capital, double tasa, int meses) {
                this.capital = capital; this.tasa = tasa; this.meses = meses;
            }
            public double calcularInteres() { return capital * tasa / 100 * meses / 12; }
            public double totalADevolver() { return capital + calcularInteres(); }
            public boolean esLargo() { return meses > 24; }
        }

        // EJERCICIO 30: Crear Usuario. Validar contraseña, cambiar correo y presentarse.
        public static class Usuario {
            private String nombre, correo, contrasena;
            public Usuario(String nombre, String correo, String contrasena) {
                this.nombre = nombre; this.correo = correo; this.contrasena = contrasena;
            }
            public boolean contrasenaValida() {
                return contrasena.length() >= 8 && contrasena.matches(".*\\d.*");
            }
            public void cambiarCorreo(String nuevoCorreo) {
                if (nuevoCorreo.contains("@")) correo = nuevoCorreo;
            }
            public String presentarse() { return nombre + " - " + correo; }
        }
    }
}
