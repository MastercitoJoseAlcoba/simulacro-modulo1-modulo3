package FIP_PRE_05_JMAC_2026_Guille;

public class ContarLetrasA {
    public static void main(String[] args) {
        System.out.println(contarLetraA("casa"));
        System.out.println(contarLetraA("perro"));
        System.out.println(contarLetraA("Ana lava la taza"));

        System.out.println(contarLetraA("casa"));
        System.out.println(contarLetraA("perro"));
        System.out.println(contarLetraA("banana"));
        System.out.println(contarLetraA("Ana lava la taza"));
        System.out.println(contarLetraA(""));

        System.out.println(contarLetraA("la practica constante ayuda a mejorar la logica de programacion, cada error encontrado aporta aprendizaje y cada solucion alcanzada fortalece la confianza para seguir avanzando"));
    }

    //Solución del ejercicio, se agrega static para probarlo en el main.
    public static int contarLetraA(String texto) {

        // Variable que almacena la cantidad de letras "a" encontradas.
        int contador = 0;

        // Recorre el texto carácter por carácter.
        for (int i = 0; i < texto.length(); i++) {

            // Verifica si el carácter actual es la letra minúscula 'a'.
            if (texto.charAt(i) == 'a') {

                // Si encuentra una 'a', aumenta el contador en 1.
                contador++;
            }
        }

        // Devuelve la cantidad total de letras 'a' encontradas.
        return contador;
    }
}
