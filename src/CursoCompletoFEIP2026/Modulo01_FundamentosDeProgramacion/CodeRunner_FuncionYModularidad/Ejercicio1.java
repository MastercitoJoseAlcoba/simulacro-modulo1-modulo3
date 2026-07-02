package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * En este ejercicio trabajarás con la definición de funciones (métodos) y el uso de operadores aritméticos para
         * evaluar una condición.
         * Deberás implementar una función que determine si un número entero es par o impar.
         *
         * Instrucciones:
         * 1. Implemente el método esPar: public boolean esPar
         * 2. El método debe recibir un número entero como parámetro. / int numero
         * 3. Determine si el número es par utilizando el operador módulo (%). return numero % 2 == 0 ;
         * 4. Si el número es par, retorne true.
         * 5. Si el número es impar, retorne false.
         */

        int valor1 = 8;
        int valor2 = 3;
        boolean resultado1 = esPar (valor1);
        boolean resultado2 = esPar (valor2);

        if (resultado1) {
            System.out.println(valor1 + " es un número par" );
        } else {
            System.out.println(valor1 + " es un número impar" );
        }

        if (resultado2) {
            System.out.println(valor2 + " es un número par" );
        } else {
            System.out.println(valor2 + " es un número impar" );
        }

    }
    public static boolean esPar (int numero) {
        return numero % 2 == 0;
    }
}
