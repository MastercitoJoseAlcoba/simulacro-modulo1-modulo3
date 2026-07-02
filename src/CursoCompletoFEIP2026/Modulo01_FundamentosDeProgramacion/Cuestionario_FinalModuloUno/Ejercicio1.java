package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 123;
        int b = 235;
        int c = 332;

        int suma1 = a + b;
        int suma2 = b + c;

        int valor = metodo(suma1, suma2);
        System.out.println(valor);
    }

    private static int metodo(int s1, int s2) {
        int resultado;
        resultado = s1 > s2 ? s1 : s2; // Operador ternario: ? s1 : s2 (false)
        return resultado;
    }
    // Imprime: 567
}

