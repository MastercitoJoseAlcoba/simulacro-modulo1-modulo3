# Parcial unificado Java — respuestas en formato código

Cada bloque está separado para copiarlo a Java o CodeRunner. En las preguntas de múltiple opción dejé la respuesta como comentario arriba del código.

## Pregunta 1 — Paso de parámetros

```java
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
