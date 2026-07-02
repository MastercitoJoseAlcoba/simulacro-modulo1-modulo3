package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad;

public class Ejercicio4 {
    public static void main(String[] args) {
        int valor1 = 98765;
        int resultado1 = contarDigitos(valor1);
        System.out.println("El número " + valor1 + " tiene " + resultado1 + " dígitos.");

        int valor2 = 98;
        int resultado2 = contarDigitos(valor2);
        System.out.println("El número " + valor2 + " tiene " + resultado2 + " dígitos.");

        /*
         * En este ejercicio, deberás implementar una función qu permita contar la cantidad de dígitos de un número entero.
         * La función deberá analizar el número recibido y determinar cuántas cifras lo componen.
         *
         * Instrucciones:
         * 1. Implemente el método contarDígitos. public static int contarDígitos (int numero)
         * 2. Si el número es igual a 0, debe retornar 1. / return numero == 0 ? 1 : (int) Math.log10(numero) + 1;
         * 3. Utilice un bucle para dividir el número entre 10 en cada iteración.
         * 4. En cada iteración, incremente un contador para llevar registro de la cantidad de dígitos. int contador = 0;
         * 5. Finalice el proceso cuando el número sea igual a 0.
         * 6. Retorne la cantidad total de dígitos encontrados.
         *
         */

    }
    public static int contarDigitos (int numero) {
        if (numero == 0) {
            return 1; // Cero tiene un dígito porque devuelve 1.
        }
        int contador = 0;

        while (numero != 0) {
            numero = numero / 10;
            contador++;
            /*
             * Ejemplo 1 con 98765
             * 98765 / 10 = 9876 -> contador = 1
             * 9876 / 10 = 987 -> contador = 2
             * 987 / 10 = 98 -> contador = 3
             * 98 / 10 = 9 -> contador = 4
             * 9 / 10 = 0 -> contador = 5
             * Resultado: 5
             *
             * En resumen: Cada división borra un dígito. Llegando a 0 sabes cuantos dígitos tienés.
             *
             * Ejemplo 2 con 98
             * 98 / 10 = 9 -> contador = 1
             * 9 / 10 = 0 -> contador = 2
             * Resultado: 2
             */
        }
        return contador;
    }
}
