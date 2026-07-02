package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * Ejercicio 12:
         *
         * Instrucciones:
         * 1. Empezar en 0.
         * 2. Ir sumando 4 con un do-while.
         * 3. Retornar el primer múltiplo de 4 que sea mayor que límite.
         *
         */

        System.out.println(multiploDe4MayorQue(10));

    }
    public static int multiploDe4MayorQue(int limite) {
        int multiplo = 4;
        do {
            multiplo += 4; // multiplo = multiplo + 4

            /**
             * 4 + 4 = 8
             * 8 + 4 = 12
             *
             * Como 12 > 10, se sale del bucle.
             */

        } while (multiplo <= limite);
        return multiplo;
    }
}
