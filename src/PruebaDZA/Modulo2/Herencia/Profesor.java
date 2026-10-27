package PruebaDZA.Modulo2.Herencia;

// Clase hija de Persona
public class Profesor extends Persona {

    private double salario;

    // Constructor
    public Profesor(String nombre, String telefono, String cedula, double salario) {
        super(nombre, telefono, cedula);
        this.salario = salario;
    }

    // Getter
    public double getSalario() {
        return salario;
    }

    // Setter
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Profesor{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}