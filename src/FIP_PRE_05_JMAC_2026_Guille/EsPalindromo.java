package FIP_PRE_05_JMAC_2026_Guille;

public class EsPalindromo {

    //Main de prueba para el ejercicio.
    public static void main(String[] args) {
        System.out.println(esPalindromo("oso"));
        System.out.println(esPalindromo("Ana"));
        System.out.println(esPalindromo("radar"));
        System.out.println(esPalindromo("casa"));
        System.out.println(esPalindromo(""));
        System.out.println(esPalindromo(null));
        System.out.println(esPalindromo("ReCoNocer"));
        System.out.println(esPalindromo("GaTo"));
    }

    //Solución del ejercicio, se agrega static para probarlo en el main.
    public static boolean esPalindromo(String palabra) {

        // Verifica si la palabra es null o está vacía.
        // En esos casos, no se considera palíndromo.
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }

        // Convierte la palabra a minúsculas para evitar diferencias entre mayúsculas y minúsculas.
        // Por ejemplo: "Ana" se compara como "ana".
        palabra = palabra.toLowerCase();

        // Índice que comienza desde el primer carácter de la palabra.
        int inicio = 0;

        // Índice que comienza desde el último carácter de la palabra.
        int fin = palabra.length() - 1;

        // Recorre la palabra comparando los caracteres desde los extremos hacia el centro.
        while (inicio < fin) {

            // Si los caracteres en las posiciones actuales son distintos,
            // la palabra no es palíndromo.
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }

            // Avanza desde el inicio hacia el centro.
            inicio++;

            // Retrocede desde el final hacia el centro.
            fin--;
        }

        // Si todas las comparaciones fueron iguales, la palabra es palíndromo.
        return true;
    }
}
