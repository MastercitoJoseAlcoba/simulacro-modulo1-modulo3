package Espacio_De_Practicas.CodeRunner01.Pregunta04;

public class Main {
    public static boolean validarVocal(String palabra) {
        if (palabra == null) {
            return false;
        }

        if (palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));

            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palabra1="Aei";
        System.out.println(validarVocal(palabra1));

        String palabra2="aeijk";
        System.out.println(validarVocal(palabra2));
    }
}
