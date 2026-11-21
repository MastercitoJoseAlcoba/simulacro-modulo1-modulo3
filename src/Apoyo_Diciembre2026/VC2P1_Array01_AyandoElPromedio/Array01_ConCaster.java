package Apoyo_Diciembre2026.VC2P1_Array01_AyandoElPromedio;

public class Array01_ConCaster {
    public static void main(String[] args) {
        // Primer array
        int [] numero1 = {2, 4, 6, 8};
        System.out.println(calcularPromedio(numero1));

        // Segundo array
        int [] numero2 = {1, 3, 5, 7}; // 5.0
        System.out.println(calcularPromedio(numero2)); // 0.0
    }
    public static double calcularPromedio(int[] array){
        // Inicializando las variables
        int suma = 0; // Acumuladora
        int cantidad = 0; // Contadora

        // Recorriendo el array
        for (int i = 0; i < array.length; i++) {
            // Buscando números pares
            if (array[i] % 2 == 0){
                suma += array[i]; // Sume el número par a la variable acumuladora
                cantidad++; // Incrementa la cantidad de números pares encontrados
            }
        }
        // Si el array no contiene números pares, el promedio es 0
        if (cantidad == 0){
            return 0;
        }
        // Calculando el promedio
        return (double) suma / cantidad; // Casting para convertir la división a double
    }

}

