package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio19 {
    public static void main(String[] args) {
        int numero = 7;
        System.out.println(factorial(numero));
    }
    private static int factorial(int numero) {
        int suma = 1;
        for (int i = numero; i >= 2; i--) {
            suma = suma * i;
        }
        return suma;
        // Imprime: 5040
    }
}
