package Apoyo_Septiembre2026.Sep_2026;

public class Ejercicio1ArraysCR {

    public static void main(String[] args) {

        /*
         * =====================================================
         * EJEMPLO
         * =====================================================
         *
         * Array original:
         *
         * índices:    0   1   2   3
         * valores:   10   5   8   3
         */
        int[] numeros = {10, 5, 8, 3};


        /*
         * Llamamos al método invertir()
         *
         * Este método:
         *
         * 1. Invierte el array.
         * 2. Si el número es par, lo multiplica por 2.
         * 3. Si el número es impar, lo multiplica por 3.
         */
        int[] resultado = invertir(numeros);


        /*
         * Mostramos el resultado.
         *
         * Original:
         *
         * {10, 5, 8, 3}
         *
         * Invertido:
         *
         * {3, 8, 5, 10}
         *
         * Transformado:
         *
         * 3  -> impar -> 3 * 3  = 9
         * 8  -> par   -> 8 * 2  = 16
         * 5  -> impar -> 5 * 3  = 15
         * 10 -> par   -> 10 * 2 = 20
         *
         * Resultado:
         *
         * {9, 16, 15, 20}
         */
        for (int i = 0; i < resultado.length; i++) {

            System.out.print(resultado[i] + " ");
        }
    }


    /*
     * =========================================================
     * MÉTODO invertir
     * =========================================================
     *
     * RECIBE:
     *
     * int[] numeros
     *
     *
     * RETORNA:
     *
     * int[]
     *
     *
     * OBJETIVO:
     *
     * - invertir el array
     * - pares por 2
     * - impares por 3
     */
    public static int[] invertir(int[] numeros) {


        /*
         * =====================================================
         * PASO 1 - VALIDAR NULL
         * =====================================================
         *
         * Antes de hacer:
         *
         * numeros.length
         *
         * tenemos que comprobar que el array exista.
         *
         * null significa que no existe ningún array.
         *
         * Si numeros es null:
         *
         * retornamos null.
         */
        if (numeros == null) {

            return null;
        }


        /*
         * =====================================================
         * PASO 2 - CREAR UN NUEVO ARRAY
         * =====================================================
         *
         * Creamos resultado con la misma cantidad
         * de posiciones que numeros.
         *
         * Si:
         *
         * numeros.length = 4
         *
         * entonces:
         *
         * resultado.length = 4
         *
         *
         * IMPORTANTE:
         *
         * No modificamos el array original.
         */
        int[] resultado = new int[numeros.length];


        /*
         * =====================================================
         * PASO 3 - RECORRER EL ARRAY
         * =====================================================
         *
         * i comienza en 0.
         *
         * El recorrido será:
         *
         * i = 0
         * i = 1
         * i = 2
         * i = 3
         *
         * porque:
         *
         * numeros.length = 4
         */
        for (int i = 0; i < numeros.length; i++) {


            /*
             * =================================================
             * PASO 4 - LEER EL ARRAY AL REVÉS
             * =================================================
             *
             * Fórmula:
             *
             * numeros.length - 1 - i
             *
             *
             * Array:
             *
             * numeros = {10, 5, 8, 3}
             *
             *
             * índices:
             *
             *     0   1   2   3
             *
             *    10   5   8   3
             *
             *
             * -----------------------------------------
             * VUELTA 1
             * -----------------------------------------
             *
             * i = 0
             *
             * 4 - 1 - 0 = 3
             *
             * numeros[3] = 3
             *
             *
             * -----------------------------------------
             * VUELTA 2
             * -----------------------------------------
             *
             * i = 1
             *
             * 4 - 1 - 1 = 2
             *
             * numeros[2] = 8
             *
             *
             * -----------------------------------------
             * VUELTA 3
             * -----------------------------------------
             *
             * i = 2
             *
             * 4 - 1 - 2 = 1
             *
             * numeros[1] = 5
             *
             *
             * -----------------------------------------
             * VUELTA 4
             * -----------------------------------------
             *
             * i = 3
             *
             * 4 - 1 - 3 = 0
             *
             * numeros[0] = 10
             *
             *
             * Entonces leemos:
             *
             * 3, 8, 5, 10
             */
            int numero = numeros[numeros.length - 1 - i];


            /*
             * =================================================
             * PASO 5 - VERIFICAR PAR O IMPAR
             * =================================================
             *
             * Para saber si un número es par:
             *
             * numero % 2 == 0
             *
             *
             * Ejemplo:
             *
             * 8 % 2 = 0
             *
             * entonces 8 es par.
             *
             *
             * 5 % 2 = 1
             *
             * entonces 5 es impar.
             */
            if (numero % 2 == 0) {


                /*
                 * Si es PAR:
                 *
                 * multiplicamos por 2.
                 */
                resultado[i] = numero * 2;

            } else {


                /*
                 * Si es IMPAR:
                 *
                 * multiplicamos por 3.
                 */
                resultado[i] = numero * 3;
            }
        }


        /*
         * =====================================================
         * PASO 6 - RETORNAR
         * =====================================================
         *
         * Cuando termina el for:
         *
         * resultado:
         *
         * {9, 16, 15, 20}
         */
        return resultado;
    }



    /*
     * =========================================================
     * =========================================================
     *              IDEAS IMPORTANTES A RECORDAR
     * =========================================================
     * =========================================================
     *
     *
     * 1. VALIDAR NULL
     *
     * if (numeros == null) {
     *     return null;
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 2. SABER CUÁNTOS ELEMENTOS TIENE UN ARRAY
     *
     * numeros.length
     *
     *
     * Ejemplo:
     *
     * int[] numeros = {10, 5, 8, 3};
     *
     * numeros.length = 4
     *
     *
     * ---------------------------------------------------------
     *
     * 3. PRIMER ÍNDICE
     *
     * Siempre:
     *
     * 0
     *
     *
     * ---------------------------------------------------------
     *
     * 4. ÚLTIMO ÍNDICE
     *
     * numeros.length - 1
     *
     *
     * Si length = 4:
     *
     * último índice = 3
     *
     *
     * ---------------------------------------------------------
     *
     * 5. RECORRIDO NORMAL
     *
     * for (int i = 0; i < numeros.length; i++) {
     *
     *     numeros[i];
     * }
     *
     *
     * Lee:
     *
     * 10
     * 5
     * 8
     * 3
     *
     *
     * ---------------------------------------------------------
     *
     * 6. RECORRIDO INVERSO CON FOR
     *
     * for (int i = numeros.length - 1; i >= 0; i--) {
     *
     *     numeros[i];
     * }
     *
     *
     * Lee:
     *
     * 3
     * 8
     * 5
     * 10
     *
     *
     * ---------------------------------------------------------
     *
     * 7. INVERTIR CREANDO OTRO ARRAY
     *
     * Fórmula fundamental:
     *
     * numeros[numeros.length - 1 - i]
     *
     *
     * Ejemplo:
     *
     * int numero =
     *     numeros[numeros.length - 1 - i];
     *
     *
     * ---------------------------------------------------------
     *
     * 8. CREAR ARRAY DEL MISMO TAMAÑO
     *
     * int[] resultado =
     *     new int[numeros.length];
     *
     *
     * ---------------------------------------------------------
     *
     * 9. GUARDAR EN EL NUEVO ARRAY
     *
     * resultado[i] = numero;
     *
     *
     * ---------------------------------------------------------
     *
     * 10. SABER SI ES PAR
     *
     * numero % 2 == 0
     *
     *
     * ---------------------------------------------------------
     *
     * 11. SABER SI ES IMPAR
     *
     * numero % 2 != 0
     *
     *
     * ---------------------------------------------------------
     *
     * 12. ACUMULADOR
     *
     * int suma = 0;
     *
     * suma += numeros[i];
     *
     *
     * Se utiliza cuando tenemos que SUMAR.
     *
     *
     * ---------------------------------------------------------
     *
     * 13. CONTADOR
     *
     * int contador = 0;
     *
     * contador++;
     *
     *
     * Se utiliza cuando tenemos que CONTAR.
     *
     *
     * ---------------------------------------------------------
     *
     * 14. BUSCAR EL MAYOR
     *
     * int mayor = numeros[0];
     *
     * if (numeros[i] > mayor) {
     *
     *     mayor = numeros[i];
     * }
     *
     *
     * IMPORTANTE:
     *
     * Es mejor empezar:
     *
     * mayor = numeros[0]
     *
     * y no:
     *
     * mayor = 0
     *
     * porque el array podría contener
     * solamente números negativos.
     *
     *
     * ---------------------------------------------------------
     *
     * 15. BUSCAR EL MENOR
     *
     * int menor = numeros[0];
     *
     * if (numeros[i] < menor) {
     *
     *     menor = numeros[i];
     * }
     *
     *
     * ---------------------------------------------------------
     *
     * 16. BUSCAR UNA POSICIÓN
     *
     * int posicion = -1;
     *
     * for (int i = 0; i < numeros.length; i++) {
     *
     *     if (numeros[i] == buscado) {
     *
     *         posicion = i;
     *
     *         break;
     *     }
     * }
     *
     *
     * -1 significa:
     *
     * "no encontrado".
     *
     *
     * ---------------------------------------------------------
     *
     * 17. BREAK
     *
     * break;
     *
     * termina inmediatamente el for.
     *
     *
     * ---------------------------------------------------------
     *
     * 18. RETURN
     *
     * return resultado;
     *
     * devuelve el resultado y termina el método.
     *
     *
     * ---------------------------------------------------------
     *
     * 19. RETURN DENTRO DEL FOR
     *
     * Hay que tener cuidado.
     *
     * Si ponemos:
     *
     * for (...) {
     *
     *     return resultado;
     * }
     *
     * el método terminará en la PRIMERA vuelta.
     *
     * Normalmente queremos:
     *
     * for (...) {
     *
     *     ...
     * }
     *
     * return resultado;
     *
     *
     * ---------------------------------------------------------
     *
     * 20. ARRAY NULL VS ARRAY VACÍO
     *
     * ARRAY NULL:
     *
     * int[] numeros = null;
     *
     * No existe un array.
     *
     *
     * ARRAY VACÍO:
     *
     * int[] numeros = {};
     *
     * Existe, pero:
     *
     * numeros.length == 0
     *
     *
     * ---------------------------------------------------------
     *
     * 21. VALIDACIÓN COMPLETA
     *
     * if (numeros == null || numeros.length == 0) {
     *
     *     ...
     * }
     *
     *
     * IMPORTANTE:
     *
     * Se pregunta primero:
     *
     * numeros == null
     *
     * porque Java utiliza cortocircuito con ||.
     *
     * Si es null, no intenta evaluar:
     *
     * numeros.length
     *
     *
     * ---------------------------------------------------------
     *
     * 22. DIFERENCIA ENTRE i Y numeros[i]
     *
     * i
     *
     * es el ÍNDICE.
     *
     *
     * numeros[i]
     *
     * es el VALOR.
     *
     *
     * Ejemplo:
     *
     * numeros = {10, 5, 8}
     *
     *
     * cuando:
     *
     * i = 1
     *
     * entonces:
     *
     * numeros[i] = numeros[1] = 5
     *
     *
     * ---------------------------------------------------------
     *
     * 23. FÓRMULA MÁS IMPORTANTE DE ESTE EJERCICIO
     *
     * numeros[numeros.length - 1 - i]
     *
     *
     * Pensarlo así:
     *
     * length
     * -
     * 1
     * -
     * i
     *
     *
     * ---------------------------------------------------------
     *
     * 24. ESQUELETO PARA CODERUNNER
     *
     * public int[] metodo(int[] numeros) {
     *
     *     if (numeros == null) {
     *         return null;
     *     }
     *
     *     int[] resultado =
     *         new int[numeros.length];
     *
     *     for (int i = 0;
     *          i < numeros.length;
     *          i++) {
     *
     *         int numero =
     *             numeros[numeros.length - 1 - i];
     *
     *         if (numero % 2 == 0) {
     *
     *             resultado[i] = ...;
     *
     *         } else {
     *
     *             resultado[i] = ...;
     *         }
     *     }
     *
     *     return resultado;
     * }
     *
     *
     * =========================================================
     * RESUMEN ULTRA CORTO PARA MEMORIZAR
     * =========================================================
     *
     * Recorrer:
     *
     * for (int i = 0; i < numeros.length; i++)
     *
     *
     * Último índice:
     *
     * numeros.length - 1
     *
     *
     * Invertir:
     *
     * numeros[numeros.length - 1 - i]
     *
     *
     * Par:
     *
     * numero % 2 == 0
     *
     *
     * Impar:
     *
     * numero % 2 != 0
     *
     *
     * Nuevo array:
     *
     * int[] resultado =
     *     new int[numeros.length];
     *
     *
     * Guardar:
     *
     * resultado[i] = ...
     *
     *
     * Retornar:
     *
     * return resultado;
     *
     * =========================================================
     */
}