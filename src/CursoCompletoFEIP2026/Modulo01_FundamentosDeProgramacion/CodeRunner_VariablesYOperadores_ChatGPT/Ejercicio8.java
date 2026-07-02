package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Ejercicio 8: Contar hacia atrás con while
         *
         * Instrucciones:
         * 1. Usar un while para disminuir el número hasta llegar a 0.
         * 2. Retornar el valor final.
         *
         */
        System.out.println(contarHaciaAtras(5)); // 5, 4, 3, 2, 1, 0
        System.out.println(contarHaciaAtras(10)); // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
        System.out.println(contarHaciaAtras(15)); // 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
        System.out.println(contarHaciaAtras(20)); // 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0

    }
    public static int contarHaciaAtras(int numero) {
        int contador = numero;
        while (contador > 0) {
            System.out.println(contador); // Si querés que no imprima los números y solo cuente internamente, se quita esta línea.
            contador--;
        }
        return contador;
    }
}
