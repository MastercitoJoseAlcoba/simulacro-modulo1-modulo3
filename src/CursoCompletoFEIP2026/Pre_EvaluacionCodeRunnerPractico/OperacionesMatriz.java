package CursoCompletoFEIP2026.Pre_EvaluacionCodeRunnerPractico;

public class OperacionesMatriz {

    public void mostrarSumaFilas(int[][] matriz) {

        for (int fila = 0; fila < matriz.length; fila++) {
            int suma = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }

            System.out.println("Fila " + (fila + 1) + ": " + suma);
        }
    }
}