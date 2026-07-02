package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta15 {
    public static void main(String[] args) {
        /**
         * ¿Es posible tener un método estático en una interfaz en Java?
         * Sí, siempre que el método sea implementado por las clases que la utilizan.
         *
         */

        MiInterfaz.saludar(); // No hace falta crear objeto ni implementar ese método en una clase.

       // Pero conceptualmente guárdate esto:
        // Método estático en interfaz = pertence a la interfaz, no a la clase que la implementa.

    }
    interface MiInterfaz {
        static void saludar() {
            System.out.println("Hola desde la interfaz");
        }
    }
}
