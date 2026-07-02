package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Iteraciones;

public class Ejercicio7 {
    public static void main(String[] args) {
      int var1 = 0;
      int var2 = 1;
      int aux = 0;
      boolean esta = true;

      while (var2 > var1 ++ && esta) {
          esta = var1 == 1? false : true;
          var2++;
          var1++;
          aux = var1;
          var1 = var2;
          var2 = aux;
          System.out.println(var1);

          // Imprime: 2
      }
    }
}
