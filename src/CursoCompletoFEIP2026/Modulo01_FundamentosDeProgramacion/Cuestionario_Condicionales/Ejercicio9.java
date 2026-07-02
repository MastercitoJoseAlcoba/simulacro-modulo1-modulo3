package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio9 {
    public static void main(String[] args) {
        String palabra = "Utec";
        String result;
        char a = palabra.charAt(2); // Cuenta desde 0
        /**
         * En "Utec":
         * a. posición 0 -> 'u'
         * b. posición 1 -> 't'
         * c. posición 2 -> 'e'
         * d. posición 3 -> 'c'
         *
         */
        switch (a) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                result = "Es una vocal";
                break;

            case 'b': case 'c': case 'd': case 'f': case 'g':
            case 'h': case 'j': case 'k': case 'l': case 'm':
            case 'n': case 'p': case 'q': case 'r': case 's':
            case 't': case 'v': case 'w': case 'x': case 'y':
            case 'z':

                result = "Es una consonante";
                break;
                default:
                result = "No es una vocal ni una consonante";

        }
        System.out.println(result);

        /**
         *
         * Pregunta 9:
         * ¿Que imprime por consola al terminar el programa?
         * a. Es una vocal
         * b. Es una consonante
         * c. No es vocal ni consonante
         * d. Nada
         */
    }
}
