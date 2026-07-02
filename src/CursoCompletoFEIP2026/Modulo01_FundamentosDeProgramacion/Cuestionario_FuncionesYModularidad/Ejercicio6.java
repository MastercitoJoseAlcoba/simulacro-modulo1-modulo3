package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio6 {
    public static void main(String[] args) {
        int bits = 8;
        int valores = 2;

        int resultado = potencia(valores, bits);
        System.out.println(resultado);
    }

    private static int potencia(int valores, int bits) {
        return (int) Math.pow(valores, bits);
    }
}
