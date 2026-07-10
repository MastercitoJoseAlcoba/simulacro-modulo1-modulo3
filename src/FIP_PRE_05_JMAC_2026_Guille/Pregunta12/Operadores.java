package FIP_PRE_05_JMAC_2026_Guille.Pregunta12;

public class Operadores {
    // Dadas las informaciones indicadas, ¿cuáles son verdaderas?
    public static void main(String[] args) {
        int a = 10, b = -20, c = 50;
        a--;
        a--;
        b++;

        for (int i = 0; i < 5; i++) {
            b++;
        }

        boolean oper = a + b > 10 || c + b < 10;
        int suma = a + b + c;
        System.out.println(oper); // false || false = false
        System.out.println(suma); // 8 - 15 + 50 = 43
    }

    /**
     * Dada las siguientes afirmaciones:
     *
     * 1. El valor de la variable suma la termina el programa es 46.
     * 2. El valor que se imprime de la variable suma por consola es 43. // Correcta
     * 3. El valor de la variable oper al terminar el programa es true.
     * 4. El valor de la variable oper que se imprime por consola al terminar el programa es false. // Correcta
     *
     * ¿Cuáles de las siguientes afirmaciones son verdaderas?
     *
     * Explicación:
     * 1. a inicia en 10 y se decrementa dos veces: queda en 8.
     * 2. b inicia en -20, se decrementa una vez y luego cuatro veces dentro del for: queda en -15.
     * 3. suma = 8 +(-15) + 50 = 43.
     * 4. oper evalúa false || false, por lo tanto, queda false.
     *
     */
}
