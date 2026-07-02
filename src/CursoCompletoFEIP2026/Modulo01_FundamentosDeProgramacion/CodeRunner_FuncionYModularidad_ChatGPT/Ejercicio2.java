package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Ejercicio 2: obtener el último dígito de un número
         *
         * Enunciado de la pregunta:
         * En este ejercicio, deberás implementar una función que permita obtener el último dígito de un número entero.
         *
         * Firma del método:
         * public int ultimoDigito(int numero) {}
         *
         * Instrucciones:
         * 1. Implemente el método ultimoDigito.
         * 2. El método debe recibir un número entero como parámetro.
         * 3. Utilice el operador módulo (%) para obtener el último dígito.
         * 4. Retorne el valor obtenido.
         *
         */

        System.out.println("El ultimo dígito de 12345 es: " + ultimoDigito(12345));
        System.out.println("El ultimo dígito de 123 es: " + ultimoDigito(123));
        System.out.println("El ultimo dígito de 12 es: " + ultimoDigito(12));

    }
    public static int ultimoDigito(int numero) {
        return numero % 10;
    }
}
