package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio10 {
    public static void main(String[] args) {
        int alumnos = 5;
        int equipos = 3;
        int combinacion = factorial(alumnos) / (factorial(alumnos-equipos) * factorial(equipos));
        System.out.println(combinacion);
    }
    public static int factorial (int n){
        int suma = 1;
        for (int i = n; i >= 2; i--) {
            suma *= i;
        }
        return suma;
    }
}

// C(alumnos,equipos)=(alumnos−equipos)!⋅equipos!
