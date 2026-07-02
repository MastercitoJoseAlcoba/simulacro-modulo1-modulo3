package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta4 {
    public static void main(String[] args) {
        UsarInterfaz objeto = new UsarInterfaz();

        objeto.metodo3();

    }
    interface Interface1 {
        void metodo1();
    }

    interface Interface2 {
        void metodo2();
    }

    interface Interface3 {
        void metodo3();
    }

    static class UsarInterfaz implements Interface3 {

        @Override
        public void metodo3() {
            System.out.println("soy el metodo 3");
            // Java, no inventa parentescos: si no hay extends, no hay herencia.
        }
    }
}
