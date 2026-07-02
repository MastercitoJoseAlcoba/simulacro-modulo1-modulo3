package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta16 {
    public static void main(String[] args) {
        /*
         * El orden en que escribís los métodos dentro de la clase no importa. lo importante es que
         *
         */

        UsarInterfaz objeto = new UsarInterfaz();

        objeto.metodo1();
        objeto.metodo2();
        objeto.metodo3();
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
        public void metodo2() {
            System.out.println("soy el metodo 2");
        }

        @Override
        public void metodo3() {
            System.out.println("soy el metodo 3");
        }

        @Override
        public void metodo1() {
            System.out.println("soy el metodo 1");
        }
    }
}
