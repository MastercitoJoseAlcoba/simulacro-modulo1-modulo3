package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma7_Sin_Guiones {

    public static void main(String[] args) {

        int[] numeros = {3, 5, 2};

        for (int numero : numeros) {

            System.out.print(numero + " ");

            for (int i = 0; i < numero; i++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}