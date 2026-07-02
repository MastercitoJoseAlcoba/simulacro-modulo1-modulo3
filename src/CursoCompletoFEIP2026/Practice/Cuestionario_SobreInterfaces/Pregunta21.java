package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta21 {
    public static void main(String[] args) {
        /**
         * ¿Que sucede si una clase implementa dos interfaces con un método común?
         * A. La clase debe implementar el método solo una vez.
         *
         */

        MiClase objeto = new MiClase();

        objeto.saludar();

    }
    interface Interfaz1 {
        void saludar();
    }

    interface Interfaz2 {
        void saludar();
    }

    static class MiClase implements Interfaz1, Interfaz2 {

        @Override
        public void saludar() {
            System.out.println("Hola desde MiClase");
        }
    }
}
