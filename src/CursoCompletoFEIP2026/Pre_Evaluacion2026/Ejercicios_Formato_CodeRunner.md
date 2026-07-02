# Ejercicios en formato CodeRunner

Formato pensado para estudiar y copiar en CodeRunner.

- En ejercicios prácticos: código directo para pegar.
- En ejercicios teóricos: respuesta marcada como comentario Java.
- Cuando el enunciado dice “no incluir main”, no se incluye `main`.

---

## Ejercicio 1 — Mostrar array con Arrays.toString

```java
/*
Pregunta:
Si se desea mostrar en consola el contenido completo del arreglo:
[10, 20, 30, 40]

Letra correcta: a

Respuesta:
System.out.println(Arrays.toString(numeros));

Explicación:
Arrays.toString(numeros) muestra el contenido del array.
Si imprimís directamente numeros, Java muestra la referencia de memoria.
*/
```

---

## Ejercicio 2 — Array de objetos Libro

```java
/*
Letra correcta: d

Respuesta:
Java HTML C#

Explicación:
libros[0] primero tenía SQL, pero luego se reemplaza por Java.
libros[1] primero tenía Python, pero luego se reemplaza por HTML.
libros[2] queda C#.
*/
```

---

## Ejercicio 3 — Consumo de autos con clases abstractas

```java
class Mostrar {

    public static void mostrarDatos(java.util.List<Auto> autos) {
        double total = 0;

        for (Auto auto : autos) {

            if (auto instanceof AutoNafta) {
                System.out.println("Tipo: AutoNafta");
            } else if (auto instanceof AutoHibrido) {
                System.out.println("Tipo: AutoHibrido");
            } else if (auto instanceof AutoElectrico) {
                System.out.println("Tipo: AutoElectrico");
            }

            double consumo = auto.calcularConsumo();
            System.out.println("Consumo: " + consumo);

            total += consumo;
        }

        System.out.println("Total consumos: " + total);
    }
}

/*
Explicación:
La lista recibe objetos de tipo Auto.
Gracias al polimorfismo, auto.calcularConsumo() ejecuta el método real:
AutoNafta, AutoHibrido o AutoElectrico.
*/
```

---

## Ejercicio 4 — Comparación de String

```java
/*
Letra correcta: d

Respuesta:
true false true

Explicación:
x == y da true porque ambos son literales.
x == z da false porque z fue creado con new.
x.equals(z) da true porque compara el contenido.
*/
```

---

## Ejercicio 5 — Método sin retorno

```java
/*
Letra correcta: b
*/

public void suma() {
}

/*
Explicación:
Un método sin retorno usa void.
La estructura correcta es:
public void suma()
*/
```

---

## Ejercicio 6 — Manejo de excepciones

```java
/*
Letra correcta: d

Correctas:
1, 3, 4 y 6

Explicación:
1. try contiene código que puede producir una excepción. Correcto.
2. catch se ejecuta siempre. Incorrecto.
3. finally se ejecuta siempre. Correcto.
4. throw se usa para lanzar una excepción. Correcto.
5. throws se usa dentro del catch. Incorrecto.
6. try no puede existir sin catch o finally. Correcto.
*/
```

---

## Ejercicio 7 — Sobrecarga con short

```java
/*
Letra correcta: a

Respuesta:
Metodo int: 12

Explicación:
No existe mostrar(short, short).
Java convierte short a int automáticamente.
Por eso ejecuta mostrar(int a, int b).
*/
```

---

## Ejercicio 8 — Flujo con try-catch-finally

```java
/*
Letra correcta: b

Flujo correcto:
Bloque 1 -> Bloque 2 -> Bloque 4 -> Bloque 5 -> Bloque 6

Explicación:
NumberFormatException no entra en catch NullPointerException.
Sí entra en catch Exception.
Después siempre se ejecuta finally.
*/
```

---

## Ejercicio 9 — Sucesión de Padovan

```java
public int[] padovan(int n) {
    if (n <= 0) {
        return new int[0];
    }

    int[] resultado = new int[n];

    for (int i = 0; i < n; i++) {
        if (i <= 2) {
            resultado[i] = 1;
        } else {
            resultado[i] = resultado[i - 2] + resultado[i - 3];
        }
    }

    return resultado;
}

/*
Explicación:
P(0) = 1
P(1) = 1
P(2) = 1

Desde i = 3:
P(i) = P(i - 2) + P(i - 3)
*/
```

---

## Ejercicio 10 — Excepción no controlada en array

```java
/*
Letra correcta: c

Respuesta:
Se produce una excepción no controlada y el programa se detiene.

Explicación:
numeros[5] lanza ArrayIndexOutOfBoundsException.
El catch interno captura ArithmeticException.
El catch externo captura NullPointerException.
Ninguno captura ArrayIndexOutOfBoundsException.
*/
```

---

## Ejercicio 11 — Interfaz en Java

```java
/*
Letra correcta: b

Respuesta:
Una clase que implementa una interfaz debe implementar sus métodos abstractos.

Explicación:
La interfaz define un contrato.
La clase que usa implements debe cumplir ese contrato.
*/
```

---

## Ejercicio 12 — Interfaz Vehiculo

```java
/*
Letra correcta: d

Verdaderas:
1, 4 y 6

Explicación:
1. La interfaz está definida correctamente.
4. Para implementarla se usa implements.
6. Se deben implementar sus métodos abstractos.

Una interfaz puede tener métodos default con cuerpo.
*/
```

---

## Ejercicio 13 — LinkedHashSet

```java
/*
Letra correcta: d

Respuesta:
[10, 20, 30]

Explicación:
Set no permite elementos repetidos.
LinkedHashSet mantiene el orden de inserción.
*/
```

---

## Ejercicio 14 — Queue

```java
/*
Letra correcta: a

Respuesta:
[Mariana, Dante, Oscar]

Explicación:
Queue funciona como FIFO:
First In, First Out.
Salen Antonio y Carmen.
Quedan Mariana, Dante y Oscar.
*/
```

---

## Ejercicio 15 — substring

```java
/*
Letra correcta: a

Respuesta:
Prog

Explicación:
substring(0, 4) toma desde el índice 0 hasta antes del índice 4.
*/
```

---

## Ejercicio 16 — Clase abstracta

```java
/*
Letra correcta: c

Respuesta:
Una clase abstracta no se puede instanciar directamente.

Explicación:
No se puede hacer:
new ClaseAbstracta();

Debe ser heredada por otra clase.
*/
```

---

## Ejercicio 17 — Operaciones con matrices

```java
public class OperacionesConMatrices {

    public int sumaElementosMatriz(int[][] matriz) {
        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }
        }

        return suma;
    }

    public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                resultado[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna];
            }
        }

        return resultado;
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}

/*
Explicación:
Para recorrer matrices se usan dos for:
uno para filas y otro para columnas.

Elemento actual:
matriz[fila][columna]
*/
```

---

## Ejercicio 18 — Sobrecarga de métodos

```java
/*
Letra correcta: c

Respuesta:
sumar(int a, int b) y sumar(double a, double b)

Explicación:
Hay sobrecarga cuando dos métodos tienen el mismo nombre,
pero diferente tipo o cantidad de parámetros.

Cambiar solo el nombre de las variables no cuenta.
*/
```

---

## Ejercicio 19 — Excepciones incorrectas

```java
/*
Letra correcta: c

Incorrectas:
1 y 5

Explicación:
1. catch puede existir sin try. Incorrecto.
5. finally se ejecuta únicamente si ocurre excepción. Incorrecto.

finally se ejecuta haya o no haya excepción.
*/
```

---

## Ejercicio 20 — Operadores

```java
/*
Letra correcta: d

Valores finales:
a = 5
b = 9
c = 6
suma = 20
oper = true
mensaje = "PAR"

La afirmación falsa es:
d. El valor que se imprime de mensaje es "IMPAR".

Explicación:
20 es par, entonces mensaje vale "PAR".
*/
```

---

## Ejercicio 21 — LocalDate

```java
/*
Letra correcta: b
*/

LocalDate fecha = LocalDate.of(2026, 04, 30);

/*
Explicación:
LocalDate se crea con:
LocalDate.of(año, mes, día)
*/
```

---

## Ejercicio 22 — Nombres de variables

```java
/*
Letra correcta: a

Respuesta:
No pueden usar palabras reservadas del lenguaje.

Explicación:
No se puede usar class, public, static, if, else, etc. como nombre de variable.
Tampoco pueden comenzar con número ni tener guion medio.
*/
```

---

## Ejercicio 23 — HashMap

```java
/*
Letra correcta: d

Estado final:
Lapiz = 15
Goma = 5
Regla = 7

Cuaderno ya no está.

Explicación:
put con una clave existente reemplaza el valor.
remove elimina la clave.
*/
```

---

## Ejercicio 24 — Función y procedimiento

```java
/*
Letra correcta: c

Respuesta:
La función devuelve un valor y el procedimiento no.

Explicación:
En Java:
- función: método que retorna algo
- procedimiento: método void
*/
```

---

## Ejercicio 25 — Suma de filas de matriz

```java
public void mostrarSumaFilas(int[][] matriz) {
    for (int fila = 0; fila < matriz.length; fila++) {
        int suma = 0;

        for (int columna = 0; columna < matriz[fila].length; columna++) {
            suma += matriz[fila][columna];
        }

        System.out.println("Fila " + (fila + 1) + ": " + suma);
    }
}

/*
Explicación:
Se usa matriz[fila].length porque la matriz puede ser escalonada.
Eso significa que cada fila puede tener distinta cantidad de columnas.
*/
```

---

## Ejercicio 26 — CRUD de reservas con HashMap

```java
class Reserva {
    private int codigo;
    private String titular;
    private int noches;
    private double precioPorNoche;

    public Reserva(int codigo, String titular, int noches, double precioPorNoche) {
        this.codigo = codigo;
        this.titular = titular;
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNoches() {
        return noches;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    @Override
    public String toString() {
        return "Reserva{codigo=" + codigo +
                ", titular='" + titular + '\'' +
                ", noches=" + noches +
                ", precioPorNoche=" + precioPorNoche +
                '}';
    }
}

interface ICrudReservas {
    void agregarReserva(Reserva reserva);
    void modificarReserva(int codigo, Reserva reserva);
    void eliminarReserva(int codigo);
    void listarReservas();
}

class CrudReservasImpl implements ICrudReservas {

    private java.util.HashMap<Integer, Reserva> reservas = new java.util.HashMap<Integer, Reserva>();

    @Override
    public void agregarReserva(Reserva reserva) {
        reservas.put(reserva.getCodigo(), reserva);
    }

    @Override
    public void modificarReserva(int codigo, Reserva reserva) {
        if (reservas.containsKey(codigo)) {
            reservas.put(codigo, reserva);
        } else {
            System.out.println("No existe la reserva");
        }
    }

    @Override
    public void eliminarReserva(int codigo) {
        if (reservas.containsKey(codigo)) {
            reservas.remove(codigo);
        } else {
            System.out.println("No existe la reserva");
        }
    }

    @Override
    public void listarReservas() {
        java.util.Set<Integer> claves = reservas.keySet();

        for (Integer clave : claves) {
            System.out.println("Clave: " + clave + " valor: " + reservas.get(clave));
        }
    }
}

/*
Explicación:
HashMap usa clave y valor.

Clave:
codigo de reserva

Valor:
objeto Reserva
*/
```

---

## Ejercicio 27 — Sistema de cuentas bancarias

```java
class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double calcularInteres(int meses) {
        return 0;
    }

    public double calcularSaldoFinal(int meses) {
        return saldo + calcularInteres(meses);
    }
}

class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularInteres(int meses) {
        return getSaldo() * 0.02 * meses;
    }

    @Override
    public double calcularSaldoFinal(int meses) {
        return getSaldo() + calcularInteres(meses);
    }
}

class PlazoFijo extends CuentaBancaria {

    public PlazoFijo(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularInteres(int meses) {
        return getSaldo() * 0.05 * meses;
    }

    @Override
    public double calcularSaldoFinal(int meses) {
        return getSaldo() + calcularInteres(meses);
    }
}

/*
Explicación:
CajaAhorro:
2% mensual

PlazoFijo:
5% mensual

Fórmulas:
interes = saldo * tasa * meses
saldoFinal = saldo + interes
*/
```

---

## Ejercicio 28 — Booleano con ternario

```java
/*
Letra correcta: b

Respuesta:
c vale false.

Explicación:
a = true
b = false

a && !b = true && true = true

Entonces se ejecuta:
!(a || b)

a || b = true
!true = false

Por eso c = false.
*/
```

---

## Ejercicio 29 — Objeto o instancia

```java
/*
Letra correcta: d

Respuesta:
a1 representa un objeto o instancia de Auto.

Explicación:
Auto es la clase.
new Auto() crea el objeto.
a1 guarda la referencia al objeto.
*/
```

---

## Ejercicio 30 — Método void

```java
/*
Letra correcta: a

Respuesta:
Como un procedimiento, porque no devuelve valor.

Explicación:
void significa que el método no retorna nada.
*/
```

---

## Ejercicio 31 — Clase Libro

```java
public class Libro {
    private String titulo;
    private String autor;
    private int cantidadPaginas;

    public Libro(String titulo, String autor, int cantidadPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = 0;
    }

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.cantidadPaginas = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + cantidadPaginas;
    }

    public boolean esLargo() {
        return cantidadPaginas >= 230;
    }
}

/*
Explicación:
Tiene 3 constructores:
- con titulo, autor y cantidadPaginas
- con titulo y autor
- vacío

esLargo devuelve true si tiene 230 páginas o más.
*/
```

---

## Ejercicio 32 — Polimorfismo

```java
/*
Letra correcta: c

Respuesta:
Polimorfismo.

Explicación:
Animal a = new Perro();

La variable es de tipo Animal,
pero el objeto real es de tipo Perro.

Cuando se llama a.hacerSonido(),
se ejecuta el método redefinido en Perro.
*/
```

---

## Ejercicio 33 — instanceof

```java
/*
Letra correcta: b

Respuesta:
true - false - true - true - false - true -

Explicación:
animal es Animal, pero no Perro.
perro es Perro y también Animal.
gato es Gato y también Animal, pero no Perro.
*/
```

---

## Ejercicio 34 — Control de excepciones con String

```java
public void prueba(String dato) {
    try {
        System.out.println(dato.charAt(3));
        System.out.println(dato.substring(0, 5));
        System.out.println("Proceso correcto");
    } catch (NullPointerException e) {
        System.out.println("Error de null");
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Error de string");
    }
}

/*
Explicación:
Si dato es null:
NullPointerException

Si el String no tiene largo suficiente:
StringIndexOutOfBoundsException

Si no hay error:
muestra los datos y luego "Proceso correcto".
*/
```

---

## Ejercicio 35 — Promedio de pares

```java
public static double calcularPromedioPares(int[] array) {
    int suma = 0;
    int cantidadPares = 0;

    for (int numero : array) {
        if (numero % 2 == 0) {
            suma += numero;
            cantidadPares++;
        }
    }

    if (cantidadPares == 0) {
        return 0;
    }

    return (double) suma / cantidadPares;
}

/*
Explicación:
Se suman solamente los números pares.
También se cuenta cuántos pares hay.

Promedio:
suma / cantidadPares

El casteo (double) evita perder decimales.
*/
```

---

## Ejercicio 36 — Validar vocales

```java
public boolean validarVocal(String palabra) {
    if (palabra == null) {
        return false;
    }

    if (palabra.length() < 3 || palabra.length() > 6) {
        return false;
    }

    for (int i = 0; i < palabra.length(); i++) {
        char letra = palabra.charAt(i);

        if (!(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
              letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')) {
            return false;
        }
    }

    return true;
}

/*
Explicación:
Debe cumplir dos condiciones:
1. Largo entre 3 y 6.
2. Todas las letras deben ser vocales.

Si una letra no es vocal, devuelve false.
Si todas son vocales y el largo es correcto, devuelve true.
*/
```

---

## Ejercicio 37 — Tipo de retorno boolean

```java
/*
Letra correcta: d

Respuesta:
boolean representa el tipo de retorno.

Explicación:
public static boolean esPar(int numero)

public -> modificador de acceso
static -> pertenece a la clase
boolean -> tipo de retorno
esPar -> nombre del método
int numero -> parámetro
*/
```

---

## Ejercicio 38 — switch

```java
/*
Letra correcta: b

Respuesta:
C-B-C-A-D-

Explicación:
i = 4:
i - 2 = 2 -> C-

i = 3:
i - 2 = 1 -> B-
No hay break, entonces cae también en case 2 -> C-

i = 2:
i - 2 = 0 -> A-

i = 1:
i - 2 = -1 -> default -> D-
*/
```

---

## Ejercicio 39 — Arrays.asList

```java
/*
Letra correcta: a

Respuesta:
Se produce una excepción en tiempo de ejecución.

Explicación:
Arrays.asList(nombres) crea una lista de tamaño fijo.
No se puede usar add() para agregar otro elemento.

Error:
UnsupportedOperationException
*/
```

---

## Ejercicio 40 — Flujo sin excepción

```java
/*
Letra correcta: d

Flujo correcto:
Bloque 1 -> Bloque 2 -> Bloque 5 -> Bloque 6

Explicación:
Si no ocurre excepción:
no entra a catch.
sí entra a finally.
después sigue el programa.
*/
```
