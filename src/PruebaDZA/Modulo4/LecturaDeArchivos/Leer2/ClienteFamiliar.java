package PruebaDZA.Modulo4.LecturaDeArchivos.Leer2;

public class ClienteFamiliar implements ConsumoAgua {
    String nombre;
    String direccion;
    String cedula;
    int metros;

    public ClienteFamiliar(String nombre, String direccion, String cedula, int metros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClienteFamiliar{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", cedula='").append(cedula).append('\'');
        sb.append(", metros=").append(metros);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularConsumoAgua(int consumo) {
        int metros = this.metros;
        double valor = 0;
        if (metros <= 10) {
            valor = CARGOFIJOFAM + consumo * 1.5;
        } else {
            valor = CARGOFIJOFAM + consumo * 2;
        }
        return CARGOFIJOFAM + consumo * 1.5;
    }

}
