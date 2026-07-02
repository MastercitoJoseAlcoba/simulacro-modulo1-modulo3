package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Split;

public class Split {
    public static void main(String[] args) {

        // Simulamos un archivo CSV cargado en un array de líneas
        String[] lineas = {
                "pais,capital,continente,idioma",
                "Uruguay,Montevideo,America del Sur,Español",
                "Argentina,Buenos Aires,America del Sur,Español",
                "Brasil,Brasilia,America del Sur,Portugues",
                "Chile,Santiago,America del Sur,Español",
                "Paraguay,Asuncion,America del Sur,Español y Guarani"
        };

        // Recorremos cada línea del CSV
        for (int i = 0; i < lineas.length; i++) {

            // Separamos cada línea por coma
            String[] datos = lineas[i].split(",");


            // Recorremos cada dato de esa línea
            for (int j = 0; j < datos.length; j++) {
                System.out.print(datos[j] + " | ");
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}