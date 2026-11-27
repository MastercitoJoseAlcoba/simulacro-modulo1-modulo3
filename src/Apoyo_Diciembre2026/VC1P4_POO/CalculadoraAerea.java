package Apoyo_Diciembre2026.VC1P4_POO;

public class CalculadoraAerea {
    public static void main(String[] args) {

        CalculadoraArea c1 = new CalculadoraArea();
        System.out.println(c1.calcularArea(5.0));

        CalculadoraArea c2 = new CalculadoraArea();
        System.out.println(c1.calcularArea(4.0, 6.0));

        CalculadoraArea c3 = new CalculadoraArea();
        System.out.println(c1.calcularArea(3.0, true));
    }

    public static class CalculadoraArea{

        public static double calcularArea(double lado){
            return (lado * lado);
        }

        public static double calcularArea(double base, double altura){
            return (base * altura);
        }

        public static double calcularArea(double radio, boolean esCirculo){
            if (esCirculo) {
                return 3.14159 * radio * radio;
            }

            return 0.0;
        }
    }
}
