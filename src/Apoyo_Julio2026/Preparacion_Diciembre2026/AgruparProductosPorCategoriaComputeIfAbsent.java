package Apoyo_Julio2026.Preparacion_Diciembre2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AgruparProductosPorCategoriaComputeIfAbsent {
    public static void main(String[] args) {
        // Recibe dos arreglos de categorías y productos y construye un mapa que relaciona cada categoría con sus productos correspondientes.
        HashMap<String, ArrayList<String>> resultado = (HashMap<String, ArrayList<String>>) agruparCategoria(new String[]{"categoria1", "categoria2"}, new String[]{"producto1", "producto2"});

    }
    public static Map<String, ArrayList<String>> agruparCategoria(String[] categorias, String[] productos) {
        if (categorias == null || productos == null || categorias.length != productos.length) {
            return null;
        }
        Map<String, ArrayList<String>> resultado = new HashMap<>();
        for (int i = 0; i < categorias.length; i++) {
            String categoria = categorias[i];
            String producto = productos[i];
            resultado.computeIfAbsent(categoria, k -> new ArrayList<>()).add(producto); // La línea más importante es esta
            /*
             * Hace tres cosas:
             * 1. Comprueba si categoría existe en el mapa.
             * 2. Si no existe, crea un ArrayList<String> vacío para esa categoría.
             * 3. Agrega el producto a la lista correspondiente.
             *
             * Por ejemplo:
             * String[] categorias = {"Frutas", "Lácteos", "Frutas"};
             * String[] productos = {"Manzana", "Leche", "Banana"};
             *
             * El resultado será:
             *
             * {
             *     "Frutas": ["Manzana", "Banana"],
             *     "Lácteos": ["Leche"]
             * }
             */
        }
        return resultado;
    }



}
