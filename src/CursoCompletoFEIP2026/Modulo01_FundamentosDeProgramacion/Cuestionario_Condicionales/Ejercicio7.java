package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        int num3 = 2;
        int result = num1 + num2 / num3 + num2;
        if (result>25)
            result++; // 29
        else
            result--; // No interfiere en el final de la pregunta
        System.out.println(result++); // Imprime: 30
    }

    /**
     * Pregunta 7:
     * ¿Cuál es el valor de la variable result al terminar el programa?
     * a. 29
     * b. 24
     * c. 28
     * d. 30 ✅
     *
     */
}
