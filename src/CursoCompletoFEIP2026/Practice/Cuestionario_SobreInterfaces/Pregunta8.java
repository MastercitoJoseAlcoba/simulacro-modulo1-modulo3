package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta8 {
    public static void main(String[] args) {
        /*
         * ¿Cómo se pueden utilizar las interfaces para lograr la abstracción en Java?
         * D. Especificando solo métodos en las interfaces.
         *
         */
        class Carro implements Vehiculo {
            @Override
            public void acelerar() {
                System.out.println("Acelerando...");
            }

            @Override
            public void frenar() {
                System.out.println("El auto frenando...");
            }

            @Override
            public void cambiarMarcha() {
                System.out.println("Cambiando la marcha...");

            }

            class Moto implements Vehiculo {
                @Override
                public void acelerar() {
                    System.out.println("Acelerando...");
                }

                @Override
                public void frenar() {
                    System.out.println("La moto se frena...");
                }

                @Override
                public void cambiarMarcha() {
                    System.out.println("Cambiando la marcha...");

                }
            }
        }


    }
    interface Vehiculo {
        void acelerar();
        void frenar();
        void cambiarMarcha();
    }
}
