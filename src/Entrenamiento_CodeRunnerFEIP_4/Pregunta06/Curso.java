package Entrenamiento_CodeRunnerFEIP_4.Pregunta06;

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

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void aplicarBeca(double porcentajeBonificacion) {
        this.costo = this.costo - (this.costo * porcentajeBonificacion / 100); // La parte clave es está.
    }

    // El método aplicarBeca no retorna nada porque modifica directamente el atributo costo. Esto es POO clásica: el objeto se actualiza a sí mismo, sin hacer drama ni System.out.println.

    @Override
    public String toString() {
        return "El curso " + codigoCurso + " corresponde a " + nombreCurso + " y su costo es " + costo + ".";
    }
}