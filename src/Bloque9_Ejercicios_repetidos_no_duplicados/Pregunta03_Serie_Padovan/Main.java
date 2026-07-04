package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta03_Serie_Padovan;

public class Main {
    public int[] padovan(int n) {

        // Si n es 0 o negativo,
        // no hay términos para generar.
        if (n <= 0) {
            return new int[0];
        }

        // Creamos un arreglo de tamaño n.
        int[] serie = new int[n];

        // Recorremos todas las posiciones.
        for (int i = 0; i < n; i++) {

            // Los tres primeros valores de Padovan son 1.
            if (i <= 2) {

                serie[i] = 1;

            } else {

                // Fórmula de Padovan:
                //
                // P(n) = P(n - 2) + P(n - 3)
                //
                // Como trabajamos con índices:
                // serie[i] = serie[i - 2] + serie[i - 3]
                serie[i] = serie[i - 2] + serie[i - 3];
            }
        }

        // Devolvemos el arreglo completo.
        return serie;
    }

/*
EJEMPLO:

padovan(10)

Resultado:
[1, 1, 1, 2, 2, 3, 4, 5, 7, 9]

IDEA CLAVE:

Primeros tres valores:
1, 1, 1

Después:
posición actual = posición i - 2 + posición i - 3
*/
}
