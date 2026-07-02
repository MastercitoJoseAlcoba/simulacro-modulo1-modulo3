package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_SobreEstructuraDeDatos;

import java.util.LinkedList;

public class Ej_01 {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<String>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Carlos");

        // Y queremos mostrar todos los nombres de la lista a través de un for tradicional, rellenar los espacios en
        // blanco para hacer lo solicitado:

        for (int i = 0; i < nombres.size(); i++) {
            System.out.print(nombres.get(i));
        }
    }
}
