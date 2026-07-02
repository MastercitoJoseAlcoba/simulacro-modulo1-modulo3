package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Pregunta 3:
         * En este ejercicio, deberás implementar una función que permita clasificar a un estudiante según su calificación.
         * La función recibirá una calificación entera y deberá retornar una categoría de desempeño en función del valor ingresado.
         *
         * Categorías:
         * 1. "Excelente", si la calificación es mayor o igual a 90.
         * 2. "Bueno", si la calificación es mayor o igual a 80 y menor que 90.
         * 3. "Aceptable", si la calificación es mayor o igual a 70 y menor que 80.
         * 4. "Insuficiente", si la calificación es menor que 70.
         *
         * Instrucciones:
         * 1. Analice el valor del parámetro.
         * 2. Utilice estructuras condicionales (if, else if, else) para determinar la categoría correspondiente.
         * 3. Retorne exactamente uno de los siguientes valores: "Excelente", "Bueno", "Aceptable", "Insuficiente".
         *
         */

        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println(ejercicio3.clasificarEstudiante(90));
        System.out.println(ejercicio3.clasificarEstudiante(85));
        System.out.println(ejercicio3.clasificarEstudiante(75));
        System.out.println(ejercicio3.clasificarEstudiante(60));

    }
    public String clasificarEstudiante(int calificacion) {
        if (calificacion >= 90) {
            return "Excelente";
        } else if (calificacion >= 80) {
            return "Bueno";
        } else if (calificacion >= 70) {
            return "Aceptable";
        } else {
            return "Insuficiente";
        }
    }
}
