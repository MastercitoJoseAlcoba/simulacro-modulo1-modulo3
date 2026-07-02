package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio3 {
    public static void main(String[] args) {
        int p = 50;
        int g = 34;

        int suma = sumaleDiez(p+g);
        suma++;
        suma++;
        System.out.println(suma);
    }
    private static int sumaleDiez(int numero){
        return numero+10;
        // El resultado que ejecuta el programa es: 96
    }
}
