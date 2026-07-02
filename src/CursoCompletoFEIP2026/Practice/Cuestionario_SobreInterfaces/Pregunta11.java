package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta11 {
    public static void main(String[] args) {
        /**
         * Respuesta final: Falso.
         * Porque implementar Interface3 implica también lo que heredó de Interfaz2 y Interfaz1. Java no se olvida de la familia.
         *
         */

    }
    interface Interface1 {
        void metodo1();
    }

    interface Interface2 extends Interface1 {
        void metodo2();
    }

    interface Interface3 extends Interface2 {
        void metodo3();
    }

    static class UsarInterfaz implements Interface3 {

        @Override
        public void metodo1() {
            System.out.println("soy el metodo 1");
        }

        @Override
        public void metodo2() {
            System.out.println("soy el metodo 2");
        }

        @Override
        public void metodo3() {
            System.out.println("soy el metodo 3");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            UsarInterfaz objeto = new UsarInterfaz();

            objeto.metodo1();
            objeto.metodo2();
            objeto.metodo3();
        }
    }
}
