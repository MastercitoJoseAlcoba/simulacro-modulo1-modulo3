package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio8 {
    public static void main(String[] args) {
        String mensaje = "Hola que tal";
        String otroMensaje = new String("Hola que tal"); // Crea un objeto nuevo con new.
        String resultado = mensaje==otroMensaje ? "iguales" : "diferentes"; // Operador ternario, entra al false / Compara si es el mismo objeto.
        if(resultado.equals("iguales")){ // Compara el contenido de la cadena.
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        // Imprime: Son diferentes
    }
}
