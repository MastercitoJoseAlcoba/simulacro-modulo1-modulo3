package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

import java.util.ArrayList;

public class OperacionesArrayList {

    private ArrayList<String> lista = new ArrayList<>();

    public static void main(String[] args) {

        OperacionesArrayList operaciones = new OperacionesArrayList();

        operaciones.agregarElemento("rojo");
        operaciones.agregarElemento("azul");
        operaciones.agregarElemento("verde");

        System.out.println(operaciones.mostrarLista());

        operaciones.eliminarElemento("azul");

        System.out.println(operaciones.mostrarLista());
    }

    public void agregarElemento(String elemento) {

        // Agrega al final
        lista.add(elemento);
    }

    public void eliminarElemento(String elemento) {

        // Elimina el elemento
        lista.remove(elemento);
    }

    public String mostrarLista() {

        return lista.toString();
    }
}
