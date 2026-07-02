package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Ejercicio 1: Evaluar si un número es par o impar
         * Firma del método: public boolean esPar(int numero) {}
         *
         * Instrucciones:
         * 1. Si el número es par, retorne "El número es par".
         * 2. Si el número es impar, retornar "El número es impar".
         *
         */
        System.out.println(evaluarParidad(10));
        System.out.println(evaluarParidad(11));

    }
    public static String evaluarParidad (int numero) { // el método devuelve un texto.
        if (numero % 2 == 0) {
            return "El número es par";
        } else {
            return "El número es impar";

        }
    }
}



