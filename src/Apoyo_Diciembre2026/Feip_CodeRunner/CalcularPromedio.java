package Apoyo_Diciembre2026.Feip_CodeRunner;

public class CalcularPromedio {
    public static double calcularPromedio(int[] numeros) {
        double suma = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma / numeros.length;
    }
}
