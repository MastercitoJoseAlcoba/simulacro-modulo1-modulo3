package PruebaDZA.Modulo1.metodosProcedimientosYFunciones;

public class Metodos {
    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = 3;
        String nombre = "Juan";
        int resultado = sumar(5, 3);
        System.out.println("El resultado es: " + resultado);

        saludar(nombre);

    }
    private static int sumar(int a, int b){ // Firma del método (función)
        int resultado = a + b;
        return resultado;
    }
    private static void saludar(String nombre){
        System.out.println("Hola "+nombre+" como estas");
    }
}
