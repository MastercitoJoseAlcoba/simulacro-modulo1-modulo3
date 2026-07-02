package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio10 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        int result = num1 + num2 / 2 + num2;
        if (result>25) // (28>25)
            result++; // 29
        else
            result--; // No influye en el final de la pregunta
        System.out.println(result++); // Imprime: 29

        /**
         * Pregunta 10:
         * ¿Qué valor imprime por la consola:
         * a. 22
         * b. 23
         * c. 28
         * d. 29 ✅
         */
    }
}
