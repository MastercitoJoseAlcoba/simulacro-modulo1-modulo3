package Apoyo_Septiembre2026.coderunners_sep_2026;

public class LluviaAcumulada {
    public static void main(String[] args) {

    }

    public int[] calcularLluviaAcumulada(int[][] registros) {

        // Creamos un vector donde vamos a guardar
        // la suma de cada columna de la matriz.
        //
        // registros[0].length representa la cantidad
        // de columnas que tiene la matriz.
        //
        // Por ejemplo, si la matriz tiene 4 columnas,
        // el vector acumulados tendrá 4 posiciones.
        int[] acumulados = new int[registros[0].length];


        // =====================================================
        // RECORRIDO DE LAS COLUMNAS
        // =====================================================
        //
        // La variable j representa la columna.
        //
        // Como queremos calcular la suma de cada columna,
        // el primer for recorre las columnas una por una.
        for (int j = 0; j < registros[0].length; j++) {


            // Creamos un acumulador para la columna actual.
            //
            // IMPORTANTE:
            // suma debe volver a comenzar en 0 cada vez
            // que pasamos a una nueva columna.
            int suma = 0;


            // =================================================
            // RECORRIDO DE LAS FILAS
            // =================================================
            //
            // La variable i representa la fila.
            //
            // Mantenemos fija la columna j y recorremos
            // todas las filas de esa columna.
            for (int i = 0; i < registros.length; i++) {

                // Sumamos el valor ubicado en:
                //
                // registros[fila][columna]
                //
                // En este caso:
                // registros[i][j]
                suma += registros[i][j];
            }


            // Una vez recorridas todas las filas,
            // guardamos la suma obtenida en la posición
            // correspondiente del vector resultado.
            acumulados[j] = suma;
        }


        // Finalmente devolvemos el vector con
        // la lluvia acumulada de cada columna.
        return acumulados;
    }
}
