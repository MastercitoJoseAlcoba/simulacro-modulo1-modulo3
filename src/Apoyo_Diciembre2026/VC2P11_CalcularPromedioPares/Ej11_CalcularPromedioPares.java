package Apoyo_Diciembre2026.VC2P11_CalcularPromedioPares;

public class Ej11_CalcularPromedioPares {
    public static void main(String[] args) {

        int[] numeros1 = {2, 4, 6, 8};
        System.out.println(calcularPromedioPares(numeros1));

        int[] numeros2 = {1, 3, 5, 7};
        System.out.println(calcularPromedioPares(numeros2));


        int[] numeros3 = {1, 2, 3, 4, 5, 6};
        System.out.println(calcularPromedioPares(numeros3));

    }

    public static double calcularPromedioPares(int[] numeros) {
        // Aca se debe colocar el código
        // siguiendo los pasos sugeridos en la letra
        double suma = 0;
        double contador = 0;

        for (double numero : numeros){
            if (numero % 2 == 0){
                suma += numero;
                contador++;
            }
        }

        if (contador == 0){
            return 0;
        }
        return suma / contador;
    }
}
