package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Ejercicio 5: contar cuántos dígitos pares tiene un número
         *
         * Enunciado de la pregunta:
         * En este ejercicio, deberás implementar una función que cuente cuántos dígitos pares contiene un número entero.
         *
         * Firma del método:
         * public int contarDigitosPares(int numero) {}
         *
         * Instrucciones:
         * 1. Implemente el método contarDigitosPares.
         * 2. Utilice un bucle para recorrer cada dígito del número.
         * 3. En cada iteracióñ:
         *    a. Obtenga el último dígito usando %.
         *    b. Verifique si ese dígito es par.
         *    c. Si es par, incremente un contador.
         * 4. Retorne la cantidad total de dígitos pares encontrados.
         *
         */
        System.out.println( contarDigitosPares(123456789));


    }
    public static int contarDigitosPares(int numero) {
        int contador = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito % 2 == 0) {
                contador++;
            }
            numero /= 10;
        }
        return contador; // Resultado: 4
    }
}
