package FIP_PRE_05_JMAC_2026_Guille.Pregunta17;

import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Stack<String> nombres = new Stack<>();
        nombres.push("Antonio");
        nombres.push("Carmen");
        nombres.push("Mariana");
        nombres.push("Dante");
        nombres.pop();
        nombres.pop();
        nombres.push("Oscar");
        System.out.println(nombres);

        // Respuesta correcta: [Antonio, Carmen, Oscar];
    }
}

/**
 *
 * Explicación:
 *
 * Stack utiliza lógica LIFO: último en entrar, primero en salir.
 *
 * 1. Se agregan Antonio, Carmen, Mariana y Dante.
 * 2. El primer pop() elimina a Dante, que era el último elemento ingresado.
 * 3. El segundo pop() elimina Mariana.
 * 4. Luego se agrega Oscar al final de la pila.
 * 5. La pila final queda [Antonio, Carmen, Oscar].
 *
 *
 */
