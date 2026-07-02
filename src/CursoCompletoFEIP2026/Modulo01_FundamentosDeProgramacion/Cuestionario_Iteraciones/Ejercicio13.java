package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Se saltea los pares con el continue.
            }
            System.out.print(i + "-"); // Imprime: 1-3-5-7-9-
        }
    }
}