package Apoyo_Repaso_VCs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solucion {
    public static void main(String[] args) {
        String [] categorias = {"frutas", "bebida", "fruta", "limpieza", "bebida"};
        String [] productos = {"manzana", "agua", "pera", "jabón", "agua"};

        HashMap<String, ArrayList<String>> resultado = (HashMap<String, ArrayList<String>>) agruparPorCategoria(categorias, productos);
        System.out.println(resultado.get("fruta"));
        System.out.println(resultado.get("bebida"));
        System.out.println(resultado.get("limpieza"));

    }
    public static Map<String, ArrayList<String>> agruparPorCategoria(String[] categorias, String[] productos) {
        Map<String, ArrayList<String>> resultado = new HashMap<>();

        // Si alguno de los arreglos está vacío devolver el mapa vacío
        if (categorias == null || productos == null) {
            return resultado;
        }

        // Largo del arreglo
        int largoCat = categorias.length;
        int largoPro = productos.length;

        // Opción 1
        int largoMin;
        if (largoCat < largoPro) {
            largoMin = largoCat;
        } else {
            largoMin = largoPro;
        }

        // Opción 2: Operador ternario
        largoMin = largoCat < largoPro ? largoCat : largoPro;

        // Opción 3:
        largoMin = Math.min(largoCat, largoPro);

        for (int i = 0; i < largoMin; i++) {
            String categoria = categorias[i];
            String producto = productos[i];
            if (categoria == null || producto == null || categoria.equals("") || producto.equals("")) {
                continue;
            }
            if (resultado.containsKey(categoria)) {
                resultado.get(categoria).add(producto);
            } else {
                resultado.put(categoria, new ArrayList<String>());
                resultado.get(categoria).add(producto);
            }
        }

        return resultado;
    }
}
