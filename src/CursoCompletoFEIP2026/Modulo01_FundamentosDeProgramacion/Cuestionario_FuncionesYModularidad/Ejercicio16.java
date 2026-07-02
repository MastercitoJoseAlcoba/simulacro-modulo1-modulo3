package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio16 {
    public static void main(String[] args) {
        String nombre1 = "Juan";
        String nombre2 = "Perez";
        System.out.println(concatenar(nombre1, nombre2));

    }
    public static String concatenar (String name1, String name2) {
        String resultado = name1 + " " + name2;
        return resultado;
        // Es un método, función y tiene dos parámetros de tipo String en la condición.
    }
}
/**
 * public static String concatenar (String string, String string2) {
 *     String resultado = string + " " + string2;
 *     return resultado;
 * }
 */