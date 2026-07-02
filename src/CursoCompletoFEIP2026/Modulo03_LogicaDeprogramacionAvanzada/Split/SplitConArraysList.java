package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Split;

import java.util.ArrayList;

public class SplitConArraysList {
    public static void main(String[] args) {
        // Simulamos las líneas de un archivo CSV
        String[] lineas = {
                "país,capital,continente,idioma",
                "Uruguay,Montevideo,America del Sur,Español",
                "Argentina,Buenos Aires,America del Sur,Español",
                "Brasil,Brasilia,America del Sur,Portugues",
                "Chile,Santiago,America del Sur,Español",
                "Paraguay,Asuncion,America del Sur,Español y Guarani"
        };

        // ArrayList de arrays
        ArrayList<String[]> paises = new ArrayList<>();

        // Primer for: recorre cada línea del CSV
        for (int i = 0; i < lineas.length; i++) {

            // split separa la línea por comas
            String[] datos = lineas[i].split(",");

            // guardamos ese array dentro del ArrayList
            paises.add(datos);
        }

        // Recorremos el ArrayList
        for (int i = 0; i < paises.size(); i++) {

            // Obtenemos una fila
            String[] fila = paises.get(i);

            // Recorremos las columnas de esa fila
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j] + " | ");
            }

            System.out.println();
        }
    }
}