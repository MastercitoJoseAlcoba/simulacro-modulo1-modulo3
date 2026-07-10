package FIP_PRE_05_JMAC_2026_Guille.Pregunta03;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.contarLetra("Hola, mundo!"));

    }
    public int contarLetra(String texto){

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
}
