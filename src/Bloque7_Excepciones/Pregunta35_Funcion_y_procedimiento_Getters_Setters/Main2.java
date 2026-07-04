package Bloque7_Excepciones.Pregunta35_Funcion_y_procedimiento_Getters_Setters;

public class Main2 {
    private double precio;

    public void setPrecio(double precio) {

        // Este método se llama setPrecio().
        //
        // Tiene tipo de retorno void.
        //
        // void significa que NO devuelve ningún valor.
        //
        // El método realiza una acción:
        //
        // modifica el atributo precio.
        //
        // Como no devuelve nada,
        // en teoría se considera un PROCEDIMIENTO.

        this.precio = precio;

        // this.precio representa el atributo de la clase.
        //
        // precio representa el parámetro recibido.
        //
        // Entonces esta línea significa:
        //
        // "Al atributo precio del objeto
        //  asignale el valor que llegó por parámetro".
    }

/*
================================================
PREGUNTA
================================================

¿Cuál afirmación es correcta?

a. Ambos son funciones porque ambos tienen nombre.

b. getNombre() es una función porque devuelve un valor,
   y setPrecio() es un procedimiento porque usa void.

c. setPrecio() es una función porque modifica un atributo.

d. Ninguno de los dos métodos puede ser usado dentro de una clase.


================================================
ANÁLISIS DE CADA OPCIÓN
================================================

Opción a:

"Ambos son funciones porque ambos tienen nombre."

Incorrecta.

Tener nombre no alcanza.

Lo importante es si devuelven valor o no.


--------------------------------

Opción b:

"getNombre() es una función porque devuelve un valor,
y setPrecio() es un procedimiento porque usa void."

Correcta.

getNombre() devuelve String.

setPrecio() usa void,
por lo tanto no devuelve valor.


--------------------------------

Opción c:

"setPrecio() es una función porque modifica un atributo."

Incorrecta.

Modificar un atributo no lo convierte en función.

Si no devuelve valor,
se considera procedimiento.


--------------------------------

Opción d:

"Ninguno de los dos métodos puede ser usado dentro de una clase."

Incorrecta.

Ambos métodos justamente se usan dentro de clases.


================================================
RESPUESTA
================================================

b. getNombre() es una función porque devuelve un valor,
y setPrecio() es un procedimiento porque usa void.


================================================
IDEA CLAVE
================================================

FUNCIÓN:
Devuelve un valor.

Ejemplos:

public String getNombre()

public int sumar()

public double calcularPromedio()

public boolean validar()

public int[] obtenerNumeros()


PROCEDIMIENTO:
No devuelve valor.

Usa void.

Ejemplos:

public void imprimir()

public void setPrecio(double precio)

public void modificar()

public void mostrarDatos()


================================================
REGLA RÁPIDA
================================================

Si tiene void:

procedimiento.

Si devuelve int, double, String, boolean, int[], etc.:

función.


================================================
ACLARACIÓN
================================================

En Java, técnicamente todos se llaman métodos.

Pero en teoría de programación se distingue así:

Método que devuelve valor:
función.

Método que no devuelve valor:
procedimiento.

Java lo llama método.
El parcial te lo puede llamar función/procedimiento.
Vos traducís mentalmente y seguís. Sin drama.
*/
}
