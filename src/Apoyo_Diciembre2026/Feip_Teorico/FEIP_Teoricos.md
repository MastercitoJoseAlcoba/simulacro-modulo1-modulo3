# FEIP · Preguntas teóricas de Java

30 preguntas agrupadas por tema. Cuando el material original muestra el número de Moodle, aparece junto al enunciado.

## Índice

- [Arrays, listas, mapas y pilas](#arrays-listas-mapas-y-pilas)
- [Objetos, herencia e interfaces](#objetos-herencia-e-interfaces)
- [Excepciones](#excepciones)
- [Operadores y control de flujo](#operadores-y-control-de-flujo)

## Arrays, listas, mapas y pilas

### 2 · ¿Qué es un mapa?

**Respuesta b.**

Un `Map` asocia claves únicas con valores. Ejemplo: `"Yerba" → 180`.

### 4 · ¿Qué afirmación es verdadera sobre un array?

**Respuesta a.**

Los valores deben ser compatibles con el tipo de sus elementos. El tamaño se fija al crearlo, los índices arrancan en `0` y se accede con `array[i]`.

### 5 · ¿Qué afirmación es verdadera sobre una `List`?

**Respuesta b.**

Una implementación mutable, como `LinkedList`, puede cambiar de tamaño. Además, permite duplicados y acceso mediante `get(i)`.

### Pila de nombres · ¿Qué imprime?

**Respuesta a.**

`[Antonio, Carmen, Oscar]`. Los dos `pop()` sacan a Dante y Mariana, en ese orden. Luego `push("Oscar")` lo agrega al tope.

### 13 · Ordenamiento · ¿Qué imprime?

**Respuesta a.**

`[2, 8, 8, 8]`. `arreglo[j] = arreglo[j + 1]` pisa el valor original y `arreglo[j + 1] = arreglo[j]` duplica el menor.

### Lista de nombres · ¿Qué imprime?

**Respuesta d.**

`[Juan, Daniel, Blanca, Nair, Ariel, Ernesto]`. `remove(2)` elimina a Hector, `set(2, "Juan")` reemplaza a Pablo y `add(3, "Nair")` inserta a Nair antes de Ariel.

**Traza de la lista**

1. Antes de `remove(2)` → `[Blanca, Ariel, Hector, Pablo, Daniel]`.
2. `remove(2)` elimina a Hector → `[Blanca, Ariel, Pablo, Daniel]`.
3. `set(2, "Juan")` reemplaza a Pablo → `[Blanca, Ariel, Juan, Daniel]`.
4. `sort()` y `reverse()` → `[Juan, Daniel, Blanca, Ariel]`.
5. Se agrega a Ernesto al final y se inserta a Nair en el índice `3`.

### `buscoPersonas` · ¿Qué hace el método?

**Respuesta** · **d**, si hay que elegir una. Recorre la `LinkedList<Persona>` e imprime a quienes cumplen `p.edad < edad`. La **b** describe la misma conducta usando «argumento».

### 35 · Array de objetos `Auto` · ¿Qué imprime?

**Respuesta a.**

`Ford VW Suzuki`. Ford reemplaza a Fiat en `[0]` y Suzuki reemplaza a Gold en `[2]`. El `for` imprime las marcas en orden de índice.

## Objetos, herencia e interfaces

### 14 · ¿Qué es un objeto?

**Respuesta b.**

Una instancia de una clase. `new Libro(...)` crea el objeto.

### 17 · ¿Qué palabra indica que un método no devuelve un valor?

**Respuesta d.**

`void`. Por ejemplo, `public void mostrarInformacion()`.

### 12 · Mismo nombre y parámetros diferentes

**Respuesta c. Sobrecarga.**

Por ejemplo, `sumar(int, int)` y `sumar(int, int, int)`.

### 26 · Mismo nombre y distintos tipos o cantidad de parámetros

**Respuesta d. Sobrecarga.**

Un cambio en el tipo de retorno por sí solo no alcanza.

### `TestSumar` · ¿Qué imprime `sumar(10, 10)`?

**Respuesta c.**

`Entre a int 20`. Los literales son `int` y `(a + b)` se evalúa antes de concatenar.

### `instanceof` con `Vehiculo`, `Auto` y `Moto` · ¿Qué imprime?

**Respuesta c.**

`true - false - false - true - false - true -`. Se evalúa el tipo real del objeto. Un `Auto` es un `Vehiculo` y `auto instanceof Moto` da `false`.

### Interfaz `Vehiculo` con `describir()` · ¿Qué afirmaciones son verdaderas?

**Respuesta c. 1, 4 y 6.**

La interfaz es válida, se usa `implements` y la clase concreta debe contar con implementaciones de `acelerar()` y `frenar()`. `describir()` ya tiene cuerpo gracias a `default`.

### 18 · Métodos en una interfaz

**Respuesta** · **a** parece ser la esperada, pero la palabra «siempre» la vuelve incorrecta. Una clase concreta puede heredar una implementación y los métodos `default` ya tienen cuerpo. Ninguna opción es exacta.

### 20 · ¿Qué describe a una clase abstracta?

**Respuesta b.**

No se puede instanciar directamente. `Figura figura = new Circulo(3);` crea un `Circulo`.

### 25 · ¿Qué permite declarar métodos sin implementación?

**Respuesta** · **d. Interfaz** parece ser la esperada. La **b. Clase abstracta** también es válida cuando declara un método `abstract`.

### 30 · Acceso predeterminado de los miembros de una interfaz

**Respuesta b. `public`.**

Por ejemplo, `void acelerar();` declara implícitamente un método `public abstract`.

### 31 · Afirmaciones sobre interfaces y clases abstractas

**Respuesta** · **a y c** son válidas: una interfaz permite métodos `default` y una clase abstracta puede implementar varias interfaces. La **b** depende de qué se entienda por «variables miembro»: los campos de una interfaz son constantes `public static final` y se puede escribir `public`. Si exigen una sola, la **a** parece ser la esperada.

### 34 · ¿Qué permite tratar distintos objetos mediante un tipo común?

**Respuesta a. Polimorfismo.**

Una `List<Figura>` puede contener distintas figuras, cada una con su propia implementación de `calcularArea()`.

### 36 · Diferencia entre clase abstracta e interfaz

**Respuesta** · **a** parece ser la respuesta esperada, pero ninguna opción es exacta en Java actual. Una clase abstracta puede tener constructores y estado de instancia. Una interfaz puede tener métodos con cuerpo, por ejemplo `default`.

### 38 · ¿Qué desventaja puede tener la herencia?

**Respuesta c.**

Puede debilitar el encapsulamiento si se exponen detalles internos a las subclases, por ejemplo con atributos mutables `protected`.

### 40 · ¿Qué permite heredar atributos y métodos?

**Respuesta b. Herencia.**

Ejemplo: `class Gerente extends Empleado`.

## Excepciones

### 21 · ¿Qué caracteriza a las excepciones personalizadas?

**Respuesta a.**

Permiten representar errores específicos, como `SaldoInsuficienteException`.

### 27 · ¿Para qué se usa `throw`?

**Respuesta d.**

Lanza una excepción. En `throw new IllegalArgumentException("Dato inválido");`, `new` crea la excepción y `throw` la lanza. También se puede lanzar una excepción existente con `throw e;`.

### 28 · ¿Qué afirmación es incorrecta?

**Respuesta** · **a y b** son incorrectas. Las `RuntimeException` pueden propagarse sin `catch` ni `throws`. Las excepciones comprobadas deben capturarse o declararse si se propagan. Si exigen una sola, la **a** es la contradicción más directa.

### `PruebaExcepcion` · ¿Qué imprime?

**Respuesta** · **35**. `valor` pasa por `10 → 11 → 21`. `parseInt("el 5")` salta al `catch`, que suma `20`. El `finally` resta `5` y el `valor--` final lo deja en `35`.

## Operadores y control de flujo

### `Operadores` · ¿Qué afirmaciones son verdaderas?

**Respuesta** · **2 y 4** según la lectura del ejercicio.

`a = 8`, `b = -15` y `c = 50`. La consola imprime `false` para `oper` y luego `43` para `suma`. Si la afirmación 4 se refiere a la última línea impresa, esa línea es `43`.

### `ProbarSwitch` · ¿Qué imprime?

**Respuesta d.**

`D-C-B-C-A-`. El `switch(i - 1)` recibe `3, 2, 1, 0`. El `case 1` imprime `B-` y sigue al `case 2` porque no tiene `break`.
