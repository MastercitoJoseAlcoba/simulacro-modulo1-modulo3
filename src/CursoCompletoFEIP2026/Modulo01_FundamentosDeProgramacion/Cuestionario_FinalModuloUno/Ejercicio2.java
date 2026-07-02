package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 3; i > 0; i--) {
            switch (i - 1) {
                case 0:
                    System.out.print("1-");
                case 1:
                    System.out.print("2-");
                    break;
                case 2:
                    System.out.print("3-");
                    break;
                    // Imprime: 3-2-1-2 (porque el último no tiene break)

                default:
                    System.out.print("4-");
            }
        }
    }
}
