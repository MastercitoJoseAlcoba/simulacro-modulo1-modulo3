package PruebaDZA.Modulo2.Herencia;
// Clase hija de Persona
public class Estudiante extends Persona{
    private int codigo;
    private String email;

    public Estudiante(String nombre, String telefono, String cedula, int codigo, String email) {
        super(nombre, telefono, cedula);
        this.codigo = codigo;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return super.toString() + "Código: " + codigo + " Email: " + email;
    }
}
