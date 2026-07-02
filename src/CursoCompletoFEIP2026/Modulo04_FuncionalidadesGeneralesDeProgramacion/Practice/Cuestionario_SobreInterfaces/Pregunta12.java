package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta12 {
    public static void main(String[] args) {
        /**
         * ¿Puede una interfaz en Java heredar de otra interfaz?
         * Sí, siempre.
         *
         * En Java, una interfaz puede heredar de otra interfaz usando extends.
         */

        Pregunta10.MiClase objeto = new Pregunta10.MiClase();
        objeto.metodo1();
        objeto.metodo2();


        // Ejemplo:
        interface Interface1 {
            void metodo1();
        }
        interface Interface2 extends Interface1 {
            void metodo2();

            // En este caso, Interface2 hereda de Interface1.
            // Entonces Interface2 queda obligado a implementar metodo1 y metodo2.
        }

    }
}
