package Bloque1_Arrays_y_matrices.Pregunta1_Paso_de_parametros;

public class Main {

    public static void main(String[] args) {

        // Creamos una variable entera llamada a.
        // Su valor inicial es 10.
        int a = 10;

        // Llamamos al método incrementar(a).
        //
        // IMPORTANTE:
        // En Java, los tipos primitivos como int se pasan por valor.
        // Eso significa que el método recibe una COPIA del valor de a.
        //
        // Entonces el método recibe 10,
        // pero NO modifica directamente la variable a del main.
        int b = incrementar(a);

        // Imprimimos el valor de a y el valor de b separados por coma.
        //
        // a sigue valiendo 10.
        // b vale 11 porque el método incrementar devolvió 11.
        System.out.println(a + "," + b);
    }

    public static int incrementar(int decremento) {

        // decremento recibe una copia del valor de a.
        //
        // Como a valía 10,
        // decremento también empieza valiendo 10.

        // ++decremento es preincremento.
        //
        // Significa:
        // 1) Primero aumenta decremento en 1.
        // 2) Después devuelve el nuevo valor.
        //
        // decremento era 10.
        // Ahora pasa a 11.
        //
        // Entonces el método devuelve 11.
        return ++decremento;
    }
}

/*
SALIDA:
10,11

RESPUESTA CORRECTA:
c. 10,11

EXPLICACIÓN FINAL:

a vale 10 porque el método no modifica la variable original.

b vale 11 porque recibe el resultado del método incrementar(a).

El método trabaja con una copia del valor.

IDEA CLAVE:
En Java, int se pasa por valor.
El método cambia su variable local, no la variable original.
*/