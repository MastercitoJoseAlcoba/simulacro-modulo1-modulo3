package Bloque2_String_y_fechas.Pregunta7_Operaciones_con_ArrayList;

import java.util.ArrayList;

public class OperacionesArrayList {

    // Atributo privado.
    // La clase maneja internamente una lista de textos.
    //
    // private significa que no se puede acceder directamente desde afuera.
    private ArrayList<String> lista;

    // Constructor sin parámetros.
    // Se ejecuta cuando hacemos:
    //
    // OperacionesArrayList op = new OperacionesArrayList();
    public OperacionesArrayList() {

        // Inicializamos la lista vacía.
        //
        // Esto es obligatorio porque si no lo hacemos,
        // lista queda en null.
        //
        // Si lista queda en null y después hacemos lista.add(...),
        // aparece NullPointerException.
        lista = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {

        // Agrega el elemento recibido al final de la lista.
        //
        // Ejemplo:
        // lista = []
        // agregarElemento("Java")
        // lista = ["Java"]
        lista.add(elemento);
    }

    public void eliminarElemento(String elemento) {

        // Elimina el elemento recibido de la lista.
        //
        // Si el elemento existe, lo elimina.
        // Si no existe, no rompe el programa.
        //
        // Ejemplo:
        // lista = ["Java", "Python", "SQL"]
        // eliminarElemento("Python")
        // lista = ["Java", "SQL"]
        lista.remove(elemento);
    }

    public String mostrarLista() {

        // Devuelve la lista convertida a texto.
        //
        // Ejemplo:
        // ["Java", "SQL"]
        //
        // ArrayList ya tiene un método toString()
        // que muestra los elementos entre corchetes.
        return lista.toString();
    }
}

/*
IDEA GENERAL DEL EJERCICIO:

La clase OperacionesArrayList encapsula una lista.

Encapsular significa:
- El atributo lista está privado.
- Desde afuera no tocas la lista directamente.
- Usas métodos para agregar, eliminar y mostrar.

EJEMPLO MENTAL:

OperacionesArrayList op = new OperacionesArrayList();

op.agregarElemento("Java");
op.agregarElemento("SQL");
op.eliminarElemento("Java");

System.out.println(op.mostrarLista());

Resultado:
[SQL]

COSAS IMPORTANTES:

1) ArrayList permite elementos duplicados.
   Ejemplo:
   ["Java", "Java", "SQL"]

2) ArrayList mantiene el orden de inserción.
   Si agregas Java, SQL, Python,
   se muestran en ese mismo orden.

3) remove(elemento) elimina la primera aparición que encuentre.

4) El constructor es clave.
   Sin esta línea:
   lista = new ArrayList<>();
   la lista queda null y el programa falla.
*/