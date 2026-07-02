package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;

public class Ej_12 {
    public static void main(String[] args) {
        /**
         * Dada la siguiente instrucción:
         * String str = autos.get(2);
         * Podemos decir que:
         *
         * La variable str contiene el tercer elemento de la lista autos.
         */
        LinkedList<String> autos = new LinkedList<>();

        // Agregar elementos a la lista
        autos.add("Ford");   // 0
        autos.add("BMW");    // 1
        autos.add("Toyota"); // 2
        autos.add("Honda");  // 3

        // Obtener el tercer elemento de la lista
        String str = autos.get(2); // "Toyota"
        System.out.println(str);
    }
}
