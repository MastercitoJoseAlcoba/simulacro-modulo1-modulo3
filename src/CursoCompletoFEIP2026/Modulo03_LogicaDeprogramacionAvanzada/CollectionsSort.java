package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>();
        // Agregar elementos a la lista
        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Pedro");
        listaNombres.add("Jose");

        // Ordena la lista
        Collections.sort(listaNombres);
        System.out.println(listaNombres);

        // Mezcla la lista
        Collections.shuffle(listaNombres);
        System.out.println(listaNombres);

        // Invierte el orden de la lista
        Collections.reverse(listaNombres);
        System.out.println(listaNombres);

        // Realiza la búsqueda de un elemento en la lista
        boolean encontrado = Collections.binarySearch(listaNombres, "Pedro") >= 0;
        System.out.println(encontrado);

        // Reemplaza un elemento en la lista
        Collections.fill(listaNombres, "Nuevo");
        System.out.println(listaNombres);

        // Devuelve el valor máximo de la colección dada
        Collections.max(listaNombres);
        System.out.println("Devuelve el valor máximo de la colección dada: "+ Collections.max(listaNombres));
        Collections.min(listaNombres);
        System.out.println("Devuelve el valor mínimo de la colección dada: "+ Collections.min(listaNombres));

        // Reemplaza un elemento en la lista
        Collections.replaceAll(listaNombres, "Nuevo", "Nuevo Nuevo");
        System.out.println(listaNombres);

        // Intercambia los elementos de dos posiciones de la lista
        Collections.swap(listaNombres, 0, 2);

    }
}
