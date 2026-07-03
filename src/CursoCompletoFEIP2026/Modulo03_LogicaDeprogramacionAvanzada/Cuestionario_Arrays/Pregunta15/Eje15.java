package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta15;

public class Eje15 {
    public static void main(String[] args) {
        // 2 salas, 3 filas por sala, 4 asientos por fila
        boolean[][][] cine = new boolean[2][3][4];

        // Por defecto, todos los boolean quedan en false
        // false = ocupado
        // true = disponible

        // Ocupar el asiento en la segunda sala, tercera fila, cuarto asiento
        cine[1][2][3] = false;

        // Mostrar el estado de los asientos en las salas
        for (int sala = 0; sala < cine.length; sala++) {

            System.out.println("Sala " + (sala + 1) + ":");

            for (int fila = 0; fila < cine[sala].length; fila++) {

                for (int asiento = 0; asiento < cine[sala][fila].length; asiento++) {

                    System.out.print(cine[sala][fila][asiento] ? "Disponible " : "Ocupado ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}