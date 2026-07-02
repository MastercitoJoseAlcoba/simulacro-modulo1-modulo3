package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_4.Pregunta05;

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
        // La parte clave del aprobado es:
        return notaFinal >= 6.0;
        // Y el toString() queda exactamente con este formato: "Estudiante [nombre] con nota [notaFinal]"
        // Por ejemplo, si el nombre es "Jose" y la nota es 8.5, devuelve:
        // Estudiante Jose con nota 8.5
    }

    @Override
    public String toString() {
        return "Estudiante " + nombre + " con nota " + notaFinal;
    }
}