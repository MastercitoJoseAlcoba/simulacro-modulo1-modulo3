package PruebaDZA.Modulo3.Estudiante;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private int [] calificaciones = new int[5];

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudiante{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", calificaciones=").append(Arrays.toString(calificaciones));
        sb.append('}');
        return sb.toString();
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return (double) suma / calificaciones.length;
    }


}
