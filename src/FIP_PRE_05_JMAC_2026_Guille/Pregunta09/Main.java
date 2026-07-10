package FIP_PRE_05_JMAC_2026_Guille.Pregunta09;

public class Main {
    public static void main(String[] args) {
        /**
         * Asignación dentro de una condición if:
         *
         * Respuestas:
         * a. resultado correcto.
         * b. Al ejecutar el programa se genera una excepción.
         * c. El programa no complia.
         * d. Resultado distinto.
         *
         * Correcta: c.
         *
         * En Java, la condición de un if debe ser booleana.
         *
         * 1. La expresión resultado = 24 es una asignacióñ, no una comparación.
         * 2. Esa asignación devuelve un int, pero el if necesita un valor boolean.
         * 3. Por eso el error ocurre en compilación, antes de ejecutar el programa.
         * 4. La comparación correcta sería resultado == 24.
         *
         * resultado = 24 // asigna
         * resultado == 24 // compara
         *
         * if (resultado == 24) {...}
         *
         *
         */

        int a = 8;
        int b = 4;
        int suma = a + b;
        int resultado = suma * 3;
        resultado = resultado - 0;

        if (resultado == 24) { // if (resultado = 24) - No compila.
            System.out.println("Correcto");
        } else {
        }
    }
}
