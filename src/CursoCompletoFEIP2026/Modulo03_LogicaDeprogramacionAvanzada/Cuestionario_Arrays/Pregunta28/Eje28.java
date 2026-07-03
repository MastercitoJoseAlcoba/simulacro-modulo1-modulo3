package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta28;

public class Eje28 {
    public static void main(String[] args) {

        String nombres[] = {"Pilar", "Inés", "Gonzalo", "Francisco"};

        int largo = verificar(nombres);

        System.out.println(nombres[largo]);
    }

    private static int verificar(String[] nombres) {

        int largo = 100;
        int indice = 0;

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].length() < largo) {
                largo = nombres[i].length();
                indice = i;
            }
        }

        return indice;
    }
}