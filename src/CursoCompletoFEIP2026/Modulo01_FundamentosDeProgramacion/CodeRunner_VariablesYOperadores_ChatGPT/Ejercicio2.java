package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Ejercicio 2: Evaluar si una persona es mayor o menor de edad
         * Firma del método: public boolean esMayorDeEdad(int edad) {}
         *
         * Instrucciones:
         * 1. Si la edad es mayor o igual a 18 retornar "Mayor de edad".
         * 2. Si no, retornar "Menor de edad".
         *
         */

        System.out.println(esMayorDeEdad(18));

    }
    public static boolean esMayorDeEdad (int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
