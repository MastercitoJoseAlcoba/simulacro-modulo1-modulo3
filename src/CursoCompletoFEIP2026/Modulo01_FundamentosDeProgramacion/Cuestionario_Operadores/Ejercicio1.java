package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Operadores;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         *
         *
         *
         */

        /**
         * Pregunta 1:
         * Dadas las variables:
         */

        int i = 7;
        float f = 5.5F;
        char c = 'w';

        /**
         * i + f = 12.5
         * 12.5 <= 10 -> false
         * c != 'p' -> 'w' != 'p' -> true
         */

        // Qué resultado da:
        String resultado = (i+f<=10 || c!='p') ? "Verdadero" : "Falso"; // Operador ternario
        System.out.println(resultado); // Imprime: Verdadero


    }
}
