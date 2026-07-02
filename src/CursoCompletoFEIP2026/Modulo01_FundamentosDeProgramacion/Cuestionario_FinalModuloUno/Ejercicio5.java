package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_FinalModuloUno;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 300;
        int b = 600;
        int suma = a+b; // 900
        suma--;
        suma--; // 898
        short miShort = (short)suma; // Casting de int a short
        miShort = (short)(miShort + 350); // Se castea automatico con el += (miShort += 350)
        System.out.println(miShort); // 1248
    }
}
