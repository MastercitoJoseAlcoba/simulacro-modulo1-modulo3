package Bloque6_Colecciones.Pregunta29_Polimorfismo_con_animales;

public class Animal {
    public void hacerSonido() {

        // ================================
        // PREGUNTA 29 — POLIMORFISMO CON ANIMALES
        // ================================
        //
        // Esta es la clase padre.
        //
        // Se llama Animal.
        //
        // Tiene un método general:
        //
        // hacerSonido()
        //
        // Si el objeto real es Animal,
        // se ejecuta esta versión.

        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    @Override
    public void hacerSonido() {

        // Perro hereda de Animal.
        //
        // extends Animal significa:
        //
        // Perro es una clase hija de Animal.
        //
        // Como Perro sobrescribe hacerSonido(),
        // cuando el objeto real sea Perro,
        // se ejecutará esta versión.
        //
        // @Override indica que estamos reemplazando
        // el método heredado.

        System.out.println("El perro ladra: ¡Guau! ¡Guau!");
    }
}

class Loro extends Animal {

    @Override
    public void hacerSonido() {

        // Loro también hereda de Animal.
        //
        // También sobrescribe hacerSonido().
        //
        // Entonces tiene su propio comportamiento.

        System.out.println("El loro dice: ¡Hola! ¡Hola!");
    }
}

class Gato extends Animal {

    @Override
    public void hacerSonido() {

        // Gato también hereda de Animal.
        //
        // Y también redefine hacerSonido().
        //
        // Cada clase hija tiene su propia versión del método.

        System.out.println("El gato maúlla: ¡Miau! ¡Miau!");
    }
}

/*
================================================
SALIDA
================================================

El perro ladra: ¡Guau! ¡Guau!
El loro dice: ¡Hola! ¡Hola!
El gato maúlla: ¡Miau! ¡Miau!
El animal hace un sonido


================================================
IDEA CLAVE
================================================

Esto es polimorfismo.

Una variable de tipo padre puede apuntar
a objetos de clases hijas.

Ejemplos:

Animal a = new Perro();
Animal a = new Loro();
Animal a = new Gato();

La variable es de tipo Animal,
pero el objeto real puede ser Perro, Loro o Gato.


================================================
REGLA DE ORO
================================================

Referencia a la izquierda.
Objeto real a la derecha.

Ejemplo:

Animal miAnimal = new Perro();

Referencia:

Animal

Objeto real:

Perro

Método ejecutado:

hacerSonido() de Perro


================================================
¿POR QUÉ PASA ESTO?
================================================

Porque hacerSonido() está sobrescrito.

Cuando un método está sobrescrito,
Java usa despacho dinámico.

Eso significa:

Java decide qué método ejecutar en tiempo de ejecución,
mirando el objeto real.

No se queda solo con el tipo de la variable.


================================================
COMPARACIÓN
================================================

Animal miAnimal = new Perro();

miAnimal.hacerSonido();

Ejecuta:

El perro ladra: ¡Guau! ¡Guau!


Animal otroAnimal = new Animal();

otroAnimal.hacerSonido();

Ejecuta:

El animal hace un sonido


================================================
RESUMEN PARA EL PARCIAL
================================================

extends:
herencia.

@Override:
sobrescritura.

Polimorfismo:
una referencia padre puede guardar objetos hijos.

Despacho dinámico:
se ejecuta el método del objeto real.

Java mira lo que hay en el new.
Ahí está la verdad.
*/


