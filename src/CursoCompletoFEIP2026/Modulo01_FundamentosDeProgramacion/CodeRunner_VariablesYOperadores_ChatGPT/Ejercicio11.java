package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio11 {
    public static void main(String[] args) {
        /**
         * Ejercicio 11: Verificar si un número está dentro de un rango
         *
         * Instrucciones:
         * 1. Si numero está entre 1 y 100 inclusive, retornar "Dentro del rango".
         * 2. Si no, retornar "Fuera del rango".
         *
         */

        System.out.println(verificarRango(50)); // Dentro del rango
        System.out.println(verificarRango(200)); // Fuera del rango

    }
    public static String verificarRango (int numero) {
        if (numero >= 1 && numero <= 100) { // Aplico parte lógica.
            return "Dentro del rango";
        } else {
            return "Fuera del rango";
        }
    }
}
