package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Ejercicio 4: calcular el cubo de un número
         *
         * Enunciado de la pregunta:
         * En este ejercicio, trabajarás con funciones (métodos) para realizar operaciones aritméticas simples.
         * Deberás implementar una función que calcule el cubo de un número entero.
         *
         * Firma del método:
         * public int calcularCubo (int numero) {}
         *
         * Instrucciones:
         * 1. Implemente el método calcularCubo.
         * 2. El método debe recibir un número entero como parámetro.
         * 3. Calcule el cubo multiplicando el número por sí mismo tres veces.
         * 4. Retorne el resultado del cubo.
         *
         */

        int resultado = calcularCubo(5);
        System.out.println(resultado);


    }
    public static int calcularCubo(int numero1) {
        return (int) Math.pow(numero1, 3);

    }
}
