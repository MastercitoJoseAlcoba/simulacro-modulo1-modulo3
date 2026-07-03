package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta03;

public class Eje3 {
    public static void main(String[] args) {

        // 2 salas, 3 filas por sala, 4 asientos por fila
        boolean[][][] cine = new boolean[2][3][4]; // Se lee así: cine[sala][fila][asiento]

        // Inicializamos todos los asientos en true
        // true = disponible
        // false = ocupado
        for (int sala = 0; sala < cine.length; sala++) {
            for (int fila = 0; fila < cine[sala].length; fila++) {
                for (int asiento = 0; asiento < cine[sala][fila].length; asiento++) {
                    cine[sala][fila][asiento] = true;
                }
            }
        }

        // Marcamos un asiento como ocupado
        cine[0][1][2] = false;

        /*
         * significa:
         *
         * Índice	significado real
         * 0	    primera sala
         * 1	    segunda fila
         * 2	    tercer asiento
         *
         * Como le asignaron: false
         *
         * y el enunciado dice que false marca un asiento como ocupado, entonces queda:
         * Primera sala, segunda fila, tercer asiento ocupado.
         *
         */

        // Mostramos el estado de ese asiento
        if (cine[0][1][2] == false) {
            System.out.println("El asiento en la primera sala, segunda fila, tercer asiento está ocupado.");
        } else {
            System.out.println("El asiento está disponible.");
        }
    }
}

/*
 *
 *
 *
 *
 *
 *
 *
 */