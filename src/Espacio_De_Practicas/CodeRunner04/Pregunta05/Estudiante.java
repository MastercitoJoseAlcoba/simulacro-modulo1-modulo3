package Espacio_De_Practicas.CodeRunner04.Pregunta05;

public class Estudiante {
    private String id;
    private String nombre;
    private double notaFinal;

    public Estudiante() {
        this.id = "0";
        this.nombre = "N/N";
        this.notaFinal = 0.0;
    }

    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.notaFinal = 0.0;
    }

    public Estudiante(String id, String nombre, double notaFinal) {
        this.id = id;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public boolean estaAprobado() {
        return notaFinal >= 6.0;
    }

    @Override
    public String toString() {
        return "Estudiante " + nombre + " con nota " + notaFinal;
    }
}