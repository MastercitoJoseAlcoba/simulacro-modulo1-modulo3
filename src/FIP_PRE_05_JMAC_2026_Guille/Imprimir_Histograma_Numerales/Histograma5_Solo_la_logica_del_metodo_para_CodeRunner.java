package FIP_PRE_05_JMAC_2026_Guille.Imprimir_Histograma_Numerales;

public class Histograma5_Solo_la_logica_del_metodo_para_CodeRunner {
    public static void main(String[] args) {
    }

    public void numeros(int[] arr) {

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

