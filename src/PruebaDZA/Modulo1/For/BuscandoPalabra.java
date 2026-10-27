package PruebaDZA.Modulo1.For;

public class BuscandoPalabra {
    public static void main(String[] args) {
        String palabra = "Estoy buscando la letra a"; // Largo 25
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A'){
                contador++;
                // break; Encuentra la primera letra a
                // continue; Salta al principio del for

            }
        }
        System.out.println("Se encontraron " + contador + " letras a y A");
    }
}
