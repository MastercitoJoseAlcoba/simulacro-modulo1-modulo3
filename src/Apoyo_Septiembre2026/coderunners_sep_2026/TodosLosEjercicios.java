package Apoyo_Septiembre2026.coderunners_sep_2026;

import java.util.ArrayList;
import java.util.List;

public class TodosLosEjercicios {

    // ============================================================
    // EJERCICIO 1 - EXCEPCIONES
    // ============================================================
    /*
     * LETRA:
     *
     * Implementar el método:
     *
     * public static void prueba(String dato, int[] vector)
     *
     * El método debe realizar dos operaciones:
     *
     * 1. Intentar mostrar por pantalla el elemento del vector
     *    ubicado en la posición indicada por vector[1].
     *
     *    Ejemplo:
     *    Si vector = {10, 3, 20, 30, 40}
     *    entonces vector[1] vale 3,
     *    por lo tanto se intenta acceder a vector[3].
     *
     *    Si la posición está fuera de rango, capturar:
     *    ArrayIndexOutOfBoundsException
     *
     *    y mostrar:
     *    "indice del array fuera de rango"
     *
     * 2. Intentar mostrar el largo del String dato.
     *
     *    Si dato es null, capturar:
     *    NullPointerException
     *
     *    y mostrar:
     *    "String null, no se puede saber su largo"
     *
     * Si no ocurre ningún error al trabajar con el String,
     * mostrar además:
     * "Llegamos al final ok"
     */

    public static void prueba(String dato, int[] vector) {

        try {
            System.out.println(vector[vector[1]]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("indice del array fuera de rango");
        }

        try {
            System.out.println(dato.length());

            System.out.println("Llegamos al final ok");

        } catch (NullPointerException e) {

            System.out.println("String null, no se puede saber su largo");
        }
    }


    // ============================================================
    // EJERCICIO 2 - MANEJO DE STRINGS Y LISTAS
    // ============================================================
    /*
     * LETRA:
     *
     * Implementar el método:
     *
     * public List<String> filtrarPalabras(List<String> palabras)
     *
     * El método recibe una lista de palabras.
     *
     * Debe recorrer todas las palabras y devolver una nueva lista
     * que contenga solamente aquellas palabras que tengan:
     *
     * - La letra "a"
     * - La letra "e"
     *
     * La búsqueda debe funcionar sin importar si las letras
     * están escritas en mayúsculas o minúsculas.
     *
     * Ejemplo:
     *
     * Entrada:
     * ["Casa", "Mesa", "Perro", "Escalera", "Sol"]
     *
     * Resultado:
     * ["Mesa", "Escalera"]
     *
     * Para facilitar la comparación se puede utilizar:
     *
     * toLowerCase()
     * contains()
     */

    public List<String> filtrarPalabras(List<String> palabras) {

        List<String> resultado = new ArrayList<>();

        for (String palabra : palabras) {

            String minuscula = palabra.toLowerCase();

            if (minuscula.contains("a") && minuscula.contains("e")) {

                resultado.add(palabra);
            }
        }

        return resultado;
    }


    // ============================================================
    // EJERCICIO 3 - ARRAYS
    // ============================================================
    /*
     * LETRA:
     *
     * Implementar el método:
     *
     * public int[] procesarTemperaturas(int[] temperaturas)
     *
     * El método recibe un array de temperaturas expresadas
     * en grados Celsius.
     *
     * Debe:
     *
     * 1. Crear un nuevo array del mismo tamaño.
     *
     * 2. Recorrer el array original de forma invertida.
     *
     * 3. Convertir cada temperatura de Celsius a Fahrenheit.
     *
     * Fórmula:
     *
     * Fahrenheit = Celsius * 9 / 5 + 32
     *
     * 4. Guardar las temperaturas convertidas en el nuevo array.
     *
     * 5. Devolver el nuevo array.
     *
     * Ejemplo:
     *
     * Entrada:
     * {0, 10, 20}
     *
     * Primero se invierte:
     * {20, 10, 0}
     *
     * Luego se convierte a Fahrenheit:
     *
     * 20°C -> 68°F
     * 10°C -> 50°F
     *  0°C -> 32°F
     *
     * Resultado:
     * {68, 50, 32}
     */

    public int[] procesarTemperaturas(int[] temperaturas) {

        int[] resultado = new int[temperaturas.length];

        for (int i = 0; i < temperaturas.length; i++) {

            // Tomamos el elemento desde el final del array.
            int temperatura =
                    temperaturas[temperaturas.length - 1 - i];

            // Convertimos Celsius a Fahrenheit.
            resultado[i] = temperatura * 9 / 5 + 32;
        }

        return resultado;
    }


    // ============================================================
    // EJERCICIO 4 - MATRICES
    // ============================================================
    /*
     * LETRA:
     *
     * Implementar el método:
     *
     * public int[] calcularLluviaAcumulada(int[][] registros)
     *
     * Se recibe una matriz que contiene registros de lluvia.
     *
     * Cada FILA representa un registro o período.
     * Cada COLUMNA representa una localidad, día o estación.
     *
     * El método debe calcular la suma de cada columna.
     *
     * Para cada columna:
     *
     * 1. Crear una variable suma inicializada en 0.
     *
     * 2. Recorrer todas las filas de esa columna.
     *
     * 3. Acumular los valores.
     *
     * 4. Guardar la suma en un array llamado acumulados.
     *
     * Finalmente debe devolver el array con las sumas.
     *
     * Ejemplo:
     *
     * Matriz:
     *
     * {
     *     {2, 4, 6},
     *     {1, 3, 5},
     *     {7, 2, 1}
     * }
     *
     * Columna 0:
     * 2 + 1 + 7 = 10
     *
     * Columna 1:
     * 4 + 3 + 2 = 9
     *
     * Columna 2:
     * 6 + 5 + 1 = 12
     *
     * Resultado:
     *
     * {10, 9, 12}
     */

    public int[] calcularLluviaAcumulada(int[][] registros) {

        // El resultado tendrá una posición por cada columna.
        int[] acumulados = new int[registros[0].length];

        // j recorre las columnas.
        for (int j = 0; j < registros[0].length; j++) {

            int suma = 0;

            // i recorre las filas.
            for (int i = 0; i < registros.length; i++) {

                suma += registros[i][j];
            }

            acumulados[j] = suma;
        }

        return acumulados;
    }
}