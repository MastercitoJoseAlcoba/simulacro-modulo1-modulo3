package Bloque4_POO.Pregunta19_While_con_incremento;

public class UsandoWhile {

    public static void main(String[] args) {

        // ================================
        // PREGUNTA 19 — WHILE CON INCREMENTO
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - while
        // - incremento x++
        // - ausencia de llaves { }
        //
        // La trampa principal está en que el while NO tiene llaves.
        //
        // Entonces solamente controla la primera instrucción
        // que aparece debajo de él.

        int x = 2, y = 5;

        // Valores iniciales:
        //
        // x = 2
        // y = 5
        //
        // Condición del while:
        //
        // x < y
        //
        // Como y vale 5,
        // el ciclo se repite mientras x sea menor que 5.

        while (x < y)
            System.out.println("Estamos en el x =" + x++);

        // Esta línea NO está dentro del while.
        //
        // ¿Por qué?
        //
        // Porque no hay llaves.
        //
        // Java interpreta esto así:
        //
        // while (x < y) {
        //     System.out.println("Estamos en el x =" + x++);
        // }
        //
        // System.out.println("UTEC");
        //
        // Entonces "UTEC" se imprime una sola vez,
        // después de que termina el while.
        System.out.println("UTEC");
    }
}

/*
================================================
RECORRIDO PASO A PASO
================================================

Valores iniciales:

x = 2
y = 5


--------------------------------
VUELTA 1
--------------------------------

Condición:

x < y

2 < 5

true

Entra al while.

Ejecuta:

System.out.println("Estamos en el x =" + x++);

IMPORTANTE:

x++ es post-incremento.

Eso significa:

1) Primero usa el valor actual.
2) Después incrementa.

Entonces imprime:

Estamos en el x =2

Después x pasa a valer 3.


--------------------------------
VUELTA 2
--------------------------------

Ahora:

x = 3

Condición:

3 < 5

true

Imprime:

Estamos en el x =3

Después x pasa a valer 4.


--------------------------------
VUELTA 3
--------------------------------

Ahora:

x = 4

Condición:

4 < 5

true

Imprime:

Estamos en el x =4

Después x pasa a valer 5.


--------------------------------
VUELTA 4
--------------------------------

Ahora:

x = 5

Condición:

5 < 5

false

No entra al while.

El ciclo termina.


--------------------------------
DESPUÉS DEL WHILE
--------------------------------

Ahora se ejecuta:

System.out.println("UTEC");

Porque esa línea está fuera del while.

Imprime:

UTEC


================================================
SALIDA FINAL
================================================

Estamos en el x =2
Estamos en el x =3
Estamos en el x =4
UTEC


================================================
RESPUESTA
================================================

a. El ciclo se ejecuta 3 veces.


================================================
IDEA CLAVE
================================================

Sin llaves, el while controla solo una instrucción.

Esto:

while (x < y)
    instruccion1;
    instruccion2;

Java lo interpreta así:

while (x < y) {
    instruccion1;
}

instruccion2;

Por eso conviene escribir siempre con llaves:

while (x < y) {
    System.out.println("Estamos en el x =" + x++);
}

System.out.println("UTEC");

Las llaves son cinturón de seguridad:
no pesan nada y salvan parciales.
*/