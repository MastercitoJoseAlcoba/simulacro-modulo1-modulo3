package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Pregunta 4:
         * En este ejercicio, deberás trabajar con estructuras repetitivas y calcular la suma de aquellos que cumplen
         * una condición específica.
         *
         * Firma del método:
         * public int sumaNumerosPares (int inicio, int fin) {}
         *
         * Instrucciones:
         * 1. Recorra todos los números enteros desde inicio hasta fin (ambos inclusive) utilizando un bucle for.
         * 2. Identifique cuáles de esos números son pares.
         * 3. Sume únicamente los números pares encontrados.
         * 4. Retorne el resultado de la suma.
         *
         *
         */

        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println(ejercicio4.sumaNumerosPares(1, 10));

    }
    public int sumaNumerosPares(int inicio, int fin) {
         int suma = 0;
         for (int i = inicio; i <= fin; i++) {
             if (i % 2 == 0) {
                 suma += i;
             }
        }
         return suma;

    }
}
