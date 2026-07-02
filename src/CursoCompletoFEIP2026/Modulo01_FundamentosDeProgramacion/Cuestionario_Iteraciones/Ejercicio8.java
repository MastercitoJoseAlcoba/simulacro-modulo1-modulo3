package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio8 {
    public static void main(String[] args) {
        int acumulado = 34;
        double dividendo = 350;
        for (int i = 35; i < 52; i=i+3) {
            acumulado += 10 + i;
            /**
             * Entonces suma:
             *
             * con i = 35 → suma 45
             * con i = 38 → suma 48
             * con i = 41 → suma 51
             * con i = 44 → suma 54
             * con i = 47 → suma 57
             * con i = 50 → suma 60
             *
             * 45 + 48 + 51 + 54 + 57 + 60 = 315
             * 34 + 315 = 349
             *
             */

            dividendo /= 2;

            /**
             * Va quedando así:
             *
             * 350 / 2 = 175
             * 175 / 2 = 87.5
             * 87.5 / 2 = 43.75
             * 43.75 / 2 = 21.875
             * 21.875 / 2 = 10.9375
             * 10.9375 / 2 = 5.46875
             *
             */
        }
        if (acumulado==378) {
            System.out.println("Ejecute la primer condición");
        } else if (acumulado == 349) { // Ejecuta la segunda condición e imprime: 349 y 5.46875
            System.out.println("Ejecute la segunda condición");
        } else {
            System.out.println("Ejecute el else");
        }
        System.out.println(acumulado);
        System.out.println(dividendo);
    }
}
