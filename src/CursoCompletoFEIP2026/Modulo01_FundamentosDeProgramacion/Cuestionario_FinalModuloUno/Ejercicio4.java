package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio4 {
    public static void main(String[] args) {
        String pal1 = "ojo", pal2 = "remedio";
        String resultado = funcion(pal1 + " " + pal2);
        System.out.println(resultado);
    }

    public static String funcion(String dato) {
        String aux = ""; // Guarda los caracteres al revés
        int indice = dato.length() - 1; // Invierte la cadena completa

        do {
            aux = aux + dato.charAt(indice);
            indice--;
        } while (indice >= 0);

        return aux;

        // Imprime: "oidemer ojo"
    }
}