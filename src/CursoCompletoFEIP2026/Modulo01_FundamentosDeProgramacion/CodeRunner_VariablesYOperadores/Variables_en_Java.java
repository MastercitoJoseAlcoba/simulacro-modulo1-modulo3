package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores;

public class Variables_en_Java {
    public static void main(String[] args) {
        // Ejemplo de byte
        byte numeroByte = 100;
        System.out.println("Valor byte: " + numeroByte);

        // Ejemplo de short
        short numeroShort = 32767;
        System.out.println("Valor short: " + numeroShort);

        // Otra forma de escribirlos para separar miles
        int numeroInt = 1_000_000;
        System.out.println("Valor int: " + numeroInt);

        // Ejemplo de long
        long numeroLong = 1_000_000_000_000L; // La 'L' al final indica que es un número long
        System.out.println("Valor long: " + numeroLong);

    }
}
