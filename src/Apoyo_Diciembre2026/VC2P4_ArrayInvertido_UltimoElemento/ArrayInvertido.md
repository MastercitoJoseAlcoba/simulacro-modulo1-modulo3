# Ejercicio — Invertir un array y hallar su último elemento

Crea un método `invertirArray` que reciba un array de enteros y devuelva uno nuevo con los valores en orden inverso.

1. Usa un `for` para copiar los valores desde el final del array original.
2. En el `main`, guarda el array invertido que devuelve el método.
3. Muestra el último elemento del array invertido. Si el array está vacío, muestra `El array está vacío`.

## Ejemplo

```text
Array original:  {4, -2, 9, 1}
Array invertido: {1, 9, -2, 4}
Último elemento del invertido: 4
```

**Pista:** el último índice es `length - 1`. Al invertir el orden, el primer elemento del original queda al final.