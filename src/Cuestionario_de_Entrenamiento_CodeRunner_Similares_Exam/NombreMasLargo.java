package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class NombreMasLargo {
    public static void main(String[] args) {

        String[] nombres = {
                "Ana",
                "Federico",
                "Luis",
                "Valentina"
        };

        System.out.println(masLargo(nombres));
    }

    private static String masLargo(String[] nombres) {

        // Primer nombre como referencia inicial
        String mayor = nombres[0];

        // Empezamos en 1 porque nombres[0]
        // ya está guardado
        for (int i = 1; i < nombres.length; i++) {

            if (nombres[i].length() > mayor.length()) {

                mayor = nombres[i];
            }
        }

        return mayor;
    }
}
