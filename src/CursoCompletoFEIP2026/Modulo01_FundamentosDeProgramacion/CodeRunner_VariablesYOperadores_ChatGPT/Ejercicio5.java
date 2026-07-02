package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         *
         * Ejercicio 5: Sumar números impares en un rango
         *
         * Firma del método:
         * public int sumarNumerosImpares(int inicio, int fin) {}
         *
         * Instrucciones:
         * 1. Recorrer desde inicio hasta fin (ambos inclusive) utilizando un bucle for.
         * 2. Sumar solo números impares.
         * 3. Retornar el resultado de la suma.
         *
         */

        System.out.println(sumarNumerosImpares(1, 10)); // Salida: 1 + 3 + 5 + 7 + 9 = 25
    }
    public static int sumarNumerosImpares (int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return suma;
    }
}
