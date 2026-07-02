package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Operadores;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Dadas las siguientes variables:
        int A = 5;
        int B = 3;
        int C = -12;
        boolean resultado = (A+B+C==4 && !(A%3==0)) || (A+B>7 && B*A==15) ? true : false;
        System.out.println("El resultado es: " + resultado);
    }
}
