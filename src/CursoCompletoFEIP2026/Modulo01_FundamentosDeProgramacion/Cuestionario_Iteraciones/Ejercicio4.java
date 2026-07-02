package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio4 {
    public static void main(String[] args) {
        int acumulador = 55;
        int j = 10;

        for (int i = 10; j<60; j+=2) { // 10, 12, 14 ... 58, no llega a 60 porque es j < 60.
            acumulador += 10; // Cantidad de vueltas: de 10 a 58, de 2 en 2
                              // Son 25 vueltas.
        }
        System.out.println(acumulador); // Valor inical: 55 + suma total: 250 = 305.

        // Imprime: 305
        // Entra 25 veces, suma 10 en cada una, imprime 305.
    }
}
