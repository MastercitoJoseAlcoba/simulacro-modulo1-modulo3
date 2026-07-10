package FIP_PRE_05_JMAC_2026_Guille.Pregunta07;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.numeros(new int[]{1,2,3,4,5,6,7,8,9,10});

    }

    public void numeros (int[] arr){
        for (int num : arr) {
            System.out.println(num+" ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("#"); // Añadimos guion si no es el último #.
                if (i < num - 1) {
                    System.out.println("-");
                }
            }

            System.out.println(); // Salto de línea después de cada número y sus '#.
        }
    }
}
