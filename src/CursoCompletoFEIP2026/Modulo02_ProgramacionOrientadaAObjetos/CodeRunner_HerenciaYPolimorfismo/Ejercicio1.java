package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_HerenciaYPolimorfismo;

public class Ejercicio1 {
    // Clase base
    public static class FiguraGeometrica {
        // Atributos
        public String nombre;

        // Constructor
        public FiguraGeometrica(String nombre){
            this.nombre = nombre;
        }

        // Métodos
        public String getNombre(){
            return nombre;
        }

        // Método para calcular el área
        public void calcularArea(){
            // Se sobreescribe en las clases derivadas
        }
    }

    // Clase derivada
    public static class Circulo extends FiguraGeometrica {
        // Atributos adicionales
        public double radio;

        public Circulo(String nombre, double radio) {
            super(nombre);
            this.radio = radio;
        }

        // Método adicional
        public double getRadio() {
            return radio;
        }

        // Sobreescritura del método para calcular

        @Override
        public void calcularArea(){
            System.out.println("Área del círculo: (" + getNombre() + ") = " + Math.PI * Math.pow(getRadio(), 2));
        }
    }
    // Clase derivada
    static class Rectangulo extends FiguraGeometrica {
        // Atributos adicionales
        public double base;
        public double altura;

        // Constructor
        public Rectangulo(String nombre, double base, double altura) {
            super(nombre);
            this.base = base;
            this.altura = altura;
        }

        // Métodos adicionales
        public double getBase() {
            return base;
        }

        public double getAltura() {
            return altura;
        }

        // Sobreescritura del método para calcular el área específico de un rectángulo
        @Override
        public void calcularArea() {
            System.out.println("Área del rectángulo (" + getNombre() + "): " + (base * altura));
        }
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo Azul", 4.0, 6.0);
        // Calcular el área de cada figura
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}
