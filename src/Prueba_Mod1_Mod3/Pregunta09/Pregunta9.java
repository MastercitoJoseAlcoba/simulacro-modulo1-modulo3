package Prueba_Mod1_Mod3.Pregunta09;

import java.util.ArrayList;

public class Pregunta9 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");

        frutas.set(1, "Naranja"); // Cambia el índice 1, que es Pera, por Naranja.
                                  // Recordá: los índices empiezan en 0.

        frutas.add(2, "Kiwi"); // Agrega "Kiwi" en el índice 2 y corre lo demás hacia la derecha:
                                             // [Manzana, Naranja, Kiwi, Banana, Uva]

        frutas.remove(3); // Elimina el índice 3, que es Banana.
                                // Quedaría así: [Manzana, Naranja, Kiwi, Uva]

        frutas.add("Melón"); // Agrega al final: [Manzana, Naranja, Kiwi, Uva, Melón]

        frutas.remove("Manzana"); // Elimina el elemento "Manzana" de la lista.

        System.out.println(frutas); // Imprime el ArrayList.
                                    // [Naranja, Kiwi, Uva, Melón]

    }
}

/**
 * ¿Qué se muestra en consola al ejecutar el programa?
 *
 * a. [Manzana, Pera, Kiwi, Banana, Uva, Melón]
 * b. [Naranja, Kiwi, Banana, Uva, Melón]
 * c. [Manzana, Naranja, Kiwi, Uva, Melón]
 * d. [Naranja, Kiwi, Uva, Melón]
 *
 * Opción correcta: d.
 *
 */
