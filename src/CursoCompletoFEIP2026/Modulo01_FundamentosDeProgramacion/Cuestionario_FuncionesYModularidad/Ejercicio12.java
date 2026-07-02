package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println(descuento(100, 0));

    }
    public static float descuento(float salario, int hijos) {
        float retorno;
        if (hijos > 0){
            retorno = (float) (salario * 0.8); // Si hijos es mayor a 0, retorno = 100 * 0.8 = 80
        } else {
            retorno = (float) (salario * 0.85); // Si hijos es igual a 0, retorno = 100 * 0.85 = 85
        }
        return retorno;
        // Se imprime por consola: 85.0

    }
}
