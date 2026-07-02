package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Varibales;

public class Ejercicio1 { // AcumuladorPregunta
    public static void main(String[] args) {
        /**
         * 1) Variables: definición y asignación
         * Las variables son espacios reservados en memoria que permiten almacenar datos con nombre, tipo y valor.
         * Se revisan sus caracteristicas, cómo se declaran y asignan, los tipos más comunes en Java y buenas prácticas.
         */
        /*
         * Pregunta 1:
         * Dado el siguiente código identificar cuál es la variable definida como acumulador:
         */
        String dato = "Utec está presente en varias localidades del interior";
        int i = 0;
        int s = 0; // Acumulador, va guardando el resultado de la suma
        int j = 0;
        for (int l = 1; l<10; l++) {
            s += l;
        }
        System.out.println(s); // Imprime: 45
    }
}
