package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad;

public class Ejercicio3 {
    public static void main(String[] args) {
        int resultado1 = calcularCuadrado(5);
        System.out.println("El cuadrado es: " + resultado1);

        int resultado2 = calcularCuadrado(20);
        System.out.println("El cuadrado es: " + resultado2);


        /*
         * En este ejercicio, trabajarás con la definición y uso de funciones (métodos) en Java.
         * Deberás implementar una función que calcule el cuadrado de un número entero.
         *
         * Instrucciones:
         * 1. Implemente el método calcularCuadrado: public int calcularCuadrado
         * 2. El método debe recibir un número entero como parámetro. / int numero
         * 3. Calcule el cuadrado del número (multiplicado por sí mismo). return numero * numero;
         * 4. Retorne el resultado del cuadrado.
         *
         */
    }
    public static int calcularCuadrado(int numero) {
        int resultado = numero * numero;
        return numero * numero;
    }

}

