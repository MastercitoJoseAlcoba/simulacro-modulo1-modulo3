package Espacio_De_Practicas.CodeRunner02.Pregunta11;

public class Main {
    public static void contarVocalesYConsonantes(String texto) {
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (Character.isLetter(letra)) {
                char letraMinuscula = Character.toLowerCase(letra);

                if (letraMinuscula == 'a' ||
                        letraMinuscula == 'e' ||
                        letraMinuscula == 'i' ||
                        letraMinuscula == 'o' ||
                        letraMinuscula == 'u') {

                    vocales++;

                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    public static void main(String[] args) {
        contarVocalesYConsonantes("Hola Mundo");
        contarVocalesYConsonantes("Java es Genial");
        contarVocalesYConsonantes("La primer prueba correctamente");
        contarVocalesYConsonantes("Estamos probando este metodo");
        contarVocalesYConsonantes("123");
    }
}
