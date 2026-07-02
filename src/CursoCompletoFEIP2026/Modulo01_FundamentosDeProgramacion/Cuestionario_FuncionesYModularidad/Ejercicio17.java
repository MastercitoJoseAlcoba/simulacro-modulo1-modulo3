package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FuncionesYModularidad;

public class Ejercicio17 {
    public static void main(String[] args) {
        String palabra = "mesa";
        String resultado = hacerVuelta(palabra);
        System.out.println(resultado);

    }
    private static String hacerVuelta(String palabra) {
        String result = "";
        for (int p=palabra.length()-1; p>=0; p--){
            result = result + palabra.charAt(p);
            System.out.println(result);
        }
        return result;
        // Imprime: "asem";

    }
}
