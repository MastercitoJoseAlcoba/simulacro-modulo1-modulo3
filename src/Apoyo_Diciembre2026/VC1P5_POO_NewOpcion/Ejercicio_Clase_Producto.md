# Ejercicio de POO — Clase `Producto`

Creá una clase `Producto` para representar un artículo en el inventario de un comercio.

```java
package Apoyo_Diciembre2026.VC4P4_POO_NewOpcion;
```

## Atributos privados

- `String nombre`
- `String categoria`
- `int stock` (cantidad de unidades disponibles)

## Constructores

1. **Sin parámetros.** Usa "Producto sin nombre", "Categoría sin definir" y stock `0`.
2. **Con nombre y categoría.** Recibe ambos valores y deja el stock en `0`.
3. **Con nombre, categoría y stock.** Recibe los tres valores.

## Getters y setters

Creá un getter y un setter para cada atributo.

- El nombre y la categoría solo se modifican si el valor es distinto de `null` y la cadena no está vacía.
- El stock solo se modifica si el valor es mayor o igual a `0`.

## Métodos

- `public boolean tieneStockSuficiente()` devuelve `true` si hay **10 unidades o más**. En caso contrario, devuelve `false`.
- `public void mostrar()` imprime el nombre, la categoría y el stock en tres líneas con el formato del ejemplo.

## Ejemplo

```java
Producto producto = new Producto("Yerba", "Almacén", 10);
producto.tieneStockSuficiente(); // Devuelve true
producto.mostrar();
```

Salida esperada de `mostrar()`

```text
Producto: Yerba
Categoría: Almacén
Stock: 10 unidades
```

No hace falta implementar `main`.

**Para probarlo en papel.** Si el producto tiene `10` unidades y llamás a `setStock(-3)`, ¿qué valor queda guardado y qué devuelve `tieneStockSuficiente()`?
