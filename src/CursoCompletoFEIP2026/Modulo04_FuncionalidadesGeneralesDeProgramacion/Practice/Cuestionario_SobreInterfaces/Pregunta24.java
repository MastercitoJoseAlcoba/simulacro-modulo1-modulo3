package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta24 {
    public static void main(String[] args) {
        /**
         * ¿Cuál es el propósito de la palabra clave default en una interfaz en Java?
         *
         * C. Establecer un método por defecto en la interfaz.
         *
         * En Java, default permite que una interfaz tenga un método con implementación, o sea con código.
         *
         */
        Persona persona = new Persona();

        persona.comer();
        persona.dormir();
    }
    interface Saludable {
        void comer();

        default void dormir() {
            System.out.println("Durmiendo 8 horas");
        }
    }

    static class Persona implements Saludable {

        @Override
        public void comer() {
            System.out.println("La persona está comiendo");
        }
    }

}
