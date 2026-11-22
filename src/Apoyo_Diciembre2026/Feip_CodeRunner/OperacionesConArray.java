public class OperacionesConArray {
    public double multiplicacionArray(double[] numeros) {
        double producto = 1.0;
        for (double numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

    public double maximoArray(double[] numeros) {
        double maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    public double promedioArray(double[] numeros) {
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
}
