package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad;

public class Ejercicio5 {
    public static void main(String[] args) {
        int valor1 = 13;
        boolean resultado1 = esPrimo(valor1);
        if (resultado1) {
            System.out.println(valor1 + " es un número primo.");
        } else {
            System.out.println(valor1 + " no es un número primo.");
        }

        int valor2 = 8;
        boolean resultado2 = esPrimo(valor2);
        if (resultado2) {
            System.out.println(valor2 + " es un número primo.");
        } else {
            System.out.println(valor2 + " no es un número primo.");
        }
        /*
         * En este ejercicio, deberás implementar una función que permita determinar si un número entero es primo.
         * Un número primo es aquel que solo es divisible por 1 y por sí mismo.
         *
         * Instrucciones:
         * 1. Implemente el método esPrimo: public boolean esPrimo (int numero)
         * 2. Si el número es menor o igual a 1, retorne false. / return numero <= 1;
         * 3. Utilice un bucle para verificar si el número tiene divisores de 1 y de sí mismo.
         * 4. Si encuentra algún divisor, retorne false. / return numero % 1 == 0 || numero % numero == 0;
         * 5. Si no encuentra divisores, retorne true. / return true;
         *
         */
    }
    public static boolean esPrimo (int numero) {
        if (numero <= 1) { // Ejemplo con 13: 13 % 2 == 1;
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) { // Ejemplo con 8: 8 % 2 == 0;
                return false;
            }
        }
        return true;
    }
}
