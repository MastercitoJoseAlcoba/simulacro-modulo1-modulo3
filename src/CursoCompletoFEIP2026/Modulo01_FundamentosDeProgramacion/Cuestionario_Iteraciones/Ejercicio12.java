package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio12 {
    public static void main(String[] args) {
        int a = 10;
        int contador = 0;
        do {
            contador++;
            System.out.println("Estamos en el bucle " + contador);
        }while (a>5);

        // El programa entra en un loop infinito.
    }

}
