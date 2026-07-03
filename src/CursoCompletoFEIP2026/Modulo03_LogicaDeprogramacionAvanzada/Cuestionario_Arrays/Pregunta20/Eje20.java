package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta20;

public class Eje20 {
    public static void main(String[] args) {
        String colores[] = {"Rojo", "Verde", "Azul", "Blanco", "Violeta", "Amarillo"};

        colores[colores.length - 1] = "Celeste";
        colores[2] = "Naranja";

        mostrar(colores);
    }

    private static void mostrar(String[] colores) {

        for (int n = colores.length - 1; n >= 0; n--) {

            if (n > 0) {
                System.out.print(colores[n] + "-");
            } else {
                System.out.println(colores[n] + ".");
            }
        }
    }
}


