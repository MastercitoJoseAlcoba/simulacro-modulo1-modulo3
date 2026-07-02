package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_2.Pregunta05;

public class juegoNumeros {
    public void juegoNumeros(int m) {
        for (int i = 1; i <= m; i++) { // m = 12
                                       // Si m vale 12, entonces i va tomando estos valores: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

            // La condición doble va primero:
            // Porque si pones primero, i % 4 == 0, cuando llegue al 12 imprimiría "cuatro" y nunca llegaría a "cuatroseis".

            // El símbolo % significa resto de la división 12 % 4 == 0 (Da exacto)
            //                                             12 % 6 == 0 (Da exacto), significa que 12 es múltiplo de 4 y de 6.
            //                                             El && significa y. Las dos condiciones tienen que ser verdaderas.
            //                                             Entonces: i % 4 == 0 && i % 6 == 0
            //                                             Se lee así: Si i es divisible entre 4 y divisible entre 6.
            //                                             En ese caso imprime: System.out.println("cuatroseis");


            if (i % 4 == 0 && i % 6 == 0) { // La clave del ejercicio está acá.
                System.out.println("cuatroseis");
            } else if (i % 4 == 0) {
                System.out.println("cuatro");
            } else if (i % 6 == 0) {
                System.out.println("seis");
            } else {
                System.out.println(i);
            }

        }
    }

    // Idea general: Es una fila de decisiones, Java pregunta de arriba para abajo.
    // Cuando tienes una condición más específica y otras más generales, pon primero la más específica.
    // En este caso: i % 4 == 0 && i % 6 == 0 y en este ejercicio es más específica que: 1. i % 4 == 0
    //                                                                                   2. i % 6 == 0
    // Porque pide dos cosas al mismo tiempo.

    public static void main(String[] args) {
        juegoNumeros j = new juegoNumeros();
        j.juegoNumeros(10);
    }
}
