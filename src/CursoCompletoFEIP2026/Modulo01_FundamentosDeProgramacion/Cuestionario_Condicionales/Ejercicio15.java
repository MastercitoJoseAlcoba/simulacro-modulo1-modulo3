package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio15 {
    public static void main(String[] args) {
        int valor1 = 55;
        valor1++;
        valor1++;

        int valor2 = 76;
        int valor3 = 10;
        int valor4 = -15;

        valor3 = valor3 + 11;

        boolean comparacion = !((valor1 >= valor3) && (valor4 < valor3));

        if (comparacion || valor2 == 78 - 1) {

            valor4 = valor4 + 15;

            if (valor1 == 57) {
                System.out.print("entre en el if del primer if de la decision");
                valor3 = 32;
            } else {
                System.out.print("entre en el else del primer if de la decision");
                valor3 = 67 + valor1;
            }

        } else if (comparacion) {
            System.out.print("entre en el primer else if de la decision");

        } else if (comparacion && valor2 == 76) {
            System.out.print("entre en el segundo else if de la decision");
            int numero = valor3 + 10;
            valor3 = valor3 + numero + 100;
            valor4 = valor4 + 30;

        } else if (comparacion || valor2 == 77 - 1) {

            valor4 = valor4 + 15;

            if (valor4 == 0) {
                System.out.print("entre en if del tercer else if de la decision");
                valor3 = (valor2 + valor4) * 2;
            } else {
                System.out.print("entre en else del tercer else if de la decision");
                valor1 = 45;
                valor1++;
            }

        } else {
            System.out.print("entre en el else de la decision");
            valor1 = valor1 + 30;
            valor4 = valor1 * 2;
        }

        System.out.println();
        System.out.println("valor1 = " + valor1);
        System.out.println("valor2 = " + valor2);
        System.out.println("valor3 = " + valor3);
        System.out.println("valor4 = " + valor4);
        System.out.println("comparación = " + comparacion);

        // El resultado es:
        // entre en if del tercer else if de la decision.
    }
}


