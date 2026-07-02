package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta14 {
    public static void main(String[] args) {
        /**
         * ¿Qué ocurre si una clase implementa una interfaz y también hereda de una clase abstracta en Java?
         *
         * d. La clase puede heredar de ambas sin problemas.
         *
         */

        Perro perro = new Perro();
        perro.respirar();
        perro.hacerSonido();
        perro.comer();

    }
    abstract static class Animal {
        public void respirar() {
            System.out.println("Respirando");
        }

        public abstract void hacerSonido();
    }
    interface Mascota {
        void comer();
    }

    static class Perro extends Animal implements Mascota { // Primero va extends y luego va implements.
        @Override
        public void hacerSonido() {
            System.out.println("Guau");
        }

        @Override
        public void comer() {
            System.out.println("Comiendo");
        }
    }
}
