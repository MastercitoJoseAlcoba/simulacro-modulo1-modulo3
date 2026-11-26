package PruebaDZA.Modulo1.Condicional;

public class AccesoEvento_IfAnidado {
    public static void main(String[] args) {
        /*
         * En Java, un if anidado consiste en colocar una sentencia if (o if-else) dentro de otra sentencia if o else.
         * Permite comprobar condiciones secundarias que solo tienen sentido si la condición principal es verdadera.
         *
         */

        // Ejemplo básico en Java
        boolean tieneEntrada = true;
        int edad = 18;

        if(tieneEntrada){
            if(edad >= 18){
                System.out.println("Puede ingresar");
            } else {
                System.out.println("No puede ingresar");
            }
        } else {
            System.out.println("No tiene entrada");
        }
    }
}
