package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl_ChatGPT;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Ejercicio 3: método para restar
         *
         * Enunciado:
         * En este ejercicio, trabajarás con métodos en Java y el uso de parámetros.
         * Un método puede recibir datos de entrada y devolver un resultado luego de realizar una operación.
         *
         * Consigna:
         * Implemente un método llamado resta que reciba dos números enteros como parámetros y retorne la resta del
         * primero menos el segundo.
         *
         * Instrucciones:
         * 1. Defina correctamente los parámetros del método.
         * 2. Utilice el operador -.
         * 3. El método debe retornar el resultado.
         * 4. No debe imprimir el resultado, sino retornarlo.
         *
         */

        // Llamamos al método resta y pasamos los valores 10 y 5 como argumentos
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int resultado = ejercicio3.resta(10, 5);
        System.out.println(resultado);


    }
    // Plantilla base
    public int resta(int a, int b) { // (parámetro 1, parámetro 2)
        return a - b;
    }
}
