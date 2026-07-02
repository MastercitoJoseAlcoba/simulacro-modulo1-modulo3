package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Ejercicio 1: verificar si un número es positivo
         *
         * Enunciado de la pregunta
         * En este ejercicio, trabajáras con la condición de funciones (métodos) y la evaluación de condiciones.
         * Deberás implementar una función que determine si un número entero es positivo.
         *
         * Firma del método:
         * public boolean esPositivo (int numero) {}
         *
         * Instrucciones:
         * 1. Implemente el método esPositivo.
         * 2. El método debe recibir un número entero como parámetro.
         * 3. Si el número es mayor que 0, retorne true.
         * 4. En caso contrario, retorne false.
         *
         */
        // Ejemplo 1
        System.out.println(esPositivo(5)); // true

        // Ejemplo 2
        System.out.println( esPositivo(0)); // false


    }
    public static boolean esPositivo (int numero) {
        return numero > 0;


        /**
         * // Ejemplo 1: Solución distinta al problema implementando un condicional
         *
         * int valor = 7;
         * boolean resultado = esPositivo(valor);
         *
         * if (resultado) {
         *     System.out.println(valor + " es positivo");
         * } else {
         *     System.out.println(valor + " no es positivo");
         * }
         *
         * return resultado;
         *
         * Resultado: 7 es positivo
         */
    }
}
