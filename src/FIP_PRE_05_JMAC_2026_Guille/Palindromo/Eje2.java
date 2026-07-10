package FIP_PRE_05_JMAC_2026_Guille.Palindromo;

public class Eje2 {

    public boolean esPalindromo(String palabra) {

        palabra = palabra.toLowerCase().replace(" ", "");

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

        Eje2 eje2 = new Eje2();

        String palabra = "reconocer";

        System.out.println(eje2.esPalindromo(palabra));
    }
}