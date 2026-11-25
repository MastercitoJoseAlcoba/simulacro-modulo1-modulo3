package Apoyo_Diciembre2026.Feip_CodeRunner;

class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, String apellido, double salario, String departamento) {
        super(nombre, apellido, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + salarioBase * 0.10;
    }
}

class Desarrollador extends Empleado {
    public Desarrollador(String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + salarioBase * 0.20;
    }
}
