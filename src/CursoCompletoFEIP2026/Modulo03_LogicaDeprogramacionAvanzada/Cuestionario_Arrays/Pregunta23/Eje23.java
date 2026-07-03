package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta23;

import java.util.Arrays;

public class Eje23 {
    public static void main(String[] args) {
        // 2 salas, 3 filas por sala, 4 asientos por fila
        boolean[][][] cine = new boolean[2][3][4];

        // Inicializar todos los asientos en true
        // true = disponible
        // false = ocupado
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
                for (int k = 0; k < cine[i][j].length; k++) {
                    cine[i][j][k] = true;
                }
            }
        }

        // Mostrar todos los asientos
        for (int i = 0; i < cine.length; i++) {
            System.out.println("Sala " + (i + 1));

            for (int j = 0; j < cine[i].length; j++) {
                System.out.println("Fila " + (j + 1) + ": " + Arrays.toString(cine[i][j]));
            }

            System.out.println();
        }
    }
}
