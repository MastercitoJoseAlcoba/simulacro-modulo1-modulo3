package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Pregunta 3:
         * En este ejercicio, trabajarás con métodos y números decímales en Java.
         * En muchos casos, los cálculos requieren trabajar con valores que no son enteros. Para ellos, se utilizan
         * tipos de datos como double.
         *
         * Ejemplo:
         * public double areaTriangulo (double base, double altura) {
         *  return (base * altura) / 2;
         * }
         *
         * Consigna:
         * Implementa un método llamado areaTriangulo que reciba dos valores tipo double correspondientes a la base
         * y a la altura de un triángulo, y retorne su área.
         * Recuerde que la fórmula del área de un triangulo es: (base * altuta) / 2.
         *
         * Plantilla base:
         * public tipoDatoDecimal areaTriangulo (tipoDatoDecimal base, tipoDatoDecimal altura) {
         * Calcula el área del triángulo usando la fórmula:
         * }
         *
         */

        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println(ejercicio3.areaTriangulo(5.0, 2.0));
    }
    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
