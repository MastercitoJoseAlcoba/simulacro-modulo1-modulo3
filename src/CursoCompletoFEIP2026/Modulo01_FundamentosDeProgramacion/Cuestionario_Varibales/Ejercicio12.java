package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Varibales;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
         * Pregunta 12:
         * Si quiero almacenar en una variable en memoria el número 35,25, ¿cuál de las siguientes es la correcta?
         * a. float variable_decimal = 35.25;
         * b. float 1 variable = 35.25;
         * c. int variable = 35.25;
         * d. double variable1 = 35.25; ✅
         * e. double variable = 35;
         */

         // Ejemplo:
         double variable = 35.25;
         System.out.println(variable); // Imprime: 35.25

        /*
         * Porque 32.25 es un número decimal, y en Java los decimales como 35.25 se interpretan por defecto como double.
         */
    }
}
