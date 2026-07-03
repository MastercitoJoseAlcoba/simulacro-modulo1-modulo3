package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta04;

public class Eje4 {
    public static void main(String[] args) {

        int[] datos = new int[4]; // Tiene 4 lugares, pero el último índice es 3, no 4. Java cuenta desde cero.

        datos[0] = 1;
        datos[3] = 10;
        datos[2] = 15; // ERROR: esta posición no existe
        datos[1] = -20;

        System.out.println(datos[0]);
        System.out.println(datos[1]);
        System.out.println(datos[2]);
        System.out.println(datos[3]);

        System.out.println("Ultimo elemento: " + datos[datos.length - 1]);
    }
}