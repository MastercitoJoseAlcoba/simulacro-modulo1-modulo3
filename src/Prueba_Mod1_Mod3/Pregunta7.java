package Prueba_Mod1_Mod3;

import java.util.Stack;

public class Pregunta7 {
    public static void main(String[] args) {

        Stack<String> pila = new Stack <>();

        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");       // Elemento superior.

        System.out.println("Elemento superior: " + pila.peek()); // El elemento que se encuentra en la parte superior.
                                                                 // Devuelve: Java

        String eliminado = pila.pop(); // elimina el elemento superior (Java) y lo devuelve.
                                       // La pila queda: [HTML, CSS, JavaScript]

        pila.push("Python"); // Agrega a Python como elemento superior.

        System.out.println("Elemento: " + eliminado);
        System.out.println("Elemento superior actual: " + pila.peek());
        System.out.println("Posición de CSS: " + pila.search("CSS")); // En stack, search() cuenta desde arriba,
                                                                         // Empezando en 1.
                                                                         // Pila: Visto desde arriba:
                                                                         // [HTML, CSS, JavaScript, Python]
        System.out.println("¿Está vacía? " + pila.isEmpty());
        System.out.println("Contenido final: " + pila);

        /**
         * a. Elemento superior: Java
         *    Eliminado: Java
         *    Elemento superior actual: Python
         *    Posición de CSS: 3
         *    ¿Está vacía? False
         *    Contenido final: [HTML, CSS, JavaScript, Python]
         *
         * b. Elemento superior: HTML
         *    Eliminado: HTML
         *    Elemento superior actual: Python
         *    Posición de CSS: 2
         *    ¿Está vacía? False
         *    Contenido final: [CSS, JavaScript, Java, Python]
         *
         * c. Elemento superior: Java
         *    Eliminado: Java
         *    Elemento superior actual: Python
         *    Posición de CSS: 3
         *    ¿Está vacía? False
         *    Contenido final: [HTML, CSS, JavaScript, Python]
         *
         * d. Elemento superior: Java
         *    Eliminado: Python
         *    Elemento superior actual: Java
         *    Posición de CSS: 3
         *    ¿Está vacía? True
         *    Contenido final: [HTML, CSS, JavaScript, Java]
         *
         * La correcta es: a.
         *
         */


    }
}
