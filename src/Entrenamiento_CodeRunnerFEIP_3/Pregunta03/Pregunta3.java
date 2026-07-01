package Entrenamiento_CodeRunnerFEIP_3.Pregunta03;

public class Pregunta3 {
    public static int[][] crearTabla(int fila, int columna) {
        // Acá te piden solo el método, no main, no Scanner, no System.out.println.
        int[][] tabla = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                // La línea clave es:
                // Porque la matriz empieza en índices: i = 0
                //                                      j = 0
                // Pero la tabla pitagórica empieza en: 1 x 1
                // Por eso se suma + 1.
                // Ejemplo mental con fila = 3 y columna = 4: 1 2 3 4
                //                                            2 4 6 8
                //                                            3 6 9 12

                /**
                 * El truco: i representa la fila, j representa la columna. Como ambos arrancan en cero, les pones +1 y listo.
                 */
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        return tabla;
    }

    public static void main(String[] args) {
        int [][] tabla = crearTabla(4,3);
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
