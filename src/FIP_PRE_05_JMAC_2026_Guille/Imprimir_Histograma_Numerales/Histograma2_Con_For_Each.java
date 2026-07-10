package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma2_Con_For_Each {

    public static void main(String[] args) {

        int[] numeros = {4, 2, 6};

        for (int numero : numeros) {

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