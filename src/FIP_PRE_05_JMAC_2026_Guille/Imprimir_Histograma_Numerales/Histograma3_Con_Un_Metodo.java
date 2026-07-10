package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma3_Con_Un_Metodo {

    public static void main(String[] args) {

        int[] numeros = {3, 1, 5, 2};

        imprimirHistograma(numeros);
    }

    public static void imprimirHistograma(int[] arr) {

        for (int numero : arr) {

            System.out.print(numero + " ");

            for (int i = 1; i <= numero; i++) {

                System.out.print("#");

                if (i < numero) {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}