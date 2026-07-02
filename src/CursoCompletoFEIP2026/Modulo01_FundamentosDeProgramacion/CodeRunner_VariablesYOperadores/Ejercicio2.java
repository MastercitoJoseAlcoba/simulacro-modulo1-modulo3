package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Pregunta 2:
         * En este ejercicio, trabajarás con diferentes tipos de variables en Java (int, double y String), realizando
         * operaciones básicas y construyendo un resultado final mediante concatenación.
         * La función deberá procesar los valores recibidos y devolver un mensaje con los resultados obtenidos.
         *
         * Firma del método:
         * public String operacionesVariables (int entero, double decimal, String cadena) {
         *   // cuerpo
         * }
         *
         * Instrucciones:
         * 1. Cree una variable resultadoEntero que almacene el valor de entero multiplicado por 2.
         * 2. Cree una variable resultadoDecimal que almacene el valor de decimal dividido por 2.
         * 3. Cree una variable resultadoCadena que almacene la cadena concatenada con el valor " es divertido".
         * 4. Retorne un mensaje con los resultados obtenidos.
         *
         * Entero multiplicado por 2: [valor], Decimal dividido por 2: [valor], Cadena concatenada: [valor]
         *
         * Plantilla base:
         * public String operacionesVariables (int entero, double decimal, String cadena) {
         *
         * return "Entero multiplicado por 2: " + resultadoEntero + ", Decimal dividido por 2: " + resultadoDecimal + ", Cadena concatenada: " + resultadoCadena;
         * }
         *
         */

        System.out.println( new Ejercicio2().operacionesVariables(5, 3.14, "Java"));


    }
    public String operacionesVariables (int entero, double decimal, String cadena) {
        int resultadoEntero = entero * 2;
        double resultadoDecimal = decimal / 2;
        String resultadoCadena = cadena + " es divertido"; // Asi va en el ejercicio

        return "Entero multiplicado por 2: " + resultadoEntero + ", Decimal dividido por 2: " + resultadoDecimal + ", Cadena concatenada: " + resultadoCadena;
    }

}
