package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreClasesAbstractas;

public class Cuestionario {
    public static void main(String[] args) {
        /*
         * Pregunta 1:
         * ¿Cómo se obliga a una clase concreta a implementar un método abstracto de una clase abstracta en Java?
         * La correcta es:
         * d. Heredando directamente de la clase abstracta.
         * Una clase concreta queda obligada a implementar los métodos abstractos cuando extiende una clase abstracta.
         *
         * Pregunta 2:
         * ¿Cuál es el propósito de un método abstracto en una clase abstracta en Java?
         * La correcta es:
         * b. Declarar un método que debe ser implementado por las clases derivadas.
         * Sirve para decir: "toda clase hija concreta debe tener este método y definir cómo funciona".
         * Método abstracto = obligación para las clases hijas.
         *
         * Pregunta 3:
         * ¿Cuál es el propósito principal de una clase abstracta en Java?
         * La correcta es:
         * c. Establecer una base común para las clases derivadas.
         * Una clase abstracta sirve como modelo padre para otras clases. Puede tener:
         * 1. Atributos comunes.
         * 2. Métodos concretos.
         * 3. Métodos abstractos que las hijas deben implementar.
         *
         * Pregunta 4:
         * ¿Cuál es la diferencia entre una clase abstracta y una interfaz en Java?
         * La correcta es:
         * c. Las clases abstractas pueden contener implementaciones concretas.
         * Una clase abstracta puede tener métodos con código y métodos abstractos.
         * Una interfaz normalmente define comportamientos que una clase debe cumplir.
         *
         * Idea para examen:
         * 1. Clase abstracta: puede tener métodos con cuerpo y métodos sin cuerpo.
         * 2. Interfaz: define comportamientos que una clase implementa.
         *
         * Pregunta 5:
         * ¿Cuál es la palabra clave utilizada para declarar una clase abstracta en Java?
         * La correcta es:
         * a. abstract
         * En Java, una clase abstracta se declara usando la palabra clave abstract antes de class.
         *
         * Pregunta 6:
         * ¿Cual es la relación entre una clase concreta y una clase abstracta en Java?
         * La correcta es:
         * c. La clase concreta hereda de la clase abstracta.
         * La clase concreta hereda de la abstracta y debe implementar sus métodos abstractos.
         *
         * Pregunta 7:
         * ¿Es posible crear una instancia (objeto) de una clase abstracta en Java?
         * La correcta es:
         * c. No, nunca.
         *
         * Pregunta 8:
         * ¿Pueden las clases abstractas tener variables de instancia en Java?
         * La correcta es:
         * d. Sí, siempre.
         *
         * Pregunta 9:
         * ¿Pueden las clases concretas tener métodos abstractos en Java?
         * La correcta es:
         * b. No, los métodos abstractos solo son permitidos en clases abstractas.
         *
         * Idea de examen:
         * 1. Clase concreta = métodos completos.
         * 2. Método abstracto = solo dentro de clase abstracta.
         *
         * "Si tiene un método abstracto la clase debe ser abstracta".
         *
         * Pregunta 10:
         * ¿Puede una clase abstracta heredar de otra clase abstracta en Java?
         * La correcta es:
         * a. Sí, siempre.
         * Una clase abstracta puede heredar de otra clase abstracta usando extends.
         * Mamífero hereda de Animal, pero como sigue siendo abstracta, no está obligada todavía a implementar los métodos
         * abstractos.
         *
         * Pregunta 11:
         * ¿Puede una clase abstracta tener métodos abstractos y concretos?
         * La correcta es:
         * d. Sí, siempre.
         *
         * Idea de examen:
         * Método abstracto = sin cuerpo.
         * Método concreto = con cuerpo.
         *
         * La clase abstracta puede mezclar ambos. Es como un contrato con instrucciones incluidas:
         * "esto lo hacés vos, esto ya te lo dejo pronto".
         *
         * Pregunta 12:
         * ¿Puede una clase abstracta tener métodos estáticos en Java?
         * La correcta es:
         * c. Sí, siempre.
         * La clase abstracta puede tener métodos static. Lo que no puede es crear objetos directamente con new.
         *
         * Pregunta 13:
         * ¿Puede una clase abstracta tener un constructor en Java?
         * La correcta es:
         * a. Sí, siempre.
         *
         * Clase abstracta no se instancia directamente, pero sí puede tener constructor.
         * El constructor sirve para inicializar datos comunes de las clases hijas.
         *
         * Pregunta 14:
         * ¿Puede una clase abstracta tener un método concreto (implementación) en Java?
         * La correcta es:
         * c. Sí, siempre.
         * La Clase abstracta puede tener métodos concretos y abstractos.
         *
         * Pregunta 15:
         * ¿Qué sucede si una clase hereda de una clase abstracta y no implementa todos sus métodos abstractos?
         * La correcta es:
         * d. La clase no se compila.
         * Si una clase concreta hereda de una clase abstracta, debe implementar todos los métodos abstractos.
         *
         */

    }
    abstract class ClaseAbstracta {
        String atributo;

        public ClaseAbstracta(String atributo) {
            this.atributo = atributo;
        }

        abstract void metodoAbstracto();

        void metodoConcreto() {
            System.out.println("Método con implementación");
        }

        static void metodoEstatico() {
            System.out.println("Método estático");
        }
    }

    class ClaseConcreta extends ClaseAbstracta {
        public ClaseConcreta(String atributo) {
            super(atributo);
        }

        @Override
        void metodoAbstracto() {
            System.out.println("Implementación obligatoria");
        }
    }
    // Frase para acordarte:
    // Abstracta = no crea objetos, pero prepara el camino.
    // Concreta = hereda, implementa y recién ahí se puede usar.
}
