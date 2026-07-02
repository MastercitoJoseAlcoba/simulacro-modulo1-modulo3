package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio18 {
    public static void main(String[] args) {
        boolean ejecutar = true;
        double operacion = 10;
        int acumulador = 0;

        while (ejecutar) {
            if (acumulador == 18) {
                ejecutar = false;
                acumulador = 78;
            }

            operacion *= acumulador;
            acumulador++;
        }

        System.out.println(acumulador);
        System.out.println(operacion);

        // Imprime: acumulador = 79 - operacion = 0.00
    }
}

