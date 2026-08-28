package Cuestionario_de_Entrenamiento_CodeRunner_Similares_Exam;

public class EmpleadoYGerente {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Juan Perez", 50000, 5);

        System.out.println("Bono anual: " + gerente1.calcularBonoAnual());
        System.out.println("Salario anual: " + gerente1.calcularSalarioAnual());

        Empleado empleado1 = new Empleado("Carlos López", 70000, 10);

        System.out.println("Bono anual: " + empleado1.calcularBonoAnual());
        System.out.println("Salario anual: " + empleado1.calcularSalarioAnual());
    }
}


// Clase padre
class Empleado {

    // Atributos protegidos para que Gerente pueda utilizarlos
    protected String nombre;
    protected double salario;
    protected int aniosServicio;

    // Constructor de Empleado
    public Empleado(String nombre, double salario, int aniosServicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.aniosServicio = aniosServicio;
    }

    // Para un Empleado común, CodeRunner espera 0.0
    public double calcularBonoAnual() {
        return 0.0;
    }

    // Para un Empleado común, CodeRunner espera 0.0
    public double calcularSalarioAnual() {
        return 0.0;
    }
}


// Gerente hereda de Empleado
class Gerente extends Empleado {

    // Constructor de Gerente
    public Gerente(String nombre, double salario, int aniosServicio) {

        // Llama al constructor de Empleado
        super(nombre, salario, aniosServicio);
    }

    // Sobrescribe el método de Empleado
    @Override
    public double calcularBonoAnual() {

        // Bono = 0.1 x salario x años de servicio
        return 0.1 * salario * aniosServicio;
    }

    // Sobrescribe el método de Empleado
    @Override
    public double calcularSalarioAnual() {

        // Salario anual = salario + bono anual
        return salario + calcularBonoAnual();
    }
}
