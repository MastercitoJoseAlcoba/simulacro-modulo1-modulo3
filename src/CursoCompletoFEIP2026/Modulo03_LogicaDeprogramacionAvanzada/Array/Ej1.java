package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

public class Ej1 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        for (Integer numero : numeros) {
            System.out.print("[" + numero + "]");
        }
    }
}
// Imprime: [10, 20, 30, 40, 50]

