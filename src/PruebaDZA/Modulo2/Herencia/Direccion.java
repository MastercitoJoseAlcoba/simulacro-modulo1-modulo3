package PruebaDZA.Modulo2.Herencia;

public class Direccion {

    // Atributos
    private String calle;
    private String numero;
    private String localidad;
    private String departamento;
    private int codigoPostal;

    // Constructor
    public Direccion(String calle, String numero, String localidad,
                     String departamento, int codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
    }

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Dirección{" +
                "calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", localidad='" + localidad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", códigoPostal=" + codigoPostal +
                '}';
    }
}