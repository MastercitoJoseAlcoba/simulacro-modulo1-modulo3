package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad;

public class Ejercicio2 {
    public static void main(String[] args) {
        int valor1 = 12345;
        int resultado1 = invertirNumero(valor1);
        System.out.println("El número invertido de " + valor1 + " es: " + valor1);
        System.out.println(invertirNumero(valor1)); // Resultado: 54321

        int valor2 = 5896;
        int resultado = invertirNumero(valor2);
        System.out.println("El número invertido de " + valor2 + " es: " + resultado);
        System.out.println(invertirNumero(valor2)); // Resultado: 6985

        /*
         * En este ejercicio, deberás implementar una función que permita invertir los dígitos de un número entero.
         * La función recibirá un número y deberá devolverlo con sus cifras en orden inverso.
         *
         * Instrucciones:
         * 1. Implemente el método invertirNumero. public static int invertirNumero (int numero).
         * 2. Utilice un bucle para recorrer los dígitos del número. While (numero > 0) {}
         * 3. En cada iteración:
         *                     a) Obtenga el último dígito utilizando el operador módulo (%).
         *                     b) Construya el número invertido acumulado ese dígito.
         *                     c) Elimine el último dígito del número original utilizando división entera.
         * 4. Continúe hasta que el número original sea 0.
         * 5. Retorne el número invertido.
         *
         */
    }
    public static int invertirNumero(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numero /= 10;
            /*
             * Inicio:
             * 1. numero = 12345
             * 2. invertido = 0
             *
             * Vuelta 1:
             * ultimoDigito = 12345 % 10 = 5
             * invertido = 0 * 10 + 5 = 5
             * numero = 12345 / 10 = 1234
             *
             * Vuelta 2:
             * ultimoDigito = 1234 % 10 = 4
             * invertido = 5 * 10 + 4 = 54
             * numero = 1234 / 10 = 123
             *
             * Vuelta 3:
             * ultimoDigito = 123 % 10 = 3
             * invertido = 54 * 10 + 3 = 543
             * numero = 123 / 10 = 12
             *
             * Vuelta 4:
             * ultimoDigito = 12 % 10 = 2
             * invertido = 543 * 10 + 2 = 5432
             * numero = 12 / 10 = 1
             *
             * Vuelta 5:
             * ultimoDigito = 1 % 10 = 1
             * invertido = 5432 * 10 + 1 = 54321
             * numero = 1 / 10 = 0
             *
             * Resultado: 54321
             *
             * La clave es esta:
             * 1. % 10 -> saca el último dígito.
             * 2. / 10 -> lo borra del número original.
             *
             * Uno agarra, el otro recorta.
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *
             */
        }
        return numeroInvertido;
    }
}
