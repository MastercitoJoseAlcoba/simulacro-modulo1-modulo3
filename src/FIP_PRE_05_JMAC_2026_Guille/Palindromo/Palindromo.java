package FIP_PRE_05_JMAC_2026_Guille.Palindromo;

public class Palindromo {

    public boolean esPalindromo(String palabra) {

        palabra = palabra.toLowerCase();

        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {

            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }

            inicio++;
            fin--;
        }

        return true;
    }

    public static void main(String[] args) {

        Palindromo prueba = new Palindromo();

        String palabra = "reconocer";

        System.out.println(prueba.esPalindromo(palabra));
    }
}