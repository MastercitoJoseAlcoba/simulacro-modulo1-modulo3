package Bloque7_Excepciones.Pregunta31_Interfaces;

public class Auto implements Vehiculo {
    // Auto implementa la interfaz Vehiculo.
    //
    // Para implementar una interfaz se usa:
    //
    // implements
    //
    // NO se usa extends.
    //
    // extends se usa cuando una clase hereda de otra clase.
    //
    // Implements se usa cuando una clase cumple una interfaz.
    //
    // Correcto:
    //
    // public class Auto implements Vehículo
    //
    // Incorrecto:
    //
    // public class Auto extends Vehículo
    //
    // Eso estaría mal porque Vehiculo es una interfaz.

    @Override
    public void acelerar() {

        // Como acelerar() está declarado en la interfaz
        // sin cuerpo,
        // Auto está obligado a implementarlo.
        //
        // @Override indica que estamos implementando
        // o sobrescribiendo un método que venía de la interfaz.

        System.out.println("El auto acelera");
    }

    @Override
    public void frenar() {

        // Como frenar() también es abstracto
        // dentro de la interfaz,
        // Auto también debe implementarlo.

        System.out.println("El auto frena");
    }

    // No es obligatorio escribir describir().
    //
    // ¿Por qué?
    //
    // Porque describir() es default.
    //
    // Ya tiene una implementación dentro de la interfaz.
    //
    // Entonces Auto puede usar ese método tal cual.
    //
    // Si quisiéramos cambiar el mensaje,
    // podríamos sobrescribirlo así:
    //
    // @Override
    // public void describir() {
    //     System.out.println("Soy un auto.");
    // }
}

/*
================================================
PREGUNTA
================================================

¿Cuál afirmación es correcta?

a. Una clase usa extends para implementar una interfaz.

b. Una clase que implementa una interfaz no está obligada
   a implementar sus métodos abstractos.

c. Una interfaz puede tener métodos default,
   y una clase la implementa usando implements.

d. Una interfaz no puede tener ningún método con cuerpo.


================================================
ANÁLISIS DE CADA OPCIÓN
================================================

Opción a:

"Una clase usa extends para implementar una interfaz."

Incorrecta.

Una clase usa implements para implementar una interfaz.

extends se usa para heredar de una clase.


--------------------------------

Opción b:

"Una clase que implementa una interfaz no está obligada
a implementar sus métodos abstractos."

Incorrecta.

Sí está obligada.

Si Auto implementa Vehiculo,
debe implementar:

acelerar()
frenar()


--------------------------------

Opción c:

"Una interfaz puede tener métodos default,
y una clase la implementa usando implements."

Correcta.

La interfaz tiene:

default void describir()

Y la clase usa:

implements Vehiculo


--------------------------------

Opción d:

"Una interfaz no puede tener ningún método con cuerpo."

Incorrecta.

Desde Java 8 existen métodos default
con cuerpo dentro de interfaces.


================================================
RESPUESTA
================================================

c. Una interfaz puede tener métodos default,
y una clase la implementa usando implements.


================================================
IDEA CLAVE
================================================

INTERFAZ:
Define un contrato.

MÉTODO ABSTRACTO:
No tiene cuerpo.
La clase que implementa la interfaz debe implementarlo.

MÉTODO DEFAULT:
Tiene cuerpo.
La clase puede usarlo o sobrescribirlo.

implements:
Clase implementa interfaz.

extends:
Clase hereda clase.
Interfaz hereda interfaz.


================================================
RESUMEN RÁPIDO
================================================

Clase hereda clase:

class Auto extends VehiculoBase

Clase implementa interfaz:

class Auto implements Vehiculo

Interfaz hereda interfaz:

interface Electrico extends Vehiculo


Java acá es burocrático, pero claro:
cada palabra tiene su ventanilla.
*/

