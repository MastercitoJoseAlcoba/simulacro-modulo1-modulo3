package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_HerenciaYPolimorfismo.Ejercicio3;

// Clase base
class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularSalario() {
        return salario;
    }
}

// Clase derivada: Gerente
class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}

// Clase derivada: Vendedor
class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salario, double comision) {
        super(nombre, salario);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comision;
    }
}

// Clase principal
public class HerenciaConPolimorfismo{
    public static void main(String[] args) {
        // Crear objetos de las clases derivadas
        Empleado empleado1 = new Gerente("Juan", 5000, 1000);
        Empleado empleado2 = new Vendedor("Maria", 3000, 500);

        // Aunque las variables son de tipo Empleado, los objetos reales son Gerente y Vendedor.
        // Por eso en polimorfismo: el mismo método calcularSalario() se comporta distinto según el objeto real.


        // Llamar al método calcularSalario() en los objetos
        System.out.println(empleado1.getNombre() + " tiene un salario de: $" + empleado1.calcularSalario());
        System.out.println(empleado2.getNombre() + " tiene un salario de: $" + empleado2.calcularSalario());
    }
}

/**
 * Si queremos ejecutar este código podemos afirmar lo siguiente:
 * a. El método getNombre() es el que se aplica al polimorfismo
 * b. El método super() es en el que vemos el polimorfismo.
 * c. El código no funciona correctamente.
 * d. El método calcularSalario() es en el que se aplica el polimorfismo. ✅
 *
 *
 *
 *
 *
 *
 *
 */