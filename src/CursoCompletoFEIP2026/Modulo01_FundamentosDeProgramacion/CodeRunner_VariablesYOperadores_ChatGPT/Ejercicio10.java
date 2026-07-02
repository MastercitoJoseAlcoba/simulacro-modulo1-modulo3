package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio10 {
    public static void main(String[] args) {
        /**
         * Ejercicio 10: Sumar de 5 en 5 con do-while
         *
         * Instrucciones:
         * 1. Comenzar en 0.
         * 2. Usar do-while.
         * 3. Ir sumando 5 hasta superar el límite.
         * 5. Retornar el último valor sumado.
         *
         */
        System.out.println(sumarDe5En5(10));


    }
    public static int sumarDe5En5(int limite) {
        int suma = 0;
        do {
            suma += 5;

            /**
             * 0 + 5 = 5
             * 5 + 5 = 10
             * 10 + 5 = 15 -> como 15 <= 10, es falso, termina y devuelve 15
             */

        } while (suma <= limite); // false
        // while (suma + 5 <= límite) {} // Si quieres que se ejecute al menos una vez, y no se pase del límite.
        return suma;
    }
}
