package Bloque2_String_y_fechas.Pregunta6_Lista_creada_con_Arrays.asLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creamos un arreglo de String llamado colores.
        // Tiene 5 elementos.
        String colores[] = {"Rojo", "Azul", "Verde", "Amarillo", "Rosa"};

        // Creamos una lista de tipo List<String>.
        // Al principio apunta a un ArrayList vacío.
        List<String> lista = new ArrayList<>();

        // Acá cambiamos lista.
        // Ahora lista ya no apunta al ArrayList vacío.
        // Ahora apunta a la lista creada por Arrays.asList(colores).
        //
        // IMPORTANTE:
        // Arrays.asList(colores) crea una lista basada en el arreglo original.
        // Esa lista tiene tamaño fijo.
        //
        // Eso significa que permite cambiar elementos existentes,
        // pero NO permite agregar ni eliminar elementos.
        lista = Arrays.asList(colores);

        // ERROR EN TIEMPO DE EJECUCIÓN:
        // Como la lista creada por Arrays.asList tiene tamaño fijo,
        // no se puede hacer add().
        //
        // Esta línea compila, pero al ejecutar lanza una excepción:
        // UnsupportedOperationException.
        lista.add("Gris");

        // Esta línea no llega a ejecutarse porque el programa se rompe antes.
        //
        // Además, aunque se ejecutara, imprimir colores directamente
        // no mostraría el contenido bonito del arreglo.
        // Para imprimir un arreglo correctamente se usa Arrays.toString(colores).
        System.out.println(colores);
    }
}

/*
RESPUESTA:
Muestra una excepción porque la lista no es mutable de la forma en la que se creó.

Respuesta correcta:
d. Muestra una excepción, ya que esta lista no es mutable de la forma en la que se creó.

IDEA CLAVE:
Arrays.asList(arreglo) devuelve una lista de tamaño fijo.

PERMITE:
lista.set(0, "Negro");

NO PERMITE:
lista.add("Gris");
lista.remove("Azul");

FORMA CORRECTA SI QUIERES UNA LISTA MODIFICABLE:

List<String> lista = new ArrayList<>(Arrays.asList(colores));
lista.add("Gris");

Ahí sí funciona porque creas un ArrayList real y modificable.

Git y Java se parecen en algo:
parece que te dejan avanzar, pero cuando ejecutas te cobran la confianza.
*/