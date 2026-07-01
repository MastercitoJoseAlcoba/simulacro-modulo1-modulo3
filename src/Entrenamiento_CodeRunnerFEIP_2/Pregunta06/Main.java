package Entrenamiento_CodeRunnerFEIP_2.Pregunta06;

public class Main {
    public static void main(String[] args) {

        Articulo a1 = new Articulo();
        System.out.println(a1.getDescripcion());
        System.out.println(a1.getCosto());
        System.out.println(a1.getStock());

        Articulo a2 = new Articulo("Laptop", 1500.50);
        System.out.println(a2.getDescripcion());
        System.out.println(a2.getCosto());
        System.out.println(a2.getStock());

        Articulo a3 = new Articulo("Celular", 750.75, 10);
        System.out.println(a3.getDescripcion());
        System.out.println(a3.getCosto());
        System.out.println(a3.getStock());

        Articulo a4 = new Articulo();
        Articulo a5 = new Articulo("Tablet", 299.99);
        Articulo a6 = new Articulo("Monitor", 199.99, 5);

        System.out.println(a4.getDescripcion() + " " + a4.getCosto() + " " + a4.getStock());
        System.out.println(a5.getDescripcion() + " " + a5.getCosto() + " " + a5.getStock());
        System.out.println(a6.getDescripcion() + " " + a6.getCosto() + " " + a6.getStock());
    }
}