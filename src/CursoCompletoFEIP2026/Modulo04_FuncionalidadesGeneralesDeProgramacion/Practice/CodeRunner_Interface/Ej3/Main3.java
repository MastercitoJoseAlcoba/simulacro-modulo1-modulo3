package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.CodeRunner_Interface.Ej3;

public class Main3 {
    public static void main(String[] args) {
        OperacionMatematica suma = new Suma();
        OperacionMatematica multiplicacion = new Multiplicacion();

        System.out.println(suma.ejecutar(5, 3));
        System.out.println(multiplicacion.ejecutar(5, 3));
    }
}

interface OperacionMatematica {
    double ejecutar(double a, double b);
}

class Suma implements OperacionMatematica {
    @Override
    public double ejecutar(double a, double b) {
        return a + b;
    }
}

class Multiplicacion implements OperacionMatematica {
    @Override
    public double ejecutar(double a, double b) {
        return a * b;
    }
}