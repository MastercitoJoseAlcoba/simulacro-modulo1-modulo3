package Bloque2_String_y_fechas.Pregunta8_Histograma_con_numerales;

public class Eje8 {
    public void numeros(int[] arr) {

        // Recorremos el arreglo completo.
        //
        // i representa la posición actual.
        // arr[i] representa el número guardado en esa posición.
        for (int i = 0; i < arr.length; i++) {

            // Si el número actual es positivo,
            // tenemos que imprimir:
            //
            // número + espacio + numerales separados por guiones
            //
            // Ejemplo:
            // 3 #-#-#
            if (arr[i] > 0) {

                // Imprime el número original y un espacio.
                //
                // Usamos print y no println porque todavía
                // tenemos que seguir imprimiendo los # en la misma línea.
                System.out.print(arr[i] + " ");

                // Este segundo for imprime tantos # como indique arr[i].
                //
                // Si arr[i] vale 3:
                // j = 0 -> imprime #
                // j = 1 -> imprime #
                // j = 2 -> imprime #
                //
                // Total: 3 numerales.
                for (int j = 0; j < arr[i]; j++) {

                    // Imprime un numeral.
                    System.out.print("#");

                    // Ahora decidimos si imprimimos un guion.
                    //
                    // El guion se imprime entre numerales,
                    // pero NO después del último.
                    //
                    // Si arr[i] vale 3:
                    //
                    // j = 0 -> imprime # y después -
                    // j = 1 -> imprime # y después -
                    // j = 2 -> imprime # y NO imprime -
                    //
                    // Resultado:
                    // #-#-#
                    if (j < arr[i] - 1) {
                        System.out.print("-");
                    }
                }

            } else {

                // Si el número es 0 o negativo,
                // se imprime solamente el número.
                //
                // No se imprimen numerales.
                System.out.print(arr[i]);
            }

            // Al terminar cada número, bajamos de línea.
            //
            // Esto hace que cada elemento del arreglo
            // tenga su propia línea en el histograma.
            System.out.println();
        }
    }

/*
EJEMPLO 1:

int[] arr = {1, 2, 3, 4};

Salida:

1 #
2 #-#
3 #-#-#
4 #-#-#-#

RECORRIDO:

arr[0] = 1
Imprime:
1 #

arr[1] = 2
Imprime:
2 #-#

arr[2] = 3
Imprime:
3 #-#-#

arr[3] = 4
Imprime:
4 #-#-#-#

EJEMPLO 2:

int[] arr = {-1, 3, -2, 5};

Salida:

-1
3 #-#-#
-2
5 #-#-#-#

IDEA CLAVE:
Hay dos bucles.

Primer for:
recorre los números del arreglo.

Segundo for:
imprime los numerales de cada número positivo.

DETALLE IMPORTANTE:
System.out.print() imprime en la misma línea.
System.out.println() imprime y baja de línea.

Sin ese println final, quedaría todo pegado.
Una tragedia estética, casi como código sin sangría.
*/
}
