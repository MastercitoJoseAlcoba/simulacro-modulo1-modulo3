package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Pregunta 1:
         * En este ejercicio, trabajarás con la definición de métodos en Java y el uso de parámetros.
         * Un método permite encapsular una funcionalidad específica. En este caso, se busca implementar un método que
         * reciba valores de entrada y retorne un resultado.
         *
         * Ejemplo:
         * public int suma (int a, int b) {
         *    return a + b;
         * }
         *
         * Consigna:
         * Implemente un método llamado suma que reciba dos números enteros como parámetros y retorne la suma de ambos.
         *
         * Instrucciones:
         * 1. Defina correctamente los parámetros del método.
         * 2. Utilice el operador + para realizar la suma.
         * 3. El método debe retornar el resultado de la suma.
         * 4. No debe imprimir resultado, sino retornarlo.
         *
         */

        System.out.println(suma(1, 2));
    }
    public static int suma(int a, int b) {

        return a + b;
    }
}
