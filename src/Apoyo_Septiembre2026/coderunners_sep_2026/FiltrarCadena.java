package Apoyo_Septiembre2026.coderunners_sep_2026;

import java.util.ArrayList;
import java.util.List;

public class FiltrarCadena {
    public static void main(String[] args) {

    }

    public List<String> filtrarPalabras(List<String> palabras) {

        // Creamos una nueva lista vacía.
        // Aquí vamos a guardar solamente las palabras
        // que cumplan con la condición solicitada.
        List<String> resultado = new ArrayList<>();


        // Recorremos una por una todas las palabras
        // de la lista recibida como parámetro.
        //
        // En cada vuelta del for, la variable "palabra"
        // contiene uno de los elementos de la lista.
        for (String palabra : palabras) {

            // Convertimos la palabra a minúsculas.
            //
            // Esto permite que la búsqueda no dependa
            // de si las letras están escritas en
            // mayúsculas o minúsculas.
            //
            // Por ejemplo:
            // "Mesa" -> "mesa"
            // "MANZANA" -> "manzana"
            String minuscula = palabra.toLowerCase();


            // Verificamos que la palabra contenga:
            // - al menos una letra "a"
            // - Y al menos una letra "e"
            //
            // contains("a") devuelve true si encuentra una "a".
            // contains("e") devuelve true si encuentra una "e".
            //
            // El operador && significa "Y".
            // Por lo tanto, ambas condiciones deben cumplirse.

            if (minuscula.contains("a") && minuscula.contains("e")) {

                // Si cumple ambas condiciones,
                // agregamos la palabra a la lista resultado.
                //
                // Agregamos "palabra" y no "minuscula"
                // para conservar exactamente cómo venía escrita
                // originalmente.
                resultado.add(palabra);
            }
        }


        // Una vez recorrida toda la lista,
        // devolvemos la nueva lista con las palabras
        // que cumplen la condición.
        return resultado;
    }
}
