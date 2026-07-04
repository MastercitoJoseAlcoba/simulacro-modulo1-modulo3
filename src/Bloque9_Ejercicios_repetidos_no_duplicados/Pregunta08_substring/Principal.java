package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta08_substring;

public class Principal {

    public static void main(String[] args) {

        String texto = "Programacion";

        // substring(0, 4)
        //
        // Empieza en el índice 0.
        // Termina antes del índice 4.
        //
        // Toma:
        // índice 0 -> P
        // índice 1 -> r
        // índice 2 -> o
        // índice 3 -> g
        System.out.println(texto.substring(0, 4));
    }
}

/*
SALIDA:
Prog

IDEA CLAVE:

substring(inicio, fin)

Incluye inicio.
No incluye fin.
*/