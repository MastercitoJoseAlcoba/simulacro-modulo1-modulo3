package Bloque1_Arrays_y_matrices.Pregunta4_Comparacion_de_cadenas;

public class EjercicioString {

    public static void main(String[] args) {

        // Creamos un String llamado cadena.
        //
        // Este String contiene el texto "UTEC".
        String cadena = "UTEC";

        // Creamos otro String llamado otro.
        //
        // También contiene el texto "UTEC",
        // pero se crea usando new.
        //
        // Eso genera un objeto distinto en memoria.
        String otro = new String("UTEC");

        // Usamos un operador ternario.
        //
        // Estructura del ternario:
        //
        // condicion ? valorSiTrue : valorSiFalse
        //
        // En este caso la condición es:
        //
        // cadena == otro
        //
        // ATENCIÓN:
        // En objetos, == compara referencias de memoria.
        //
        // No compara el contenido del texto.
        //
        // Entonces Java pregunta:
        // "¿cadena y otro son exactamente el mismo objeto?"
        //
        // La respuesta es false,
        // porque otro fue creado con new.
        //
        // Entonces mensaje toma el valor "diferentes".
        String mensaje = (cadena == otro) ? "iguales" : "diferentes";

        // Ahora se pregunta si mensaje contiene la palabra "iguales".
        //
        // Pero mensaje vale:
        // "diferentes"
        //
        // La palabra "diferentes" NO contiene "iguales".
        if (mensaje.contains("iguales")) {

            // Esta línea no se ejecuta.
            System.out.println("Son iguales");

        } else {

            // Como la condición del if es false,
            // se ejecuta el else.
            System.out.println("Son diferentes");
        }
    }
}

/*
SALIDA:
Son diferentes

RESPUESTA CORRECTA:
d. Son diferentes

EXPLICACIÓN:

cadena contiene:
"UTEC"

otro contiene:
"UTEC"

Pero esta comparación:

cadena == otro

NO compara el contenido.
Compara si son el mismo objeto en memoria.

Como otro se creó con new,
es otro objeto distinto.

Por eso:

cadena == otro

da false.

Entonces:

mensaje = "diferentes"

Después:

mensaje.contains("iguales")

también da false.

Por eso imprime:

Son diferentes

FORMA CORRECTA DE COMPARAR STRINGS:

if (cadena.equals(otro)) {
    System.out.println("Son iguales");
} else {
    System.out.println("Son diferentes");
}

Con equals(), sí se compara el contenido.

IDEA CLAVE:

Para String:

==       compara referencias.
equals() compara contenido.

En parciales de Java, si ves String + ==,
levantá sospecha. Ahí suele estar la trampa.
*/