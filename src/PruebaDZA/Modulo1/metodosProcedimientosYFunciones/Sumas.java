package PruebaDZA.Modulo1.metodosProcedimientosYFunciones;

public class Sumas {
    public static void main(String[] args) {
        // Ejemplo simple de suma sin parámetros
        suma1();

        // Ejemplo de suma con parámetros
        suma2(10.0, 5.0);

        // Ejemplo de función

    }
    // Procedimiento
    public static void suma1(){
        double num1 = 5.0, num2 = 3.0, resultado;
        resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado); // Imprime el resultado de la suma en consola
    }

    // Procedimiento
    public static void suma2(double num3, double num4){
        double resultado;
        resultado = num3 + num4;
        System.out.println(num3 + " + " + num4 + " = " + resultado);
    }

    // Función
    public static double suma3(){
        double num5 = 7.3, num6 = 2.7, resultado;
        resultado = num5 + num6;
        return resultado;
    }

}
