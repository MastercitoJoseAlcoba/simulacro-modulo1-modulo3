package Espacio_De_Practicas.CodeRunner02.Pregunta04;

public class Main {
    public static void juegoNumeros(int m) {
        for (int i = 1; i <= m; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
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

    public static void main(String[] args) {
        juegoNumeros(12);
        juegoNumeros(6);
        juegoNumeros(15);

    }
}
