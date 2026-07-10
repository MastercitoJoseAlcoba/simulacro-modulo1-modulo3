package FIP_PRE_05_JMAC_2026_Guille.Pregunta04;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.esPalindromo("radar"));

    }
    public boolean esPalindromo(String palabra){
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }

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
}
