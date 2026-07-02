package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_EstructurasDeDatos;

import java.util.LinkedList;

public class ContarParesImpares {

    public static int[] contarParesImpares(LinkedList<Integer> lista) {
        int pares = 0;
        int impares = 0;

        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        return new int[]{pares, impares};
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(11);
        lista.add(21);
        lista.add(32);
        lista.add(42);
        lista.add(53);

        int[] resultado = ContarParesImpares.contarParesImpares(lista);

        System.out.println("Cantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);
    }
}