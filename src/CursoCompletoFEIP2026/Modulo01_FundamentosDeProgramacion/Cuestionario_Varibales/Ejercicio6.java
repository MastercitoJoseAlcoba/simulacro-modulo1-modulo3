package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Varibales;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * Pregunta 6:
         * ¿Cuál es la diferencia entre == y .equals() al comparar variables de tipo String en Java?
         * a. == compara el contenido de las cadenas, mientras que .equals() compara las referencias de objetos.
         * b. Ambos son equivalentes y se pueden usar indistintamente.
         * c. .equals() compara el contenido de las cadenas, mientras que == compara las referencias de objetos. ✅
         * d. Java no permite comparar cadenas de texto.
         */

        // Ejemplo:
        String cadena1 = "Hola";
        String cadena2 = "Hola";
        System.out.println(cadena1 == cadena2); // Imprime: false, compara referencias
        System.out.println(cadena1.equals(cadena2)); // Imprime: true, compara contenido

        /*
         * ¿Por qué?
         * 1. == pregunta si ambos apuntan al mismo objeto en la memoria.
         * 2. .equals() pregunta si ambos tienen el mismo texto.
         */
    }
}
