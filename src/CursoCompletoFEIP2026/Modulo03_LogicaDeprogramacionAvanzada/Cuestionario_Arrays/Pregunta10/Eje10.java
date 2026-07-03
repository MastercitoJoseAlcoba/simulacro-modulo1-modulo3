package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta10;

public class Eje10 {
    public static void main(String[] args) {

        int datos[][] = {
                {4, 5, 1, 7, 3},    // Fila 0: 4  5  1  7  3
                {13, 4, 56, 12, 10} // Fila 1: 13 4 56 12 10

                // Tiene 2 filas
                // Tiene 5 columnas

                // Entonces sus dimensiones son: 2 x 5
        };

        // Cantidad de filas
        int filas = datos.length;

        // Cantidad de columnas de la primera fila
        int columnas = datos[0].length;

        System.out.println("Filas: " + filas);
        System.out.println("Columnas: " + columnas);
        System.out.println("Dimensiones: " + filas + " x " + columnas);
    }
}