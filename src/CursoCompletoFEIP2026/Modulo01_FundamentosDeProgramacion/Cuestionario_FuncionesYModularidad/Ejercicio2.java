package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio2 {
    public static void main(String[] args) {
        float salario = 1000.0f;
        int hijos = 0;
        System.out.println(descuento(100, 0));
        System.out.println(descuento(salario, hijos));

    }
    public static float descuento(float salario, int hijos) { // Es una función porque devuelve un valor.
        float retorno;
        if (hijos > 0) {
            retorno = (float) (salario * 0.8);
        } else {
            retorno = (float) (salario * 0.85);
        }
        return retorno;
        // La función tine un parámetro de tipo float y retorna un float
    }
}
