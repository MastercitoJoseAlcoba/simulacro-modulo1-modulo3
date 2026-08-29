package Apoyo_Septiembre2026.Sep_2026;

import java.util.Arrays;

public class EjerciciosArrays {

    public static void main(String[] args) {

        int[] numeros = {5, 8, 3, 8, 12, 7, 4};

        System.out.println("Array original: " + Arrays.toString(numeros));

        System.out.println("1. Suma total: " + sumarElementos(numeros));
        System.out.println("2. Suma de pares: " + sumarPares(numeros));
        System.out.println("3. Cantidad de pares: " + contarPares(numeros));
        System.out.println("4. Mayor: " + encontrarMayor(numeros));
        System.out.println("5. Menor: " + encontrarMenor(numeros));
        System.out.println("6. Cantidad de veces que aparece 8: "
                + contarOcurrencias(numeros, 8));

        System.out.println("7. Último impar: "
                + encontrarUltimoImpar(numeros));

        int[] invertido = invertir(numeros);
        System.out.println("8. Invertido: "
                + Arrays.toString(invertido));

        int[] paresDuplicados = duplicarPares(numeros);
        System.out.println("9. Pares duplicados: "
                + Arrays.toString(paresDuplicados));

        System.out.println("10. ¿Contiene 12?: "
                + buscarNumero(numeros, 12));

        System.out.println("11. Segundo mayor: "
                + segundoMayor(numeros));

        int[] ordenado = {1, 3, 5, 7, 9};
        System.out.println("12. ¿Está ordenado?: "
                + estaOrdenado(ordenado));

        int[] valores = {3, 15, 8, 20};
        System.out.println("13. Procesar valores: "
                + Arrays.toString(procesarValores(valores)));

        int[] baterias = {10, 21, 30, 41};
        System.out.println("14. Procesar baterías: "
                + Arrays.toString(procesarBaterias(baterias)));
    }


    // =====================================================
    // 1. SUMAR TODOS LOS ELEMENTOS
    // =====================================================

    public static int sumarElementos(int[] numeros) {

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma;
    }


    // =====================================================
    // 2. SUMAR SOLAMENTE LOS PARES
    // =====================================================

    public static int sumarPares(int[] numeros) {

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                suma += numeros[i];
            }
        }

        return suma;
    }


    // =====================================================
    // 3. CONTAR CUÁNTOS NÚMEROS PARES HAY
    // =====================================================

    public static int contarPares(int[] numeros) {

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }


    // =====================================================
    // 4. ENCONTRAR EL MAYOR
    // =====================================================

    public static int encontrarMayor(int[] numeros) {

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }


    // =====================================================
    // 5. ENCONTRAR EL MENOR
    // =====================================================

    public static int encontrarMenor(int[] numeros) {

        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }


    // =====================================================
    // 6. CONTAR OCURRENCIAS DE UN NÚMERO
    // =====================================================

    public static int contarOcurrencias(int[] numeros, int buscado) {

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscado) {
                contador++;
            }
        }

        return contador;
    }


    // =====================================================
    // 7. ENCONTRAR EL ÚLTIMO NÚMERO IMPAR
    // =====================================================

    public static int encontrarUltimoImpar(int[] numeros) {

        for (int i = numeros.length - 1; i >= 0; i--) {

            if (numeros[i] % 2 != 0) {
                return numeros[i];
            }
        }

        return -1;
    }


    // =====================================================
    // 8. INVERTIR UN ARRAY
    // =====================================================

    public static int[] invertir(int[] numeros) {

        if (numeros == null) {
            return null;
        }

        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {

            resultado[i] = numeros[numeros.length - 1 - i];
        }

        return resultado;
    }


    // =====================================================
    // 9. DUPLICAR SOLAMENTE LOS NÚMEROS PARES
    // =====================================================

    public static int[] duplicarPares(int[] numeros) {

        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                resultado[i] = numeros[i] * 2;
            } else {
                resultado[i] = numeros[i];
            }
        }

        return resultado;
    }


    // =====================================================
    // 10. BUSCAR UN NÚMERO
    // =====================================================

    public static boolean buscarNumero(int[] numeros, int buscado) {

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscado) {
                return true;
            }
        }

        return false;
    }


    // =====================================================
    // 11. ENCONTRAR EL SEGUNDO MAYOR
    // =====================================================

    public static int segundoMayor(int[] numeros) {

        int mayor = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor) {

                segundo = mayor;
                mayor = numeros[i];

            } else if (numeros[i] > segundo
                    && numeros[i] != mayor) {

                segundo = numeros[i];
            }
        }

        return segundo;
    }


    // =====================================================
    // 12. VERIFICAR SI EL ARRAY ESTÁ ORDENADO
    // =====================================================

    public static boolean estaOrdenado(int[] numeros) {

        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }

        return true;
    }


    // =====================================================
    // 13. PROCESAR VALORES
    //
    // Si es mayor a 10 → dividir entre 2
    // Si es menor o igual a 10 → multiplicar por 3
    // =====================================================

    public static int[] procesarValores(int[] valores) {

        int[] resultado = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] > 10) {
                resultado[i] = valores[i] / 2;
            } else {
                resultado[i] = valores[i] * 3;
            }
        }

        return resultado;
    }


    // =====================================================
    // 14. PROCESAR BATERÍAS
    //
    // Invierte el array.
    // Si el número invertido es par → multiplicarlo por 4.
    // =====================================================

    public static int[] procesarBaterias(int[] baterias) {

        if (baterias == null) {
            return null;
        }

        int[] resultado = new int[baterias.length];

        for (int i = 0; i < baterias.length; i++) {

            int valor = baterias[baterias.length - 1 - i];

            if (valor % 2 == 0) {
                resultado[i] = valor * 4;
            } else {
                resultado[i] = valor;
            }
        }

        return resultado;
    }
}