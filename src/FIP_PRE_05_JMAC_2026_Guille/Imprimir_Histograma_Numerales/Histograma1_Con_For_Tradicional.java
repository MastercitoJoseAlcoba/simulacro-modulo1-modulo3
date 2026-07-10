package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma1_Con_For_Tradicional {

    public static void main(String[] args) {

        int[] numeros = {3, 5, 2};

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

            for (int j = 1; j <= numeros[i]; j++) {

                System.out.print("#");

                if (j < numeros[i]) {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}