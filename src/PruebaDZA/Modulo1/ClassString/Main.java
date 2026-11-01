package PruebaDZA.Modulo1.ClassString;

public class Main {
    public static void main(String[] args) {
        // La clase String es un arreglo de char().
        // Se puede acceder a los elementos de la clase String como si fuera un arreglo.
        // Indice del String arranca en cero. 0123456789

        String str = "Hola";
        int longitud = str.length();
        boolean inicia = str.startsWith("H");
        boolean termina = str.endsWith("a");
        boolean esVacio = str.isEmpty();
        boolean esta = str.contains("o");
        boolean iguales = str.equals("Hola");
        int pos = str.indexOf("a");
        String otra = str.substring(1);
        char primerCaracter = str.charAt(0);
        String minuscula = str.toLowerCase();
        String mayuscula = str.toUpperCase();
        String dato = str.replace("o", "a");

        String dato1 = "Ana";
        String dato2 = dato1.replace("a", "o");
        boolean iguales2 = dato1.equals(dato2);
        System.out.println("Las variables dato y dato2 son iguales con método equals " + iguales);

        for (int i = 0; i < dato1.length(); i++) {
            System.out.println(dato1.charAt(i));
        }


    }

    private static Object replace(String o, String a) {
        return null;
    }
}
