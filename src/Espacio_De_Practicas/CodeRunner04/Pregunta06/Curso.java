package Espacio_De_Practicas.CodeRunner04.Pregunta06;

public class Curso {

    private String codigoCurso;
    private String nombreCurso;
    private double costo;

    public Curso() {
        this.codigoCurso = "SIN-CODIGO";
        this.nombreCurso = "sin descripción";
        this.costo = 0.0;
    }

    public Curso(String codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.costo = 0.0;
    }

    public Curso(String codigoCurso, String nombreCurso, double costo) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.costo = costo;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void aplicarBeca(double porcentaje) {
        this.costo = this.costo - (this.costo * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Curso " + nombreCurso + " con costo " + costo;
    }
}