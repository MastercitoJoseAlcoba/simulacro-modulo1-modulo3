package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl_ChatGPT;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Ejercicio 1: cociente de una división entera en Java.
         *
         * Enunciado:
         * En este ejercicio, trabajarás con la división entera en Java.
         * Cuando dividimos dos números enteros con /, Java devuelve solo la parte entera del resultado.
         *
         */

        // Ejemplo
        int resultado = 10 / 3;
        System.out.println(resultado); // Salida: 3

        /**
         * Consigna:
         * Cree un método llamado cociente que reciba dos números enteros: numero y divisor.
         * El método debe retornar el cociente de la división entre ambos valores.
         *
         * Instrucciones:
         * 1. Utilice el operador /.
         * 2. El método debe retornar un valor de tipo int.
         * 3. No debe imprimir el resultado, sino retornarlo.
         *
         */

        // Llamamos al método cociente y pasamos los valores 10 y 3 como argumentos
        int cociente1 = cociente(20, 5);
        int cociente2 = cociente(10, 3);
        System.out.println(cociente1); // Salida: 4
        System.out.println(cociente2); // Salida: 3

    }
    public static int cociente(int numero, int divisor) {
        return numero / divisor;
    }
}
