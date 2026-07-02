package Espacio_De_Practicas.CodeRunner02.Pregunta07;

public class Main {
    public static void trianguloAsteriscos(int n) {
        for (int i = 1; i <= n; i++) {

            System.out.print(i);

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        trianguloAsteriscos(8);
        System.out.println();
    }
}
