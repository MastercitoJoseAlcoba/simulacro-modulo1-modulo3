# FEIP – Manejo de excepciones y archivos

## E01 – Lectura de cantidad de bizcochos (TRY y CATCH)

### Enunciado

Un método recibe un String que representa la cantidad de
bizcochos pedidos en una panadería.

Se debe:

- Intentar convertir el texto a número entero usando `try`.
- Si el texto no representa un número válido, capturar la
  excepción y devolver `"Dato invalido"`.
- Si el número es menor o igual a 0, lanzar una excepción
  y devolver `"Cantidad incorrecta"`.
- Si el número es mayor a 24, lanzar una excepción
  y devolver `"Pedido demasiado grande"`.
- Si todo es correcto, devolver `"Pedido registrado: X bizcochos"`.

**El uso de `try` y `catch` es obligatorio.**

### Código inicial

```java
public class PedidoBizcochos {

    public String procesarPedido(String texto) {
        // Escriba su código aquí
    }
}
```

### Ejemplo

```java
PedidoBizcochos pb = new PedidoBizcochos();
System.out.println(pb.procesarPedido("-3"));
```

### Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| "hola" | Dato invalido |
| "-3" | Cantidad incorrecta |
| "0" | Cantidad incorrecta |
| "12" | Pedido registrado: 12 bizcochos |
| "24" | Pedido registrado: 24 bizcochos |
| "25" | Pedido demasiado grande |

---

## E02 – Control de acceso (FINALLY)

### Enunciado

Un método recibe la edad de una persona como String.

Se debe:

- Intentar convertir el valor a entero.
- Si no es un número, capturar la excepción y devolver
  `"Edad invalida"`.
- Si la edad es menor a 18, devolver `"Acceso denegado"`.
- Si la edad es válida y mayor o igual a 18, devolver
  `"Acceso permitido"`.

Independientemente de lo que ocurra:

- El bloque `finally` debe devolver siempre el mensaje
  `"Control finalizado"` concatenado al resultado,
  separado por `" - "`.

### Código inicial

```java
public class ControlAcceso {

    public String verificarEdad(String edadTexto) {
        // Escriba su código aquí
    }
}
```

### Ejemplo

```java
ControlAcceso ca = new ControlAcceso();
System.out.println(ca.verificarEdad("hola"));
```

### Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| "hola" | Edad invalida - Control finalizado |
| "10" | Acceso denegado - Control finalizado |
| "17" | Acceso denegado - Control finalizado |
| "18" | Acceso permitido - Control finalizado |
| "25" | Acceso permitido - Control finalizado |

---

## E03 – Carga de patente (TRY, CATCH, FINALLY y EXCEPCIÓN ESPECÍFICA)

### Enunciado

Se debe escribir un programa en Java que lea una única
línea de texto desde la entrada estándar, correspondiente
a una patente de vehículo.

No se debe validar un formato específico de letras o números.

Solo se controlan las siguientes condiciones:

1. Si la línea leída es `null` o está vacía, se debe
   lanzar una `NullPointerException`.

2. Si la longitud del texto es menor a 6 caracteres,
   se debe lanzar una `StringIndexOutOfBoundsException`.

3. Si ninguna de las situaciones anteriores ocurre,
   la patente se considera válida.

El programa debe manejar las excepciones utilizando
`try`, `catch` y `finally`, cumpliendo lo siguiente:

- Para leer la entrada, usar el Scanner `sc`:

```java
String patente = sc.nextLine();
```

- Capturar `NullPointerException` y mostrar:

```text
Patente vacia
```

- Capturar `StringIndexOutOfBoundsException` y mostrar:

```text
Patente incompleta
```

- Si la patente es válida, mostrar:

```text
Patente registrada
```

- En todos los casos, el bloque `finally` debe imprimir:

```text
Proceso terminado
```

### Código inicial propuesto

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escriba su código aquí
    }
}
```

### Casos de prueba

#### Prueba 1 – Patente vacía

Entrada: `""`

Resultado:

```text
Patente vacia
Proceso terminado
```

#### Prueba 2 – Patente incompleta

Entrada: `"ABC"`

Resultado:

```text
Patente incompleta
Proceso terminado
```

#### Prueba 3 – Patente válida

Entrada: `"ABC123"`

Resultado:

```text
Patente registrada
Proceso terminado
```

#### Prueba 4 – Patente válida

Entrada: `"SAB1234"`

Resultado:

```text
Patente registrada
Proceso terminado
```