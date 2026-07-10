package FIP_PRE_05_JMAC_2026_Guille.Contar_Letras_A;

public class ContarA {

    public int contarLetrasA(String palabra) {

        int contador = 0;

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        ContarA prueba = new ContarA();

        String palabra = "Manzana";

        System.out.println(prueba.contarLetrasA(palabra));
    }
}