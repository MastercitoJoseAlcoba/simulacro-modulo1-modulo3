# Soluciones Java — cada pregunta con letra y código dentro del mismo bloque

Formato: cada bloque trae `PREGUNTA`, `LETRA` y `CÓDIGO / RESPUESTA` dentro del mismo bloque de código.

## Pregunta 1 — Paso de parámetros

```java
/*
PREGUNTA 1 — Paso de parámetros

LETRA:
Dado un código donde a vale 10, b recibe incrementar(a), el método retorna ++decremento y se imprime a + "," + b. Indicar la salida por consola.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. 10,11

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = incrementar(a);

        System.out.println(a + "," + b);
    }

    public static int incrementar(int decremento) {
        return ++decremento;
    }
}
```

## Pregunta 2 — Nombre más largo en un arreglo

```java
/*
PREGUNTA 2 — Nombre más largo en un arreglo

LETRA:
Completar la función masLargo(String[] nombres), que recibe un arreglo de nombres y devuelve el nombre con mayor cantidad de letras. No incluir main.

CÓDIGO / RESPUESTA:
*/

private static String masLargo(String[] nombres) {
    String mayor = "";

    for (int i = 0; i < nombres.length; i++) {
        if (nombres[i].length() > mayor.length()) {
            mayor = nombres[i];
        }
    }

    return mayor;
}
```

## Pregunta 3 — Condicional con error

```java
/*
PREGUNTA 3 — Condicional con error

LETRA:
Dado un código con int valor = 10 y una condición if (valor = 2), indicar qué ocurre al ejecutarlo.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. El programa tiene un error de compilación. En Java, en un if se necesita una condición booleana; valor = 2 es una asignación int.

public class Usando {
    public static void main(String[] args) {
        int valor = 10;

        if (valor = 2) {
            System.out.println("caso 1");
        } else {
            System.out.println("caso 2");
        }
    }
}
```

## Pregunta 4 — Comparación de cadenas

```java
/*
PREGUNTA 4 — Comparación de cadenas

LETRA:
Dado un código que compara String cadena = "UTEC" con String otro = new String("UTEC") usando == y luego evalúa mensaje.contains("iguales"), indicar qué imprime.

CÓDIGO / RESPUESTA:
*/

// Respuesta: d. Son diferentes. cadena == otro compara referencias, no contenido; por eso mensaje queda "diferentes".

public class EjercicioString {
    public static void main(String[] args) {
        String cadena = "UTEC";
        String otro = new String("UTEC");

        String mensaje = (cadena == otro) ? "iguales" : "diferentes";

        if (mensaje.contains("iguales")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }
}
```

## Pregunta 5 — Duplicar números pares

```java
/*
PREGUNTA 5 — Duplicar números pares

LETRA:
Completar duplicarPares(int[] arr): recibe un arreglo de enteros y devuelve otro arreglo donde los números pares aparecen duplicados y los impares quedan iguales.

CÓDIGO / RESPUESTA:
*/

public static int[] duplicarPares(int[] arr) {
    int[] resultado = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            resultado[i] = arr[i] * 2;
        } else {
            resultado[i] = arr[i];
        }
    }

    return resultado;
}
```

## Pregunta 6 — Lista creada con Arrays.asList

```java
/*
PREGUNTA 6 — Lista creada con Arrays.asList

LETRA:
Dado un arreglo de colores convertido con Arrays.asList(colores), luego se intenta lista.add("Gris"). Indicar qué ocurre al ejecutar.

CÓDIGO / RESPUESTA:
*/

// Respuesta: d. Muestra una excepción: Arrays.asList(colores) devuelve una lista de tamaño fijo; no permite add().

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String colores[] = {"Rojo", "Azul", "Verde", "Amarillo", "Rosa"};

        List<String> lista = new ArrayList<>();
        lista = Arrays.asList(colores);

        lista.add("Gris");

        System.out.println(colores);
    }
}
```

## Pregunta 7 — Operaciones con ArrayList

```java
/*
PREGUNTA 7 — Operaciones con ArrayList

LETRA:
Crear la clase OperacionesArrayList usando ArrayList<String>, con agregarElemento, eliminarElemento y mostrarLista. No incluir main.

CÓDIGO / RESPUESTA:
*/

import java.util.ArrayList;

public class OperacionesArrayList {
    private ArrayList<String> lista;

    public OperacionesArrayList() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    public void eliminarElemento(String elemento) {
        lista.remove(elemento);
    }

    public String mostrarLista() {
        return lista.toString();
    }
}
```

## Pregunta 8 — Histograma con numerales

```java
/*
PREGUNTA 8 — Histograma con numerales

LETRA:
Completar numeros(int[] arr): imprimir un histograma. Si el número es positivo, imprimir el número, un espacio y # separados por guiones. Si es cero o negativo, imprimir solo el número.

CÓDIGO / RESPUESTA:
*/

public void numeros(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            System.out.print(arr[i] + " ");

            for (int j = 0; j < arr[i]; j++) {
                System.out.print("#");
                if (j < arr[i] - 1) {
                    System.out.print("-");
                }
            }
        } else {
            System.out.print(arr[i]);
        }

        System.out.println();
    }
}
```

## Pregunta 9 — Herencia: Persona, Profesor, Estudiante

```java
/*
PREGUNTA 9 — Herencia: Persona, Profesor, Estudiante

LETRA:
Crear/interpretar la herencia del diagrama: Persona como clase base; Profesor y Estudiante heredan de Persona, con atributos propios y toString().

CÓDIGO / RESPUESTA:
*/

public class Persona {
    private String nombre;
    private String cedula;
    private String direccion;

    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', cedula='" + cedula
                + "', direccion='" + direccion + "'}";
    }
}

public class Profesor extends Persona {
    private String carnetSalud;
    private String materia;

    public Profesor(String nombre, String cedula, String direccion,
                    String carnetSalud, String materia) {
        super(nombre, cedula, direccion);
        this.carnetSalud = carnetSalud;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + " Profesor{carnetSalud='" + carnetSalud
                + "', materia='" + materia + "'}";
    }
}

public class Estudiante extends Persona {
    private String codigo;
    private boolean tieneBeca;

    public Estudiante(String nombre, String cedula, String direccion,
                      String codigo, boolean tieneBeca) {
        super(nombre, cedula, direccion);
        this.codigo = codigo;
        this.tieneBeca = tieneBeca;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante{codigo='" + codigo
                + "', tieneBeca=" + tieneBeca + "}";
    }
}
```

## Pregunta 10 — Clase Libro

```java
/*
PREGUNTA 10 — Clase Libro

LETRA:
Crear la clase Libro con atributos titulo, autor y numeroPaginas; tres constructores sobrecargados; y métodos get para cada atributo. No incluir main.

CÓDIGO / RESPUESTA:
*/

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
```

## Pregunta 11 — Clase Perro

```java
/*
PREGUNTA 11 — Clase Perro

LETRA:
Dada la clase Perro con atributos privados, constructor, getters y setters, indicar si tiene errores.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. La clase no tiene errores.

public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}
```

## Pregunta 12 — Arreglo de objetos

```java
/*
PREGUNTA 12 — Arreglo de objetos

LETRA:
Dado un arreglo de objetos Persona con edades 50, 20, 30, 50 y 40; total inicia en 1*2; se suma cada edad. Indicar qué imprime.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. 192. total inicia en 1 * 2 = 2; luego suma 50 + 20 + 30 + 50 + 40 = 190; total final = 192.

public class Main {
    public static void main(String[] args) {
        int total = 1 * 2;

        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Carlos", 50);
        personas[1] = new Persona("Mario", 20);
        personas[2] = new Persona("María", 30);
        personas[3] = new Persona("José", 50);
        personas[4] = new Persona("Sofía", 40);

        for (Persona p : personas) {
            total += p.getEdad();
        }

        System.out.println(total);
    }
}
```

## Pregunta 13 — Sumar elementos de un arreglo

```java
/*
PREGUNTA 13 — Sumar elementos de un arreglo

LETRA:
Dado un arreglo {2,3,5,4,4,12,22}, se calcula sumArr(arreglo)+12. Indicar la salida por consola.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. 64. La suma del arreglo es 52 y luego se suma 12.

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {2, 3, 5, 4, 4, 12, 22};

        int sumar = sumArr(arreglo) + 12;

        System.out.println(sumar);
    }

    public static int sumArr(int[] arr) {
        int suma = 0;

        for (int n : arr) {
            suma += n;
        }

        return suma;
    }
}
```

## Pregunta 14 — Bucle while

```java
/*
PREGUNTA 14 — Bucle while

LETRA:
Dado un while (numero1 > 10) con numero1 = 2 y resultado inicial 0, indicar qué imprime.

CÓDIGO / RESPUESTA:
*/

// Respuesta: a. No hay un resultado correcto. El while no entra porque numero1 vale 2 y 2 > 10 es falso; se imprime 0.0.

public class EjercicioFuncion {
    public static void main(String[] args) {
        int numero1 = 2, numero2 = 8;
        double resultado = 0;

        while (numero1 > 10) {
            resultado = calcular(numero1, numero2);
            break;
        }

        System.out.println(resultado);
    }

    private static double calcular(int num2, int num1) {
        double resultado = num1 * 2 - num2;
        return resultado;
    }
}
```

## Pregunta 15 — Paso de parámetros con int e Integer

```java
/*
PREGUNTA 15 — Paso de parámetros con int e Integer

LETRA:
Dado x = 5 e Integer y = 2, se llama multiplicar(x,y), pero el método modifica solo copias locales. Indicar qué imprime x + y.

CÓDIGO / RESPUESTA:
*/

// Respuesta: d. Muestra por consola el valor 7. El método no modifica x ni y fuera del método.

public class Main {
    public static void main(String[] args) {
        int x = 5;
        Integer y = Integer.valueOf(2);

        multiplicar(x, y);

        System.out.println(x + y);
    }

    public static void multiplicar(int i, Integer j) {
        i *= 10;
        j *= 10;
    }
}
```

## Pregunta 16 — Manejo de excepciones

```java
/*
PREGUNTA 16 — Manejo de excepciones

LETRA:
Completar prueba(String dato, int[] vector) controlando ArrayIndexOutOfBoundsException y NullPointerException, mostrando los mensajes pedidos.

CÓDIGO / RESPUESTA:
*/

public void prueba(String dato, int[] vector) {
    try {
        System.out.println(vector[vector[1]]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("indice del array fuera de rango");
    } catch (Exception e) {
        System.out.println("error general");
    }

    try {
        System.out.println(dato.length());
        System.out.println("Llegamos al final ok");
    } catch (NullPointerException e) {
        System.out.println("String null, no se puede saber su largo");
    } catch (Exception e) {
        System.out.println("error general");
    }
}
```

## Pregunta 17 — LinkedList

```java
/*
PREGUNTA 17 — LinkedList

LETRA:
Dado una LinkedList con A,B,C,D,E; se elimina posición 0, se elimina posición 2 y se agrega "X" en posición 2. Indicar lista.get(2).

CÓDIGO / RESPUESTA:
*/

// Respuesta: a. Elemento en la posición 2: X.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        procesarLista(lista);

        System.out.println("Elemento en la posición 2: " + lista.get(2));
    }

    public static void procesarLista(LinkedList<String> lista) {
        lista.remove(0);
        lista.remove(2);
        lista.add(2, "X");
    }
}
```

## Pregunta 18 — HashSet

```java
/*
PREGUNTA 18 — HashSet

LETRA:
Dado un HashSet con valores repetidos, indicar la característica correcta: no admite duplicados y no garantiza orden.

CÓDIGO / RESPUESTA:
*/

// Respuesta: b. HashSet no permite elementos duplicados y no garantiza el orden de impresión.

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> numeros = new HashSet<>();

        numeros.add("dos");
        numeros.add("tres");
        numeros.add("tres");
        numeros.add("cuatro");
        numeros.add("cinco");

        System.out.println(numeros);
    }
}
```

## Pregunta 19 — while con incremento

```java
/*
PREGUNTA 19 — while con incremento

LETRA:
Dado x=2, y=5 y while(x<y) con x++, indicar cuántas veces se imprime el String UTEC después del ciclo.

CÓDIGO / RESPUESTA:
*/

// Respuesta: a. El ciclo se ejecuta 3 veces. x toma 2, 3 y 4 dentro del while.

public class UsandoWhile {
    public static void main(String[] args) {
        int x = 2, y = 5;

        while (x < y)
            System.out.println("Estamos en el x =" + x++);

        System.out.println("UTEC");
    }
}
```

## Pregunta 20 — Suma de números pares

```java
/*
PREGUNTA 20 — Suma de números pares

LETRA:
Dado un arreglo con solo números impares, sumar los elementos pares y mostrar la suma.

CÓDIGO / RESPUESTA:
*/

// Respuesta: b. 0. El arreglo no tiene números pares.

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 13, 17};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
```

## Pregunta 21 — Sobrecarga de métodos

```java
/*
PREGUNTA 21 — Sobrecarga de métodos

LETRA:
Dada una clase Mensaje con dos métodos enviarMensaje sobrecargados, indicar la salida al llamar uno con un parámetro y otro con dos parámetros.

CÓDIGO / RESPUESTA:
*/

// Respuesta: Enviando mensaje a: Ana
// Enviando mensaje a: Juan con el contenido: Hola, ¿cómo estás?

class Mensaje {
    public void enviarMensaje(String destinatario) {
        System.out.println("Enviando mensaje a: " + destinatario);
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println(
            "Enviando mensaje a: " + destinatario +
            " con el contenido: " + mensaje
        );
    }
}

public class Main {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();

        msg.enviarMensaje("Ana");
        msg.enviarMensaje("Juan", "Hola, ¿cómo estás?");
    }
}
```

## Pregunta 22 — Procesar matriz

```java
/*
PREGUNTA 22 — Procesar matriz

LETRA:
Procesar una matriz 3x3, sumar solo los números pares y devolver suma * 3. Indicar la salida.

CÓDIGO / RESPUESTA:
*/

// Respuesta: d. 60. Suma los pares 2 + 4 + 6 + 8 = 20 y devuelve 20 * 3.

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int resultado = procesarMatriz(matriz);

        System.out.println("El resultado es: " + resultado);
    }

    public static int procesarMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    suma += matriz[i][j];
                }
            }
        }

        return suma * 3;
    }
}
```

## Pregunta 23 — Polimorfismo con vehículos

```java
/*
PREGUNTA 23 — Polimorfismo con vehículos

LETRA:
Dadas las clases Vehiculo, Coche y Motocicleta con método encender sobrescrito, indicar la salida usando polimorfismo.

CÓDIGO / RESPUESTA:
*/

// Respuesta: El vehículo está encendido
// El coche está encendido
// La motocicleta está encendida

class Vehiculo {
    public void encender() {
        System.out.println("El vehículo está encendido");
    }
}

class Coche extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("El coche está encendido");
    }
}

class Motocicleta extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("La motocicleta está encendida");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo miCoche = new Coche();
        Vehiculo miMotocicleta = new Motocicleta();

        miVehiculo.encender();
        miCoche.encender();
        miMotocicleta.encender();
    }
}
```

## Pregunta 24 — Operaciones con métodos

```java
/*
PREGUNTA 24 — Operaciones con métodos

LETRA:
Dado complexOperation(a,b,c): suma a+b, multiplica por c y resta a. Con a=5,b=10,c=15, indicar la salida.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. 220. (5 + 10) * 15 - 5 = 220.

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int result = complexOperation(a, b, c);

        System.out.println(result);
    }

    public static int complexOperation(int x, int y, int z) {
        int step1 = add(x, y);
        int step2 = multiply(step1, z);
        int step3 = subtract(step2, x);

        return step3;
    }

    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }
}
```

## Pregunta 25 — Pares, impares y múltiplos de 10

```java
/*
PREGUNTA 25 — Pares, impares y múltiplos de 10

LETRA:
Completar evenOddSum(int n): del 1 al n imprimir odd para impares, even para pares y evenTen para múltiplos de 10.

CÓDIGO / RESPUESTA:
*/

public static void evenOddSum(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 10 == 0) {
            System.out.println("evenTen");
        } else if (i % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
```

## Pregunta 26 — Ordenamiento burbuja descendente

```java
/*
PREGUNTA 26 — Ordenamiento burbuja descendente

LETRA:
Completar ordenamientoBurbuja(int[] arreglo) para ordenar el arreglo en forma decreciente usando bubble sort, sin funciones de ordenamiento.

CÓDIGO / RESPUESTA:
*/

public static void ordenamientoBurbuja(int[] arreglo) {
    int n = arreglo.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arreglo[j] < arreglo[j + 1]) {
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }
}
```

## Pregunta 27 — Suma de bordes de una matriz

```java
/*
PREGUNTA 27 — Suma de bordes de una matriz

LETRA:
Completar sumaBordes(int[][] matriz, boolean sentidoHorario): devolver la suma de los elementos del borde exterior de una matriz cuadrada.

CÓDIGO / RESPUESTA:
*/

public static int sumaBordes(int[][] matriz, boolean sentidoHorario) {
    int n = matriz.length;

    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return matriz[0][0];
    }

    int suma = 0;

    for (int j = 0; j < n; j++) {
        suma += matriz[0][j];
    }

    for (int i = 1; i < n; i++) {
        suma += matriz[i][n - 1];
    }

    for (int j = n - 2; j >= 0; j--) {
        suma += matriz[n - 1][j];
    }

    for (int i = n - 2; i >= 1; i--) {
        suma += matriz[i][0];
    }

    return suma;
}
```

## Pregunta 28 — Herencia: Empleado y Gerente

```java
/*
PREGUNTA 28 — Herencia: Empleado y Gerente

LETRA:
Crear las clases Empleado y Gerente. Gerente hereda de Empleado y calcula bono anual = 0.1 * salario * añosServicio; salario anual = salario + bono anual.

CÓDIGO / RESPUESTA:
*/

public class Empleado {
    public String nombre;
    public double salario;
    public int aniosServicio;

    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.aniosServicio = 0;
    }

    public Empleado(String nombre, double salario, int aniosServicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.aniosServicio = aniosServicio;
    }

    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }
    public int getAniosServicio() { return aniosServicio; }

    public double calcularBonoAnual() {
        return 0;
    }

    public double calcularSalarioAnual() {
        return 0;
    }
}

public class Gerente extends Empleado {
    public Gerente(String nombre, double salario, int aniosServicio) {
        super(nombre, salario, aniosServicio);
    }

    @Override
    public double calcularBonoAnual() {
        return 0.1 * this.salario * this.aniosServicio;
    }

    @Override
    public double calcularSalarioAnual() {
        return this.salario + calcularBonoAnual();
    }
}
```

## Pregunta 29 — Polimorfismo con animales

```java
/*
PREGUNTA 29 — Polimorfismo con animales

LETRA:
Dadas clases Animal, Perro, Loro y Gato con hacerSonido sobrescrito, indicar la salida usando polimorfismo.

CÓDIGO / RESPUESTA:
*/

// Respuesta: El perro ladra: ¡Guau! ¡Guau!
// El loro dice: ¡Hola! ¡Hola!
// El gato maúlla: ¡Miau! ¡Miau!
// El animal hace un sonido

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau! ¡Guau!");
    }
}

class Loro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El loro dice: ¡Hola! ¡Hola!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau! ¡Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();

        miAnimal = new Loro();
        miAnimal.hacerSonido();

        miAnimal = new Gato();
        miAnimal.hacerSonido();

        Animal otroAnimal = new Animal();
        otroAnimal.hacerSonido();
    }
}
```

## Pregunta 30 — Factoriales

```java
/*
PREGUNTA 30 — Factoriales

LETRA:
Completar factoriales(int n): devolver un arreglo con los factoriales desde 0 hasta n.

CÓDIGO / RESPUESTA:
*/

public static int[] factoriales(int n) {
    int[] fact = new int[n + 1];
    fact[0] = 1;

    for (int i = 1; i <= n; i++) {
        fact[i] = fact[i - 1] * i;
    }

    return fact;
}
```

## Pregunta 31 — Interfaces

```java
/*
PREGUNTA 31 — Interfaces

LETRA:
Interfaces: identificar que una interfaz puede tener métodos default, y que una clase la implementa con implements.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. Una interfaz puede tener métodos default, y una clase la implementa usando implements.

public interface Vehiculo {
    void acelerar();
    void frenar();

    default void describir() {
        System.out.println("Yo soy un vehículo.");
    }
}
```

## Pregunta 32 — Mayor elemento de cada fila

```java
/*
PREGUNTA 32 — Mayor elemento de cada fila

LETRA:
Completar mayorFilas(int[][] matriz): para cada fila de una matriz, mostrar el mayor elemento con el formato indicado.

CÓDIGO / RESPUESTA:
*/

private static void mayorFilas(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        int max = matriz[i][0];

        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > max) {
                max = matriz[i][j];
            }
        }

        System.out.println("Mayor fila :" + i + " es " + max);
    }
}
```

## Pregunta 33 — switch: vocal, consonante o carácter especial

```java
/*
PREGUNTA 33 — switch: vocal, consonante o carácter especial

LETRA:
Completar una función con switch para clasificar un carácter como vocal, consonante o no es una letra.

CÓDIGO / RESPUESTA:
*/

public static void clasificar(char caracter) {
    switch (caracter) {
        case 'a': case 'e': case 'i': case 'o': case 'u':
        case 'A': case 'E': case 'I': case 'O': case 'U':
            System.out.println("es vocal");
            break;

        default:
            if ((caracter >= 'a' && caracter <= 'z') ||
                (caracter >= 'A' && caracter <= 'Z')) {
                System.out.println("es consonante");
            } else {
                System.out.println("no es una letra");
            }
    }
}
```

## Pregunta 34 — Sumar índices de un arreglo

```java
/*
PREGUNTA 34 — Sumar índices de un arreglo

LETRA:
Dado un bucle que recorre i = 0, 2, 4 y suma i, distinguir que se suman índices y no elementos.

CÓDIGO / RESPUESTA:
*/

// Respuesta: b. 6. Se suman los índices 0 + 2 + 4, no los elementos del arreglo.

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int suma = 0;

        for (int i = 0; i < arr.length; i += 2) {
            suma += i;
        }

        System.out.println(suma);
    }
}
```

## Pregunta 35 — Función y procedimiento

```java
/*
PREGUNTA 35 — Función y procedimiento

LETRA:
Distinguir función y procedimiento: getNombre devuelve valor; setPrecio usa void y no devuelve valor.

CÓDIGO / RESPUESTA:
*/

// Respuesta: b. getNombre() es una función porque devuelve un valor, y setPrecio() es un procedimiento porque usa void.

public String getNombre() {
    return nombre;
}

public void setPrecio(double precio) {
    this.precio = precio;
}
```

## Pregunta 36 — Constructores sobrecargados

```java
/*
PREGUNTA 36 — Constructores sobrecargados

LETRA:
Crear clase Persona con constructores sobrecargados: sin parámetros, con nombre, y con nombre y edad.

CÓDIGO / RESPUESTA:
*/

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
```

## Pregunta 37 — Excepción por índice fuera de rango

```java
/*
PREGUNTA 37 — Excepción por índice fuera de rango

LETRA:
Dado acceso nums[5] en arreglo de tamaño 3 dentro de try/catch, indicar qué excepción se controla y qué mensaje se imprime.

CÓDIGO / RESPUESTA:
*/

// Respuesta: c. Imprime: Error: índice fuera de los límites del array.

public class Main {
    public static void main(String[] args) {
        try {
            int[] nums = new int[3];
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de los límites del array");
        }
    }
}
```

## Pregunta 38 — LinkedList: agregar y modificar elementos

```java
/*
PREGUNTA 38 — LinkedList: agregar y modificar elementos

LETRA:
Dada una LinkedList de razas, agregar al inicio y modificar una posición con set. Indicar la salida.

CÓDIGO / RESPUESTA:
*/

// Respuesta: b. Yorkshire - Pitbul - CaneCorso -

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> razas = new LinkedList<>();

        razas.add("Pastor");
        razas.add("CaneCorso");
        razas.add(0, "Yorkshire");
        razas.set(1, "Pitbul");

        for (String raza : razas) {
            System.out.print(raza + " - ");
        }
    }
}
```

## Pregunta 39 — switch avanzado

```java
/*
PREGUNTA 39 — switch avanzado

LETRA:
Dado un switch avanzado con compareTo y operador ternario, calcular el valor final impreso.

CÓDIGO / RESPUESTA:
*/

// Respuesta: a. 3. Atento: con el código escrito, "Gato".compareTo("Perro") es negativo, por lo tanto opcion vale 0.

public class Main {
    public static void main(String[] args) {
        int msuma = 0;

        for (int i = 3; i > 0; i--) {
            int diferencia = "Gato".compareTo("Perro");
            int opcion = diferencia > 0 ? 1 : 0;

            switch (i - opcion) {
                case 0:
                    msuma += i;
                    break;

                case 1:
                    msuma -= i;
                    break;

                case 2:
                    msuma += i;

                default:
                    msuma++;
            }
        }

        System.out.println(msuma);
    }
}
```

## Pregunta 40 — Patrones básicos de programación

```java
/*
PREGUNTA 40 — Patrones básicos de programación

LETRA:
Resumen de patrones básicos de programación: iteración, estructuras de datos, métodos, POO, control de flujo y excepciones.

CÓDIGO / RESPUESTA:
*/

// Respuesta: b. Iteración, estructuras de datos, métodos, POO y control de flujo.
// 
// Pregunta	Respuesta	Pregunta	Respuesta
// 1	c	3	c
// 4	d	6	d
// 11	c	12	c
// 13	c	14	a
// 15	d	17	a
// 18	b	19	a
// 20	b	21
// 22	d	23
// 24	c	29
// 31	c	34	b
// 35	b	37	c
// 38	b	39	a
// 40	b

Concepto	Uso
Bucle	Recorrer arreglos, listas o matrices
Colección	Guardar varios elementos en una estructura
Acumulador	Sumar, contar o calcular factoriales
Matriz bidimensional	Recorrer filas y columnas
Condición	Decidir qué acción realizar
Interfaz	Definir un contrato de métodos
Excepción	Controlar errores de ejecución
Objeto	Representar entidades con atributos y métodos
switch	Selección múltiple
Polimorfismo	Ejecutar métodos sobrescritos según el objeto real
```
