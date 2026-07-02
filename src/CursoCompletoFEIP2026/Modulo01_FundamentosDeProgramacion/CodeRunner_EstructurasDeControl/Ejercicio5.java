package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Pregunta 5:
         * En este ejercicio, deberás trabajar con estructuras repetitivas, especialmente utilizando un bucle while.
         * La función deberá calcular la suma de todos los números naturales desde 1 hasta el valor límite dado.
         *
         * Instrucciones:
         * 1. Inicialice una variable suma en 0. (int suma = 0)
         * 2. Utilice una variable auxiliar (por ejemplo, contador) para recorrer los números desde 1 hasta limite. (int contador = 1)
         * 3. Utilice un bucle while para iterar mientras el contador no supere el límite.
         * 4. En cada iteración, acumule el valor del contador en la variable suma. (suma += contador)
         * 5. Retorne el resultado final. (return suma)
         */
    }
    public static int sumaDeNaturales(int limite) {
        int suma = 0;
        int contador = 1;
        while (contador <= limite) {
            suma += contador;
            contador++;
        }
        return suma;
    }
}
