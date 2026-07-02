package Espacio_De_Practicas.CodeRunner04.Pregunta05;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("A1", "Carlos", 8.0);
        Estudiante e2 = new Estudiante("A2", "Ana", 4.0);
        Estudiante e3 = new Estudiante();
        Estudiante e4 = new Estudiante("A3", "Luis");

        System.out.println(e1.estaAprobado());
        System.out.println(e2.estaAprobado());
        System.out.println(e3.getId());
        System.out.println(e4.toString());


    }

}