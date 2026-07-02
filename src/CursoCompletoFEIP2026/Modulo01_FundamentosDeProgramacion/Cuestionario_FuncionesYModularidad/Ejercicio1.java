package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Juan";
        System.out.println(estaPresente('a', "Juan"));

    }
    public static boolean estaPresente(char letra, String nombre) {
        boolean esta = false;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == letra) {
                return true;
            }
        }
        return esta;
        // Este método devuelve true si la letra esta presente en el nombre y uno de sus parámetros es un char.
    }
}
