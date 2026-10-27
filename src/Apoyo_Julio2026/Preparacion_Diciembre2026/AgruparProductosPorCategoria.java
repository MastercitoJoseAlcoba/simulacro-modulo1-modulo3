package Apoyo_Julio2026.Preparacion_Diciembre2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparProductosPorCategoria {
    public static void main(String[] args) {

    }
    public static Map<String, ArrayList<String>> agruparProductosPorCategoria(String[] categorias, String[] productos) {
        
        if (categorias == null || productos == null || categorias.length != productos.length) {
            return null;
        }
        
        Map<String, ArrayList<String>> resultado = new HashMap<>();
        
        for (int i = 0; i < categorias.length; i++) {
            String categoria = categorias[i];
            String producto = productos[i];
            
            if (!resultado.containsKey(categoria)) {
                resultado.put(categoria, new ArrayList<>());
            }
            
            resultado.get(categoria).add(producto);
        }

        return resultado ;
    }
}
