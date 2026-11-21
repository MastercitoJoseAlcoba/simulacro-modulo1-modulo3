# Ejercicio — Procesar temperaturas

Implementa el método `public static int[] procesarTemperaturas(int[] temperaturas)`.

El método recibe un array de temperaturas en grados Celsius y debe devolver un nuevo array con esas temperaturas en grados Fahrenheit y en orden inverso.

## Tu tarea

1. Crea un array nuevo del mismo tamaño que `temperaturas`.
2. Recorre el array original desde el último elemento hasta el primero.
3. Convertí cada temperatura con la fórmula `fahrenheit = celsius * 9 / 5 + 32`.
4. Guarda los valores convertidos en el nuevo array, empezando por la posición `0`.
5. Devuelve el array resultante.

## Ejemplo

```text
Entrada en Celsius:    [30, 25, 20, 15, 10]
Salida en Fahrenheit:  [50, 59, 68, 77, 86]
```

El `10` está al final de la entrada. Al convertirlo, da `50`, que queda al principio de la salida.