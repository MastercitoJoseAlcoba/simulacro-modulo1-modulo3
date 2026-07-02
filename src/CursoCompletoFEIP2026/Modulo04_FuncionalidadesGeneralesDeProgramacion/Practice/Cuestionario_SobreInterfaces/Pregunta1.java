package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta1 {
    public static void main(String[] args) {
        /**
         * De manera incorrecta:
         *
         * public interface Interface1 {
         *     public void metodo1();
         * }
         * public interface Interface2 extends Interface1 {
         *     public void metodo2();
         * }
         * public Interface Interface3 extends Interface2 {
         *     public void metodo3();
         * }
         * public class UsarInterfaz implements Interface3 {
         *
         *     public void metodo3() {
         *         System.out.println("Soy el método 3");
         *     }
         * }
         *
         */

        // De manera correcta
        UsarInterfaz objeto = new UsarInterfaz();
        objeto.metodo1();
        objeto.metodo2();
        objeto.metodo3();


    }
    // De manera correcta
    public static class UsarInterfaz implements Interface03 {

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
}
