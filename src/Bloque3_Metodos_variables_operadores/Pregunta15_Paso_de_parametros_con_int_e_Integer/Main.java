package Bloque3_Metodos_variables_operadores.Pregunta15_Paso_de_parametros_con_int_e_Integer;

public class Main {
    public static void main(String[] args) {
        // x es un tipo primitivo int.
        // Guarda el valor 5.
        int x = 5;

        // y es un objeto Integer.
        // Guarda el valor 2.
        Integer y = Integer.valueOf(2);

        // Llamamos al método multiplicar.
        //
        // Se pasan x e y al método.
        //
        // IMPORTANTE:
        // En Java, los parámetros se pasan por valor.
        //
        // Eso significa que el método recibe copias de las referencias/valores.
        multiplicar(x, y);

        // Después de llamar al método:
        //
        // x sigue valiendo 5.
        // y sigue valiendo 2.
        //
        // Entonces:
        // x + y = 5 + 2 = 7.
        System.out.println(x + y);
    }

    public static void multiplicar(int i, Integer j) {

        // i recibe una copia del valor de x.
        //
        // x vale 5.
        // i vale 5.
        //
        // Esta línea modifica i, no x.
        i *= 10;

        // j recibe una copia de la referencia de y.
        //
        // Integer es inmutable.
        //
        // Cuando hacemos j *= 10,
        // Java desempaqueta el Integer, multiplica,
        // y crea/asigna otro valor a j.
        //
        // Pero eso no cambia la variable y del main.
        j *= 10;
    }
}

/*
CÁLCULO:

En main:

x = 5
y = 2

Se llama:

multiplicar(x, y);

Dentro del método:

i = 5
j = 2

Luego:

i *= 10;  // i pasa a 50
j *= 10;  // j pasa a 20

Pero esos cambios quedan dentro del método.

Cuando volvemos al main:

x sigue siendo 5.
y sigue siendo 2.

Entonces:

System.out.println(x + y);

Imprime:

5 + 2 = 7

SALIDA:
7

RESPUESTA:
d. Muestra por consola el valor 7.

IDEA CLAVE:
Java pasa parámetros por valor.

Con int:
se copia el número.

Con Integer:
se copia la referencia, pero Integer es inmutable.

Resultado:
el método no cambia x ni y del main.
*/
