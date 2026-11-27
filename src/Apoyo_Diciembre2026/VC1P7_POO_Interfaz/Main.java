package Apoyo_Diciembre2026.VC1P7_POO_Interfaz;

public class Main {
    public static void main(String[] args) {

        Dibujable d1 = new Circulo(3.0);
        System.out.println(d1.dibujar());

        Dibujable d2 = new Cuadrado(10.0);
        System.out.println(d2.dibujar());

        d1 = new Circulo(1.2);
        d2 = new Cuadrado(2.5);

        System.out.println(d1.dibujar() + " | " + d2.dibujar());
    }
}