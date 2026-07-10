package FIP_PRE_05_JMAC_2026_Guille.Contar_Letras_A;

public class Eje3 {

    public int contarA(String texto) {

        int cantidad = 0;

        for (int i = 0; i < texto.length(); i++) {

            char letra = Character.toLowerCase(texto.charAt(i));

            if (letra == 'a') {
                cantidad++;
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {

        Eje3 eje3 = new Eje3();

        String texto = "La casa amarilla";

        System.out.println("Cantidad de letras a: " + eje3.contarA(texto));
    }
}