package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta16_Operadores_y_ternario;

public class Main {
    public class Operador {

        public static void main(String[] args) {

            int a = 10, b = 4, c = 7;

            // a-- resta 1.
            // a pasa de 10 a 9.
            a--;

            // b += 3 significa:
            // b = b + 3
            //
            // b pasa de 4 a 7.
            b += 3;

            // c-- resta 1.
            // c pasa de 7 a 6.
            c--;

            // El for se ejecuta dos veces:
            // i = 1
            // i = 2
            for (int i = 1; i <= 2; i++) {

                // Primera vuelta:
                // a = 9 - 2 = 7
                //
                // Segunda vuelta:
                // a = 7 - 2 = 5
                a -= 2;

                // Primera vuelta:
                // b = 8
                //
                // Segunda vuelta:
                // b = 9
                b++;
            }

            // Valores finales:
            // a = 5
            // b = 9
            // c = 6

            // a + b > 10 || c < 6
            //
            // 5 + 9 = 14
            // 14 > 10 -> true
            //
            // 6 < 6 -> false
            //
            // true || false -> true
            boolean oper = a + b > 10 || c < 6;

            // suma = 5 + 9 + 6 = 20
            int suma = a + b + c;

            // Como 20 es par, mensaje queda "PAR".
            String mensaje = (suma % 2 == 0) ? "PAR" : "IMPAR";

            System.out.println(oper);
            System.out.println(suma);
            System.out.println(mensaje);
            System.out.println("variable a es: " + a);
        }
    }

/*
SALIDA:

true
20
PAR
variable a es: 5

IDEA CLAVE:

Ternario:

condicion ? valorSiTrue : valorSiFalse

Si suma es par:
mensaje = "PAR"
*/
}
