package Apoyo_Diciembre2026.VC2P8_SumarElementosArray;

public class Ej08_SumarElementosArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int suma = sumarElementos(array);
        System.out.println("La suma de los elementos del array es: " + suma);
    }
    public static int sumarElementos(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}
