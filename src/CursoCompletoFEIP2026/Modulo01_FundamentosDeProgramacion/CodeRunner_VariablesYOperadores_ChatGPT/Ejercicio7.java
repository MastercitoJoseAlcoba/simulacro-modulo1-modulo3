package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Ejercicio 7: Multiplicar naturales hasta un límite usando while
         *
         * Instrucciones:
         * 1. Inicializar resultado en 1.
         * 2. Usar contador desde 1.
         * 3. Mientras contador sea menor o igual a limite, multiplicar resultado por contador.
         * 4. Retornar resultado.
         *
         */

        System.out.println(multiplicarNaturalesHasta(5)); // 120
        System.out.println(multiplicarNaturalesHasta(10)); // 3628800
    }
    public static int multiplicarNaturalesHasta(int limite) {
        int resultado = 1;
        int contador = 1;

        while (contador <= limite) {

            /**
             * 1 * 1 = 1
             * 1 * 2 = 2
             * 2 * 3 = 6
             * 6 * 4 = 24
             * 24 * 5 = 120 // El límite es 5
             */

            resultado *= contador;
            contador++;
        }

        return resultado;
    }

}
