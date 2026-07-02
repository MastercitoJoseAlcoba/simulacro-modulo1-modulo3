package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.HashMap;

public class Persona {

    private String nombre;
    private int ciudadResidencia;
    private String ci;

    public Persona(String nombre, int ciudadResidencia, String ci) {
        this.nombre = nombre;
        this.ciudadResidencia = ciudadResidencia;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(int ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}
