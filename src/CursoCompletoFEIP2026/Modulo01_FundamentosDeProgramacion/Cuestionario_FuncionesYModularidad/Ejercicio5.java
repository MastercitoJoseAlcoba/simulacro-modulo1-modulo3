package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 15; // 1+2+3+4+5+6+7+8+9+10+11+12+13+14+15 = 120 (int numero = Sirve como límite del for)
        System.out.println(sumar(numero));

    }
    public static int sumar(int numero) {
        int acumulador = 0;
        for (int i = 1; i<=numero; i++) {
            acumulador = acumulador + i;
        }
        return acumulador;

    }
}
