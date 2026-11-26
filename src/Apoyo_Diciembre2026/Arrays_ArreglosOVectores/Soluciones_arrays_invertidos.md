# Arrays invertidos en Java — Soluciones FEIP

Métodos para CodeRunner. Se asume que los arrays no son `null`.

## Ejercicio 1 — Invertir un array

Devuelve un nuevo array en orden inverso.

```java
public int[] invertirArray(int[] arreglo) {
    int[] resultado = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        resultado[i] = arreglo[arreglo.length - 1 - i];
    }
    return resultado;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[1, 2, 3, 4]` | `[4, 3, 2, 1]` |
| `[10, 20, 30]` | `[30, 20, 10]` |
| `[5]` | `[5]` |
| `[]` | `[]` |

## Ejercicio 2 — Invertir y duplicar

Invierte el orden y multiplica cada elemento por dos.

```java
public int[] duplicarInvertido(int[] arreglo) {
    int[] resultado = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        resultado[i] = arreglo[arreglo.length - 1 - i] * 2;
    }
    return resultado;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[1, 2, 3]` | `[6, 4, 2]` |
| `[5, 10, 15]` | `[30, 20, 10]` |
| `[-2, 0, 4]` | `[8, 0, -4]` |
| `[]` | `[]` |

## Ejercicio 3 — Último número par

Busca desde el final. Si no encuentra un par, retorna -1.

```java
public int ultimoPar(int[] arreglo) {
    for (int i = arreglo.length - 1; i >= 0; i--) {
        if (arreglo[i] % 2 == 0) {
            return arreglo[i];
        }
    }
    return -1;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[2, 4, 6, 7]` | `6` |
| `[8, 3, 5, 9]` | `8` |
| `[1, 3, 5]` | `-1` |
| `[]` | `-1` |

## Ejercicio 4 — Invertir y duplicar solo los pares

Los impares mantienen su valor, pero también cambian de posición.

```java
public int[] invertirDuplicarPares(int[] arreglo) {
    int[] resultado = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        int valor = arreglo[arreglo.length - 1 - i];
        if (valor % 2 == 0) {
            valor = valor * 2;
        }
        resultado[i] = valor;
    }
    return resultado;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[1, 2, 3, 4]` | `[8, 3, 4, 1]` |
| `[2, 5, 8]` | `[16, 5, 4]` |
| `[1, 3, 5]` | `[5, 3, 1]` |
| `[]` | `[]` |

## Ejercicio 5 — Procesar temperaturas

Invierte el array y duplica las temperaturas mayores o iguales a 25.

```java
public int[] procesarTemperaturas(int[] temperaturas) {
    int[] resultado = new int[temperaturas.length];
    for (int i = 0; i < temperaturas.length; i++) {
        int valor = temperaturas[temperaturas.length - 1 - i];
        if (valor >= 25) {
            valor = valor * 2;
        }
        resultado[i] = valor;
    }
    return resultado;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[30, 25, 20, 15, 10]` | `[10, 15, 20, 50, 60]` |
| `[10, 20, 30]` | `[60, 20, 10]` |
| `[25, 24]` | `[24, 50]` |
| `[]` | `[]` |

## Ejercicio 6 — Último divisible por 3 y 5

Busca desde el final un valor divisible por ambos números.

```java
public int buscarUltimoDivisible(int[] arreglo) {
    for (int i = arreglo.length - 1; i >= 0; i--) {
        if (arreglo[i] % 3 == 0 && arreglo[i] % 5 == 0) {
            return arreglo[i];
        }
    }
    return -1;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[15, 20, 30, 7]` | `30` |
| `[45, 12, 10]` | `45` |
| `[3, 5, 8]` | `-1` |
| `[]` | `-1` |

## Ejercicio 7 — Invertir y eliminar los impares

Cuenta los pares para crear un array del tamaño exacto.

```java
public int[] obtenerParesInvertidos(int[] arreglo) {
    int cantidad = 0;
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] % 2 == 0) {
            cantidad++;
        }
    }
    int[] resultado = new int[cantidad];
    int posicion = 0;
    for (int i = arreglo.length - 1; i >= 0; i--) {
        if (arreglo[i] % 2 == 0) {
            resultado[posicion] = arreglo[i];
            posicion++;
        }
    }
    return resultado;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[1, 2, 3, 4, 5, 6]` | `[6, 4, 2]` |
| `[10, 3, 8, 5]` | `[8, 10]` |
| `[1, 3, 5]` | `[]` |
| `[2, 4, 6]` | `[6, 4, 2]` |

## Ejercicio 8 — Verificar si un array es capicúa

Compara los extremos hasta la mitad del array.

```java
public boolean esCapicua(int[] arreglo) {
    for (int i = 0; i < arreglo.length / 2; i++) {
        if (arreglo[i] != arreglo[arreglo.length - 1 - i]) {
            return false;
        }
    }
    return true;
}
```

| Entrada | Resultado esperado |
|---|---|
| `[1, 2, 3, 2, 1]` | `true` |
| `[1, 2, 2, 1]` | `true` |
| `[1, 2, 3]` | `false` |
| `[5]` | `true` |
| `[]` | `true` |

## Dos formas de recorrer en orden inverso

- `arreglo[arreglo.length - 1 - i]`: índice inverso con un `for` ascendente.
- `for (int i = arreglo.length - 1; i >= 0; i--)`: recorrido directo desde el final.
- En una búsqueda, el `return` dentro del `if` permite terminar al encontrar el valor.
