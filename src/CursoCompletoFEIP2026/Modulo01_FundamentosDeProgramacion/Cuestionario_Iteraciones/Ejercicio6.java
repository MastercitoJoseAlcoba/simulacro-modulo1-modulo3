package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio6 {
    public static void main(String[] args) {
        boolean ejecutar = true;
        double numero = 0;
        int sumador = 40;
        int acumulador = 0;

        while (ejecutar) {
            if (numero==10 || numero==20) {
                numero=numero + 10;
            } else if (numero==0 || numero==40) {
                numero = numero + sumador;
            } else if (numero==80) {
                numero = numero + 80;
            } else if (numero==160) {
                ejecutar = false;
                numero = numero * 2;
            } else {
                ejecutar = false;
                numero = 0;
            }
            acumulador++;
        }
        System.out.println(acumulador);
        System.out.println(numero);

        for (int i = 14; i>0; i--) {
            System.out.println("Imprimimos varias veces el for");
            numero = numero + i;
        }
        System.out.println(numero);

        // Imprime: 14 veces el for.
        // Va desde 14 hasta 1, va iterando de 1 en 1.

    }

}

