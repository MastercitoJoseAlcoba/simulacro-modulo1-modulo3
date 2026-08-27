package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Matrices;

public class MatricesEscalonadas {

    public static void main(String[] args) {

        int[][] matriz = {         // Matriz con filas de diferentes tamaños
                {1, 2, 3},        // 3 columnas
                {4, 5},           // 2 columnas
                {6, 7, 8, 9}      // 4 columnas
        };


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }


        /*
         * IMPORTANTE:
         *
         * matriz.length
         *
         * cantidad de filas.
         *
         *
         * matriz[i].length
         *
         * cantidad de columnas DE ESA FILA.
         */
    }
}