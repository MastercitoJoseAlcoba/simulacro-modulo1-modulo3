package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_EstructurasDeDatos;

import java.util.LinkedList;

public class RecorrerLista {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);

        int resultado = sumarElementos(lista);
        System.out.println("La suma de los elementos de la lista es: " + resultado);

    }
    // Lo que pide el CodeRunne
    public static int sumarElementos(LinkedList<Integer> lista) {
        int suma = 0;
        for (int elemento : lista) {
            suma = suma + elemento;
        }
        return suma;
    }
}


