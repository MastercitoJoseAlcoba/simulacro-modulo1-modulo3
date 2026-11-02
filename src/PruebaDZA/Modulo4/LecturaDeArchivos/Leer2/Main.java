package PruebaDZA.Modulo4.LecturaDeArchivos.Leer2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        LinkedList<ConsumoAgua> consumo = new LinkedList<>();

        Path myPath = Path.of(
                "src/PruebaDZA/Modulo4/LecturaDeArchivos/Leer2/ConsumoAgua.txt"
        );

        List<String> lineas = Files.readAllLines(
                myPath, StandardCharsets.UTF_8
        );

        for (String linea : lineas) {

            String[] partes = linea.split(",");

            consumo.add(new RegistroConsumo(
                    partes[0].trim(),
                    Integer.parseInt(partes[1].trim()),
                    Integer.parseInt(partes[2].trim())
            ));
        }

        for (ConsumoAgua c : consumo) {
            System.out.println(c);
        }
    }
}