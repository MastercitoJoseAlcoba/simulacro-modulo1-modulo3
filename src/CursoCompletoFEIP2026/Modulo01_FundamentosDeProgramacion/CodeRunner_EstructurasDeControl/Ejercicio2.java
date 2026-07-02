package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Pregunta 2:
         * En este ejercicio, deberás implementar una función que permita evaluar la aprobación de un estudiante con
         * base en su calificación.
         * La función recibirá una calificación entera comprendida entre 0 y 100 (inclusive), y deberá retornar un mensaje
         * indicando si el estudiante aprueba o reprueba el curso.
         *
         * Firma del método:
         * public String evaluarAprobación (int calificación) {}
         *
         */

        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println(ejercicio2.evaluarAprobacion(85));
        System.out.println(ejercicio2.evaluarAprobacion(45));
        System.out.println(ejercicio2.evaluarAprobacion(60));
        System.out.println();


    }
    public String evaluarAprobacion(int calificacion) {
        if (calificacion >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
