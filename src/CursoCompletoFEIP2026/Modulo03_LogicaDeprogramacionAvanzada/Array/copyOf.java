package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

public class copyOf {
    public static void main(String[] args) {
        int [] numeros = {10, 20, 30, 40, 50};
        int [] copiaNumeros = java.util.Arrays.copyOf(numeros, numeros.length);
        System.out.println("Copia de números : " + java.util.Arrays.toString(copiaNumeros)); // Imprime: [10, 20, 30, 40, 50]
    }
}
