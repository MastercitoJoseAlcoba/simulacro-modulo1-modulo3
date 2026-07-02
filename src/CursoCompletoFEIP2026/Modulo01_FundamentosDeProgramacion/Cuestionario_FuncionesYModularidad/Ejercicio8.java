package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio8 {
    public static void main(String[] args) {
        int resultado = funRandom();
        System.out.println(resultado);
    }
    private static int funRandom() {
        return (int) (Math.random()*10)+1;

        // Imprime: Impredecible ya que random me puede mostrar un número diferente cada vez que lo ejecuto.
    }
}
