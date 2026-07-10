package FIP_PRE_05_JMAC_2026_Guille.Contar_Letras_A;

public class Eje4 {

    public static int contarA(String texto) {

        int contador = 0;

        for (char letra : texto.toLowerCase().toCharArray()) {

            if (letra == 'a') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        String texto = "Ana anda a caballo";

        System.out.println("Cantidad de letras a: " + contarA(texto));
    }
}