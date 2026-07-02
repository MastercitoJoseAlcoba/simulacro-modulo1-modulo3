package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

public class Pregunta18 {
    public static void main(String[] args) {
        /*
         * ¿Cuál es la restricción principal al utilizar variables en una interfaz en Java?
         * C. Deben ser finales (final).
         *
         */
    }
    interface Configuracion {
        int MAX_USUARIOS = 100;
        String NOMBRE_APP = "Sistema Java";
    }

    public class Main {
        public static void main(String[] args) {

            System.out.println("Máximo de usuarios: " + Configuracion.MAX_USUARIOS);
            System.out.println("Nombre de la app: " + Configuracion.NOMBRE_APP);

            // Esto daría ERROR porque las variables de una interfaz son final
            // Configuracion.MAX_USUARIOS = 200;
        }
    }
}
