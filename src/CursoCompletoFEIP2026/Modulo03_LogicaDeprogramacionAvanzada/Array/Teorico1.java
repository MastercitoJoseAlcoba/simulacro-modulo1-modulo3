package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.Array;

public class Teorico1 {
    public static void main(String[] args) {
        /** Ejemplo de un array */

        int[] notas = new int[5]; /** Rango es: n - 1; */

        // Asignación de valores al vector
        notas[0] = 10; // Índice 0, valor 10
        notas[1] = 20;
        notas[2] = 30;
        notas[3] = 40;
        notas[4] = 50;
        System.out.println(notas[2]); // Imprime: 30

        // Variable para almacenar la suma de los valores del vector
        int suma1 = 0;


        for (int i = 0; i < notas.length; i++) { /** (n - 1) */
            suma1 += notas[i]; // Sumar los valores del vector
            System.out.println(suma1);
            System.out.println();

            if (notas[i] % 2 == 0) { // Mostrar solo los pares
                System.out.println(notas[i]);
            }
        }
        /** Ejemplo de uso de un array de objetos: 10 */

        // Crear un array de objetos de tipo Persona
        Persona1 persona1 = new Persona1("Juan", 45 );
        Persona1 persona2 = new Persona1("Maria", 22 );
        Persona1 persona3 = new Persona1("Pedro", 28 );

        // Asignar el array a una variable
        Persona1 [] personas = {persona1, persona2, persona3};

        // Contenedor para almacenar la suma de edades de las personas
        double suma2 = 0;

        // Ciclo para sumar las edades de las personas
        for (int i = 0; i < personas.length; i++) { // Cantidad de elementos del array
            suma2 += personas[i].getEdad(); // Sumar las edades de las personas
        }
        double promedio = suma2 / personas.length;
        System.out.println(promedio);

        // Matrices bidimensionales

        boolean[][][] cine = new boolean[3][2][4];

        for (int i = 0; i < cine.length; i++) { // Cantidad de filas
            for (int j = 0; j < cine[i].length; j++) { // Cantidad de filas
                for (int k = 0; k < cine[i][j].length; k++) { // Cantidad de columnas
                    System.out.print(cine[i][j][k] + " "); // Imprimir el valor de la matriz
                }
                System.out.println();
            }
        }

    }

}








