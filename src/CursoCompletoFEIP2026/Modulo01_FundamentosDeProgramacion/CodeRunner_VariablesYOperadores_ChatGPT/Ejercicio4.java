package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Ejercicio 4: Clasificar las notas en letras
         * Fima del método: public String clasificarNota(double nota) {}
         *
         * Categorías:
         * 1. "A" si nota >= 90
         * 2. "B" si nota >= 80 y < 90
         * 3. "C" si nota >= 70 y < 80
         * 4. "D" si nota >= 60 y < 70
         * 5. "F" si nota < 60
         *
         */

        System.out.println(new Ejercicio4().clasificarNota(75));
        System.out.println(new Ejercicio4().clasificarNota(65));
        System.out.println(new Ejercicio4().clasificarNota(50));
        System.out.println(new Ejercicio4().clasificarNota(35));

    }
    public String clasificarNota(double nota) {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
