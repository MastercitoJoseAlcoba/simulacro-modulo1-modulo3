package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 32;
        boolean d = false;
        boolean e = (a==b);

        // Primer if:
        if ((b % a != 0) && !e) { // false && true = false (No entra) (32 % 8 = 0) Es un módulo ósea se busca el resto de hacer 32 % 8
            if (a<10) {
                a++;
                d = (a<10);
            } else {
                a--;
                d = (a<10);
            }
            // Segundo else if:
        } else if ((b / a != 0) && e) {
            if (a==8) {
                a++;
                d = (a<10);
            }
            // Va el else:
        } else {
            if ((b>a) || e) {
                d = true;
                a = b/a;
            } else {
                a = 0;
                d = false;
            }
        }
        System.out.println("a = " + a + " d = " + d);
    }
}
