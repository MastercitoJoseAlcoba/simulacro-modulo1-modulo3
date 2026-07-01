package Entrenamiento_CodeRunnerFEIP_4.Pregunta05;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("A1", "Carlos", 8.0);
        System.out.println(e1.estaAprobado());


        Estudiante e2 = new Estudiante("A2", "Ana", 4.0);
        System.out.println(e2.estaAprobado());


        Estudiante e3 = new Estudiante();
        System.out.println(e3.getId());


        Estudiante e4 = new Estudiante("A3", "Luis");
        System.out.println(e4.toString());


        Estudiante e5 = new Estudiante("A4", "Marta", 6.0);
        System.out.println(e5.estaAprobado());


    }
}
