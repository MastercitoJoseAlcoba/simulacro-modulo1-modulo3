# FEIP · Ejercicios de CodeRunner en Java

Cada ejercicio es una respuesta independiente. CodeRunner aporta el `main` en las pruebas compartidas.

## Pregunta 1 · Clase Producto

Implementá cuatro atributos y tres constructores. La prueba lee los atributos con getters. El constructor vacío deja `0`, `null`, `0.0` y `0`. El constructor de tres parámetros deja `cantidad` en `0`.

```java
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio) {
        this(id, nombre, precio, 0);
    }

    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
```

## Pregunta 7 · Multiplicación, máximo y promedio de un array

Crea `OperacionesConArray` con tres métodos que reciben `double[]`. Con `{1, 2, 3, 4, 5}`, devuelven `120.0`, `5.0` y `3.0`. Se supone que el arreglo tiene al menos un elemento.

```java
public class OperacionesConArray {
    public double multiplicacionArray(double[] numeros) {
        double producto = 1.0;
        for (double numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

    public double maximoArray(double[] numeros) {
        double maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    public double promedioArray(double[] numeros) {
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
}
```

## Pregunta 8 · Perímetro de una matriz de caracteres

Cargá los bordes de una matriz cuadrada con `'#'` y el interior con `' '`. El método termina con la llave que cierra `matrizMostrar`. Si el editor ya trae la firma y la impresión, completá el bloque de carga en la plantilla.

```java
public static void matrizMostrar(char[][] matriz) {
    int ultimo = matriz.length - 1;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (i == 0 || i == ultimo || j == 0 || j == ultimo) {
                matriz[i][j] = '#';
            } else {
                matriz[i][j] = ' ';
            }
        }
    }

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
```

## Pregunta 10 · Operaciones con matrices de enteros

La prueba instancia `OperacionesConMatrices`. `sumaElementosMatriz` devuelve un `int`, `sumarMatrices` devuelve un `int[][]` e `imprimirMatriz` imprime un tabulador después de **cada** número. Para sumar, se supone que ambas matrices tienen las mismas dimensiones.

```java
public class OperacionesConMatrices {
    public int sumaElementosMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }

    public int[][] sumarMatrices(int[][] a, int[][] b) {
        int[][] resultado = new int[a.length][];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        return resultado;
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```

## Pregunta 22 · Clase Libro

Inicializá los cinco atributos en el constructor. Usá la etiqueta exacta `Esta Disponible: ` (sin tilde y con D mayúscula) en `mostrarInformacion()`. En `estaDisponible()`, imprimí el mensaje con tilde y punto final.

```java
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;
    private boolean estaDisponible;

    public Libro(String titulo, String autor, int anioPublicacion,
                 String isbn, boolean estaDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.estaDisponible = estaDisponible;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("ISBN: " + isbn);
        System.out.println("Esta Disponible: " + estaDisponible);
    }

    public void estaDisponible() {
        if (estaDisponible) {
            System.out.println("Está disponible.");
        } else {
            System.out.println("No está disponible.");
        }
    }
}
```

## Pregunta 23 · Promedio de un array de enteros

El método es `static` y devuelve `double`. Con `{1, 2}` devuelve `1.5` porque la suma es decimal. La letra no fija el resultado para un arreglo vacío.

```java
public static double calcularPromedio(int[] numeros) {
    double suma = 0.0;

    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }

    return suma / numeros.length;
}
```

## Pregunta 39 · Herencia de empleados

`Empleado` devuelve el salario base. `Gerente` suma un bono del 10 % y `Desarrollador` suma un 20 %. Con los ejemplos, los salarios calculados son `30000.0`, `66000.0` y `48000.0`.

```java
class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, String apellido, double salario, String departamento) {
        super(nombre, apellido, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + salarioBase * 0.10;
    }
}

class Desarrollador extends Empleado {
    public Desarrollador(String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + salarioBase * 0.20;
    }
}
```

## Sin número visible · Rectangulo

Calculá área y perímetro usando la base y la altura del objeto. Con base `5` y altura `3`, el área da `15.0` y el perímetro, `16.0`.

```java
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
```

## Sin número visible · Mostrar figuras y sumar sus áreas

La plantilla ya define `Figura` y sus subclases `Rectangulo`, `Circulo` y `Triangulo`. Completá `mostrarDatos` para imprimir cada tipo y mostrar la suma total al final. El ejemplo compartido no especifica una etiqueta para el total.

```java
public static void mostrarDatos(java.util.List<Figura> figuras) {
    double sumaAreas = 0.0;

    for (Figura figura : figuras) {
        System.out.println(figura.tipo);
        sumaAreas += figura.calcularArea();
    }

    System.out.println(sumaAreas);
}
```
