package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * En este ejercicio, deberás implementar una función que permita calcular la potencia de un número.
         * La función recibirá una base y un exponente, y deberá retornar el resultado de elevar la base al exponente
         * indicado.
         *
         * Instrucciones:
         * Implemente el método calcularPotencia.
         * El método debe recibir dos parámetros:
         * base: número que será elevado.
         * exponente: potencia a la que se elevará la base.
         * Utilice el método Math.pow() para calcular la potencia.
         * Retorne el resultado obtenido.
         *
         */
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double resultado1 = ejercicio6.calcularPotencia(2, 3);
        System.out.println(resultado1);

        double resultado2 = ejercicio6.calcularPotencia(5, 2);
        System.out.println(resultado2);

    }
    public double calcularPotencia(int base, int exponente) {
        // Implementa la lógica para calcular la potencia
        return Math.pow(base, exponente);
    }
}
