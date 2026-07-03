package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta12;

public class Eje12 {
    public static void main(String[] args) {
        /**
         * String varios[] = { "Juan", "Pedro", 23, true };
         *
         * Porque el array fue declarado como String[], entonces solo puede guardar textos.
         *
         * Estos están bien:
         * "Juan"
         * "Pedro"
         *
         * Pero estos están mal dentro de un String[]:
         * 23      // int
         * true    // boolean
         *
         */

        // Código correcto:
        String varios[] = {"Juan", "Pedro", "23", "true"};

        for (int i = 0; i < varios.length; i++) {
            System.out.println(varios[i]);
        }
    }
}

