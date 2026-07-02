package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio9 {
    public static void main(String[] args) {
        /**
         *
         * Ejercicio 9: Duplicar un número hasta llegar o superar un valor
         *
         * Instrucciones:
         * 1. Inicializar una variable en 1.
         * 2. usar do-while para duplicarla.
         * 3. Continuar mientras la variable sea menor que límite.
         * 4. Retornar la variable.
         *
         */
        System.out.println(duplicarHasta(10));


    }
    public static int duplicarHasta(int limite) {
        int resultado = 1;
        do {
            resultado *= 2;

            /**
             * 1 * 2 = 2
             * 2 * 2 = 4
             * 4 * 2 = 8 -> devuelve 8
             * 8 * 2 = 16 -> no, porque se pasa
             */

        } while (resultado < limite);
        return resultado;
    }
}
