# Ejercicio: Clase `Pelicula`

Se desea desarrollar una clase llamada `Pelicula` para representar películas dentro de un sistema.

La clase debe pertenecer al paquete:

```java
package ej4;
```

## Atributos

La clase deberá contener los siguientes atributos privados:

- `titulo`, de tipo `String`.
- `genero`, de tipo `String`.
- `duracion`, de tipo `int`, expresada en minutos.

## Constructores

La clase debe implementar **tres constructores**.

### Constructor 1

Un constructor sin parámetros que inicialice los atributos con los siguientes valores:

- título: `"Película sin título"`
- género: `"Género sin definir"`
- duración: `0`

### Constructor 2

Un constructor que reciba:

```java
String titulo
String genero
```

La duración deberá inicializarse en `0`.

### Constructor 3

Un constructor que reciba:

```java
String titulo
String genero
int duracion
```

## Getters y setters

Se deberán implementar los métodos `get` y `set` correspondientes para todos los atributos.

Los setters deberán cumplir con las siguientes validaciones:

- El título solo podrá modificarse si no es `null` ni una cadena vacía.
- El género solo podrá modificarse si no es `null` ni una cadena vacía.
- La duración solo podrá modificarse si es mayor o igual a `0`.

## Método `esLarga()`

Implementar el siguiente método:

```java
public boolean esLarga()
```

El método deberá devolver:

- `true` si la duración de la película es de **120 minutos o más**.
- `false` en caso contrario.

## Método `mostrar()`

Implementar el siguiente método:

```java
public void mostrar()
```

El método deberá mostrar en consola los datos de la película con el siguiente formato:

```text
Película: <titulo>
Género: <genero>
Duración: <duracion> minutos
```

## Ejemplo

Dada la siguiente película:

```java
Pelicula pelicula =
        new Pelicula("Interestelar", "Ciencia ficción", 169);
```

Al ejecutar:

```java
pelicula.esLarga();
```

el resultado deberá ser:

```text
true
```

Y al ejecutar:

```java
pelicula.mostrar();
```

deberá mostrar:

```text
Película: Interestelar
Género: Ciencia ficción
Duración: 169 minutos
```

## Restricción

No es necesario implementar el método `main`.