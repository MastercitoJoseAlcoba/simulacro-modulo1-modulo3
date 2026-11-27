package Apoyo_Diciembre2026.VC2P9_EncontrarMayorMenorArray;

public class Ej09_EncontrarMayorMenorArray {
    public static void main(String[] args) {
        int [] miArray = {12, 5, 8, 20, 3, 10};

        int mayor = EncontrarMayorMenorArray.encontrarMayor(miArray);
        int menor = EncontrarMayorMenorArray.encontrarMenor(miArray);

        System.out.println("El valor mayor del array es: " + mayor);
        System.out.println("El valor menor del array es: " + menor);

    }

    public class EncontrarMayorMenorArray {
        public static int encontrarMayor(int[] array) {
            // Verifica si el array no está vacío
            if (array.length == 0) {
                throw new IllegalArgumentException("El array no puede estar vacío.");
            }

            // Inicializa el mayor con el primer elemento del array
            int mayor = array[0];

            // Utiliza un bucle para encontrar el valor mayor
            for (int i = 1; i < array.length; i++){
                if (array[i] > mayor){
                    mayor = array[i];
                }
            }

            // Devuelve el valor mayor encontrado
            return mayor;
        }

        public static int encontrarMenor(int[] array) {
            // Verifica si el array no está vacío
            if (array.length == 0) {
                throw new IllegalArgumentException("El array no puede estar vacío.");
            }

            // Inicializa el menor con el primer elemento del array
            int menor = array[0];

            // Utiliza un bucle para encontrar el valor menor
            for (int j = 1; j < array.length; j++){
                if (array[j] < menor){
                    menor = array[j];
                }
            }

            // Devuelve el valor menor encontrado
            return menor;

        }
    }
}
