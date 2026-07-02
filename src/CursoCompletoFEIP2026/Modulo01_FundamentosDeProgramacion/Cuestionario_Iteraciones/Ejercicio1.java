package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio1 {
    public static void main(String[] args) {
        boolean ejecutar = true;
        double numero = 0;
        int sumador = 40;
        int acumulador = 0;

        while (ejecutar) {
            if (numero==10 || numero==20) {
                numero=numero + sumador;
            }
            else if (numero==0 || numero==40) {
                numero = numero + sumador;
            }
            else if (numero==80){
                numero = numero + 80;
            }
            else if (numero==160){
                ejecutar = false;
                numero = numero * 2;
            }
            else {
                ejecutar = false;
                numero = 0;
            }
            acumulador++;
        }
        System.out.println(acumulador);
        System.out.println(numero);
        for (int i = 14; i>0; i--) {
            System.out.println("Imprimimos varías veces el for");
        }
        System.out.println(numero);

        // Imprimimos varias veces el for, resultado: 320
    }
}
