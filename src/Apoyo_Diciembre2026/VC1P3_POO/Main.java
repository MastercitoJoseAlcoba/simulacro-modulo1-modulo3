package Apoyo_Diciembre2026.VC1P3_POO;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Sin nombre", "General");
        System.out.println(e1.obtenerFicha());

        Estudiante e2 = new Estudiante("Laura", "General");
        System.out.println(e2.obtenerFicha());

        Estudiante e3 = new Estudiante("Rodrigo", "Tecnólogia de Información");
        System.out.println(e3.obtenerFicha());
    }
}
