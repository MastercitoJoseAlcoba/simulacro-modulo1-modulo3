package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Ejercicio6:
         *
         * Instrucciones:
         * 1. Recorrer el rango con for
         * 2. Contar cuántos números son divisibles entre 3.
         * 3. Retornar la cantidad.
         *
         */

        System.out.println(contarDivisores(10));

    }

    public static int contarDivisores(int numero) {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++; // Cuenta no suma.
            }
        }

        return contador;
    }
}