package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta26_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrincipalSet {

    public static void main(String[] args) {

        // LinkedHashSet:
        //
        // 1) No permite duplicados.
        // 2) Mantiene el orden de inserción.
        Set<Integer> numeros = new LinkedHashSet<>();

        numeros.add(10);
        numeros.add(20);

        // 10 ya existe.
        // No se agrega.
        numeros.add(10);

        numeros.add(30);

        // 20 ya existe.
        // No se agrega.
        numeros.add(20);

        System.out.println(numeros);
    }
}

/*
SALIDA:
[10, 20, 30]

IDEA CLAVE:

HashSet:
no permite duplicados, pero no garantiza orden.

LinkedHashSet:
no permite duplicados y mantiene orden de inserción.

TreeSet:
no permite duplicados y ordena naturalmente.
*/