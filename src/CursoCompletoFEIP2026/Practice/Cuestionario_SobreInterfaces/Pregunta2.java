package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta2 {
    public static void main(String[] args) {
        // Demostración de que una clase puede implementar múltiples interfaces
        Clase1 objeto = new Clase1();

        objeto.metodo1();
        objeto.metodo2();
    }

    /**
     *  Si tenemos la siguiente definición en una clase:
     *  public class Clase1 implements Inter1, Inter2 {
     *      ...
     *  }
     *  Es correcta esta definición: ¿Verdadero o Falso?
     *  1. Verdadero
     * 
     */
    interface Inter1 {
        void metodo1();
    }

    interface Inter2 {
        void metodo2();
    }

    public static class Clase1 implements Inter1, Inter2 {

        @Override
        public void metodo1() {
            System.out.println("Método 1");
        }

        @Override
        public void metodo2() {
            System.out.println("Método 2");
        }

        public static void main(String[] args) {
            Clase1 objeto = new Clase1();

            objeto.metodo1();
            objeto.metodo2();
        }
    }
}
