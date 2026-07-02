package CursoCompletoFEIP2026.Practice.CuestionarioFinal;

public class CuestionarioInterfacesAbstractasExcepciones {

    public static void main(String[] args) {

        System.out.println("""
        ==================================================
        CUESTIONARIO JAVA
        Interfaces, clases abstractas y excepciones
        ==================================================

        PREGUNTA 1:
        ¿Cuál de las siguientes afirmaciones describe mejor una interfaz en Java?

        a. Define un conjunto de métodos que una clase debe implementar.
        b. Puede contener implementaciones de métodos.
        c. Puede ser instanciada directamente.
        d. Puede tener miembros de datos privados.

        RESPUESTA CORRECTA:
        a. Define un conjunto de métodos que una clase debe implementar.

        EXPLICACIÓN:
        Una interfaz es como un contrato.
        Dice qué métodos debe tener una clase, pero la clase decide cómo hacerlos.

        EJEMPLO:
        interface Reproducible {
            void reproducir();
        }

        class Cancion implements Reproducible {
            @Override
            public void reproducir() {
                System.out.println("Reproduciendo canción");
            }
        }

        REGLA:
        interface = contrato
        implements = la clase cumple el contrato


        ==================================================

        PREGUNTA 2:
        ¿Cuál de las siguientes afirmaciones es cierta sobre las clases abstractas en Java?

        a. Pueden contener métodos abstractos y concretos.
        b. Pueden contener métodos finales.
        c. Pueden ser instanciadas.
        d. Pueden implementar múltiples interfaces.

        RESPUESTA CORRECTA:
        a. Pueden contener métodos abstractos y concretos.

        EXPLICACIÓN:
        Una clase abstracta puede tener métodos sin cuerpo y métodos con cuerpo.

        EJEMPLO:
        abstract class Animal {

            // Método abstracto: no tiene cuerpo
            abstract void hacerSonido();

            // Método concreto: sí tiene cuerpo
            void dormir() {
                System.out.println("El animal duerme");
            }
        }

        class Perro extends Animal {
            @Override
            void hacerSonido() {
                System.out.println("Guau");
            }
        }

        REGLA:
        abstract class = clase incompleta
        Puede tener métodos abstractos y concretos.
        No se puede instanciar directamente.


        ==================================================

        PREGUNTA 3:
        ¿Cuál es el propósito principal de las excepciones en Java?

        a. Facilitar la depuración del código.
        b. Mejorar el rendimiento del programa.
        c. Manejar errores y condiciones excepcionales durante la ejecución.
        d. Aumentar la seguridad del programa.

        RESPUESTA CORRECTA:
        c. Manejar errores y condiciones excepcionales durante la ejecución.

        EXPLICACIÓN:
        Las excepciones sirven para controlar errores que ocurren mientras el programa se ejecuta.

        EJEMPLO:
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }

        REGLA:
        try = intento ejecutar código peligroso
        catch = capturo y manejo el error
        exception = error durante la ejecución


        ==================================================

        PREGUNTA 4:
        ¿Cuál es la principal diferencia entre una interfaz y una clase abstracta en Java?

        a. Una interfaz puede contener implementaciones de métodos, mientras que una clase abstracta no.
        b. Una interfaz puede extender múltiples interfaces, mientras que una clase abstracta solo puede extender una clase.
        c. Una clase abstracta puede contener miembros de datos, mientras que una interfaz no puede.
        d. Una clase abstracta no puede ser implementada por otras clases, mientras que una interfaz puede.

        RESPUESTA CORRECTA:
        b. Una interfaz puede extender múltiples interfaces, mientras que una clase abstracta solo puede extender una clase.

        EXPLICACIÓN:
        En Java, una interfaz puede extender varias interfaces.
        Una clase abstracta solo puede extender una clase.

        EJEMPLO:
        interface Volador {
            void volar();
        }

        interface Nadador {
            void nadar();
        }

        interface AnimalEspecial extends Volador, Nadador {
            void moverse();
        }

        abstract class Animal {
            abstract void hacerSonido();
        }

        abstract class Perro extends Animal {
            // Una clase solo puede extender una clase
        }

        REGLA:
        interface -> implements
        abstract class -> extends
        interface puede extender varias interfaces
        clase abstracta solo extiende una clase


        ==================================================

        PREGUNTA 5:
        ¿Qué hace la declaración throws en una firma de método en Java?

        a. Indica que el método crea una excepción.
        b. Indica que el método captura una excepción.
        c. Indica que el método puede lanzar una excepción.
        d. Indica que el método maneja una excepción.

        RESPUESTA CORRECTA:
        c. Indica que el método puede lanzar una excepción.

        EXPLICACIÓN:
        throws se escribe en la firma del método.
        Sirve para avisar que ese método puede lanzar una excepción.

        EJEMPLO:
        public void leerArchivo() throws IOException {
            // código que puede lanzar IOException
        }

        REGLA:
        throw  = lanza una excepción concreta
        throws = avisa que el método puede lanzar una excepción

        throws no maneja el error.
        Solo avisa. Como cartel de "ojo, esto puede explotar".


        ==================================================

        PREGUNTA 6:
        ¿Qué palabra clave se utiliza para declarar una interfaz en Java?

        a. interface
        b. abstract
        c. implements
        d. class

        RESPUESTA CORRECTA:
        a. interface

        EXPLICACIÓN:
        Para declarar una interfaz se usa la palabra clave interface.

        EJEMPLO:
        interface Reproducible {
            void reproducir();
        }

        class Cancion implements Reproducible {
            @Override
            public void reproducir() {
                System.out.println("Reproduciendo canción");
            }
        }

        REGLA:
        interface crea el contrato.
        implements cumple el contrato.


        ==================================================

        PREGUNTA 7:
        ¿Qué palabra clave se utiliza para definir una clase abstracta en Java?

        a. interface
        b. abstract
        c. class
        d. extends

        RESPUESTA CORRECTA:
        b. abstract

        EXPLICACIÓN:
        Para definir una clase abstracta se usa la palabra clave abstract.

        EJEMPLO:
        abstract class Animal {
            abstract void hacerSonido();
        }

        class Gato extends Animal {
            @Override
            void hacerSonido() {
                System.out.println("Miau");
            }
        }

        REGLA:
        abstract class NombreClase {
            abstract void metodo();
        }

        abstract = clase incompleta que necesita una clase hija.


        ==================================================

        PREGUNTA 8:
        ¿Qué palabra clave se utiliza para lanzar una excepción en Java?

        a. catch
        b. throw
        c. throws
        d. try

        RESPUESTA CORRECTA:
        b. throw

        EXPLICACIÓN:
        throw se usa para lanzar una excepción manualmente.

        EJEMPLO:
        public void validarEdad(int edad) {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        }

        REGLA:
        throw  = lanzo una excepción
        throws = aviso que puede lanzarse una excepción

        Ejemplo:
        throw new IllegalArgumentException("Dato inválido");

        throw tira la piedra.
        throws pone el cartel de "cuidado con la piedra".


        ==================================================
        RESUMEN FINAL PARA EXAMEN
        ==================================================

        INTERFACE:
        - Se declara con interface.
        - Es un contrato.
        - Una clase la usa con implements.
        - Puede extender varias interfaces.

        CLASE ABSTRACTA:
        - Se declara con abstract class.
        - Puede tener métodos abstractos y concretos.
        - No se puede instanciar directamente.
        - Una clase hija la hereda con extends.

        EXCEPCIONES:
        - Sirven para manejar errores en ejecución.
        - try contiene código que puede fallar.
        - catch captura el error.
        - throw lanza una excepción.
        - throws avisa que un método puede lanzar una excepción.

        PALABRAS CLAVE:
        interface  -> declara una interfaz
        implements -> implementa una interfaz
        abstract   -> declara clase o método abstracto
        extends    -> hereda de una clase
        try        -> intenta ejecutar código peligroso
        catch      -> captura una excepción
        throw      -> lanza una excepción
        throws     -> avisa que puede lanzar excepción

        ==================================================
        """);
    }
}