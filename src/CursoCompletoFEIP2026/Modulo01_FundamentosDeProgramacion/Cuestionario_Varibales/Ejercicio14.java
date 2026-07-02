package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Varibales;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Dado el siguiente código en Java:
        double a = 15.9;
        float b = 13.8f;
        double suma = a + b; // Suma: 29.7
        suma++; // Suma: 30.7
        suma++; // Suma: 31.7
        int c = (int) suma; // Convierte a entero: 31
        c--; // Resta: 30
        c--; // Resta: 29
        c--; // Resta: 28
        c+= 23; // Suma: 51
        c*= 3; // Multiplica: 153
        System.out.println(c); // Imprime 153

        /*
         * Pregunta 14:
         * ¿Que se imprime en la consola al ejecutar este programa?
         * a. 145
         * b. El programa da un problema de compilación al tratar de ejecutar.
         * c. 153 ✅
         * d. 154
         */

    }
}
