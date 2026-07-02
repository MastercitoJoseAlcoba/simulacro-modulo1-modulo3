package Parcial_Mejores_Ejercicios.JuegoSemaforo;

public class Pregunta2 {
    public static void juegoSemaforo(int n) {

        // Tienes que hacer un for desde 1 hasta n, y poner primero la condición doble:
        // La condición doble va primero porque el 10 es múltiplo de 2 y de 5.
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("rojoverde");
            } else if (i % 2 == 0) {
                System.out.println("rojo");
            } else if (i % 5 == 0) {
                System.out.println("verde");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        juegoSemaforo(5);
        juegoSemaforo(10);
        juegoSemaforo(1);
        juegoSemaforo(15);
        juegoSemaforo(20);
    }
}
