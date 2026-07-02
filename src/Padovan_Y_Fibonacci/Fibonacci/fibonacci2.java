package Padovan_Y_Fibonacci.Fibonacci;

public class fibonacci2 {
    public static void main(String[] args) {
        int n = 8;

        int anterior = 0;
        int actual = 1;
        int siguiente = 0;

        System.out.println(anterior);
        System.out.println(actual);
        System.out.println(siguiente);

        for (int i = 2; i <= n; i++) {
            siguiente = anterior + actual;
            System.out.println(siguiente);
            anterior = actual;
            actual = siguiente;
        }
    }
}
