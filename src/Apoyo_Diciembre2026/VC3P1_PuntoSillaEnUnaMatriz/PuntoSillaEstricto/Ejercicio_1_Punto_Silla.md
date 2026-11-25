# Ejercicio 1 - Punto silla en una matriz

## 1. Matriz original

| Fila / Columna | 0 | 1 | 2 |
|----------------|---|---|---|
| 0              | 7 | 8 | 5 |
| 1              | 3 | 9 | 2 |
| 2              | 6 | 4 | 1 |

El punto silla es el número 5.

- Es el menor elemento de su fila.
- Es el mayor estricto de su columna.
- Sus coordenadas son [0, 2].

---

## 2. Traza de escritorio

### Primer recorrido: buscar el menor de la fila

i = 0

| j       | Valor | minimo            | indiceMinimo |
|---------|-------|-------------------|--------------|
| Inicial | ---   | Integer.MAX_VALUE | -1           |
| 0       | 7     | 7                 | 0            |
| 1       | 8     | 7                 | 0            |
| 2       | 5     | 5                 | 2            |

### Resultado del primer recorrido

```java
minimo = 5;
indiceMinimo = 2;
esMinUnico = true;
```

El número 5 es el menor de la fila y no se repite.

---

## 3. Segundo recorrido: verificar la columna

```java
boolean esMayorEstricto = true;

for (int k = 0; k < matriz.length; k++) {

    if (k != i && matriz[k][indiceMinimo] >= minimo) {
        esMayorEstricto = false;
        break;
    }
}
```

### Explicación de la condición

- k != i: evita comparar el elemento consigo mismo.
- &&: ambas condiciones deben cumplirse.
- matriz[k][indiceMinimo]: recorre verticalmente.
- >= minimo: busca un elemento mayor o igual.
- break: finaliza el ciclo for.

### Traza de escritorio

| k | Elemento | Comparación    | Acción         |
|---|----------|----------------|----------------|
| 0 | 5        | k != i (false) | No se compara  |
| 1 | 2        | 2 >= 5 (false) | Continúa       |
| 2 | 1        | 1 >= 5 (false) | Continúa       |

Como ningún otro elemento de la columna es mayor
o igual a 5, la bandera permanece en true.

---

## 4. Variables bandera

```java
esMinUnico = true;
esMayorEstricto = true;
```

Ambas condiciones son verdaderas.

```java
if (esMinUnico && esMayorEstricto) {
    return new int[][]{{i, indiceMinimo}};
}
```

---

## 5. Retorno final

```java
return new int[][]{{i, indiceMinimo}};
```

Devuelve las coordenadas:

```java
{{0, 2}}
```

---

## 6. Salida por consola

```text
Fila: 0
Columna: 2
Punto silla: 5
```

---

## 7. Variables utilizadas

| Variable         | Función                         |
|------------------|---------------------------------|
| i                | Recorre las filas               |
| j                | Recorre las columnas            |
| k                | Realiza el recorrido vertical   |
| minimo           | Almacena el menor valor          |
| indiceMinimo     | Guarda la columna del mínimo     |
| esMinUnico       | Variable bandera                 |
| esMayorEstricto  | Variable bandera                 |

---

## 8. Conclusión

El número 5 cumple las dos condiciones:

- Menor de su fila: (7, 8, 5).
- Mayor estricto de su columna: (5, 2, 1).

Por lo tanto, el número 5 es el punto silla.

## Recordatorio para FEIP

- i: selecciona la fila.
- j: busca el mínimo.
- k: verifica la columna.

No memorizar el código. Comprender la lógica.