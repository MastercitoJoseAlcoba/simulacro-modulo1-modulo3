package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra = "roma";
        int i = palabra.length()-1;
        String result = "";
        do {
            result = result + palabra.charAt(i);
            i--;
        } while (i>=0);
        System.out.println(result);

        // Imprime: "amor"

    }
}
