package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta17_Booleanos_con_ternario;

public class Main {
    public class Booleano {

        public static void main(String[] args) {

            boolean a = true;
            boolean b = false;

            // Expresión:
            //
            // c = (a && !b) ? !(a || b) : (a && b)
            //
            // Primero:
            // a && !b
            //
            // a = true
            // b = false
            // !b = true
            //
            // true && true = true
            //
            // Entonces se ejecuta la parte del ?
            //
            // !(a || b)
            //
            // a || b = true || false = true
            // !true = false
            boolean c = (a && !b) ? !(a || b) : (a && b);

            // c vale false.
            // !c vale true.
            System.out.println(!c);
        }
    }

/*
CONTENIDO FINAL DE c:
false

PERO EL PROGRAMA IMPRIME:
true

IDEA CLAVE:

Una cosa es el valor de la variable.
Otra cosa es lo que se imprime.

c = false
!c = true
*/
}
