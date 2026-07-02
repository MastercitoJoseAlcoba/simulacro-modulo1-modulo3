package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Operadores;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Dadas las siguientes variables:
        int A = 5;
        int B = 3;
        int C = -12;
        boolean resultado = (A/B<3 && A%3<C) ? true : false;
        System.out.println("El resultado es: " + resultado);
    }
}
