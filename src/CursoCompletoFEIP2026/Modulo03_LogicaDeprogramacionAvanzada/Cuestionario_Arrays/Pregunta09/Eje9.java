package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta09;

public class Eje9 {
    public static void main(String[] args) {

        String paises[][] = {
                {"Uruguay", "Argentina", "Italia"},
                {"Durazno", "Minas", "Melo", "Fray Bentos"},
                {"Buenos Aires", "Rosario", "Parana"},
                {"Roma", "Napoles", "Venecia"}

                /*
                 * Se llama array escalonado porque no todas las filas tienen la misma cantidad de elementos:
                 *
                 * paises[0].length // 3
                 * paises[1].length // 4
                 * paises[2].length // 3
                 * paises[3].length // 3
                 *
                */
        };

        // Recorremos el array escalonado
        for (int fila = 0; fila < paises.length; fila++) {

            for (int columna = 0; columna < paises[fila].length; columna++) {
                System.out.print(paises[fila][columna] + " ");
            }

            System.out.println();
        }
    }
}