package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Pregunta 5:
         * En este ejercicio, trabajarás con el operador módulo en Java.
         * El operador % permite obtener el resto de una división entre dos números enteros.
         *
         * Ejemplo:
         * int resultado = 10 % 3;
         * System.out.println(resultado); // Imprime: 1
         *
         * Plantilla base:
         * public static int resto(int numero, int divisor) {
         *    Calcula el resto de la división entre número y divisor.
         * }
         *
         */

        System.out.println( resto(15, 5)); // Imprime: 0
        System.out.println( resto(10, 6)); // Imprime: 4
    }
    public static int resto(int numero, int divisor) {
        return numero % divisor;
    }
}
