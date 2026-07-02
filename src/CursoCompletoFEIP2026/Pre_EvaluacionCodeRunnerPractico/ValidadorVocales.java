package CursoCompletoFEIP2026.Pre_EvaluacionCodeRunnerPractico;

public class ValidadorVocales {

    public boolean validarVocal(String palabra) {

        if (palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' &&
                    letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
                return false;
            }
        }

        return true;
    }
}