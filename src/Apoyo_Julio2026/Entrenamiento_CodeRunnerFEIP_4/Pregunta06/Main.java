package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_4.Pregunta06;

public class Main {
    public static void main(String[] args) {

        Curso c = new Curso();
        System.out.println(c.getCodigoCurso());
        System.out.println(c.getNombreCurso());
        System.out.println(c.getCosto());


        Curso c2 = new Curso("C001", "Matemática Básica");
        System.out.println(c2.getCodigoCurso());
        System.out.println(c2.getNombreCurso());
        System.out.println(c2.getCosto());


        Curso c3 = new Curso("C002", "Programación I", 1500);
        System.out.println(c3.getCodigoCurso());
        System.out.println(c3.getNombreCurso());
        System.out.println(c3.getCosto());


    }
}
