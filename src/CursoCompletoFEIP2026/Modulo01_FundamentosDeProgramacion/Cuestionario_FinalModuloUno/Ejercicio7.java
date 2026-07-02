package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio7 {
    public static void main(String[] args) {
        for(int h=1; h<100; h=h+2){ // // h toma estos valores: 1, 3, 5, 7, 9, 11, 1
            if(h % 5 == 1) // Muéstrame los que al dividir por 5 dejan resto 1
                System.out.println(h+" -");
            // 1 -11 -21 -31 -41 -51 -61 -71 -81 -91 -
        }
    }
}
