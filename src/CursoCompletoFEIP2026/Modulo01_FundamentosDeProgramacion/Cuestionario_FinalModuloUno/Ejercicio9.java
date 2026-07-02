package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio9 {
    public static void main(String[] args) {
        String mensaje = "prueba final";
        int largo = mensaje.length() -1;
        for(int k=largo; k>0; k--){
            if (mensaje.charAt(k)=='a'){
                continue; // No tiene en cuenta la letra a.
            }
            System.out.println(mensaje.charAt(k));
            // Imprime: lnif beurp
        }
    }
}
