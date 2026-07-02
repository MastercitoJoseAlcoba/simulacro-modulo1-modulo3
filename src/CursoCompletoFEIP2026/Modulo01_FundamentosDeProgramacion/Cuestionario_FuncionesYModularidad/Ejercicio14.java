package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio14 {
    public static void main(String[] args) {
//        String nombre = "Juan";
        String name = "Pedro";
//        int edad = 25;
        int age = 25;
        mostrar(name, age);


    }
    private static int mostrar(String name, int age) {
//        System.out.println("Hola "+ nombre + " tu edad es " + edad);
        System.out.println("Hola "+ name + " tu edad es " + age);
        return age;
        // No funciona, porque los parámetros son distintos en el método que los que se encuentran en el main.
    }
}
