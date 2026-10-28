package PruebaDZA.Modulo3.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", new int[]{10, 9, 8, 7, 6});
        Estudiante estudiante2 = new Estudiante("Pedro", new int[]{9, 8, 7, 6, 5});
        Estudiante estudiante3 = new Estudiante("Maria", new int[]{8, 7, 6, 5, 4});

        Estudiante estudiantes [] = {estudiante1, estudiante2, estudiante3};
        double suma = 0;
        double mayor = 0;
        int indice = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }

        // Llamando al método calcularPromedio
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Promedio de " + estudiantes[i].getNombre() + ": " + estudiantes[i].calcularPromedio());
            suma += estudiantes[i].calcularPromedio();
            if (estudiantes[i].calcularPromedio() > mayor) {
                mayor = estudiantes[i].calcularPromedio();
                indice = i;
            }
        }

        double promedioGeneral = suma / estudiantes.length;
        System.out.println("Promedio general: " + promedioGeneral);
        System.out.println("Es el estudiante " + estudiantes[indice].getNombre() + " tiene el mayor promedio.");
    }
}
