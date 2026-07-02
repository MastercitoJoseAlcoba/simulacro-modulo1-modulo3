package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta3 {
    public static void main(String[] args) {
        /*
         * ¿Cuál es el propósito principal de una interfaz en Java?
         * b. Establecer un contrato entre clases que implementan la interfaz.
         * <p>
         * La interfaz dice:
         * toda clase que implemente Animal debe tener el método hacerSonido()".
         *
         */
    }
    public interface Animal {
        void hacerSonido();
    }
    public class Perro implements Animal {
        @Override
        public void hacerSonido() {
            System.out.println("Guau");

            // Significa que la clase Perro implementa la interfaz Animal
        }
    }
}
