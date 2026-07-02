package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_HerenciaYPolimorfismo;

public class Ejercicio2 {
    // Clase base
    public class Empleado {
        // Método
        public void calcularSalario(){
            System.out.println("Calculando salario de empleado");
        }
    }
    // Clase derivada
    public class Programador extends Empleado { //
        public void calcularSalario(){
            System.out.println("Calculando salario de programador");
        }
    }
    // Clase derivada
    public class Vendedor extends Empleado {
        public void calcularSalario(){
            System.out.println("Calculando salario de vendedor");
        }
    }

}


