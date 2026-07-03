package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Cuestionario_Arrays.Pregunta16;

import java.util.Arrays;

public class Eje16 {
    public static void main(String[] args) {
        char[] letras = new char[6];

        letras[0] = 65;   // 65 en ASCII/Unicode es 'A'
        letras[1] = 66;   // 66 es 'B'
        letras[2] = 'C';
        letras[3] = 'D';
        letras[4] = 70;   // 70 es 'F'

        System.out.println(Arrays.toString(letras));

        /*
         * El último elemento queda “vacío” porque letras[5] nunca fue cargado.
         * Como es un array de char, su valor por defecto es:
         *
         * '\u0000'
         *
         */
    }
}
