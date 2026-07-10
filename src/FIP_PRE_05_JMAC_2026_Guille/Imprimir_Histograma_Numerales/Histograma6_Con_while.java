package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma6_Con_while {

    public static void main(String[] args) {

        int[] numeros = {2, 5, 3};

        int i = 0;

        while (i < numeros.length) {

            System.out.print(numeros[i] + " ");

            int j = 1;

            while (j <= numeros[i]) {

                System.out.print("#");

                if (j < numeros[i]) {
                    System.out.print("-");
                }

                j++;
            }

            System.out.println();

            i++;
        }
    }
}