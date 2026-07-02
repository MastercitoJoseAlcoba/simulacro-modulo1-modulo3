package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_2.Pregunta11;

public class Pregunta11 {
    public static void contarVocalesYConsonantes(String texto) {
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));

            // Solo contamos letras
            if (Character.isLetter(letra)) { // La clave está acá.
                                             // Eso hace que ignore espacios, números y símbolos.
                                             //Después, si es letra, pregunta si es vocal. Si no es vocal, entonces cuenta como consonante.

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
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
        contarVocalesYConsonantes("Java es genial");
        contarVocalesYConsonantes("1234567890");
    }
}



