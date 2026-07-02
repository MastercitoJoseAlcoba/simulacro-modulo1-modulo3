package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;

public class Ej_04 {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<String>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Jose");

        /** Y queremos mostrar todos los nombres de la lista a través de un for Each, rellenar los espacios en blanco para hacer lo solicitado: */

        for (String s : nombres) {
            System.out.print(s);
        }
    }
}
