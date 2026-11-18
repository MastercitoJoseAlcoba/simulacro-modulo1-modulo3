package Apoyo_Diciembre2026.VC1P1_POO;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Carlos";
        p1.edad = 25;
        System.out.println(p1.saludar());

        Persona p2 = new Persona();
        p2.nombre = "Lucia";
        p2.edad =18;
        System.out.println(p2.saludar());

        Persona p3 = new Persona();
        p3.nombre = "Pedro";
        p3.edad = 30;
        System.out.println(p3.saludar());
    }
}
