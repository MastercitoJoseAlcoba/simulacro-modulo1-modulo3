package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Operadores;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Pregunta 4:
         * Dadas las siguientes variables con valores:
         */

        int i = 7;
        float f = 5.5F;
        char c = 'w';

        // Qué resultado da:
        boolean resultado = !(c!='p') || i%2==0 ? true : false;
        System.out.println(resultado); // Imprime: false

        // ¡Porque:
        // c = 'w'
        // (c !='p') -> true
        // !(true) -> false

        // i % 2 == 0 -> false

    }
}
