package Apoyo_Repaso_VCs;

public class MainPD {
    public static void main(String[] args) {
        // Primero crea un array de nombres y una matriz
        String[] nombres = {"Ana",   // Suma 3 (3 + 0 + 5 + 7 = 15)
                            "Luis"}; // Suma 4 (4 + 0 + 5 + 7 = 16)

        int[][] matriz = {{7, 8},  // Fila 0
                         {9, 10}}; // Fila 1

        // Después llama al método. cada argumento se asigna al parámetro que ocupa la misma posición en la firma.
        int resultado = procesarDato(nombres, matriz, "hola", 10, 2, 0, 0, 0);
        System.out.println("Resultado: " + resultado);
        // int resultado = procesarDato(nombres, matriz, "hola", 10, 2, 0, 0, 0);

        /**
         * Los últimos tres 0 son postNombre, fila y columna, en ese orden. El método toma "Ana"de nombres[0] y 7 de matriz[0][0].
         * La cuenta es 3 + 0 + 5 + 7 = 15. "hola"" aporta 0 porque falla la conversióñ, y las operaciones siguientes se
         * ejecutan igual.
         */

    }

    public static <nullPointException> int procesarDato(String[] nombres, int[][] matriz, String textoNumero, int a, int b, int postNombre, int fila, int columna) {
        /**
         * Tenes que controlar que de acuerdo a los parámetros recibidos, este código procese todas las operaciones y no
         * se corte si se produce una excepción.
         * Tenemos que ver en que parte del código se pueden generar excepciones y controlarlas adecuadamente.
         */

        // Variable acumuladora
        int suma = 0;

        // Usa un try-catch por operación. Si una falla, suma queda como estaba y el método sigue con la siguiente.

        // Operación: Longitud de "Ana" - Resultado: Aporta 3 - Suma: 3
        try {
            suma += nombres[postNombre].length();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // El índice no existe o el arreglo o el nombre es null.
        }

        // Operación: Convertir "hola" a entero - Resultado: Falla y aporta 0 - Suma: 3
        try {
            suma += Integer.parseInt(textoNumero);
        } catch (NumberFormatException e) {
            // El texto no representa un int válido.
        }

        // Operación: 10/2 - Resultado: Aporta 5 - Suma: 8
        try {
            suma += a / b;
        } catch (ArithmeticException e) {
            // El divisor és cero.
        }

        // Operación: Leer una celda que contiene: 7 - Resultado: Aporta 7 - Suma: 15
        try {
            suma += matriz[fila][columna];
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // La posición no existe o la matriz o la fila es null.
        }

        return suma;
    }
}

/**
 * Si pusieras todo en un solo try, al fallar la conversióñ Java saltaría al catch y se saltearía la división y la lectura
 * de la matriz.
 * Por eso el return suma va al final, después de intentar las cuatro operaciones.
 */

/**
 * Paso                         Con Ana          Con Luis
 * Antes de dividir                   3                 4
 * 10 / 2 aporta 5            3 + 5 = 8         4 + 5 = 9
 * matriz [0][0] aporta 7    8 + 7 = 15        9 + 7 = 16
 *
 * Entonces suma+= equivale a suma += 7. Si en esa celda hubieras escrito 20, sumaría 20.
 */