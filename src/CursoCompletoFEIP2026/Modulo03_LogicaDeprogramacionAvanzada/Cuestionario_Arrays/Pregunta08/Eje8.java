package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta08;

import java.util.Arrays;

public class Eje8 {
    public static void main(String[] args) {

        int numeros[] = {1, 3, 4, 5, 1, 2, 3, 5, 1, 4, 2, 4, 1, 6, 2, 3, 1, 2, 5, 5, 1, 4, 1, 2, 1};

        int nuevo[] = new int[numeros.length];

        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {

            boolean existe = false;

            for (int j = 0; j <= indice; j++) {
                if (numeros[i] == nuevo[j]) {
                    existe = true;
                }
            }

            if (existe == false) {
                indice++;
                nuevo[indice] = numeros[i];
            }
        }

        int retorno[] = new int[indice + 1];        // Con este fragmento, lo que hace el código es crear un array nuevo llamado
                                                    // retorno y copiarle los valores desde nuevo [0] hasta nuevo [indice].
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = nuevo[i];
        }

        System.out.println(Arrays.toString(retorno));
    }
}