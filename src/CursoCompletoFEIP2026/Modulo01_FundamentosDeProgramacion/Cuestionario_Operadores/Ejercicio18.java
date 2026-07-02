package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Operadores;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Dadas las siguientes variables:
        int i = 7;
        float f = 5.5F;
        char c = 'w';
        boolean resultado = !(!(c != 'p') || (i % 2 == 0)) ? true : false;
        System.out.println("El resultado es: " + resultado); // Imprime: false
    }
}
