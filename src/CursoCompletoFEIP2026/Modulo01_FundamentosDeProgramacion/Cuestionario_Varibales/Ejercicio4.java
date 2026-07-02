package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Varibales;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * Pregunta 4:
         * ¿Qué es el alcance (scope) de una variable en Java?
         * a. El número de veces que se puede acceder a la variable.
         * b. La región del programa en la que la variable puede ser utilizada. ✅
         * c. La velocidad con la que la variable se inicializa.
         * d. La cantidad de memoria que ocupa la variable.
         *
         */

        // Ejemplo:
        if (true) {
            int numero = 5;
            System.out.println(numero); // Dentro del alcance del scope
        }
//        System.out.println(numero); Fuera del alcance del scope
    }
}
