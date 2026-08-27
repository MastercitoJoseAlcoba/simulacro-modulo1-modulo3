package Apoyo_Septiembre2026;

public class ApoyoArrays {
    public static void main(String[] args) {

        //Ejemplo:
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        //Acceder a un elemento/valor.
        //matriz[fila][columna];

        System.out.println("---------".repeat(10));

        introduccionMatrices();

        System.out.println("---------".repeat(10));

        mostrarMatriz();

        System.out.println("---------".repeat(10));

        recorridoPorFilas();

        System.out.println("---------".repeat(10));

        recorridoPorFilasInverso();

        System.out.println("---------".repeat(10));

        recorridoPorColumnas();

        System.out.println("---------".repeat(10));

        recorridoPorColumnasInverso();

        System.out.println("---------".repeat(10));

        recorridoPorFila();

        System.out.println("---------".repeat(10));

        recorridoPorColumna();

        System.out.println("---------".repeat(10));

        sumaFilas();

        System.out.println("---------".repeat(10));

        sumaColumnas();

        System.out.println("---------".repeat(10));



    }
    //0. INTRODUCCIÓN: ¿QUÉ ES UNA MATRIZ?
    public static void introduccionMatrices() {
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Introducción a las matrices.");
        System.out.println("Cantidad de filas: "+matriz.length);
        System.out.println("Cantidad de columnas (para la fila 0): "+matriz[0].length);
        System.out.println("Cantidad de columnas (para la fila 1): "+matriz[1].length);

        System.out.println("Elementos de la matriz: ");
        System.out.println("Elemento en la posición (2,2): "+matriz[2][2]);
        System.out.println("Elemento en la posición (1,1): "+matriz[1][1]);
        System.out.println("Elemento en la posición (1,2): "+matriz[1][2]);

        //Ultimo elemento de la fila, que posicion/indice tiene?
        System.out.println("Ultima posicion valida de la fila: " + (matriz.length-1));
        //Ultimo elemento de la columna, que posicion/indice tiene?
        System.out.println("Ultima posicion valida de la columna: " + (matriz[0].length-1));

    }

    //1. MOSTRAR UNA MATRIZ - \t
    public static void mostrarMatriz(){
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Mostrar matriz.");

        for (int i = 0; i < matriz.length; i++) { //Recorro las filas de la matriz.
            for (int j = 0; j < matriz[i].length; j++) { //Me va a mover en las columnas.
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }

    //2. RECORRIDO HACIA ADELANTE POR FILAS
    public static void recorridoPorFilas(){
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Recorrido por filas matriz.");

        for (int i = 0; i < matriz.length; i++) { //Recorro las filas de la matriz.
            for (int j = 0; j < matriz[i].length; j++) { //Me va a mover en las columnas.
                System.out.println("Fila: "+ i +", Columna: "+j+" Valor/Elemento: "+matriz[i][j]);
            }
            System.out.println();
        }
    }

    //3. RECORRIDO HACIA ATRÁS POR FILAS
    public static void recorridoPorFilasInverso(){
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Recorrido por filas inverso.");

        for (int i  = matriz.length-1; i >= 0; i--) { //Filas
            for (int j = matriz[i].length-1; j>= 0; j--) { //Columas
                System.out.println("Fila: "+ i +", Columna: "+j+" Valor/Elemento: "+matriz[i][j]);
            }
        }


    }
    //4. RECORRIDO POR COLUMNAS
    public static void recorridoPorColumnas(){
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Recorrido por columnas.");
        //i es para filas
        //j es para columnas
        for (int j = 0; j < matriz[0].length; j++) { //Columnas!
            for (int i = 0; i < matriz.length; i++) { //Filas
                System.out.println("Fila: "+ i +", Columna: "+j+" Valor/Elemento: "+matriz[i][j]);
            }
        }
    }
    //5. RECORRIDO INVERSO POR COLUMNAS
    public static void recorridoPorColumnasInverso(){
        int [][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Recorrido por columnas inverso.");
        for (int j = matriz[0].length-1; j >= 0; j--) { //Columnas.
            for (int i = matriz.length-1; i >= 0; i--) { //Fila.
                System.out.println("Fila: "+ i +", Columna: "+j+" Valor/Elemento: "+matriz[i][j]);
            }
        }
    }


    //6. RECORRER UNA SOLA FILA

    public static void recorridoPorFila(){
        int [][] matriz = {
                {10, 20, 30},
                {40,50,60},
                {70, 80, 90}
        };
        //Fila pre definida, dentro del método.
        int fila = 1;

        System.out.println("Fila: "+fila);

        //Iterar.
        for (int j = 0; j < matriz[fila].length; j++) {
            System.out.println("Fila" + j + " Valor: "+matriz[fila][j]);

        }

    }


    public static void recorridoPorFilaParams(int filaRecorrer) {
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("Fila: " + filaRecorrer);

        //Iterar.
        for (int j = 0; j < matriz[filaRecorrer].length; j++) {
            System.out.println("Fila" + j + "Valor: " + matriz[filaRecorrer][j]);

        }
    }



    //7. RECORRER UNA SOLA COLUMNA

    public static void recorridoPorColumna(){
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int columna = 2;

        System.out.println("Columna: "+columna);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Columna: "+i+" Valor: "+matriz[i][columna]);
        }


    }



    //8. SUMA TOTAL DE LA MATRIZ
    public static void sumaTotalMatriz(){
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        //Valor donde almacenar la suma.
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {//Filas
            for (int j = 0; j < matriz[i].length; j++) {//Columnas
                //Acá estoy dentro de cada elemento de mi matriz.
                suma += matriz[i][j];
            }
        }
        //Afuera del for, imprimo la suma.
        System.out.println("Suma total de la matriz: "+suma);

    }

    public static int sumaTotalMatrizRetorno(){
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        //Valor donde almacenar la suma.
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {//Filas
            for (int j = 0; j < matriz[i].length; j++) {//Columnas
                //Acá estoy dentro de cada elemento de mi matriz.
                suma += matriz[i][j];
            }
        }
        //Afuera del for, retorno la suma.
        return suma;
    }

    //9. SUMA DE CADA FILA
    public static void sumaFilas(){
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < matriz.length; i++) { //Filas.
            //Acumulador de suma.
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) { //Columnas.
                suma += matriz[i][j];
            }
            System.out.println("Suma de fila: "+i+" Valor: "+suma);
        }

    }

    //10. SUMA DE CADA COLUMNA
    public static void sumaColumnas(){
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        for (int j = 0; j < matriz[0].length; j++) { //Recorrido por columnas, va for de afuera columnas.
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) { //Recorriendo las filas.
                suma += matriz[i][j]; //Acumulo la suma.
            }
            System.out.println("Suma de columna: "+j+" Valor: "+suma);
        }
    }

    /*
     * ============================================================
     * 11. EJERCICIO 1
     *
     * SUMA DE CADA FILA Y DETERMINAR LA MAYOR
     * ============================================================
     */

    public static void filaConMayorSuma() {

        int[][] matriz = {
                {5, 3, 2},
                {10, 4, 8},
                {1, 2, 3}
        };

        int mayorSuma = 0;
        int filaMayor = -1;

        for (int i = 0; i < matriz.length; i++) {

            int sumaFila = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                sumaFila += matriz[i][j];
            }

            System.out.println(
                    "Suma fila " + i + ": " + sumaFila
            );

            if (filaMayor == -1 || sumaFila > mayorSuma) {

                mayorSuma = sumaFila;
                filaMayor = i;
            }
        }

        System.out.println(
                "Fila con mayor suma: " + filaMayor
        );

        System.out.println(
                "Mayor suma: " + mayorSuma
        );
    }

    /*
     * ============================================================
     * 12. EJERCICIO 2
     *
     * CANTIDAD DE PARES E IMPARES POR COLUMNA
     * ============================================================
     */

    public static void paresImparesPorColumna() {

        int[][] matriz = {
                {2, 7, 6},
                {3, 8, 9},
                {4, 5, 10}
        };

        for (int j = 0; j < matriz[0].length; j++) {

            int pares = 0;
            int impares = 0;

            for (int i = 0; i < matriz.length; i++) {

                if (matriz[i][j] % 2 == 0) {

                    pares++;

                } else {

                    impares++;
                }
            }

            System.out.println(
                    "Columna " + j
                            + " -> Pares: " + pares
                            + " | Impares: " + impares
            );
        }
    }

    /*
     * ============================================================
     * 13. BUSCAR UN VALOR
     * ============================================================
     */

    public static void buscarValor() {

        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int buscado = 50;

        int filaEncontrada = -1;
        int columnaEncontrada = -1;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == buscado) {

                    filaEncontrada = i;
                    columnaEncontrada = j;
                }
            }
        }

        if (filaEncontrada != -1) {

            System.out.println(
                    "Encontrado en fila "
                            + filaEncontrada
                            + ", columna "
                            + columnaEncontrada
            );

        } else {

            System.out.println("Valor no encontrado");
        }
    }

    /*
     * ============================================================
     * 14. EJERCICIO 3
     *
     * BUSCAR MÁXIMO Y DEVOLVER POSICIÓN
     * ============================================================
     *
     * Igual que en arrays unidimensionales,
     * es conveniente inicializar el máximo
     * utilizando un valor real de la matriz.
     *
     * matriz[0][0]
     * ============================================================
     */

    public static void buscarMaximoYPosicion() {

        int[][] matriz = {
                {8, 15, 4},
                {21, 9, 13},
                {7, 30, 12}
        };

        int maximo = matriz[0][0];

        int filaMaximo = 0;
        int columnaMaximo = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > maximo) {

                    maximo = matriz[i][j];

                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }

        System.out.println(
                "Máximo: " + maximo
        );

        System.out.println(
                "Fila: " + filaMaximo
        );

        System.out.println(
                "Columna: " + columnaMaximo
        );

        System.out.println(
                "Posición: ["
                        + filaMaximo
                        + "]["
                        + columnaMaximo
                        + "]"
        );
    }

    /*
     * ============================================================
     * 15. TRANSFORMAR UNA MATRIZ
     * ============================================================
     *
     * Reemplazar todos los números negativos por 0.
     * ============================================================
     */

    public static void transformarMatriz() {

        int[][] matriz = {
                {5, -3, 8},
                {-1, 4, -7},
                {6, -2, 9}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < 0) {

                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("=== MATRIZ TRANSFORMADA ===");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(
                        matriz[i][j] + "\t"
                );
            }

            System.out.println();
        }
    }

    /*
     * ============================================================
     * 16. EJERCICIO INTEGRADOR
     * ============================================================
     *
     * Dada una matriz:
     *
     * - calcular suma total;
     * - contar pares;
     * - contar impares;
     * - encontrar máximo;
     * - encontrar mínimo;
     * - indicar posición del máximo;
     * - indicar posición del mínimo.
     * ============================================================
     */

    public static void ejercicioIntegrador() {

        int[][] matriz = {
                {12, 5, 8},
                {17, 4, 10},
                {21, 6, 3}
        };

        int suma = 0;

        int pares = 0;
        int impares = 0;

        int maximo = matriz[0][0];
        int minimo = matriz[0][0];

        int filaMaximo = 0;
        int columnaMaximo = 0;

        int filaMinimo = 0;
        int columnaMinimo = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int valor = matriz[i][j];

                suma += valor;

                if (valor % 2 == 0) {

                    pares++;

                } else {

                    impares++;
                }

                if (valor > maximo) {

                    maximo = valor;
                    filaMaximo = i;
                    columnaMaximo = j;
                }

                if (valor < minimo) {

                    minimo = valor;
                    filaMinimo = i;
                    columnaMinimo = j;
                }
            }
        }

        System.out.println("=== RESULTADOS ===");

        System.out.println("Suma: " + suma);

        System.out.println("Pares: " + pares);

        System.out.println("Impares: " + impares);

        System.out.println(
                "Máximo: " + maximo
                        + " en ["
                        + filaMaximo
                        + "]["
                        + columnaMaximo
                        + "]"
        );

        System.out.println(
                "Mínimo: " + minimo
                        + " en ["
                        + filaMinimo
                        + "]["
                        + columnaMinimo
                        + "]"
        );
    }


    /*
     * ============================================================
     * 17. TICKET DE SALIDA
     * ============================================================
     *
     * Dada:
     *
     * int[][] matriz = {
     *     {14, 7, 22},
     *     {5, 18, 3},
     *     {10, 30, 8}
     * };
     *
     * Resolver:
     *
     * 1. Calcular la suma total.
     *
     * 2. Contar cuántos números son mayores que 10.
     *
     * 3. Encontrar el mayor valor.
     *
     * 4. Indicar fila y columna del mayor.
     *
     * 5. Mostrar la suma de cada fila.
     * ============================================================
     */

    public static void ticketSalida() {

        int[][] matriz = {
                {14, 7, 22},
                {5, 18, 3},
                {10, 30, 8}
        };

        int sumaTotal = 0;

        int mayoresQueDiez = 0;

        int mayor = matriz[0][0];

        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < matriz.length; i++) {

            int sumaFila = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                int valor = matriz[i][j];

                sumaTotal += valor;

                sumaFila += valor;

                if (valor > 10) {

                    mayoresQueDiez++;
                }

                if (valor > mayor) {

                    mayor = valor;

                    filaMayor = i;
                    columnaMayor = j;
                }
            }

            System.out.println(
                    "Suma fila " + i
                            + ": " + sumaFila
            );
        }

        System.out.println(
                "Suma total: " + sumaTotal
        );

        System.out.println(
                "Mayores que 10: "
                        + mayoresQueDiez
        );

        System.out.println(
                "Mayor: " + mayor
        );

        System.out.println(
                "Posición del mayor: ["
                        + filaMayor
                        + "]["
                        + columnaMayor
                        + "]"
        );
    }

}


