package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma4_Controlando_Numeros_Negativos_Y_Cero {

    public static void main(String[] args) {

        int[] numeros = {3, 0, -2, 4, 1};

        imprimirHistograma(numeros);
    }

    public static void imprimirHistograma(int[] arr) {

        for (int numero : arr) {

            System.out.print(numero + " ");

            if (numero > 0) {

                for (int i = 1; i <= numero; i++) {

                    System.out.print("#");

                    if (i < numero) {
                        System.out.print("-");
                    }
                }
            }

            System.out.println();
        }
    }
}