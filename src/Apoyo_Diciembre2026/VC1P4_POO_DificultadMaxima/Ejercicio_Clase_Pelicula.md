# Ejercicio: clase Película

Crea la clase `Pelicula` en el paquete `VC4P4_POO_Ej_Dificultad_Examen` para representar una película.

## Atributos privados

- `String titulo`
- `String genero`
- `int duracion` (en minutos)

## Constructores

1. `Pelicula()` usa «Película sin título», «Género sin definir» y 0 minutos.
2. `Pelicula(String titulo, String genero)` recibe el título y el género. La duración queda en 0.
3. `Pelicula(String titulo, String genero, int duracion)` recibe los tres valores.

## Getters y setters

Implementá un getter y un setter para cada atributo.

- Título y género se actualizan solo si el valor es distinto de `null` y la cadena no está vacía.
- La duración se actualiza solo si el valor es mayor o igual a 0.

## Métodos

- `public boolean esLarga()` devuelve `true` si la duración es de 120 minutos o más. En caso contrario, devuelve `false`.
- `public void mostrar()` imprime los tres datos con el formato del ejemplo.

## Ejemplo

```java
Pelicula pelicula = new Pelicula("Interestelar", "Ciencia ficción", 169);
pelicula.esLarga(); // devuelve true
pelicula.mostrar(); 
```

Salida de `mostrar()`

```text
Película: Interestelar
Género: Ciencia ficción
Duración: 169 minutos
```

No hace falta implementar `main`.
