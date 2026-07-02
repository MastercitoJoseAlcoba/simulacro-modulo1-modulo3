package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.CodeRunner_ClasesAbstractas;

public class Pregunta2 {
    public static void main(String[] args) {

    }
    abstract class FiguraGeometrica {
        public abstract void dibujar();

        public abstract void calcularArea();
    }

    class Circulo extends FiguraGeometrica {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public void dibujar() {
            System.out.println("Dibujando un círculo.");
        }

        @Override
        public void calcularArea() {
            double area = Math.PI * radio * radio;
            System.out.println("Área del círculo: " + area);
        }
    }

    class Rectangulo extends FiguraGeometrica {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public void dibujar() {
            System.out.println("Dibujando un rectángulo.");
        }

        @Override
        public void calcularArea() {
            double area = base * altura;
            System.out.println("Área del rectángulo: " + area);
        }
    }
}
