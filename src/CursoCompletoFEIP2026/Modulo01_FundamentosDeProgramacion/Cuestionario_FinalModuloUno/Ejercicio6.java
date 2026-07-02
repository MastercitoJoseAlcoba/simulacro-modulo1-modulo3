package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a = 15, b = 23, c = 30;

        a++;
        b--;
        c++;

        boolean resultado = a + b + c == 68 && a > (c - a) || a > (b - 8);
        int suma = a + b + c; // 69

        System.out.println(suma);
        System.out.println(!resultado); // false

        // 2. El valor que se imprime de suma es 69 y el valor de resultado al terminar es true, no pregunta el valor
        // que imprime al terminar true porque ahy seríá false (!).
    }
}