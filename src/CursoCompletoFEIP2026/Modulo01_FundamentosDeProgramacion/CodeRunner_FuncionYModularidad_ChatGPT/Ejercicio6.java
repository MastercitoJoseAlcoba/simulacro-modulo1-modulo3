package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Ejercicio 6: verificar si un número termina en cero
         *
         * Enunciado de la pregunta:
         * En este ejercicio, deberás implementar una función que determine si un número entero termina en 0.
         *
         * Firma del método:
         * public boolean terminaEnCero (int numero) {}
         *
         * Instrucciones:
         * 1. Implemente el método terminaEnCero.
         * 2. El metodo debe recibir un número entero como parámetro.
         * 3. Utilice el operador módulo (%) para obtener el último dígito.
         * 4. Si el último dígito es 0, retorne true.
         * 5. En caso contrario, retorne false.
         *
         */

        System.out.println(terminaEnCero(12300)); // true
        System.out.println(terminaEnCero(1234)); // false
    }
    public static boolean terminaEnCero (int numero) {
        return numero % 10 == 0;
    }
}
