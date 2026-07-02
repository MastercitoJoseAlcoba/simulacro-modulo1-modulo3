package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Ejercicio3: sumar los dígitos de un número
         *
         * Enunciado de la pregunta:
         * En este ejercicio, deberás implementar una función que permita sumar todos los dígitos de un número entero.
         *
         * Firma del método:
         * public int sumarDigitos(int numero) {}
         *
         * Instrucciones:
         * 1.Implemente el método sumarDigitos.
         * 2. Utilice un bucle para recorrer los dígitos del número.
         * 3. En cada iteración:
         *    a. Obtenga el último dígito usando %.
         *    b. Súmelo a un acumulador.
         *    c. Elimine el último dígito usando /.
         * 4. Retorne la suma total.
         *
         */

        System.out.println(sumarDigitos(1234));

    }
    public static int sumarDigitos(int numero) {
        int suma = 0; // acá guardamos la suma total

        while (numero > 0) { // mientras que el número sea mayor que cero
            int ultimoDigito = numero % 10; // saca el último dígito
            suma += ultimoDigito; // los suma a la variable suma
            numero /= 10; // elimina el último dígito
        }
        return suma; // devuelve el resultado final
    }
}

/**
 * Ejemplo con el número 1234:
 *
 * 1234 % 10 = 4 (Resto) -> suma 4 a la suma total
 * 123 % 10 = 3 (Resto) -> suma 3 a la suma total
 * 12 % 10 = 2 (Resto) -> suma 2 a la suma total
 * 1 % 10 = 1 (Resto) -> suma 1 a la suma total
 *
 * Resultado: 10
 *
 * Si el número es 0, devuelve 0.
 *
 */