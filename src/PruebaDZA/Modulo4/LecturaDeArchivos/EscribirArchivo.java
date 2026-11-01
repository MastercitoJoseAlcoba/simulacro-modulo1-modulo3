package PruebaDZA.Modulo4.LecturaDeArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivo {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("C:\\Users\\Jose\\IdeaProjects\\simulacro_de_prueba_modulo1_al_modulo3\\src\\PruebaDZA\\Modulo4\\LecturaDeArchivos\\archivo.txt", true);
            /**
             * Tenemos que poner de esta forma si queremos agregar sobre el fichero
             * que ya contiene información, (se agrega el tru después del nombre del archivo).
             */
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++) {
                pw.println("Escribimos la linea " + i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
            try {
                /**
                 * Nuevamente, aprovechamos el finally para asegurarnos que se cierra el fichero.
                 */
                fichero.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fin del programa");
    }
}
