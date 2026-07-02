package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;

public class Ej_10 {
    public static void main(String[] args) {
        LinkedList<String> autos = new LinkedList<>();
        autos.add("Ford");
        autos.add("BMW");
        autos.add("Fiat");
        autos.add("Audi");
        autos.add("Mercedes");
        System.out.println(autos);

        autos.clear(); // Borra todos los elementos de la lista
        System.out.println(autos);
    }
}
