package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio15 {
    public static void main(String[] args) {
        int a = 1, e = 4;
        double r = 0;

        while (a<100){
            r = metodo(a, e); // metodo(1, 4) = 7.0
            break;
        }
        System.out.println(r);
    }
    public static double metodo(int e, int a) { // metodo(4, 1) = 7.0
        double r = a * 2 - e;
        return r;

        // El resultado que ejecuta el programa es: 7.0
        // Regla de oro: argumentos <-> parámetros por orden, no por nombre.
    }
}
