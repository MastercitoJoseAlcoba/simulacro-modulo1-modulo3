package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta10 {
    public static void main(String[] args) {
        /*
         * Dada una interfaz que tiene en su definición tres abstractos con su firma.
         * Si voy a utilizar la interfaz desde una clase, (implementar la interfaz), en esta clase que implemento la
         * interfaz debo hacer por lo menos lo siguiente:
         *
         * d. Implementar los tres métodos abstractos de la interfaz.
         *
         * Si una interfaz tiene 3 métodos abstractos, la clase que la implementa debe implementar los 3 métodos, salvo
         * que la clase sea "abstract".
         *
         */

        // Declarando una variable de tipo MiInterfaz
        MiClase objeto = new MiClase(); // Objeto de la clase MiClase
        objeto.metodo1();
        objeto.metodo2();
        objeto.metodo3();

    }
    interface MiInterfaz {
        void metodo1();
        void metodo2();
        void metodo3();
    }

    static class MiClase implements MiInterfaz { // En el CodeRunner no va "static".

        @Override
        public void metodo1() {
            System.out.println("Método 1");
        }

        @Override
        public void metodo2() {
            System.out.println("Método 2");
        }

        @Override
        public void metodo3() {
            System.out.println("Método 3");
        }
    }
}
