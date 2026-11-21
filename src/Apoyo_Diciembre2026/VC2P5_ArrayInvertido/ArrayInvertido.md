# Ejercicio — Invertir un array recorriéndolo desde el final

Implementa un método llamado `invertirArray` que reciba un array de enteros y devuelva un array nuevo con los elementos en orden inverso.

## Tu tarea

1. Crea un array nuevo del mismo tamaño que el original.
2. Recorre el array original con un `for` que comience en `numeros.length - 1` y termine en `0`, bajando una posición en cada vuelta.
3. Copia los elementos en el nuevo array empezando por la posición `0`.
4. Devuelve el nuevo array al terminar el recorrido.
5. En él `main`, muestra el array invertido y su último elemento. Si está vacío, muestra `El array está vacío` en lugar del último elemento.

## Ejemplo

```text
Array original: [4, -2, 9, 1]
Array invertido: [1, 9, -2, 4]
Último elemento del invertido: 4
```