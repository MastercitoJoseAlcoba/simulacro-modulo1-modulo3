package PruebaDZA.Modulo1.Condicional;

public class EvaluarAcceso_ConReturn {
    public static void main(String[] args) {
        boolean tieneEntrada = true;
        int edad = 20;
        String resultado = evaluarAcceso(tieneEntrada, edad);
        System.out.println(resultado);

    }

    public static String evaluarAcceso(boolean tieneEntrada, int edad){
        if (!tieneEntrada){
            return "Debe comprar una entrada primero.";
        }
        if (edad < 18){
            return "No tiene edad suficiente para ingresar.";
        }
        return "Puede ingresar.";
    }
}
