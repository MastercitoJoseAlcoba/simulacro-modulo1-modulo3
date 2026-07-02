package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl_ChatGPT;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Ejercicio 5: perímetro de un rectángulo
         *
         * Enunciado:
         * En este ejercicio, trabajarás con métodos y números decimales en Java.
         * El perímetro de un rectángulo se calcula sumando todos sus lados:
         *
         * 2 * (base + altura)
         *
         * Consigna:
         * Implemente un método llamado perimetroRectangulo que reciba dos valores de tipo double: base y altura, y
         * retorne el perímetro del rectángulo.
         *
         * Instrucciones:
         * 1. Defina correctamente el tipo de retorno.
         * 2. Utilice parámetros de tipo double.
         * 3. Aplique la fórmula correctamente.
         * 4. El método debe retornar el resultado, no imprimirlo.
         *
         */

        System.out.println(perimetroRectangulo(5.0, 2.0));
        System.out.println(areaRectangulo(5.0, 2.0));

    }
    public static double perimetroRectangulo(double base, double altura){
        return 2 * (base + altura);
    }
    public static double areaRectangulo(double base, double altura){
        return base * altura;
    }
}
