package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio16 {
    public static void main(String[] args) {
       int suma = 0;
       int contador = 0;
       for (int i = 1; i <= 100; i++) {
           if (i % 2 == 0) {
               suma += i;
               contador++;
               System.out.println("La suma es: " + suma);
               System.out.println("El contador es: " + contador);
               // Imrime: a. suma = 2450 - contador = 49
           }
       }
    }
}
