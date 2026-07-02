package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta20 {
    public static void main(String[] args) {
        Perro perro = new Perro();

        perro.hacerSonido();
        perro.dormir();

    }
    // Ejemplo:
    interface Animal {
        void hacerSonido();

        default void dormir() {
            System.out.println("El animal está durmiendo"); // Ese método ya viene implementado. la clase puede usarlo sin sobreescribirlo.
        }
    }

    static class Perro implements Animal {

        @Override
        public void hacerSonido() {
            System.out.println("Guau");
        }
        /*
         * ¿Cuál es el propósito de los métodos default en una interfaz en Java?
         * Respuesta final: b. proporcionan implementación predeterminada para métodos.
         *
         * Los métodos default en una interfaz permiten escribir un método con código dentro de la interfaz.
         */
    }
}
