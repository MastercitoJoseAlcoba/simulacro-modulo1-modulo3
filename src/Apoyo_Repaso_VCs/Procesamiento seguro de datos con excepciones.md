### Ejercicio 1: Procesamiento seguro de datos con excepciones
Complete el método procesarDato. El objetivo es realizar varias operaciones que pueden producir excepciones, evitando que
el programa se detenga durante la ejecución.

El método recibe los siguientes parámetros:
1. String[] nombres
2. int[][] matriz
3. String textoNumero
4. int a
5. int b
6. int postNombre
7. int fila
8. int columna

### El método debe calcular y devolver la suma de los siguientes valores:
1. La cantidad de caracteres del nombre ubicado en nombres [postNombre].
2. El valor entero obtenido en convertir textoNumero.
3. El resultado de la división entera entre a y b.
4. El valor ubicado en matriz[fila][columna].

Cada una de estas operaciones puede producir una excepción. Si una operación produce una excepción, dicha operación debe 
aportar 0 al total, pero el método debe continuar ejecutando las demas operaciones.

### Firma del método
public static int procesarDato(String[] nombres, int[][] matriz, String textoNumero, int a, int b, int postNombre, int fila, int columna) {