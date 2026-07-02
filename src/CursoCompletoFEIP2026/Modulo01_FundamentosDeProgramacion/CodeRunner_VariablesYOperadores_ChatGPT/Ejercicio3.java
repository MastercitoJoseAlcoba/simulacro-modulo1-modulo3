package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores_ChatGPT;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Ejercicio 3: clasificar temperatura
         * Firma del método: public String clasificarTemperatura(double temperatura) {}
         *
         * Instrucciones:
         * 1. "Frío" si la temperatura es menor a 10.
         * 2. "Templado" si la temperatura es mayor o igual a 10 y menor a 20.
         * 3. "Caluroso" si la temperatura es mayor o igual a 25.
         *
         */

        System.out.println(new Ejercicio3().clasificarTemperatura(15));
        System.out.println("-".repeat(20));

    }
    public String clasificarTemperatura(double temperatura) {
        if (temperatura < 10) {
            System.out.println("Frío");
        } else if (temperatura >= 10 && temperatura < 20) {
            System.out.println("Templado");
        } else {
            System.out.println("Caluroso");
        }
        System.out.println("-".repeat(20));
        return "Temperatura: " + temperatura;
    }
}
