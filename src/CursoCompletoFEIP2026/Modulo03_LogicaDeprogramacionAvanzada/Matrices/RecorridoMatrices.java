package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Matrices;

public class RecorridoMatrices {

    public static void main(String[] args) {

        char[][] matriz = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        for (int i = 0; i < matriz.length; i++) { // i recorre filas

            for (int j = 0; j < matriz[i].length; j++) { // j recorre columnas

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println(); // Salto después de terminar cada fila
        }
    }
}