package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio7 {
    public static void main(String[] args) {

        /**
         * Ejercicio 7: multiplicar dos números usando un método.
         *
         * Enunciado de la pregunta:
         * En este ejercicio, trabajarás con la creación de funciones que recibe parámetros y retornan resultados.
         * Deberás implementar una función que multiplique dos números enteros.
         *
         * Firma del método:
         * public int multiplicar(int a, int b) {}
         *
         * Instrucciones:
         * 1. Implemente el método multiplicar.
         * 2. El método debe recibir dos números enteros como parámetros.
         * 3. Calcule el producto entre ambos números.
         * 4. Retorne el resultado.
         *
         */
        // Ejemplo de uso:
        int num1 = 12, num2 = 5;

        var resultado = num1 * num2;
        System.out.println(resultado);
        System.out.println("-".repeat(100));


        // Ejemplo de uso con la clase:
        int result = new Ejercicio7().multiplicar(5, 10);
        System.out.println(result);

    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
