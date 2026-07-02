package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio6 {
    public static void main(String[] args) {
        String nombre1 = "Juan";
        String nombre2 = "Juan";
        String nombre3 = "Ana";
        int pago = (nombre1==nombre2) || (nombre1.equals(nombre3)) ? 1000 : 500;
        pago += 500;
        System.out.println("El pago es: " + pago++); // Se imprime pago primero y después se aumenta en 1, 1500 quedaria

        /**
         * Pregunta 6
         * ¿Qué es lo que se muestra por consola?
         * a. 1501
         * b. 1500 ✅
         * c. 1000
         * d. 1001
         *
         */



    }
}
