package Espacio_De_Practicas.CodeRunner02.Pregunta08;

public class Class {
    public static void main(String[] args) {
        Articulo a11 = new Articulo();
        System.out.println(a11.getDescripcion());
        System.out.println(a11.getCosto());
        System.out.println(a11.getStock());

        Articulo a12 = new Articulo("Laptop", 1500.50);
        System.out.println(a12.getDescripcion());
        System.out.println(a12.getCosto());
        System.out.println(a12.getStock());

        Articulo a13 = new Articulo("Celular", 750.75, 10);
        System.out.println(a13.getDescripcion());
        System.out.println(a13.getCosto());
        System.out.println(a13.getStock());

        System.out.println(a11.getDescripcion() + " " + a11.getCosto() + " " + a11.getStock());
        System.out.println(a12.getDescripcion() + " " + a12.getCosto() + " " + a12.getStock());
        System.out.println(a13.getDescripcion() + " " + a13.getCosto() + " " + a13.getStock());

    }

}
