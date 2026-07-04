package Bloque8_Interfaces_y_herencia.Pregunta40_Patrones_basicos_de_programacion;
/*
PREGUNTA 40 — PATRONES BÁSICOS DE PROGRAMACIÓN

Tema:
- Reconocimiento de patrones
- Bucles
- Colecciones
- Acumuladores
- Matrices
- Condiciones
- Interfaces
- Excepciones
- Objetos
- Switch
- Polimorfismo

Pregunta:
¿Cuál grupo representa mejor los temas principales del parcial?

a. HTML, CSS, redes y bases de datos.
b. Iteración, estructuras de datos, métodos, POO y control de flujo.
c. Sistemas operativos, memoria RAM y hardware.
d. Diseño gráfico, edición de video y animaciones.

Respuesta correcta:
b. Iteración, estructuras de datos, métodos, POO y control de flujo.
*/

public class PatronesDelParcial {
    /*
    Este ejercicio no pide programar una lógica concreta.
    Pide reconocer patrones.

    Un patrón es una idea que se repite en muchos ejercicios.

    En este parcial, casi todo se puede resumir así:

    iterar + decidir + acumular + usar estructura adecuada
    */

    /*
    1) BUCLE

    Uso:
    Recorrer arreglos, listas o matrices.

    Ejemplo con arreglo:
    */

    public void recorrerArreglo(int[] arr) {

        // Recorremos desde la posición 0 hasta la última.
        for (int i = 0; i < arr.length; i++) {

            // arr[i] representa el elemento actual.
            System.out.println(arr[i]);
        }
    }

    /*
    Idea clave:
    Si tengo muchos datos, casi seguro necesito un bucle.
    */

    /*
    2) COLECCIÓN

    Uso:
    Guardar varios elementos en una estructura.

    Ejemplos:
    - ArrayList
    - LinkedList
    - HashSet
    - HashMap

    Una colección ofrece métodos útiles:
    add, remove, get, set, contains.
    */

    /*
    3) ACUMULADOR

    Uso:
    Sumar, contar o calcular resultados progresivos.
    */

    public int sumarArreglo(int[] arr) {

        // Acumulador inicializado en 0.
        int suma = 0;

        // Recorremos cada número del arreglo.
        for (int n : arr) {

            // Sumamos el número actual al acumulador.
            suma += n;
        }

        // Devolvemos la suma total.
        return suma;
    }

    /*
    También puede usarse para contar.
    */

    public int contarPares(int[] arr) {

        // Contador inicializado en 0.
        int contador = 0;

        // Recorremos el arreglo.
        for (int numero : arr) {

            // Si el número es par...
            if (numero % 2 == 0) {

                // Aumentamos el contador.
                contador++;
            }
        }

        return contador;
    }

    /*
    Idea clave:
    El acumulador guarda un resultado parcial.
    Va creciendo o cambiando paso a paso.
    */

    /*
    4) MATRIZ BIDIMENSIONAL

    Uso:
    Recorrer filas y columnas.

    Matriz = bucle dentro de bucle.
    */

    public void recorrerMatriz(int[][] matriz) {

        // i representa las filas.
        for (int i = 0; i < matriz.length; i++) {

            // j representa las columnas de cada fila.
            for (int j = 0; j < matriz[i].length; j++) {

                // matriz[i][j] es el elemento actual.
                System.out.println(matriz[i][j]);
            }
        }
    }

    /*
    5) CONDICIÓN

    Uso:
    Decidir qué acción realizar.
    */

    public void mostrarParidad(int numero) {

        // Si el resto de dividir entre 2 es 0,
        // el número es par.
        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }

    /*
    Idea clave:
    if/else sirve para tomar caminos distintos.
    */

    /*
    6) INTERFAZ

    Uso:
    Definir un contrato de métodos.

    Una interfaz dice qué métodos debe tener una clase.
    La clase decide cómo implementarlos.
    */

    interface Vehiculo {
        void acelerar();
        void frenar();
    }

    class Auto implements Vehiculo {

        // Como Auto implementa Vehiculo,
        // está obligado a implementar acelerar().
        public void acelerar() {
            System.out.println("El auto acelera");
        }

        // También está obligado a implementar frenar().
        public void frenar() {
            System.out.println("El auto frena");
        }
    }

    /*
    7) EXCEPCIÓN

    Uso:
    Controlar errores de ejecución.
    */

    public void ejemploExcepcion() {

        try {

            int[] nums = new int[3];

            // Esta posición no existe.
            System.out.println(nums[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Capturamos el error para que el programa no se rompa.
            System.out.println("índice fuera de rango");
        }
    }

    /*
    Idea clave:
    try intenta ejecutar.
    catch captura el error si ocurre.
    */

    /*
    8) OBJETO

    Uso:
    Representar entidades con atributos y métodos.
    */

    class Libro {

        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }

    /*
    Idea clave:
    Un objeto junta datos y comportamientos.
    */

    /*
    9) SWITCH

    Uso:
    Selección múltiple.
    */

    public void mostrarOpcion(int opcion) {

        switch (opcion) {

            case 1:
                System.out.println("uno");
                break;

            case 2:
                System.out.println("dos");
                break;

            default:
                System.out.println("otro");
        }
    }

    /*
    Idea clave:
    switch sirve cuando hay varios casos posibles.
    */

    /*
    10) POLIMORFISMO

    Uso:
    Ejecutar métodos sobrescritos según el objeto real.
    */

    class Animal {
        public void hacerSonido() {
            System.out.println("Sonido genérico");
        }
    }

    class Perro extends Animal {

        @Override
        public void hacerSonido() {
            System.out.println("Guau");
        }
    }

    public void ejemploPolimorfismo() {

        // La variable es de tipo Animal.
        Animal a = new Perro();

        // Pero el objeto real es Perro.
        //
        // Entonces se ejecuta hacerSonido() de Perro.
        a.hacerSonido();
    }

    /*
    RESPUESTA DEL EJERCICIO:

    La opción correcta es:

    b. Iteración, estructuras de datos, métodos, POO y control de flujo.

    POR QUÉ:

    El parcial trabaja principalmente con:

    - bucles
    - arreglos
    - matrices
    - listas
    - HashSet
    - métodos
    - clases
    - objetos
    - herencia
    - interfaces
    - polimorfismo
    - excepciones
    - switch
    - if/else

    Es decir:
    fundamentos de programación en Java.

    RESUMEN FINAL:

    Si ves arreglo/lista/matriz:
    pensá en recorrido.

    Si ves suma/conteo/factorial:
    pensá en acumulador.

    Si ves elegir entre casos:
    pensá en if o switch.

    Si ves clases hijas:
    pensá en herencia y polimorfismo.

    Si ves error posible:
    pensá en try/catch.

    Si ves contrato:
    pensá en interfaz.

    Esto no es memorizar por fuerza bruta.
    Es reconocer patrones.

    Cuando ves el patrón,
    el ejercicio baja dos cambios.
    */
}

