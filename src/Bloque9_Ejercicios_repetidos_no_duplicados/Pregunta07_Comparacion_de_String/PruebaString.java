package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta07_Comparacion_de_String;

public class PruebaString {

    public static void main(String[] args) {

        // x e y son literales.
        // En Java, los literales iguales suelen compartir
        // la misma referencia en el String pool.
        String x = "Java";
        String y = "Java";

        // z se crea con new.
        // Aunque tenga el mismo contenido,
        // es otro objeto distinto en memoria.
        String z = new String("Java");

        // == compara referencias.
        // x e y apuntan al mismo literal.
        System.out.print(x == y); // true

        System.out.print(" ");

        // x y z tienen el mismo contenido,
        // pero no son la misma referencia.
        System.out.print(x == z); // false

        System.out.print(" ");

        // equals compara contenido.
        System.out.print(x.equals(z)); // true
    }
}

/*
SALIDA:
true false true

IDEA CLAVE:

== compara memoria/referencia.

equals() compara contenido.

Para String, casi siempre usá equals().
*/