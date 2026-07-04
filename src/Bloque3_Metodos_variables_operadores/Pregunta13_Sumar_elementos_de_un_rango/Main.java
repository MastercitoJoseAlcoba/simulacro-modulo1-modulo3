package Bloque3_Metodos_variables_operadores.Pregunta13_Sumar_elementos_de_un_rango;

public class Main {
    public static void main(String[] args) {
        // Creamos un arreglo de enteros.
        int[] arreglo = {2, 3, 5, 4, 4, 12, 22};

        // Llamamos al método sumArr(arreglo).
        //
        // Ese método suma todos los elementos del arreglo.
        //
        // Después al resultado le sumamos 12.
        int sumar = sumArr(arreglo) + 12;

        // Imprimimos el resultado final.
        System.out.println(sumar);
    }

    public static int sumArr(int[] arr) {

        // Variable acumuladora.
        // Empieza en 0 porque todavía no sumamos nada.
        int suma = 0;

        // For-each.
        //
        // Recorre todos los números del arreglo.
        //
        // En cada vuelta, n toma el valor de un elemento.
        for (int n : arr) {

            // Sumamos el número actual a la variable suma.
            suma += n;
        }

        // Devolvemos la suma total del arreglo.
        return suma;
    }
}

/*
ARREGLO:

{2, 3, 5, 4, 4, 12, 22}

SUMA:

2 + 3 = 5
5 + 5 = 10
10 + 4 = 14
14 + 4 = 18
18 + 12 = 30
30 + 22 = 52

Entonces:

sumArr(arreglo) devuelve 52.

Pero en main dice:

int sumar = sumArr(arreglo) + 12;

Entonces:

sumar = 52 + 12;
sumar = 64;

SALIDA:
64

RESPUESTA:
c. 64

IDEA CLAVE:
El método devuelve 52, pero el programa imprime 64 porque después suma 12.

Siempre mirar qué hacen con el resultado del método.
Ahí suelen esconder la trampita.
*/
