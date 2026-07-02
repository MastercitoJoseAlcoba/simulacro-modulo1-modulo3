package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio4 {
    public static void main(String[] args) {
        String a = "Fiat";
        String b = "Premio";
        String c = "Diesel";
        mostrarAuto(b, c, a);

    }
    public static void mostrarAuto (String marca, String modelo, String tipo) {
        String mensaje = "Auto de la marca: " + marca + " es del modelo " + modelo + " y usa combustible " + tipo;
        System.out.println(mensaje);
    }
}
